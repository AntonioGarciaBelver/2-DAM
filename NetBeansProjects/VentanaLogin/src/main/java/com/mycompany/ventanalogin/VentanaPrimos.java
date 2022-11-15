package com.mycompany.ventanalogin;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultListModel;

public class VentanaPrimos extends javax.swing.JFrame {

    private ArrayList<Integer> numeros = new ArrayList<Integer>();
    Integer inicio = 1;
    Integer fin = 10;
    private DefaultListModel modeloListado = new DefaultListModel();
    
    //Instanciamos la clase configuracion y la seteamos su ventana padre(this)
    //y le ponemos que sea modal(true). -> No puedes cambiar de ventana sin cerrarla
    private Configuracion dialogo = new Configuracion(this,true);
    
    public VentanaPrimos() {
        initComponents();
        listado.setModel(modeloListado);
        
        actualizarLista();

    }    
    
    public static Boolean esPrimo(Integer num) {
        for (Integer i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public void actualizarLista(){
        numeros.clear();
        for (Integer i = inicio; i <= fin; i++) {
            if (esPrimo(i)) numeros.add(i);
            
        }
        modeloListado.clear();
        modeloListado.addAll(numeros);
    }
    
    public void actualizarTodo(Integer ini, Integer fin){
        inicio = ini;
        this.fin = fin;
        actualizarLista();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listado = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 300));
        setPreferredSize(new java.awt.Dimension(300, 300));
        setResizable(false);

        boton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        boton.setForeground(new java.awt.Color(255, 51, 51));
        boton.setText("RECALCULAR");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
        getContentPane().add(boton, java.awt.BorderLayout.SOUTH);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTADO DE NUMEROS PRIMOS");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setViewportView(listado);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        dialogo.setup(inicio, fin);
        dialogo.setVisible(true);
    }//GEN-LAST:event_botonActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrimos().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listado;
    // End of variables declaration//GEN-END:variables
}
