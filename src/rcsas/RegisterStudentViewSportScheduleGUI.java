/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcsas;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class RegisterStudentViewSportScheduleGUI extends javax.swing.JFrame {

    /**
     * Creates new form RegisterStudentViewSelfRecordGUI
     */
    public RegisterStudentViewSportScheduleGUI() {
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
        jLabel2 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        ChosenSportInput = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("SPORT SCHEDULE");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Choose sports:");

        BackButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 0, 0));
        BackButton.setText("BACK");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        SubmitButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(102, 0, 204));
        SubmitButton.setText("SUBMIT");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        ChosenSportInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Swimming", "Badminton", "Football", "Archery", "Gymnastics", "Volleyball", "Basketball", "Cricket", "Tennis", "Table Tennis" }));
        ChosenSportInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChosenSportInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(SubmitButton)
                        .addGap(38, 38, 38)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(ChosenSportInput, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(ChosenSportInput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubmitButton)
                    .addComponent(BackButton))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        String chosenSport = (String)ChosenSportInput.getSelectedItem();
        
        dispose();
        switch (chosenSport) {
            case "Swimming":
                SwimmingScheduleGUI swimmingScheduleGUI = new SwimmingScheduleGUI();
                swimmingScheduleGUI.setVisible(true);
                break;
            case "Badminton":
                BadmintonScheduleGUI badmintonScheduleGUI = new BadmintonScheduleGUI();
                badmintonScheduleGUI.setVisible(true);
                break;
            case "Football":
                FootballScheduleGUI footballScheduleGUI = new FootballScheduleGUI();
                footballScheduleGUI.setVisible(true);
                break;
            case "Archery":
                ArcheryScheduleGUI archeryScheduleGUI = new ArcheryScheduleGUI();
                archeryScheduleGUI.setVisible(true);
                break;
            case "Gymnastics":
                GymnasticsScheduleGUI gymnasticsScheduleGUI = new GymnasticsScheduleGUI();
                gymnasticsScheduleGUI.setVisible(true);
                break;
            case "Volleyball":
                VolleyballScheduleGUI volleyballScheduleGUI = new VolleyballScheduleGUI();
                volleyballScheduleGUI.setVisible(true);
                break;
            case "Basketball":
                BasketballScheduleGUI basketballScheduleGUI = new BasketballScheduleGUI();
                basketballScheduleGUI.setVisible(true);
                break;
            case "Cricket":
                CricketScheduleGUI cricketScheduleGUI = new CricketScheduleGUI();
                cricketScheduleGUI.setVisible(true);
                break;
            case "Tennis":
                TennisScheduleGUI tennisScheduleGUI = new TennisScheduleGUI();
                tennisScheduleGUI.setVisible(true);
                break;
            case "Table Tennis":
                TableTennisScheduleGUI tableTennisScheduleGUI = new TableTennisScheduleGUI();
                tableTennisScheduleGUI.setVisible(true);
                break;
            default:
                System.out.println("Invalid selection.");
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        dispose();
        RegisterStudentViewDetailsGUI registerStudentViewDetailsGUI = new RegisterStudentViewDetailsGUI();
        registerStudentViewDetailsGUI.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ChosenSportInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChosenSportInputActionPerformed

    }//GEN-LAST:event_ChosenSportInputActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterStudentViewSportScheduleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterStudentViewSportScheduleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterStudentViewSportScheduleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterStudentViewSportScheduleGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterStudentViewSportScheduleGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JComboBox<String> ChosenSportInput;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}