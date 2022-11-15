package com.mycompany.hellojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    
    public static Connection conexion;
    public static final String URL = 
            //MySQL SWAMP. Properties
            "jdbc:mysql://localhost:3306/accesoadatos"
            + "?zeroDateTimeBehavior=CONVERT_TO_NULL";
    public static final String USER = "root";
    public static final String PASSWORD = "toorDam2";
   
    public static void main(String[] args) {
        
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectando...");       
            Statement st = conexion.createStatement();          
            String consultasql = "SELECT alumno.id, alumno.nombre, alumno.apellidos FROM alumno";
            
            ResultSet rs = st.executeQuery(consultasql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                System.out.println(id + ") " + nombre+" "+apellidos);
            }
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserta nuevo alumno: ");
            String alumno = sc.next();
            
            consultasql = "INSERT INTO hello (id, nombre) VALUES(NULL, ?);";
            //prepared statement
            var pst = conexion.prepareStatement(consultasql);
            //Al parametro 1 ?, le asignamos el valor alumno
            pst.setString(1, alumno);
            //consultasql = "INSERT INTO `hello`(`id`, `nombre`) VALUES (null,'Loren');";
            int filasAfectadas = pst.executeUpdate();
            if(filasAfectadas == 1){
                System.out.println("Loren insertado en el sistema correctamente");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }   
}
