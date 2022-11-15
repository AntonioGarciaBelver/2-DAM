package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Statement.RETURN_GENERATED_KEYS;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Alumno;

public class AlumnoDAOMySQL implements AlumnoDAO {

    private static final String GET_QUERY = "select * from alumno where id =? ";
    private static final String INSERT_QUERY = """
                                               INSERT INTO `alumno` (`id`, `nombre`, `apellidos`, `curso`)
                                                VALUES (NULL, ?, ?, ?);""";
    private static final String GETALL_QUERY = "SELECT * FROM `alumno`";
    private static final String DELETE_ID_QUERY= "DELETE FROM `alumno` WHERE `alumno`.`id` = ? ";
    private static final String UPDATE_QUERY= """
                                              UPDATE `alumno` SET 
                                              `nombre` = 'Antonio', 
                                              `apellidos` = 'Garcia', 
                                              `curso` = '2ºDAM' WHERE `alumno`.`id` = """;
    private static final String GETALL_BY_CURSO_QUERY = "";        
    
    private static Connection CONEXION = Conexion.getCONEXION();

    public AlumnoDAOMySQL() {
    }

    @Override
    public Alumno get(Integer id) {

        try ( var pst = CONEXION.prepareStatement(GET_QUERY)) {

            pst.setInt(1, id);

            ResultSet resultado = pst.executeQuery();

            if (resultado.next()) {
                var alumno = new Alumno();
                alumno.setId(resultado.getInt("id"));
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setApellidos(resultado.getString("apellidos"));
                alumno.setCurso(resultado.getString("curso"));
                return alumno;
            } else {
                return null;
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    public void add(Alumno a) {
         try(var pst = CONEXION.prepareStatement(INSERT_QUERY, RETURN_GENERATED_KEYS)){
             
             pst.setString(1, a.getNombre());
             pst.setString(2, a.getApellidos());
             pst.setString(3, a.getCurso());
             
             if(pst.executeUpdate()>0){
                 
                 var keys = pst.getGeneratedKeys();
                 keys.next();
                 
                 a.setId(keys.getInt(1));
             }
             
         } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Alumno> getAll() {
        
        var salida = new ArrayList<Alumno>();
        
        try(var pst = CONEXION.prepareStatement(GETALL_QUERY)){
            
            ResultSet resultado = pst.executeQuery();
            
            while(resultado.next()){
                var alumno = new Alumno();
                alumno.setId(resultado.getInt("id"));
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setApellidos(resultado.getString("apellidos"));
                alumno.setCurso(resultado.getString("curso"));
                salida.add(alumno);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salida;
    }

    @Override
    public void delete(Alumno a) {
        delete(a.getId());
    }

    @Override
    public void update(Alumno a){
        try(var pst = CONEXION.prepareStatement(UPDATE_QUERY)){
            pst.setString(1, a.getNombre());
            pst.setString(2, a.getApellidos());
            pst.setString(3, a.getCurso());
            pst.setInt(4, a.getId());
            
            if(pst.executeUpdate()==0){
                Logger.getLogger(AlumnoDAOMySQL.class.getName()).severe("Alumno no existe");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void delete(Integer id) {
        
        try(var pst = CONEXION.prepareStatement(DELETE_ID_QUERY)){
            pst.setInt(1, id);
            if(pst.executeUpdate()==0){
               Logger.getLogger(AlumnoDAOMySQL.class.getName()).warning("Alumno no encontrado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Alumno> getAllByCurso(String curso) {
        
        var salida = new ArrayList<Alumno>();
        
        try(var pst = CONEXION.prepareStatement(GETALL_BY_CURSO_QUERY)){
            
            pst.setString(1, curso);
            ResultSet resultado = pst.executeQuery();
            
            while(resultado.next()){
                var alumno = new Alumno();
                alumno.setId(resultado.getInt("id"));
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setApellidos(resultado.getString("apellidos"));
                alumno.setCurso(resultado.getString("curso"));
                salida.add(alumno);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salida;
    }
}
