package com.mycompany.helloproperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    
    public static void main(String[] args) {
        
        try {
            //Manera correcta de acceder a la carpeta resources
            var fis = Principal.class.getClassLoader().getResourceAsStream("config.properties");
            var config = new Properties();
            
            config.load(fis);
            /*config.forEach((k,v)->{
                System.out.println(k+ " = "+ v);
            });*/
            
            String user = null;
            if(config.containsKey("user")){
                user = config.getProperty("user");
                config.setProperty("user", user+"O");
                config.store(new FileOutputStream("config.properties"), "Modificacion");
            }
            System.out.println(user);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
