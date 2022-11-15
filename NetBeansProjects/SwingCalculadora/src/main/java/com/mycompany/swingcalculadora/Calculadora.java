package com.mycompany.swingcalculadora;

import java.awt.Font;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnPorcentaje = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnComa = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        setMinimumSize(new java.awt.Dimension(360, 515));
        setPreferredSize(new java.awt.Dimension(360, 515));
        setResizable(false);

        texto.setColumns(100);
        texto.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        texto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        texto.setText("0");
        texto.setMinimumSize(new java.awt.Dimension(64, 140));
        texto.setPreferredSize(new java.awt.Dimension(4214, 140));
        texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoActionPerformed(evt);
            }
        });
        getContentPane().add(texto, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(new java.awt.GridLayout(5, 4, 10, 5));

        btnPorcentaje.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPorcentaje.setText("%");
        btnPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentajeActionPerformed(evt);
            }
        });
        jPanel1.add(btnPorcentaje);

        btnRaiz.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnRaiz.setText("√");
        btnRaiz.setMinimumSize(new java.awt.Dimension(107, 47));
        btnRaiz.setPreferredSize(new java.awt.Dimension(107, 47));
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });
        jPanel1.add(btnRaiz);

        btnDividir.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnDividir.setText("/");
        btnDividir.setMinimumSize(new java.awt.Dimension(107, 47));
        btnDividir.setPreferredSize(new java.awt.Dimension(107, 47));
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });
        jPanel1.add(btnDividir);

        btnBorrar.setText("⌫");
        btnBorrar.setMinimumSize(new java.awt.Dimension(107, 47));
        btnBorrar.setPreferredSize(new java.awt.Dimension(107, 47));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar);

        btnSiete.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiete);

        btnOcho.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnOcho.setText("8");
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });
        jPanel1.add(btnOcho);

        btnNueve.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnNueve.setText("9");
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        jPanel1.add(btnNueve);

        btnMultiplicar.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        btnMultiplicar.setText("X");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMultiplicar);

        btnCuatro.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnCuatro.setText("4");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        jPanel1.add(btnCuatro);

        btnCinco.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCinco);

        btnSeis.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeis);

        btnRestar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnRestar.setText("-");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRestar);

        btnUno.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnUno.setText("1");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        jPanel1.add(btnUno);

        btnDos.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnDos.setText("2");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        jPanel1.add(btnDos);

        btnTres.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        jPanel1.add(btnTres);

        btnSumar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnSumar.setText("+");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSumar);

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDelete.setText("DEL");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);

        btnCero.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnCero.setText("0");
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });
        jPanel1.add(btnCero);

        btnComa.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnComa.setText(".");
        btnComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComaActionPerformed(evt);
            }
        });
        jPanel1.add(btnComa);

        btnResultado.setBackground(new java.awt.Color(51, 204, 255));
        btnResultado.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btnResultado.setText("=");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });
        jPanel1.add(btnResultado);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String operacion;
    private Float num1;
    private Float num2;
    private int num3;
    private Float resultado;
    private Font fuente = new Font("Segoe", 0, 48);

    private void actualizar() {
        texto.setFont(this.fuente);
        texto.setText("0");
    }

    private Float resultado(Float num1, Float num2, String operacion, int num3) {
        switch (operacion) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "x":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            case "raiz":
                double f1 = Math.sqrt(num3);
                String s1 = Double.toString(f1);
                resultado = Float.parseFloat(s1);
                break;
            case "porcentaje":
                double f2 = num1 * 0.01;
                String s2 = Double.toString(f2);
                resultado = Float.parseFloat(s2);
                break;
        }
        return resultado;
    }

    private void textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        // TODO add your handling code here:
        num1 = Float.parseFloat(texto.getText());
        texto.setText("");
        operacion = "x";
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        // TODO add your handling code here:
        if (texto.getText().equals("0")) {
            texto.setText("1");
        } else {
            texto.setText(texto.getText() + "1");
        }
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        if (texto.getText().equals("0")) {
            texto.setText("2");
        } else {
            texto.setText(texto.getText() + "2");
        }
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        if (texto.getText().equals("0")) {
            texto.setText("3");
        } else {
            texto.setText(texto.getText() + "3");
        }
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        if (texto.getText().equals("0")) {
            texto.setText("4");
        } else {
            texto.setText(texto.getText() + "4");
        }
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        if (texto.getText().equals("0")) {
            texto.setText("5");
        } else {
            texto.setText(texto.getText() + "5");
        }
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        if (texto.getText().equals("0")) {
            texto.setText("6");
        } else {
            texto.setText(texto.getText() + "6");
        }
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        if (texto.getText().equals("0")) {
            texto.setText("7");
        } else {
            texto.setText(texto.getText() + "7");
        }
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        if (texto.getText().equals("0")) {
            texto.setText("8");
        } else {
            texto.setText(texto.getText() + "8");
        }
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        if (texto.getText().equals("0")) {
            texto.setText("9");
        } else {
            texto.setText(texto.getText() + "9");
        }
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        num1 = num2 = 0f;
        actualizar();
    }//GEN-LAST:event_btnDeleteActionPerformed


    private void btnComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComaActionPerformed
        texto.setText(texto.getText() + ".");
    }//GEN-LAST:event_btnComaActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        num2 = Float.parseFloat(texto.getText());
        if (num2 == 0) {
            Font f = new Font("Arial", 0, 18);
            texto.setFont(f);
            texto.setText("No se puede dividir por 0");
        } else {
            resultado(num1, num2, operacion, num3);
            String result = resultado.toString();
            if (resultado % 1 == 0) {
                //A los numeros enteros les quitamos los decimales 0.00
                result = result.substring(0, result.length() - 2);
            }
            texto.setText(result);
        }
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        // TODO add your handling code here:
        num1 = Float.parseFloat(texto.getText());
        texto.setText("");
        operacion = "+";
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        // TODO add your handling code here:
        num1 = Float.parseFloat(texto.getText());
        texto.setText("");
        operacion = "-";
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        // TODO add your handling code here:
        if(!"0".equals(texto.getText())){
            texto.setText(texto.getText() + "0");
        }
        
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        // TODO add your handling code here:
        num1 = Float.parseFloat(texto.getText());
        texto.setText("");
        operacion = "/";
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        num3 = Integer.parseInt(texto.getText()); 
        operacion = "raiz";
        resultado(num1, num2, operacion, num3);
        String result = resultado.toString();
        if(resultado%1 == 0 ){
            result = result.substring(0, result.length()-2);
        } 
        texto.setText(result);
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        if(!"0".equals(texto.getText())){
            texto.setText(texto.getText().substring(0, texto.getText().length() - 1));
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentajeActionPerformed
        num1 = Float.parseFloat(texto.getText()); 
        operacion = "porcentaje";
        resultado(num1, num2, operacion, num3);
        
        String result = resultado.toString();
        if(resultado%1 == 0 ){
            result = result.substring(0, result.length()-2);
        } 
        texto.setText(result);
    }//GEN-LAST:event_btnPorcentajeActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnComa;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField texto;
    // End of variables declaration//GEN-END:variables
}
