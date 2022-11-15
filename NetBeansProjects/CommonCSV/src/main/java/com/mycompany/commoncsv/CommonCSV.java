package com.mycompany.commoncsv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class CommonCSV{
    //Método que almacena el contenido de nuestro fichero a un String
    public static String leerFichero(String fichero) { 
        String lista = "";
        try ( var fr = new FileReader(fichero);  var br = new BufferedReader(fr);) {
            String linea;
            //Mientras que siga habiendo contenido por leer, convertimos 
            //mayúsculas y almacenamos para que no distinga las palabras por 
            //mayúsculas y minúsculas.
            while ((linea = br.readLine()) != null) {
                String toUpperCase = linea.toUpperCase();
                lista += toUpperCase;
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return lista;
    }
    
    public static void createCSVFile(TreeMap mapa, String nombre) throws IOException {
        FileWriter out = new FileWriter(nombre+"_histograma.csv");
        try ( CSVPrinter printer = new CSVPrinter(out, CSVFormat.DEFAULT)) {
            mapa.forEach((palabra, cantidad) -> {
                try {
                    printer.printRecord(palabra, cantidad);
                } catch (IOException ex) {
                    Logger.getLogger(CommonCSV.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        }
    }
    
    public static void main(String[] args) throws IOException {
        //Pedir nombre archivo y guardarlo en variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del archivo que quieras leer:");
        String nombreArchivo = sc.next();
        
        //Lectura del fichero e impresión por consola
        String fichero = leerFichero("src/main/resources/" + nombreArchivo+ ".txt");
        System.out.println(fichero);
        
        //Reempalazamos los signos "" y ' 
        fichero = fichero.replace("\"", "");
        fichero = fichero.replace("'", "");
        
        //Separamos las palabras, quedando guardadas en un array
        String[] palabras = fichero.split("[\\s,.:()?!¿¡-]");
        ArrayList<String> total = new ArrayList<String>();
        for (String elemento : palabras) {
            total.add(elemento);
        }
        
        HashMap<String, Integer> map = new HashMap<>();
        Iterator<String> it = total.iterator();
        
        //Iteramos el ArrayList. Solo observamos las palabras de tamaño>2
        while (it.hasNext()) {
            String value = it.next();
            if (value.length() > 2) {
                //Si nuestro hashmap contiene la palabra, sumamos 1 al valor
                if (map.containsKey(value)) {
                    map.put(value, (map.get(value) + 1));
                //Si no, lo metemos nuevo con el valor 1
                } else {
                    map.put(value, 1);
                }
            }
        }
        
        //Creamos un TreeMap y así lo ordenamos alfabéticamente
        TreeMap<String, Integer> sorted = new TreeMap<>();
        sorted.putAll(map);
        System.out.println(sorted);
        createCSVFile(sorted, nombreArchivo);
    }
}