package com.mycompany.objectalumno;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Alumno;

public class Principal {

    static ArrayList<models.Alumno> clase;
    static final String ARCHIVO = "data.bin";

    static {
        System.out.println("Iniciando...");
        clase = new ArrayList<>();
    }

    public static void saveData() {

        try {
            var fos = new FileOutputStream(ARCHIVO);
            var oos = new ObjectOutputStream(fos);

            oos.writeObject(clase);
            oos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void loadData() {

        if (!(new File(ARCHIVO)).exists()) return;

        try {
            FileInputStream fis = new FileInputStream(ARCHIVO);
            ObjectInputStream ois = new ObjectInputStream(fis);

            clase = (ArrayList<Alumno>) ois.readObject();
            ois.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {

        loadData();

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {

            String s = sc.nextLine();
            if (s.equals("q")) {
                break;
            }

            Alumno a = new Alumno();

            a.setNombre(s);
            a.setApellido(sc.nextLine());
            a.setDni(sc.nextLine());
            clase.add(a);
        }

        System.out.println("--------------------");
        saveData();
        System.out.println(clase);

    }
}
