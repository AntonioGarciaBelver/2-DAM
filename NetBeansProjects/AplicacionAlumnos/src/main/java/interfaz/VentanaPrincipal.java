package interfaz;

import controller.AlumnoDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Alumno;

public class VentanaPrincipal extends javax.swing.JFrame {

    static AlumnoDAO datos;
    private Integer idAlumnoActual;
    
    public VentanaPrincipal(AlumnoDAO datosExternos) {
            
        datos = datosExternos;
        initComponents();
        
        actualizarTabla();
               
    }

    private void actualizarTabla() {
        ArrayList<Alumno> alumnos = datos.getAll();
        ((DefaultTableModel) tabla.getModel()).setRowCount(0);
        for(var a: alumnos){
            Object fila [] = {
                a.getId(),
                a.getNombre(),
                a.getApellidos(),
                a.getCurso()
            };
            
            ( (DefaultTableModel) tabla.getModel() ).addRow(fila);
//            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
//            model.addRow(fila);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Curso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.setShowGrid(false);
        tabla.setShowHorizontalLines(true);
        tabla.setShowVerticalLines(true);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.PAGE_AXIS));

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        btnGuardar.setText("Actualizar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardar);

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnBorrar);

        jPanel1.add(jPanel3, java.awt.BorderLayout.EAST);

        jPanel2.setLayout(new java.awt.GridLayout(3, 2, 15, 5));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre");
        jPanel2.add(jLabel1);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombre);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Apellidos");
        jPanel2.add(jLabel3);
        jPanel2.add(txtApellidos);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Curso");
        jPanel2.add(jLabel2);
        jPanel2.add(txtCurso);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        jMenu1.setText("Archivo");

        jMenuItem2.setText("Salir..");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        Integer pos_actual = tabla.getSelectedRow();
        
        DefaultTableModel modeloTabla = (DefaultTableModel) tabla.getModel();
        
        txtNombre.setText((String) (modeloTabla).getValueAt(pos_actual, 1));
        txtApellidos.setText((String) (modeloTabla).getValueAt(pos_actual, 2));
        txtCurso.setText((String) (modeloTabla).getValueAt(pos_actual, 3));
        
        idAlumnoActual = (Integer) modeloTabla.getValueAt(pos_actual, 0);
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(formularioVacio()) return;
        
        Alumno alumno = new Alumno();
        alumno.setNombre( txtNombre.getText());
        alumno.setApellidos(txtApellidos.getText());
        alumno.setCurso(txtCurso.getText());
        datos.add(alumno);
        
        actualizarTabla();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(formularioVacio()) return;
        
        Alumno alumno = new Alumno();
        alumno.setNombre( txtNombre.getText());
        alumno.setApellidos(txtApellidos.getText());
        alumno.setCurso(txtCurso.getText());
        
        datos.update(alumno);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        if(formularioVacio()) return;
        
        Integer opcion = JOptionPane.showConfirmDialog(null, "¿Deseas Borrar?");
        if(opcion == 0){
            datos.delete(idAlumnoActual);
            actualizarTabla();
            
            idAlumnoActual = null;
            borrarFormulario();
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private boolean formularioVacio() {
        // TODO add your handling code here:
        return("".equals(txtNombre.getText()) ||
                "".equals(txtApellidos.getText()) ||
                "".equals(txtCurso.getText()));
    }
    
    private void borrarFormulario() {
        
        txtNombre.setText("");
        txtApellidos.setText("");
        txtCurso.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables


    
}
