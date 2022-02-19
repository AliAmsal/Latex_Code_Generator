/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latex;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author newac
 */
public class subsection extends javax.swing.JFrame {

    /**
     * Creates new form sections
     */
    String code = "";
    String filename= "output.tex";
    FileWriter fw;
    public subsection() {
        initComponents();
        openfile();
        contentTF.setEnabled(false);
       
    }

    subsection(String code) {
        initComponents();
        this.code = code;
    }
    
    /**
     *
     */
    public void openfile() {
         try {
            //the true will append the new data
            fw = new FileWriter(filename, true);

        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleTF = new javax.swing.JTextField();
        addItems = new javax.swing.JButton();
        addCode = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        contentTF = new javax.swing.JTextArea();
        addBody = new javax.swing.JButton();
        addTitle = new javax.swing.JButton();
        createSubsection = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTFActionPerformed(evt);
            }
        });
        getContentPane().add(titleTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 290, 40));

        addItems.setBorderPainted(false);
        addItems.setContentAreaFilled(false);
        addItems.setFocusPainted(false);
        addItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemsActionPerformed(evt);
            }
        });
        getContentPane().add(addItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 650, 130, 130));

        addCode.setBorderPainted(false);
        addCode.setContentAreaFilled(false);
        addCode.setFocusPainted(false);
        addCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCodeActionPerformed(evt);
            }
        });
        getContentPane().add(addCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 650, 110, 120));

        contentTF.setColumns(20);
        contentTF.setRows(5);
        jScrollPane1.setViewportView(contentTF);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 630, 140));

        addBody.setIcon(new javax.swing.ImageIcon(getClass().getResource("/latex/check (1).png"))); // NOI18N
        addBody.setBorderPainted(false);
        addBody.setContentAreaFilled(false);
        addBody.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBodyActionPerformed(evt);
            }
        });
        getContentPane().add(addBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, -1, -1));

        addTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/latex/check (1).png"))); // NOI18N
        addTitle.setBorderPainted(false);
        addTitle.setContentAreaFilled(false);
        addTitle.setFocusPainted(false);
        addTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTitleActionPerformed(evt);
            }
        });
        getContentPane().add(addTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 40, -1));

        createSubsection.setBorderPainted(false);
        createSubsection.setContentAreaFilled(false);
        createSubsection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSubsectionActionPerformed(evt);
            }
        });
        getContentPane().add(createSubsection, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 860, 420, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/latex/WhatsApp Image 2021-12-23 at 11.02.46 PM.jpeg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemsActionPerformed
        try {
            new items().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(subsection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addItemsActionPerformed

    private void addBodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBodyActionPerformed
        try {
            //code += '\n' + contentTF.getText();
            openfile();
            fw.write('\n' + contentTF.getText());
            fw.close();
            contentTF.setEditable(false);
            contentTF.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(subsection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addBodyActionPerformed

    private void addTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTitleActionPerformed
        try {
            //code += '\n' + "\\subsection{" + titleTF.getText() +  "}";
            openfile();
            fw.write('\n' + "\\subsection{" + titleTF.getText() +  "}");
            fw.close();
            contentTF.setEnabled(true);
            
            contentTF.setEditable(true);
            titleTF.setEditable(false);
            titleTF.setEnabled(false);
        } catch (IOException ex) {
            Logger.getLogger(subsection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addTitleActionPerformed

    private void titleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTFActionPerformed

    private void createSubsectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSubsectionActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_createSubsectionActionPerformed

    private void addCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCodeActionPerformed
        new code().setVisible(true);
    }//GEN-LAST:event_addCodeActionPerformed

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
            java.util.logging.Logger.getLogger(subsection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subsection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subsection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subsection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subsection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBody;
    private javax.swing.JButton addCode;
    private javax.swing.JButton addItems;
    private javax.swing.JButton addTitle;
    private javax.swing.JTextArea contentTF;
    private javax.swing.JButton createSubsection;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField titleTF;
    // End of variables declaration//GEN-END:variables
}
