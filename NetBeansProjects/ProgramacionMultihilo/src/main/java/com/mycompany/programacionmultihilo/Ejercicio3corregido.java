/*
Ejercicio 3
Utilizando la clase VariableCompartida de la práctica anterior y una instancia
compartida de dicha clase, realizar un programa en Java donde disponemos de una
hebra que modifica los valores de la instancia de VariableCompartida desde 0 a 99
utilizando el método set.
Disponemos también de otra hebra, que utilizando el método get debe mostrar por
pantalla todos los cambios que se van produciendo en la instancia de
VariableCompartida (sabiendo que se van a generar 100 valores).
¿Se recogen todos los valores? ¿Qué ocurre?
-> Tan solo recogemos el ultimo valor. Primero se ejecuta 1 hilo y luego el segundo.
Intenta solucionar los problemas detectados.
 */
package com.mycompany.programacionmultihilo;
import java.util.concurrent.atomic.AtomicInteger;

public class Ejercicio3corregido {
    
    public static class VariableCompartida{
        
        private int variable;
        
        public VariableCompartida(int variable){
            this.variable = variable;
        }

        public int obtenerV() {
            return variable;
        }

        public void establecerV(int variable) {
            this.variable = variable;
        }
        
        public void incrementV(int incremento) {
            this.variable = variable + incremento;
        }
        
    }

    VariableCompartida vc = new VariableCompartida(0);

    public static class T1 extends Thread {

        VariableCompartida vc;
        AtomicInteger x = new AtomicInteger();

        public T1(VariableCompartida vc, AtomicInteger x) {
            this.vc = vc;
            this.x = x;
        }

        @Override
        public void run() {
            Boolean ejecutandose = true;
            int contador = 0;
            while (ejecutandose) {
                if (x.get()==1) {
                    if (contador == 99) {
                        ejecutandose = false;
                    }
                    
                    System.out.println("Hilo 1: " + vc.obtenerV());
                    x.set(0);
                    contador++;
                }

            }

        }

    }

    public static class T2 extends Thread {

        VariableCompartida vc;
        AtomicInteger x = new AtomicInteger();

        public T2(VariableCompartida vc, AtomicInteger x) {
            this.vc = vc;
            this.x = x;

        }

        @Override
        public void run() {

            Boolean ejecutandose = true;
            int contador = 0;
            while (ejecutandose) {
                if (x.get()==0) {
                    if (contador == 99) {
                        ejecutandose = false;
                    }
                    vc.incrementV(1);
                    x.set(1);
                    contador++;
                }

            }

        }

    }

    public static void main(String[] args) {

        VariableCompartida vc = new VariableCompartida(0);
        AtomicInteger x = new AtomicInteger();
        
        T1 t1 = new T1(vc, x);
        T2 t2 = new T2(vc, x);
        
        t1.start();
        t2.start();
        

    }
}
