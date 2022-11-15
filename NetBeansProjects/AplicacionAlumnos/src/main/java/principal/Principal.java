package principal;

import controller.AlumnoDAOMySQL;
import interfaz.VentanaPrincipal;

public class Principal {

    static AlumnoDAOMySQL dao = new AlumnoDAOMySQL();
    
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal(dao).setVisible(true);
            }
        });
    }
}
