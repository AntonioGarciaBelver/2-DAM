package com.mycompany.ej5programacionmultihilo;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
        
        ArrayList<Integer> miArray = new ArrayList<>();
        miArray.add(5);
        miArray.add(1);
        miArray.add(10);
        miArray.add(6);
        miArray.add(30);
        miArray.add(7);
        miArray.add(8);
        miArray.add(15);
        
        Nodo prueba = new Nodo(miArray);
        prueba.start();
        try {
            prueba.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(prueba.listaDesordenada);
    }

}
