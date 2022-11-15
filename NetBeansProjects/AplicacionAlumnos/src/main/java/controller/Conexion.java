package controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
//    Hemos movido los datos a un Configuracion.Properties
//    private static final String USER = "root";
//    private static final String PASSWORD = "toorDam2";
//    private static final String URL = "jdbc:mysql://localhost:3306/accesoadatos?zeroDateTimeBehavior=CONVERT_TO_NULL";

    private static Connection CONEXION;

    static {
        try {

            var conf = new Properties();

            try {
                conf.load(new FileReader("configuracion.properties"));

                CONEXION = DriverManager.getConnection(conf.getProperty("url"), conf.getProperty("user"), conf.getProperty("password"));
                System.out.println("Conexión realizada con éxito");

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getCONEXION() {
        return CONEXION;
    }

}
