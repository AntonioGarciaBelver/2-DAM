/*
Ejercicio 2
Disponemos de una clase denominada VariableCompartida que encapsula el valor de
una variable v de tipo int. La clase VariableCompartida contiene métodos para
establecer (método set), obtener (método get) o incrementar (método inc) el valor de v.
Realizar un programa en Java que cree 2 hebras compartiendo una instancia de la clase
VariableCompartida e incrementen cada una de ella 10 veces el valor de v. Mostrar
desde la hebra del programa principal el valor final de v.
¿Se obtienen los resultados esperados? Aumenta progresivamente el número de
incrementos hasta observar algún comportamiento “extraño”. Justifica los resultados
obtenidos.
 */
package com.mycompany.programacionmultihilo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio2 {
    
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
    
    public static class Concurrente extends Thread {
        
        VariableCompartida vc;
        int incremento = 100;
        
        public Concurrente(VariableCompartida vc){
            this.vc = vc;
        }
        
        @Override
        public void run() {
             try {
                for (int i = 0; i < incremento; i++) {
                vc.incrementV(1);
            }
               
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    
    public static void main(String[] args) {
        
        VariableCompartida vc = new VariableCompartida(0);
        
        Concurrente t1 = new Concurrente(vc);
        Concurrente t2 = new Concurrente(vc);
        
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("El ultimo valor es: "+vc.obtenerV());
        
        
    }
    
}
