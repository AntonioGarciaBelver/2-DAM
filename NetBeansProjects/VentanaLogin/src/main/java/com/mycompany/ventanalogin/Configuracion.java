package com.mycompany.ventanalogin;

import javax.swing.JFrame;

public class Configuracion extends javax.swing.JDialog {

    private VentanaPrimos ventanaPadre;
    
    public Configuracion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ventanaPadre = (VentanaPrimos) parent;
        initComponents();
    }
    
    public void setup(Integer inicio, Integer fin){
        this.inicio.getModel().setValue(inicio);
        this.fin.getModel().setValue(fin);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        inicio = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        fin = new javax.swing.JSpinner();
        btnCalcular = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 2, 20, 5));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Inicial");
        getContentPane().add(jLabel1);
        getContentPane().add(inicio);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Final");
        getContentPane().add(jLabel2);
        getContentPane().add(fin);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        this.setVisible(false);
        ventanaPadre.actualizarTodo(
                (Integer)this.inicio.getModel().getValue(), 
                (Integer)this.fin.getModel().getValue());
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JSpinner fin;
    private javax.swing.JSpinner inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
