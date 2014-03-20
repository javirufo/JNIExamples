/*
 * frmCalculadora.java
 *
 * Created on 14 de noviembre de 2006, 11:55
 */

import calculo.CalculadoraJNI;
/**
 *
 * @author  javi
 */
public class frmCalculadora extends javax.swing.JFrame {
    private int a,b;
    private char operacion;
    private int resultado;
    CalculadoraJNI calc;
    /** Creates new form frmCalculadora */
    public frmCalculadora() {
        initComponents();
        a=-1;
        b=-1;
        operacion = (char) -1;
        calc = new CalculadoraJNI();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        panelResultado = new javax.swing.JPanel();
        lblResultado = new javax.swing.JLabel();
        panelCalculadora = new javax.swing.JPanel();
        panelBotonesNumeros = new javax.swing.JPanel();
        cmd1 = new javax.swing.JButton();
        cmd2 = new javax.swing.JButton();
        cmd3 = new javax.swing.JButton();
        cmd4 = new javax.swing.JButton();
        cmd5 = new javax.swing.JButton();
        cmd6 = new javax.swing.JButton();
        cmd7 = new javax.swing.JButton();
        cmd8 = new javax.swing.JButton();
        cmd9 = new javax.swing.JButton();
        cmd0 = new javax.swing.JButton();
        panelOperaciones = new javax.swing.JPanel();
        cmdSuma = new javax.swing.JButton();
        cmdResta = new javax.swing.JButton();
        cmdMultiplica = new javax.swing.JButton();
        cmdDivide = new javax.swing.JButton();
        cmdResultado = new javax.swing.JButton();

        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        panelResultado.setLayout(new java.awt.BorderLayout());

        panelResultado.setBackground(new java.awt.Color(255, 255, 255));
        panelResultado.setMaximumSize(new java.awt.Dimension(2147483647, 70));
        panelResultado.setMinimumSize(new java.awt.Dimension(0, 70));
        panelResultado.setPreferredSize(new java.awt.Dimension(100, 70));
        lblResultado.setBackground(new java.awt.Color(255, 255, 255));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblResultado.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelResultado.add(lblResultado, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelResultado);

        panelCalculadora.setLayout(new javax.swing.BoxLayout(panelCalculadora, javax.swing.BoxLayout.X_AXIS));

        panelBotonesNumeros.setLayout(new java.awt.GridLayout(4, 3));

        cmd1.setText("1");
        cmd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd1ActionPerformed(evt);
            }
        });

        panelBotonesNumeros.add(cmd1);

        cmd2.setText("2");
        cmd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd2ActionPerformed(evt);
            }
        });

        panelBotonesNumeros.add(cmd2);

        cmd3.setText("3");
        cmd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd3ActionPerformed(evt);
            }
        });

        panelBotonesNumeros.add(cmd3);

        cmd4.setText("4");
        cmd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd4ActionPerformed(evt);
            }
        });

        panelBotonesNumeros.add(cmd4);

        cmd5.setText("5");
        cmd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd5ActionPerformed(evt);
            }
        });

        panelBotonesNumeros.add(cmd5);

        cmd6.setText("6");
        cmd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd6ActionPerformed(evt);
            }
        });

        panelBotonesNumeros.add(cmd6);

        cmd7.setText("7");
        cmd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd7ActionPerformed(evt);
            }
        });

        panelBotonesNumeros.add(cmd7);

        cmd8.setText("8");
        cmd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd8ActionPerformed(evt);
            }
        });

        panelBotonesNumeros.add(cmd8);

        cmd9.setText("9");
        cmd9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd9ActionPerformed(evt);
            }
        });

        panelBotonesNumeros.add(cmd9);

        cmd0.setText("0");
        cmd0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd0ActionPerformed(evt);
            }
        });

        panelBotonesNumeros.add(cmd0);

        panelCalculadora.add(panelBotonesNumeros);

        panelOperaciones.setLayout(new java.awt.GridLayout(5, 1));

        panelOperaciones.setMaximumSize(new java.awt.Dimension(100, 32767));
        panelOperaciones.setMinimumSize(new java.awt.Dimension(100, 125));
        cmdSuma.setText("+");
        cmdSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSumaActionPerformed(evt);
            }
        });

        panelOperaciones.add(cmdSuma);

        cmdResta.setText("-");
        cmdResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRestaActionPerformed(evt);
            }
        });

        panelOperaciones.add(cmdResta);

        cmdMultiplica.setText("*");
        cmdMultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMultiplicaActionPerformed(evt);
            }
        });

        panelOperaciones.add(cmdMultiplica);

        cmdDivide.setText("/");
        cmdDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDivideActionPerformed(evt);
            }
        });

        panelOperaciones.add(cmdDivide);

        cmdResultado.setText("=");
        cmdResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdResultadoActionPerformed(evt);
            }
        });

        panelOperaciones.add(cmdResultado);

        panelCalculadora.add(panelOperaciones);

        getContentPane().add(panelCalculadora);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdResultadoActionPerformed
        
        switch(operacion)
        {
            case '+':
                resultado = calc.suma(a, b);
                break;
            case '-':
                resultado = +calc.resta(a, b);
                break;
            case '*':
                resultado = calc.producto(a, b);
                break;
            case '/':
                resultado = calc.division(a, b);
                break;
            default:
                System.out.println("Operacion no permitida");                        
        }
        a=-1;
        b=-1;
        operacion = (char)-1;
        lblResultado.setText(Integer.toString(resultado));
    }//GEN-LAST:event_cmdResultadoActionPerformed

    private void cmdDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDivideActionPerformed
        operacion = '/';
    }//GEN-LAST:event_cmdDivideActionPerformed

    private void cmdMultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMultiplicaActionPerformed
        operacion = '*';
    }//GEN-LAST:event_cmdMultiplicaActionPerformed

    private void cmdRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRestaActionPerformed
        operacion = '-';
    }//GEN-LAST:event_cmdRestaActionPerformed

    private void cmdSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSumaActionPerformed
        operacion = '+';
    }//GEN-LAST:event_cmdSumaActionPerformed

    private void cmd0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd0ActionPerformed
        if (operacion==(char)-1)
            a = 0;
        else
            b = 0;
    }//GEN-LAST:event_cmd0ActionPerformed

    private void cmd9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd9ActionPerformed
        if (operacion==(char)-1)
            a = 9;
        else
            b = 9;
    }//GEN-LAST:event_cmd9ActionPerformed

    private void cmd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd8ActionPerformed
        if (operacion==(char)-1)
            a = 8;
        else
            b = 8;
    }//GEN-LAST:event_cmd8ActionPerformed

    private void cmd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd7ActionPerformed
        if (operacion==(char)-1)
            a = 7;
        else
            b = 7;
    }//GEN-LAST:event_cmd7ActionPerformed

    private void cmd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd6ActionPerformed
        if (operacion==(char)-1)
            a = 6;
        else
            b = 6;
    }//GEN-LAST:event_cmd6ActionPerformed

    private void cmd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd5ActionPerformed
        if (operacion==(char)-1)
            a = 5;
        else
            b = 5;
    }//GEN-LAST:event_cmd5ActionPerformed

    private void cmd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd4ActionPerformed
        if (operacion==(char)-1)
            a = 4;
        else
            b = 4;
    }//GEN-LAST:event_cmd4ActionPerformed

    private void cmd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd3ActionPerformed
        if (operacion==(char)-1)
            a = 3;
        else
            b = 3;
    }//GEN-LAST:event_cmd3ActionPerformed

    private void cmd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd2ActionPerformed
        if (operacion==(char)-1)
            a = 2;
        else
            b = 2;
    }//GEN-LAST:event_cmd2ActionPerformed

    private void cmd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd1ActionPerformed
        if (operacion==(char)-1)
            a = 1;
        else
            b = 1;
    }//GEN-LAST:event_cmd1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCalculadora().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd0;
    private javax.swing.JButton cmd1;
    private javax.swing.JButton cmd2;
    private javax.swing.JButton cmd3;
    private javax.swing.JButton cmd4;
    private javax.swing.JButton cmd5;
    private javax.swing.JButton cmd6;
    private javax.swing.JButton cmd7;
    private javax.swing.JButton cmd8;
    private javax.swing.JButton cmd9;
    private javax.swing.JButton cmdDivide;
    private javax.swing.JButton cmdMultiplica;
    private javax.swing.JButton cmdResta;
    private javax.swing.JButton cmdResultado;
    private javax.swing.JButton cmdSuma;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JPanel panelBotonesNumeros;
    private javax.swing.JPanel panelCalculadora;
    private javax.swing.JPanel panelOperaciones;
    private javax.swing.JPanel panelResultado;
    // End of variables declaration//GEN-END:variables
    
}