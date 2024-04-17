/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AlumnoT
 */
public class Ej02 extends javax.swing.JFrame {

    /**
     * Creates new form Ej02
     */
    public Ej02() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLableNum1 = new javax.swing.JLabel();
        jLabelNum2 = new javax.swing.JLabel();
        jTextoNum1 = new javax.swing.JTextField();
        jTextoNum2 = new javax.swing.JTextField();
        jLabelResultado = new javax.swing.JLabel();
        jBtnSuma = new javax.swing.JButton();
        jBtnResta = new javax.swing.JButton();
        jBtnMulti = new javax.swing.JButton();
        jBtnDivision = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Fira Code Medium", 0, 12)); // NOI18N

        jLableNum1.setText("Numero 1");

        jLabelNum2.setText("Numero 2");

        jTextoNum1.setText("Inserte numero");
        jTextoNum1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextoNum1MouseClicked(evt);
            }
        });

        jTextoNum2.setText("Inserte numero");
        jTextoNum2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextoNum2MouseClicked(evt);
            }
        });

        jLabelResultado.setFont(new java.awt.Font("Fira Code Light", 1, 12)); // NOI18N
        jLabelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultado.setText("Resultado");
        jLabelResultado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jBtnSuma.setText("Suma");
        jBtnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSumaActionPerformed(evt);
            }
        });

        jBtnResta.setText("Resta");
        jBtnResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRestaActionPerformed(evt);
            }
        });

        jBtnMulti.setText("Multiplicacion");
        jBtnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMultiActionPerformed(evt);
            }
        });

        jBtnDivision.setText("Division");
        jBtnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDivisionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLableNum1)
                            .addComponent(jLabelNum2))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextoNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextoNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jBtnSuma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnResta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnMulti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnDivision)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLableNum1)
                    .addComponent(jTextoNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNum2)
                    .addComponent(jTextoNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSuma)
                    .addComponent(jBtnResta)
                    .addComponent(jBtnMulti)
                    .addComponent(jBtnDivision))
                .addGap(26, 26, 26)
                .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMultiActionPerformed
        String msg;
        try{
            double num1 = Double.parseDouble(jTextoNum1.getText());
            double num2 = Double.parseDouble(jTextoNum2.getText());
            
            double multi = num1*num2;
            msg = ""+multi;
            
        }catch(Exception e){
            msg = "[ERROR]";
        }
        
        jLabelResultado.setText(msg);
    }//GEN-LAST:event_jBtnMultiActionPerformed

    private void jBtnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRestaActionPerformed
        String msg;
        try{
            double num1 = Double.parseDouble(jTextoNum1.getText());
            double num2 = Double.parseDouble(jTextoNum2.getText());
            
            double resta = num1-num2;
            msg = ""+resta;
            
        }catch(Exception e){
            msg = "[ERROR]";
        }
        
        jLabelResultado.setText(msg);
    }//GEN-LAST:event_jBtnRestaActionPerformed

    private void jBtnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSumaActionPerformed
        String msg;
        try{
            double num1 = Double.parseDouble(jTextoNum1.getText());
            double num2 = Double.parseDouble(jTextoNum2.getText());
            
            double suma = (num1+num2);
            msg = ""+suma;
            
        }catch(Exception e){
            msg = "[ERROR]";
        }
        
        jLabelResultado.setText(msg);
    }//GEN-LAST:event_jBtnSumaActionPerformed

    private void jBtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDivisionActionPerformed
        String msg;
        try{
            double num1 = Double.parseDouble(jTextoNum1.getText());
            double num2 = Double.parseDouble(jTextoNum2.getText());
            
            double division = num1/num2;
            msg = ""+division;
            
        }catch(Exception e){
            msg = "[ERROR]";
        }
        
        jLabelResultado.setText(msg);
    }//GEN-LAST:event_jBtnDivisionActionPerformed

    private void jTextoNum1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextoNum1MouseClicked
        jTextoNum1.setText("");
    }//GEN-LAST:event_jTextoNum1MouseClicked

    private void jTextoNum2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextoNum2MouseClicked
        jTextoNum2.setText("");
    }//GEN-LAST:event_jTextoNum2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void ejecutar() {
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
            java.util.logging.Logger.getLogger(Ej02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ej02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ej02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ej02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ej02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDivision;
    private javax.swing.JButton jBtnMulti;
    private javax.swing.JButton jBtnResta;
    private javax.swing.JButton jBtnSuma;
    private javax.swing.JLabel jLabelNum2;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLableNum1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextoNum1;
    private javax.swing.JTextField jTextoNum2;
    // End of variables declaration//GEN-END:variables
}
