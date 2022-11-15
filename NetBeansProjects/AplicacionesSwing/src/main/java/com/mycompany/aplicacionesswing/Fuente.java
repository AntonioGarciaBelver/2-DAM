package com.mycompany.aplicacionesswing;

import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;

public class Fuente extends javax.swing.JDialog {

    private EditorTexto ventanaPadre;
    GraphicsEnvironment gEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
    private String[] fontName = gEnv.getAvailableFontFamilyNames();
    private String[] fontStyle = {"Normal", "Negrita", "Cursiva", "Cursiva y Negrita"};
    private String[] fontSizes = {"10", "12", "14", "16", "18", "20", "22", "24",
                                   "26", "28", "30", "36", "42", "48", "60","72"};
    public Font font;
    private int estilo = 0;
    private Color color = black;
    private String mayus = "normal";
    
    public Fuente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ventanaPadre = (EditorTexto) parent;
        initComponents();
      
        comboFont.setModel(new DefaultComboBoxModel<>(fontName));
        comboStyle.setModel(new DefaultComboBoxModel<>(fontStyle));
        comboSize.setModel(new DefaultComboBoxModel<>(fontSizes));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        comboFont = new javax.swing.JComboBox<>();
        comboStyle = new javax.swing.JComboBox<>();
        comboSize = new javax.swing.JComboBox<>();
        btnColor = new javax.swing.JButton();
        comboMayus = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        textoPrueba = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fuente");
        setMinimumSize(new java.awt.Dimension(365, 360));
        setModal(true);
        setResizable(false);

        jPanel2.setMinimumSize(new java.awt.Dimension(350, 500));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Fuente: ");
        jLabel1.setMaximumSize(new java.awt.Dimension(41, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(41, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(115, 70));
        jPanel2.add(jLabel1);

        jLabel2.setText("Estilo de fuente:");
        jLabel2.setPreferredSize(new java.awt.Dimension(115, 16));
        jPanel2.add(jLabel2);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Tamaño:");
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 16));
        jPanel2.add(jLabel3);

        jLabel4.setText(" Color:");
        jLabel4.setPreferredSize(new java.awt.Dimension(70, 16));
        jPanel2.add(jLabel4);
        jLabel4.getAccessibleContext().setAccessibleName("Color:");

        jLabel5.setText("Aa");
        jLabel5.setPreferredSize(new java.awt.Dimension(65, 16));
        jPanel2.add(jLabel5);

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel4.setPreferredSize(new java.awt.Dimension(500, 100));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        comboFont.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arial", " " }));
        comboFont.setMinimumSize(new java.awt.Dimension(80, 22));
        comboFont.setPreferredSize(new java.awt.Dimension(110, 22));
        comboFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFontActionPerformed(evt);
            }
        });
        jPanel4.add(comboFont);

        comboStyle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal" }));
        comboStyle.setMinimumSize(new java.awt.Dimension(110, 22));
        comboStyle.setPreferredSize(new java.awt.Dimension(110, 22));
        comboStyle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboStyleActionPerformed(evt);
            }
        });
        jPanel4.add(comboStyle);

        comboSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10" }));
        comboSize.setMinimumSize(new java.awt.Dimension(75, 22));
        comboSize.setPreferredSize(new java.awt.Dimension(75, 22));
        comboSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSizeActionPerformed(evt);
            }
        });
        jPanel4.add(comboSize);

        btnColor.setText("Color");
        btnColor.setPreferredSize(new java.awt.Dimension(60, 22));
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });
        jPanel4.add(btnColor);

        comboMayus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "MAYUSCULAS", "minusculas", "CamelCase" }));
        comboMayus.setPreferredSize(new java.awt.Dimension(70, 22));
        comboMayus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMayusActionPerformed(evt);
            }
        });
        jPanel4.add(comboMayus);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.setMinimumSize(new java.awt.Dimension(381, 32));
        jPanel1.setPreferredSize(new java.awt.Dimension(328, 150));

        jPanel5.setPreferredSize(new java.awt.Dimension(300, 100));

        textoPrueba.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoPrueba.setText("AaBbYyZz");
        textoPrueba.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel5.add(textoPrueba);

        jPanel1.add(jPanel5);

        jPanel3.setMinimumSize(new java.awt.Dimension(163, 50));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 32));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel3.add(btnAceptar);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancelar);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboStyleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStyleActionPerformed
        Font font = textoPrueba.getFont();
        String size = comboSize.getSelectedItem().toString();
        String style = comboStyle.getSelectedItem().toString();
        
        
        switch(style){
            case "Normal" -> this.estilo = 0;
            case "Negrita" -> this.estilo = 0;
            case "Cursiva" -> this.estilo = 0;
            case "Cursiva y Negrita" -> this.estilo = 0;
        }
    
        textoPrueba.setFont(new Font(font.getFontName(), this.estilo, 
                                                Integer.parseInt(size)));
        this.font = textoPrueba.getFont();
    }//GEN-LAST:event_comboStyleActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        ventanaPadre.actualizarTabla(this.font, this.color, this.mayus);
        this.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void comboSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSizeActionPerformed
        // Selecionamos tamano texto
        String getSize = comboSize.getSelectedItem().toString();
        Font f = textoPrueba.getFont();
        // Seteamos nuevo tamano
        textoPrueba.setFont(new Font(f.getFontName(),
        f.getStyle(), Integer.parseInt(getSize)));
        this.font = textoPrueba.getFont();
    }//GEN-LAST:event_comboSizeActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void comboFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFontActionPerformed
        // TODO add your handling code here:
        String getSize = comboSize.getSelectedItem().toString();
        Font f = textoPrueba.getFont();
        // setting new size
        textoPrueba.setFont(new Font(comboFont.getSelectedItem().toString(), 
                                    f.getStyle(), Integer.parseInt(getSize)));
        this.font = textoPrueba.getFont();
    }//GEN-LAST:event_comboFontActionPerformed

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
        // TODO add your handling code here:
        JColorChooser colorChooser = new JColorChooser();
        Color color = colorChooser.showDialog(null, "Choose a color", Color.black);
        this.color = color;
        textoPrueba.setForeground(color);
    }//GEN-LAST:event_btnColorActionPerformed

    private void comboMayusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMayusActionPerformed
        // TODO add your handling code here:
        String style = comboMayus.getSelectedItem().toString();
        if("MAYUSCULAS".equals(style)){
            textoPrueba.setText(textoPrueba.getText().toUpperCase());
            this.mayus = "MAYUSCULAS";
        }else if("minusculas".equals(style)){
            textoPrueba.setText(textoPrueba.getText().toLowerCase());
            this.mayus = "minusculas";
        }else if("CamelCase".equals(style)){
            textoPrueba.setText(ventanaPadre.convertToCamelCase(textoPrueba.getText()));
            this.mayus = "CamelCase";
        }
    }//GEN-LAST:event_comboMayusActionPerformed
   
    
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
            java.util.logging.Logger.getLogger(Fuente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fuente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fuente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fuente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Fuente dialog = new Fuente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnColor;
    private javax.swing.JComboBox<String> comboFont;
    private javax.swing.JComboBox<String> comboMayus;
    private javax.swing.JComboBox<String> comboSize;
    private javax.swing.JComboBox<String> comboStyle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel textoPrueba;
    // End of variables declaration//GEN-END:variables
}
