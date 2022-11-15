package com.mycompany.mavenproject1;

/**
 *
 * @author anton
 */
import java.util.Scanner;

public class Primos {

    public static void main(String[] args) {
        int ejecutar = 1;
        while (ejecutar != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escriba el numero inicial (0 para salir): ");
            int num1 = sc.nextInt();

            if (num1 == 0) {
                ejecutar = 0;
                System.out.println("Salir del programa");
                System.exit(0);
            }

            System.out.println("Escriba el numero final: ");
            int num2 = sc.nextInt();

            System.out.println("Buscando primos...");
            int cuantosPrimos = 0;

            for (int i = num1; i <= num2; i++) {
                boolean primo = true;

                if (i == 1) {
                    primo = false;
                } else {
                    for (int j = 2; j <= i / 2; j++) {
                        if (i % j == 0) {
                            primo = false;
                            j = i / 2;
                        }
                    }
                }

                if (primo) {
                    cuantosPrimos++;
                    System.out.println(i);
                }

            }
            System.out.println("Se han encontrado " + cuantosPrimos + " numeros primos en el intervalo\n"
                    + "--------------------------------------------------");
        }
    }

}
