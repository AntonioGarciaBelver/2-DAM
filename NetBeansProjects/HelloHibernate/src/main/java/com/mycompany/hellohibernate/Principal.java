package com.mycompany.hellohibernate;

import java.util.ArrayList;
import java.util.Scanner;
import models.Alumno;
import models.Tarea;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Principal {

    static Alumno al;
    
    public static void main(String[] args) {
        
        var sf = new Configuration().configure().buildSessionFactory();

        try(Session s = sf.openSession()){
            System.out.println("Conexion realizada");

            var tarea = new Tarea();
            tarea.setNombre("Preparar Examen de diciembre");
            tarea.setModulo("PMDM");
            System.out.println("------");

            al = s.get(Alumno.class, 1);
            System.out.println("------");
            System.out.println(al);
            if( al !=null){
                tarea.setAlumno(al);
                al.getTareas().add(tarea);
            };
            
            System.out.println(tarea);
            
            Transaction t = s.beginTransaction();
            s.save(tarea);
            t.commit();
            
            System.out.println("---------------------");
            System.out.println(tarea);
            System.out.println(al);
        }
        
        /*System.out.println("Listado de tareas");
        try(Session s = sf.openSession()){
            Query consulta = s.createQuery("from Tarea");
            var listado = (ArrayList<Tarea>) consulta.list();           
            listado.forEach((al)->{System.out.println(al);});            
        }        

        System.out.println("\n\nListado de alumnos");
        try(Session s = sf.openSession()){
            Query consulta = s.createQuery("from Alumno");
            var listado = (ArrayList<Alumno>) consulta.list();           
            for(Alumno al: listado){
                System.out.println(al);
            }
        }*/              
        
    }
    

    /*public static void main2(String[] args) {

        var sf = new Configuration().configure().buildSessionFactory();
        
        var sc = new Scanner(System.in);
        
        var a = new Alumno();
        a.setNombre(sc.nextLine());
        a.setApellidos(sc.nextLine());
        a.setCurso(sc.nextLine());
        
        try(Session s = sf.openSession()){
            Transaction t = s.beginTransaction();          
            s.save(a);
            t.commit();
        }
        
        System.out.println("------ Alumnado --------");
        
        ArrayList<Alumno> listado;
        
        try(Session s = sf.openSession()){
            Query consulta = s.createQuery("from Alumno");
            listado = (ArrayList<Alumno>) consulta.list();           
            listado.forEach((al)->{System.out.println(al);});            
        }
        
        System.out.println("Forzando curso...");
        a.setCurso("4DAM");
        
        try(Session s = sf.openSession()){
            Transaction t = s.beginTransaction();          
            s.update(a);
            t.commit();
        }       
         
        System.out.println("Borrando alumno...");
        try(Session s = sf.openSession()){
            Transaction t = s.beginTransaction();          
            s.delete(a);
            t.commit();
            //t = s.beginTransaction();          
            //s.delete(a);
            //t.commit();
        }             
        
        System.out.println("Borrando alumno 20...");
        try(Session s = sf.openSession()){
            Transaction t = s.beginTransaction();
            Alumno paraborrar = s.get(Alumno.class, 20);
            System.out.println(paraborrar);
        
            s.delete(paraborrar);
            t.commit();
        }
    }*/
    
}
