package controller;

import java.util.ArrayList;
import models.Alumno;

public interface AlumnoDAO {
    
    Alumno get(Integer id);
    
    void add (Alumno a);
    
    ArrayList<Alumno> getAll();
    
    void delete(Alumno a);
    
    void delete(Integer id);
    
    void update(Alumno a);
    
    ArrayList<Alumno> getAllByCurso(String curso);
    
}
