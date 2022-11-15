/*
Ejercicio 1
Realizar un programa en Java con 3 hebras, cada una de las cuales escribe por pantalla
varias veces (valor pasado como parámetro en el constructor) el carácter que se le
indique (también indicado como parámetro). ¿Se mezclan las letras? Justifica el
comportamiento observado.

RESPUESTA
Las letras se van mezclando ya que los 3 hilos se ejecutan al mismo tiempo.
 */
package com.mycompany.programacionmultihilo;

public class Ejercicio1 {

    public static class Concurrente extends Thread {

        private final int tiempo = 500;
        private String cadena;
        private int cantidadRepeticion;
        
        public Concurrente(String cadena, int cantidadRepeticion){
            this.cadena = cadena;
            this.cantidadRepeticion = cantidadRepeticion;
        }
        
        @Override
        public void run() {
             try {
                for (int i = 0; i < cantidadRepeticion; i++) {
                System.out.println(cadena); 
                Thread.sleep(tiempo);
            }
               
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        
        Concurrente c1 = new Concurrente("a",5);
        Concurrente c2 = new Concurrente("b",5);
        Concurrente c3 = new Concurrente("c",5);
        c1.start();
        c2.start();
        c3.start();
        
    }

}
