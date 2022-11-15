package models;

import java.io.Serializable;

public class Alumno implements Serializable {

    private Integer id;
    private String nombre;
    private String apellidos;
    private String curso;

    public Alumno() {
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "alumno{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", curso=" + curso + '}';
    }
}
