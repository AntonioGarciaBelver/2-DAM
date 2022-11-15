package com.mycompany.copiaarchivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CopiaArchivo {

    public static void copiaBinaria(String origen, String destino) {

        /*try {
            //FLUJO DE ENTRADA (LECTURA)
            FileInputStream fis = new FileInputStream(origen);
            //FLUJO DE SALIDA (ESCRITURA)
            FileOutputStream fos = new FileOutputStream(new File(destino));

            int b = 0;

            try {
                while ((b = fis.read()) > 0) {
                    fos.write(b);
                }
            } catch (IOException ex) {
                Logger.getLogger(CopiaArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                //CERRAMOS LOS FLUJOS DE ENTRADA Y SALIDA
                fos.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(CopiaArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CopiaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        try ( FileInputStream fis = new FileInputStream(origen);  FileOutputStream fos = new FileOutputStream(new File(destino))) {

            int b = 0;
            while ((b = fis.read()) > 0) {
                fos.write(b);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CopiaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CopiaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void copiaTexto(String origen, String destino) {

        try ( var fr = new FileReader(origen);  var fw = new FileWriter(destino);) {

            int c;
            while ((c = fr.read()) > 0) {
                System.out.print((char) c);
                fw.write(c);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CopiaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CopiaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void copiaTextoBuffered(String origen, String destino) {

        try ( var fr = new BufferedReader(new FileReader(origen));  var fw = new BufferedWriter(new FileWriter(destino));) {

            String s;

            while ((s = fr.readLine()) != null) {
                System.out.println(s);
                s = s.toUpperCase();
                fw.write(s);
                //AÑADE RETORNO DE CARRO
                fw.newLine();
            }

        } catch (IOException ex) {
            Logger.getLogger(CopiaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void copiaTextoBufferedLines(String origen, String destino) {

        try ( var fr = new BufferedReader(new FileReader(origen));  var fw = new BufferedWriter(new FileWriter(destino));) {
            /* 
            for(String s : fr.lines().toList()){
                System.out.println(s);
            }*/
            //CREAMOS UN ITERADOR
            Iterator<String> it = fr.lines().iterator();

            while (it.hasNext()) {
                String s = it.next();
                System.out.println(s);
                //System.out.println(s.length());
            }

        } catch (IOException ex) {
            Logger.getLogger(CopiaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void saveArrayList(ArrayList<String> a, String out){
        
        try {
            var fos = new FileOutputStream(out);
            var oos = new ObjectOutputStream(fos);
            
            oos.writeObject(a);
            oos.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CopiaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CopiaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static ArrayList<String> loadArrayList(String in){
        
        ArrayList<String> salida = new ArrayList<String>();
        try {
            var fis = new FileInputStream(in);
            var ois = new ObjectInputStream(fis);
            
            salida = (ArrayList<String>) ois.readObject();            
            
            return salida;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CopiaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CopiaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CopiaArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salida;
    }
    
    public static void main(String[] args) {

        //copiaTextoBufferedLines("pom.xml", "pom.bak.xml");
        
        String cadena="""
                 What is Lorem Ipsum?
                 Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
                 The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from "de Finibus Bonorum et Malorum" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.
                 Where can I get some?
                 There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.""";
        cadena = cadena.replace("\"", "");
        cadena = cadena.replace("'", "");
        
        String[] palabras= cadena.split("[\\s,.:()?!¿¡-]");
        ArrayList<String> total = new ArrayList<String>();
        
        for(String elemento :palabras){        
            total.add(elemento);
        }
        //saveArrayList(total,"datos.bin");
        System.out.println(total);
        
        total = loadArrayList("datos.bin");
        
        System.out.println(total);
        

    }
}
