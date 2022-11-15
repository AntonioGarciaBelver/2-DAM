package com.mycompany.ejemplovarios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author anton
 */
public class HasMap {
    
    private static Logger log = Logger.getLogger("EJEMPLO");
    
    static Scanner sc;

    public static Boolean esPrimo(Integer num){
        for(Integer i=2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        
        sc = new Scanner(System.in);
        System.out.println("Numero inicial:");
        Integer inicial = sc.nextInt();
        System.out.println("Numero final:");
        Integer fin = sc.nextInt();
       
        
        ArrayList <Integer> numeros = new ArrayList<Integer>();
        
        var tabla = new HashMap<Integer, String>();
        
        for(Integer i = inicial; i<=fin; i++){
            numeros.add(i);
        }
        
        System.out.println("---------------");
        System.out.println(numeros);
        System.out.println(numeros.size());
        System.out.println("---------------");
        
        for (Integer i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i)+" "+ esPrimo(numeros.get(i)));
        }
        
        for (Integer num : numeros){
            System.out.println(num + " " + esPrimo(num));
        }
        /*
        //Exresion LAMBDA. 
        numeros.forEach((i) -> {
            i = i*i;
            System.out.println(i);
            });
        
        */
        Iterator<Integer> it = numeros.iterator();
        
        log.info("Recorriendo el Array y calculado los Primos");
        while (it.hasNext()) {
            Integer valor = it.next();
            //tabla.put(valor, esPrimo(valor));
            tabla.put(valor, esPrimo(valor)?" primo":"*");
            log.info("Primo encontrado");
        }
              
        System.out.println(tabla);
        System.out.println(numeros);

    }  
}
