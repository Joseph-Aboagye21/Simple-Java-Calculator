
package forms;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;

/**
 *
 * @author Nanarh
 */
public class JMain extends javax.swing.JFrame {

    /**
     * Creates new form JMain
     */
    
    //Grouping the radiobuttons
    private void groupButton(){
        ButtonGroup bg1 = new ButtonGroup(); 
        bg1.add(rbAdd);
        bg1.add(rbSubtract);
        bg1.add(rbMultiply);
        bg1.add(rbDivide);
    }
    public JMain() {
        initComponents();
        groupButton();
        //setting the title
        this.setTitle("Calculator");
        
        //setting the location of the JFrame
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int x = (d.width - this.getWidth())/2;
        int y = (d.height - this.getHeight())/2;
        this.setLocation(x, y);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfFirst = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfSecond = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfResult = new javax.swing.JTextField();
        bnClear = new javax.swing.JButton();
        bnCalculate = new javax.swing.JButton();
        bnEnd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rbAdd = new javax.swing.JRadioButton();
        rbSubtract = new javax.swing.JRadioButton();
        rbMultiply = new javax.swing.JRadioButton();
        rbDivide = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Math Calculator");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("First Number");

        tfFirst.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Second Number");

        tfSecond.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Result");

        tfResult.setEditable(false);
        tfResult.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        bnClear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bnClear.setText("Clear");
        bnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnClearActionPerformed(evt);
            }
        });

        bnCalculate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bnCalculate.setText("Calculate");
        bnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCalculateActionPerformed(evt);
            }
        });

        bnEnd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bnEnd.setText("End");
        bnEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnEndActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        rbAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbAdd.setText("Add");

        rbSubtract.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbSubtract.setText("Subtract");

        rbMultiply.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbMultiply.setText("Multiply");

        rbDivide.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbDivide.setText("Divide");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbAdd)
                    .addComponent(rbSubtract)
                    .addComponent(rbMultiply)
                    .addComponent(rbDivide))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbSubtract)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbMultiply)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbDivide))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bnClear)
                        .addGap(18, 18, 18)
                        .addComponent(bnCalculate)
                        .addGap(18, 18, 18)
                        .addComponent(bnEnd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfFirst)
                            .addComponent(tfSecond)
                            .addComponent(tfResult, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfResult, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnClear)
                    .addComponent(bnCalculate)
                    .addComponent(bnEnd))
                .addGap(70, 70, 70))
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
    }// </editor-fold>//GEN-END:initComponents

    private void bnEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnEndActionPerformed
        // Exiting the system
        System.exit(0);
    }//GEN-LAST:event_bnEndActionPerformed

    private void bnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnClearActionPerformed
        // Clearing the textfields
        tfFirst.setText("");
        tfSecond.setText("");
        tfResult.setText("");
        rbAdd.setSelected(true);
        tfFirst.requestFocus();
        tfSecond.requestFocus();
    }//GEN-LAST:event_bnClearActionPerformed

    private void bnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCalculateActionPerformed
        // Codes to perform the calculations
        try{
            if(tfFirst.getText().isEmpty() || tfSecond.getText().isEmpty() ){
                JOptionPane.showMessageDialog(null, "TextFields cannot be empty","Error",JOptionPane.ERROR_MESSAGE);
                tfFirst.requestFocus();
                tfSecond.requestFocus();
                
            }else{
                double num1 = Double.parseDouble(tfFirst.getText());
                double num2 = Double.parseDouble(tfSecond.getText());
                double ans;
                
                if(rbAdd.isSelected()){
                    ans = num1 + num2;
                    tfResult.setText(Double.toString(ans));
                }else if(rbSubtract.isSelected()){
                    ans = num1 - num2;
                    tfResult.setText(Double.toString(ans));
                }else if(rbMultiply.isSelected()){
                    ans = num1 * num2;
                    tfResult.setText(Double.toString(ans));
                }else if(rbDivide.isSelected()){
                    if(num2 == 0){
                        JOptionPane.showMessageDialog(null, "Last number cannot be zero","Error",JOptionPane.ERROR_MESSAGE);
                        
                    }else{
                    ans = num1 / num2;
                    tfResult.setText(Double.toString(ans));
                }
                }else{
                    JOptionPane.showMessageDialog(null, "Choose an operator","Error",JOptionPane.ERROR_MESSAGE);   
                }  
            }
        }catch (Exception e){
             JOptionPane.showMessageDialog(null, "Input isn't numeric","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bnCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(JMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnCalculate;
    private javax.swing.JButton bnClear;
    private javax.swing.JButton bnEnd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rbAdd;
    private javax.swing.JRadioButton rbDivide;
    private javax.swing.JRadioButton rbMultiply;
    private javax.swing.JRadioButton rbSubtract;
    private javax.swing.JTextField tfFirst;
    private javax.swing.JTextField tfResult;
    private javax.swing.JTextField tfSecond;
    // End of variables declaration//GEN-END:variables

}
