/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcsas;

/**
 *
 * @author user
 */
public class SearchRecordGUI extends javax.swing.JFrame {

    /**
     * Creates new form SearchRecordGUI
     */
    public SearchRecordGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        CoachButton = new javax.swing.JButton();
        SportButton = new javax.swing.JButton();
        RegisteredStudentsButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Search Record");

        CoachButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        CoachButton.setForeground(new java.awt.Color(0, 153, 153));
        CoachButton.setText("Coach");
        CoachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoachButtonActionPerformed(evt);
            }
        });

        SportButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SportButton.setForeground(new java.awt.Color(255, 51, 255));
        SportButton.setText("Sport");
        SportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SportButtonActionPerformed(evt);
            }
        });

        RegisteredStudentsButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        RegisteredStudentsButton.setForeground(new java.awt.Color(0, 204, 102));
        RegisteredStudentsButton.setText("Student");
        RegisteredStudentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisteredStudentsButtonActionPerformed(evt);
            }
        });

        BackButton.setBackground(new java.awt.Color(204, 255, 204));
        BackButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(204, 0, 0));
        BackButton.setText("BACK");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RegisteredStudentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CoachButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(CoachButton)
                .addGap(18, 18, 18)
                .addComponent(SportButton)
                .addGap(18, 18, 18)
                .addComponent(RegisteredStudentsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(BackButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CoachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoachButtonActionPerformed
        dispose();
        SearchRecordCoachGUI searchRecordCoachGUI = new SearchRecordCoachGUI();
        searchRecordCoachGUI.setVisible(true);
    }//GEN-LAST:event_CoachButtonActionPerformed

    private void SportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SportButtonActionPerformed
        dispose();
        SearchRecordSportGUI searchRecordSportGUI = new SearchRecordSportGUI();
        searchRecordSportGUI.setVisible(true);
    }//GEN-LAST:event_SportButtonActionPerformed

    private void RegisteredStudentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisteredStudentsButtonActionPerformed
        dispose();
        SearchRecordStudentGUI searchRecordStudentGUI = new SearchRecordStudentGUI();
        searchRecordStudentGUI.setVisible(true);
    }//GEN-LAST:event_RegisteredStudentsButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        dispose();
        AdminMainGUI adminMainGUI = new AdminMainGUI();
        adminMainGUI.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SearchRecordGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchRecordGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchRecordGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchRecordGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchRecordGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CoachButton;
    private javax.swing.JButton RegisteredStudentsButton;
    private javax.swing.JButton SportButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
