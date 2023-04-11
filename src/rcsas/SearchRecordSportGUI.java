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
public class SearchRecordSportGUI extends javax.swing.JFrame {

    /**
     * Creates new form SearchRecordGUI
     */
    public SearchRecordSportGUI() {
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
        SportIDInput = new javax.swing.JTextField();
        SearchByIDButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SportDetailsOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Search Record");

        BackButton.setBackground(new java.awt.Color(204, 255, 204));
        BackButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        BackButton.setForeground(new java.awt.Color(204, 51, 0));
        BackButton.setText("BACK");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Sport ID");

        SportIDInput.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N

        SearchByIDButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SearchByIDButton.setForeground(new java.awt.Color(51, 153, 0));
        SearchByIDButton.setText("Search by ID");
        SearchByIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByIDButtonActionPerformed(evt);
            }
        });

        SportDetailsOutput.setColumns(20);
        SportDetailsOutput.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SportDetailsOutput.setRows(5);
        SportDetailsOutput.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        SportDetailsOutput.setEnabled(false);
        jScrollPane1.setViewportView(SportDetailsOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(SportIDInput)
                                .addComponent(SearchByIDButton, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel2)))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(BackButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(SportIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(SearchByIDButton)
                .addGap(29, 29, 29)
                .addComponent(BackButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        dispose();
        SearchRecordGUI searchRecordGUI = new SearchRecordGUI();
        searchRecordGUI.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    private void SearchByIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByIDButtonActionPerformed
        String sportID = SportIDInput.getText();
        SportDetailsOutput.setText("");
        SearchBySportID(sportID);
    }//GEN-LAST:event_SearchByIDButtonActionPerformed

    private void SearchBySportID(String sportID) {
        File f = new File("sport_details.txt");
        
        try {
            Scanner buffer = new Scanner(f);
            
            while (buffer.hasNext()) {
                String line = buffer.nextLine();
                
                if (line.isEmpty()) {
                    line = buffer.nextLine();
                }
                
                if (line.contains("SPORT ID")) {
                    if (line.substring(10).equals(sportID)) {
                        while (!line.isEmpty()) {
                            SportDetailsOutput.append(line + "\n");
                            line = buffer.nextLine();
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Unable to read file.");
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
            java.util.logging.Logger.getLogger(SearchRecordSportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchRecordSportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchRecordSportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchRecordSportGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchRecordSportGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton SearchByIDButton;
    private javax.swing.JTextArea SportDetailsOutput;
    private javax.swing.JTextField SportIDInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
