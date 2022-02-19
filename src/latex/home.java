/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latex;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author newac
 */
public class home extends javax.swing.JFrame {

    /** Creates new form home */
    int titlestyle = 0;
    int subtitlestyle = 0;
    int authorstyle = 0;
    int datestyle = 0;
    public home() {
        initComponents();
    }

    

    home(int heading, int subheading, int author, int date) {
        initComponents();
        titlestyle = heading;
        subtitlestyle = subheading;
        authorstyle = author;
        datestyle = date;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateTF = new javax.swing.JTextField();
        authorTF = new javax.swing.JTextField();
        subtitleTF = new javax.swing.JTextField();
        titleTF = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        createDoc = new javax.swing.JButton();
        settings = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateTF.setBackground(new java.awt.Color(204, 204, 255));
        dateTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(dateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 610, 300, 40));

        authorTF.setBackground(new java.awt.Color(204, 204, 255));
        authorTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(authorTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, 300, 40));

        subtitleTF.setBackground(new java.awt.Color(204, 204, 255));
        subtitleTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subtitleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtitleTFActionPerformed(evt);
            }
        });
        getContentPane().add(subtitleTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 300, 40));

        titleTF.setBackground(new java.awt.Color(204, 204, 255));
        titleTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTFActionPerformed(evt);
            }
        });
        getContentPane().add(titleTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 300, 40));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A3", "A4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 300, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/latex/WhatsApp Image 2021-12-23 at 4.35.16 AM.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        createDoc.setBorderPainted(false);
        createDoc.setContentAreaFilled(false);
        createDoc.setFocusPainted(false);
        createDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDocActionPerformed(evt);
            }
        });
        getContentPane().add(createDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 710, 440, 70));

        settings.setBorderPainted(false);
        settings.setContentAreaFilled(false);
        settings.setFocusPainted(false);
        settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsActionPerformed(evt);
            }
        });
        getContentPane().add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 830, 280, 100));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subtitleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtitleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtitleTFActionPerformed

    private void titleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTFActionPerformed

    private void createDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDocActionPerformed
        String[][] fontstyle = {{"",""},{"\\textbf{","}"},{"\\emph{","}"},{"\\underline{","}"}};
        
        
        String code = "\\documentclass{article}";
        
        code += "\\usepackage[english]{babel}\n" +
"\\usepackage[utf8]{inputenc}\n" +
"\\usepackage{amsmath}\n" +
"\\usepackage{graphicx}\n" +
"\\usepackage[colorinlistoftodos]{todonotes}\n" +
"\\usepackage[obeyspaces]{url}\n" +
"%\\usepackage{hyperref}\n" +
"\n" +
"\\usepackage{setspace}\n" +
"\\usepackage{listings}\n" +
"\\usepackage{xcolor}\n" +
"\n" +
"\\definecolor{codegreen}{rgb}{0,0.6,0}\n" +
"\\definecolor{codeblue}{rgb}{0,0,0.6}\n" +
"\\definecolor{codegray}{rgb}{0.5,0.5,0.5}\n" +
"\\definecolor{codepurple}{rgb}{0.58,0,0.82}\n" +
"\\definecolor{backcolour}{rgb}{0.95,0.95,0.92}\n" +
"\n" +
"\\lstset{language=Java,\n" +
"	backgroundcolor=\\color{backcolour},\n" +
"	backgroundcolor=\\color{backcolour},   \n" +
"	commentstyle=\\color{codegreen},\n" +
"	keywordstyle=\\color{magenta},\n" +
"	numberstyle=\\tiny\\color{codegray},\n" +
"	stringstyle=\\color{codepurple},\n" +
"	basicstyle=\\ttfamily\\footnotesize,\n" +
"	breakatwhitespace=false,         \n" +
"	breaklines=true,                 \n" +
"	captionpos=b,                    \n" +
"	keepspaces=true,                 \n" +
"	numbers=left,                    \n" +
"	numbersep=5pt,                  \n" +
"	showspaces=false,                \n" +
"	showstringspaces=false,\n" +
"	showtabs=false,                  \n" +
"	tabsize=2\n" +
"}";
       
        
                
        code = code + '\n' + "\\title{" + fontstyle[titlestyle][0] + titleTF.getText() + fontstyle[titlestyle][1] + "\\\\";
        code = code + '\n' +  "\\vspace{5mm}\\" + '\n' +
	"\\large " + fontstyle[subtitlestyle][0] + subtitleTF.getText() + fontstyle[subtitlestyle][1] + "}";
        code = code + '\n' + "\\author{" + fontstyle[authorstyle][0] + authorTF.getText() + fontstyle[authorstyle][1] + "}";
        code = code + '\n' + "\\date{" + fontstyle[datestyle][0] + dateTF.getText() + fontstyle[datestyle][1] + "}";
        
        code = code + '\n' + "\\begin{document} "
                + " \n" + " \\maketitle " ;
                
                
        System.out.println(code);
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("output.tex", "UTF-8");
            writer.println(code);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        new sections().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_createDocActionPerformed

    private void settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsActionPerformed
        new settings().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_settingsActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authorTF;
    private javax.swing.JButton createDoc;
    private javax.swing.JTextField dateTF;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton settings;
    private javax.swing.JTextField subtitleTF;
    private javax.swing.JTextField titleTF;
    // End of variables declaration//GEN-END:variables

}
