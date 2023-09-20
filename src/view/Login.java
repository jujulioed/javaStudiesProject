/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author duke
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        passField = new javax.swing.JPasswordField();
        userField = new javax.swing.JTextField();
        passText = new javax.swing.JLabel();
        userText = new javax.swing.JLabel();
        loginText = new javax.swing.JLabel();
        loginPanel = new javax.swing.JLabel();
        backgroundLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 210, 40));

        userField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userFieldActionPerformed(evt);
            }
        });
        getContentPane().add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 210, 40));

        passText.setFont(new java.awt.Font("Notes", 0, 24)); // NOI18N
        passText.setForeground(new java.awt.Color(255, 255, 255));
        passText.setText("Senha");
        passText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        passText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        passText.setName(""); // NOI18N
        getContentPane().add(passText, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, -1));

        userText.setFont(new java.awt.Font("Notes", 0, 24)); // NOI18N
        userText.setForeground(new java.awt.Color(255, 255, 255));
        userText.setText("Usuário");
        userText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        userText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        userText.setName(""); // NOI18N
        getContentPane().add(userText, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, -1));

        loginText.setFont(new java.awt.Font("Notes", 0, 36)); // NOI18N
        loginText.setForeground(new java.awt.Color(255, 255, 255));
        loginText.setText("Login");
        loginText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginText.setName(""); // NOI18N
        getContentPane().add(loginText, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, -1, -1));

        loginPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/login-panel.png"))); // NOI18N
        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        backgroundLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/banner.png"))); // NOI18N
        getContentPane().add(backgroundLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLogin;
    private javax.swing.JLabel loginPanel;
    private javax.swing.JLabel loginText;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passText;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userText;
    // End of variables declaration//GEN-END:variables
}
