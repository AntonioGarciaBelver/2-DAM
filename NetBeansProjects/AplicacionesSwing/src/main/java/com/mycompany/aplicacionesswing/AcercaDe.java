package com.mycompany.aplicacionesswing;

public class AcercaDe extends javax.swing.JDialog {

    private EditorTexto ventanaPadre;
    
    public AcercaDe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        ventanaPadre = (EditorTexto) parent;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerca de Editor de texto");
        setMinimumSize(new java.awt.Dimension(420, 450));
        setPreferredSize(new java.awt.Dimension(400, 450));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(457, 300));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("<html>Bloc de notas (en inglés: Notepad) es un editor de texto incluido <br> en los sistemas operativos de Microsoft desde 1985.1​. Su funcionalidad <br> es muy simple. Algunas características propias son: Inserción de hora y<br>  fecha actual pulsando F5, en  formato \"HH:MM DD/MM/AA\". Inserción de <br> hora y fecha actual si el documento comienza por \".LOG\". Ajuste de línea. <br> Posibilidad de exportar a cualquier formato de texto no formateado. Es<br> el equivalente en Windows del editor de MS-DOS. La extensión predeterminada de este <br> editor es *.txt.  En el bloc de notas se pueden crear Archivos batch al igual<br>  que programas en diferentes lenguajes como Java (lenguaje de <br> programación), Ruby, Python, HTML, Hoja de estilos en cascada (CSS),<br>  C (lenguaje de programación), C++, y C Sharp.<br><br></html>");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel2.setText("   Bloc de notas realizado por Antonio Garcia y Loren Lynch");
        jPanel1.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        jPanel2.add(jLabel4);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blocNotas.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jPanel2.add(jLabel3);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AcercaDe dialog = new AcercaDe(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
