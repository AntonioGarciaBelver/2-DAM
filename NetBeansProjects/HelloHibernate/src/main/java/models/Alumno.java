/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author FranciscoRomeroGuill
 */
@Data
@NoArgsConstructor
@Entity
//@Table(name="alumnado")
public class Alumno implements Serializable {
    
    @Id
    @GeneratedValue(strategy=IDENTITY)
    private Integer id;
    private String nombre;
    private String apellidos;
    private String curso;
    
    @OneToMany(mappedBy="alumno", fetch=FetchType.EAGER, cascade=CascadeType.ALL)
    private List<Tarea> tareas;
}
