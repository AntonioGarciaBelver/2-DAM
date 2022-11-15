package com.mycompany.aplicacionesswing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorFichero {

    public static void copiaTextoBuffered(String texto, String destino) {

        try ( var bf = new BufferedWriter(new FileWriter(destino));) {
            //Escritura del fichero
            bf.write(texto);

        } catch (IOException ex) {
            Logger.getLogger(ControladorFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String leerFichero(String fichero) { //Mete el txt en un arrayList
        String texto = "";
        try ( var fr = new FileReader(fichero);  var br = new BufferedReader(fr);) {
            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                texto += (linea + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return texto;
    }

}
