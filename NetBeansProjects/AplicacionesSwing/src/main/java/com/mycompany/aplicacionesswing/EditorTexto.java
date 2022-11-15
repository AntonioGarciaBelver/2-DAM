package com.mycompany.aplicacionesswing;

import java.io.File;
import javax.swing.JFileChooser;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.*;
import java.util.regex.Pattern;

public class EditorTexto extends javax.swing.JFrame {

    Font fuenteTipo = new Font("Arial", 0, 12);

    public EditorTexto() {
        initComponents();

        texto.setFont(fuenteTipo);
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(500);
                        lblFecha.setText(formateador.format(LocalDateTime.now()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread hilo = new Thread(runnable);
        hilo.start();
    }

    //Instanciamos la clase configuracion y la seteamos su ventana padre(this)
    //y le ponemos que sea modal(true). -> No puedes cambiar de ventana sin cerrarla
    private AcercaDe acercaDe = new AcercaDe(this, true);
    private Fuente fuenteDialogo = new Fuente(this, true);

    public void actualizarTabla(Font fuenteActual, Color colorActual, String Mayus) {
        texto.setFont(fuenteActual);
        texto.setForeground(colorActual);
        switch (Mayus) {
            case "MAYUSCULAS" ->
                texto.setText(texto.getText().toUpperCase());
            case "minusculas" ->
                texto.setText(texto.getText().toLowerCase());
            case "CamelCase" ->
                texto.setText(convertToCamelCase(texto.getText().toLowerCase()));
        }
    }

    public String convertToCamelCase(String value) {
        StringBuilder returnValue = new StringBuilder();
        String throwAwayChars = "()[]{}=?!.:,-_+\\\"#~/";
        value = value.replaceAll("[" + Pattern.quote(throwAwayChars) + "]", " ");
        value = value.toLowerCase();
        boolean makeNextUppercase = true;
        for (char c : value.toCharArray()) {
            if (Character.isSpaceChar(c) || Character.isWhitespace(c)) {
                makeNextUppercase = true;
            } else if (makeNextUppercase) {
                c = Character.toTitleCase(c);
                makeNextUppercase = false;
            }
            returnValue.append(c);
        }
        return returnValue.toString().replaceAll("\\s+", "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        texto = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lblLongitud = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblFecha = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        lblUbicacion = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        nuevo = new javax.swing.JMenuItem();
        abrir = new javax.swing.JMenuItem();
        guardar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        fuente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        acercade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editor de Texto");
        setMinimumSize(new java.awt.Dimension(750, 600));

        jPanel1.setMinimumSize(new java.awt.Dimension(400, 46));
        jPanel1.setPreferredSize(new java.awt.Dimension(591, 109));
        jPanel1.setLayout(new java.awt.BorderLayout());

        texto.setColumns(20);
        texto.setRows(5);
        texto.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                textoInputMethodTextChanged(evt);
            }
        });
        texto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoKeyTyped(evt);
            }
        });
        jPanel1.add(texto, java.awt.BorderLayout.CENTER);
        texto.getAccessibleContext().setAccessibleName("");
        texto.getAccessibleContext().setAccessibleDescription("");

        jPanel2.setPreferredSize(new java.awt.Dimension(401, 25));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel2KeyTyped(evt);
            }
        });
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel3.setMinimumSize(new java.awt.Dimension(170, 0));
        jLabel3.setPreferredSize(new java.awt.Dimension(170, 0));
        jPanel2.add(jLabel3);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setBorder(new javax.swing.border.MatteBorder(null));
        jSeparator3.setPreferredSize(new java.awt.Dimension(4, 20));
        jPanel2.add(jSeparator3);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Tamaño:");
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel1.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 16));
        jPanel2.add(jLabel1);

        lblLongitud.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLongitud.setMinimumSize(new java.awt.Dimension(70, 16));
        lblLongitud.setPreferredSize(new java.awt.Dimension(50, 16));
        jPanel2.add(lblLongitud);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setBorder(new javax.swing.border.MatteBorder(null));
        jSeparator4.setPreferredSize(new java.awt.Dimension(4, 20));
        jPanel2.add(jSeparator4);

        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setMinimumSize(new java.awt.Dimension(90, 16));
        lblFecha.setPreferredSize(new java.awt.Dimension(130, 16));
        jPanel2.add(lblFecha);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setBorder(new javax.swing.border.MatteBorder(null));
        jSeparator5.setPreferredSize(new java.awt.Dimension(4, 20));
        jPanel2.add(jSeparator5);

        jLabel2.setText("Ubicación ");
        jPanel2.add(jLabel2);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setBorder(new javax.swing.border.MatteBorder(null));
        jSeparator6.setPreferredSize(new java.awt.Dimension(4, 20));
        jPanel2.add(jSeparator6);

        lblUbicacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUbicacion.setMinimumSize(new java.awt.Dimension(100, 16));
        lblUbicacion.setPreferredSize(new java.awt.Dimension(250, 16));
        jPanel2.add(lblUbicacion);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Archivo");

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        jMenu1.add(nuevo);

        abrir.setText("Abrir");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        jMenu1.add(abrir);

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jMenu1.add(guardar);
        jMenu1.add(jSeparator1);

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu1.add(salir);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Formato");

        fuente.setText("Fuente");
        fuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuenteActionPerformed(evt);
            }
        });
        jMenu3.add(fuente);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Acerca de..");

        acercade.setText("Acerca del editor de texto");
        acercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercadeActionPerformed(evt);
            }
        });
        jMenu2.add(acercade);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        texto.setText("");
    }//GEN-LAST:event_nuevoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void acercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercadeActionPerformed
        // TODO add your handling code here:
        acercaDe.setVisible(true);
    }//GEN-LAST:event_acercadeActionPerformed

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        if (archivo != null) {
            texto.setText(ControladorFichero.leerFichero(archivo.getAbsolutePath()));
        }
        lblLongitud.setText(Integer.toString(texto.getText().length()));
        lblUbicacion.setText(archivo.getAbsolutePath());
    }//GEN-LAST:event_abrirActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        jf.showSaveDialog(this);
        File archivo = jf.getSelectedFile();
        if (archivo != null) {
            ControladorFichero.copiaTextoBuffered(texto.getText(), archivo.getAbsolutePath());
        }
        texto.setText("");

    }//GEN-LAST:event_guardarActionPerformed

    private void textoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_textoInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_textoInputMethodTextChanged

    private void jPanel2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2KeyTyped

    private void fuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuenteActionPerformed
        // TODO add your handling code here:
        fuenteDialogo.setVisible(true);
    }//GEN-LAST:event_fuenteActionPerformed

    private void textoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoKeyTyped
        // TODO add your handling code here:
        int contador = texto.getText().length();
        lblLongitud.setText(String.valueOf(contador));
    }//GEN-LAST:event_textoKeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorTexto().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrir;
    private javax.swing.JMenuItem acercade;
    private javax.swing.JMenuItem fuente;
    private javax.swing.JMenuItem guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblLongitud;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JMenuItem nuevo;
    private javax.swing.JMenuItem salir;
    private javax.swing.JTextArea texto;
    // End of variables declaration//GEN-END:variables

}
