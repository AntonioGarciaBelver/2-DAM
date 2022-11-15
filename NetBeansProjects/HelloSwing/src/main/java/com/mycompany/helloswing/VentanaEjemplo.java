package com.mycompany.helloswing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;
import javax.swing.JTextField;

public class VentanaEjemplo {

    public static void main(String[] args) {
        var ventana = new JFrame(); // Crea una ventana.
        ventana.setTitle("Swing"); // Establecer un título de la ventana.
        ventana.setSize(400, 400); // Establecer el tamaño de la ventana.
        
        var boton = new JButton("Mi primer botón"); // Crear un botón.
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Quitar el programa de memoria.
        
        var layout = new BorderLayout(); // Crea un layout de tipo borde.
        ventana.getContentPane().setLayout(layout); // Establecemos el layout de la ventana.
        ventana.getContentPane().add(boton, BorderLayout.SOUTH); // Establece el botón en la parte inferior del borde.
        
        //var label = new JLabel("Introduce tu nombre: "); // Crear una etiqueta.
        //ventana.getContentPane().add(label, BorderLayout.NORTH); // Establece la etiqueta en la parte superior del borde.
        /*--------------------------------------------------------------------------------------------------------------------*/
        var modelo = new DefaultListModel(); // Modelo por defecto. Lista de String.
        var lista = new JList(modelo); // Asociamos la lista al modelo.
        ventana.getContentPane().add(lista); // Añadimos lista a la ventana. Al centro.
        
        var texto = new JTextField(); // Crea un cajetín de texto.
        ventana.getContentPane().add(texto, BorderLayout.NORTH); // Añadimos a la ventana el cajetín en el centro, al no establecer posición.
        
        // Método onClick del botón. Expresión Lambda.
        var manejador = (ActionListener) (ActionEvent e) -> {
            int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Hola, " + texto.getText(),
                    "Ventana", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (showConfirmDialog == 0) {
                modelo.addElement(texto.getText()); // Guardamos en la lista.
            }
        };
        boton.addActionListener(manejador); // Añadir al botón la acción del click.
        ventana.setVisible(true); // Hacer que se vea la ventana.
    }
}
