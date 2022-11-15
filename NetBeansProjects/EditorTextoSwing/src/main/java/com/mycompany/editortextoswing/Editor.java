package com.mycompany.editortextoswing;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;

public class Editor extends javax.swing.JFrame {

    GraphicsEnvironment gEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
    private String[] fontName = gEnv.getAvailableFontFamilyNames();
    private String[] fontStyle = {"Normal", "Negrita", "Cursiva", "Cursiva y Negrita"};
    private String[] fontSizes = {"10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38"};
    public Font font;
    public int estilo = 0;

    
    public Editor() {
        initComponents();
        
        cbFont.setModel(new DefaultComboBoxModel<>(fontName));
        cbStyle.setModel(new DefaultComboBoxModel<>(fontSizes));
        cbSize.setModel(new DefaultComboBoxModel<>(fontStyle));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cbFont = new javax.swing.JComboBox<>();
        cbStyle = new javax.swing.JComboBox<>();
        cbSize = new javax.swing.JComboBox<>();
        btnColor = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        lblTexto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel1.setLayout(new java.awt.BorderLayout());

        cbFont.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial" }));
        cbFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFontActionPerformed(evt);
            }
        });
        jPanel3.add(cbFont);

        cbStyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", " " }));
        cbStyle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStyleActionPerformed(evt);
            }
        });
        jPanel3.add(cbStyle);

        cbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38" }));
        cbSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSizeActionPerformed(evt);
            }
        });
        jPanel3.add(cbSize);

        btnColor.setText("Color");
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });
        jPanel3.add(btnColor);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(300, 300));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 500));

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setPreferredSize(new java.awt.Dimension(200, 200));
        jScrollPane1.setViewportView(textArea);

        jPanel2.add(jScrollPane1);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel4.setPreferredSize(new java.awt.Dimension(200, 200));

        lblTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTexto.setText("jLabel1");
        lblTexto.setPreferredSize(new java.awt.Dimension(200, 100));
        jPanel4.add(lblTexto);

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFontActionPerformed
        // TODO add your handling code here:
        String getSize = cbSize.getSelectedItem().toString();
        Font f = textArea.getFont();
        // setting new size
        textArea.setFont(new Font(cbFont.getSelectedItem().toString(), f.getStyle(), Integer.parseInt(getSize)));
        lblTexto.setFont(new Font(cbFont.getSelectedItem().toString(), f.getStyle(), Integer.parseInt(getSize)));
        

    }//GEN-LAST:event_cbFontActionPerformed

    private void cbSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSizeActionPerformed
        // TODO add your handling code here:
        Font style = textArea.getFont();
        String size = cbSize.getSelectedItem().toString();
        // setting new size
        textArea.setFont(new Font(style.getFontName(), style.getStyle(), Integer.parseInt(size)));
        lblTexto.setFont(new Font(style.getFontName(), style.getStyle(), Integer.parseInt(size)));
    }//GEN-LAST:event_cbSizeActionPerformed

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        // TODO add your handling code here:
        JColorChooser colorChooser = new JColorChooser();
        Color color = colorChooser.showDialog(null, "Choose a color", Color.black);
        
        textArea.setForeground(color);
        lblTexto.setForeground(color);
    }//GEN-LAST:event_btnColorActionPerformed

    private void cbStyleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStyleActionPerformed
        // TODO add your handling code here:
        Font style = textArea.getFont();
        String size = cbSize.getSelectedItem().toString();
        String estilo = cbStyle.getSelectedItem().toString();
        
        if(estilo == "Normal"){
            this.estilo = 0;
        }else if(estilo == "Cursiva"){
            this.estilo = 1;
        }else if(estilo == "Negrita"){
            this.estilo = 2;
        }else if(estilo == "Cursiva y Negrita"){
            this.estilo = 3;
        }
        
        textArea.setFont(new Font(style.getFontName(), this.estilo, Integer.parseInt(size)));
        lblTexto.setFont(new Font(style.getFontName(), this.estilo, Integer.parseInt(size)));
    }//GEN-LAST:event_cbStyleActionPerformed

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
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    public void setFont(Font font) {
        this.font = font;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColor;
    private javax.swing.JComboBox<String> cbFont;
    private javax.swing.JComboBox<String> cbSize;
    private javax.swing.JComboBox<String> cbStyle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
