/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcsas;

import java.io.*;
import java.util.*;

/**
 *
 * @author user
 */
public class SearchRecordCoachGUI extends javax.swing.JFrame {

    /**
     * Creates new form SearchRecordGUI
     */
    public SearchRecordCoachGUI() {
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
        BackButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CoachIDInput = new javax.swing.JTextField();
        RatingInput = new javax.swing.JTextField();
        SearchByIDButton = new javax.swing.JButton();
        SearchByRatingButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CoachDetailsOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(186, 223, 14));
        jLabel1.setText("Search Record");

        BackButton.setBackground(new java.awt.Color(204, 255, 204));
        BackButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(255, 51, 0));
        BackButton.setText("BACK");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Coach ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("Rating");

        CoachIDInput.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        RatingInput.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        SearchByIDButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SearchByIDButton.setForeground(new java.awt.Color(153, 102, 0));
        SearchByIDButton.setText("Search by ID");
        SearchByIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByIDButtonActionPerformed(evt);
            }
        });

        SearchByRatingButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SearchByRatingButton.setForeground(new java.awt.Color(153, 102, 0));
        SearchByRatingButton.setText("Search by Rating");
        SearchByRatingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByRatingButtonActionPerformed(evt);
            }
        });

        CoachDetailsOutput.setColumns(20);
        CoachDetailsOutput.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        CoachDetailsOutput.setRows(5);
        CoachDetailsOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CoachDetailsOutput.setEnabled(false);
        jScrollPane1.setViewportView(CoachDetailsOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CoachIDInput)
                                .addGap(109, 109, 109)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RatingInput, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(75, 75, 75)))
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(BackButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchByIDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(SearchByRatingButton)))
                        .addContainerGap(46, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CoachIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RatingInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchByIDButton)
                    .addComponent(SearchByRatingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BackButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        dispose();
        SearchRecordGUI searchRecordGUI = new SearchRecordGUI();
        searchRecordGUI.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SearchByIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByIDButtonActionPerformed
        String coachID = CoachIDInput.getText();
        CoachDetailsOutput.setText("");
        SearchByCoachID(coachID);
    }//GEN-LAST:event_SearchByIDButtonActionPerformed

    private void SearchByRatingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByRatingButtonActionPerformed
        String rating = RatingInput.getText();
        CoachDetailsOutput.setText("");
        SearchByRating(rating);
    }//GEN-LAST:event_SearchByRatingButtonActionPerformed

    private void SearchByCoachID(String coachID) {
        File f = new File("coach_details.txt");
        
        try {
            Scanner buffer = new Scanner(f);
            
            while (buffer.hasNext()) {
                String line = buffer.nextLine();
                
                if (line.isEmpty()) {
                    line = buffer.nextLine();
                }
                
                if (line.contains("COACH ID")) {
                    if (line.substring(10).equals(coachID)) {
                        while (!line.isEmpty()) {
                            CoachDetailsOutput.append(line + "\n");
                            line = buffer.nextLine();
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Unable to read file.");
        }
    }

    private void SearchByRating(String rating) {
        File f = new File("coach_details.txt");
        
        try {
            Scanner buffer = new Scanner(f);
            List<String> temp = new ArrayList<>();
            String line;
            
            do {
                line = buffer.nextLine();
                temp.add(line);
                if (line.contains("RATING")) {
                    if (line.substring(8).equals(rating)) {
                        for (int i = temp.size() - 11; i <= temp.size(); i++) {
                            CoachDetailsOutput.append(temp.get(i) + "\n");
                        }
                        break;
                    }
                }
            } while (line != null);
        } catch (Exception e) {
            System.out.println("File does not exist.");
        }
    }
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
            java.util.logging.Logger.getLogger(SearchRecordCoachGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchRecordCoachGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchRecordCoachGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchRecordCoachGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchRecordCoachGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextArea CoachDetailsOutput;
    private javax.swing.JTextField CoachIDInput;
    private javax.swing.JTextField RatingInput;
    private javax.swing.JButton SearchByIDButton;
    private javax.swing.JButton SearchByRatingButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}