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

public class Ejercicio3 {
    
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
        private int valor = 100;

        public T1(VariableCompartida vc) {
            this.vc = vc;

        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < valor; i++) {
                    vc.establecerV(i);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static class T2 extends Thread {

        VariableCompartida vc;
        private int valor = 100;

        public T2(VariableCompartida vc) {
            this.vc = vc;

        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < valor; i++) {
                    System.out.println("Hilo 2: " + vc.obtenerV());
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        VariableCompartida vc = new VariableCompartida(0);
        Boolean a = true;

        T1 t1 = new T1(vc);
        T2 t2 = new T2(vc);

        t1.start();
        t2.start();
    }
}
