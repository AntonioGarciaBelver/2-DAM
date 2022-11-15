package principal;

import controller.AlumnoDAOMySQL;
import models.Alumno;

public class Principal {

    static AlumnoDAOMySQL dao = new AlumnoDAOMySQL();
    
    public static void main(String[] args) {
        
        Alumno a = new Alumno();
        a.setNombre("Antonio");
        a.setApellidos("Garcia Belver");
        a.setCurso("2ºDAM");
        System.out.println(a);
        
        dao.add(a);
        
        System.out.println(dao.getAll());
        
        dao.getAll().forEach((al)->{
            System.out.println(al);
        });
        
    }
    
}
