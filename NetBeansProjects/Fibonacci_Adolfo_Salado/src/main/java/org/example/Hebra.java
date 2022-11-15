package org.example;

/* Realizado por Adolfo Salado López. Ejercicio Fibonacci. */

public class Hebra extends Thread {
    private int numero;
    public static int resultado;

    /***
     * Constructor de la clase Hebra. Recibe el número a trabajar.
     * @param numero: Número que recibimos para calcular Fibonacci.
     */
    public Hebra(int numero) {
        this.numero = numero;
    }

    /***
     * Método utilizado para realizar el cálculo de Fibonnaci de manera recursiva.
     * @param numero: Recibe el número para realizar el cálculo.
     * @return: Dvuelve el elemento calculado, siendo la suma del número penúltimo mas el antepenúltimo.
     * Ej.: De 10, se sumarían el valor de 9 y de 8.
     */
    public static int calculo(int numero) {
        if (numero == 1 || numero == 2) {
            return 1;
        } else {
            return (calculo(numero - 1) + calculo(numero - 2));
        }
    }

    /***
     * En éste método obtenemos el resultado a partir de los valores que calculamos.
     */
    @Override
    public void run() {
        if (numero <= 2) {
            resultado = 1;
        } else {
            try {
                Hebra calculo = new Hebra(numero - 1);
                calculo.start();

                int valor = calculo(numero - 2);
                calculo.join();

                resultado += valor;

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(resultado);
    }
}