/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stel.jornadaespacial;

/**
 *
 * @author user
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        jTextFieldLogin.setBackground(new java.awt.Color(0,0,0,1));
        jPasswordFieldSenha.setBackground(new java.awt.Color(0,0,0,1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TítuloImage = new javax.swing.JLabel();
        jLabelLoginImage = new javax.swing.JLabel();
        AstronautaImage = new javax.swing.JLabel();
        jLabelSubtítuloImage = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelUsername1 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabel_____2 = new javax.swing.JLabel();
        jPanelExit = new javax.swing.JPanel();
        ExitButton = new javax.swing.JLabel();
        jLabel_____1 = new javax.swing.JLabel();
        jlabelShow = new javax.swing.JLabel();
        jlabelDisable = new javax.swing.JLabel();
        jlabelUserImage = new javax.swing.JLabel();
        jCheckBoxPasswordLembrar = new javax.swing.JCheckBox();
        jLabelLembrarSenha = new javax.swing.JLabel();
        jLabelEsqueceu = new javax.swing.JLabel();
        jButtonLogar = new javax.swing.JButton();
        jLabelImagemCadastro = new javax.swing.JLabel();
        jLabelCadastrar = new javax.swing.JLabel();
        FundoImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TítuloImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Título.png"))); // NOI18N
        getContentPane().add(TítuloImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabelLoginImage.setBackground(new java.awt.Color(0, 0, 0));
        jLabelLoginImage.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLoginImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLoginImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Login.png"))); // NOI18N
        getContentPane().add(jLabelLoginImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        AstronautaImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Astronauta.png"))); // NOI18N
        getContentPane().add(AstronautaImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabelSubtítuloImage.setBackground(new java.awt.Color(0, 0, 0));
        jLabelSubtítuloImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubtítuloImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/subtítulo.png"))); // NOI18N
        getContentPane().add(jLabelSubtítuloImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 410, 20));

        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Senha do Viajante.png"))); // NOI18N
        getContentPane().add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 190, 30));

        jLabelUsername1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsername1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsername1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Nome do Viajante.png"))); // NOI18N
        getContentPane().add(jLabelUsername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 180, -1));

        jTextFieldLogin.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jTextFieldLogin.setForeground(new java.awt.Color(255, 206, 0));
        jTextFieldLogin.setBorder(null);
        jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 340, 30));

        jPasswordFieldSenha.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jPasswordFieldSenha.setForeground(new java.awt.Color(255, 206, 0));
        jPasswordFieldSenha.setBorder(null);
        getContentPane().add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 340, 30));

        jLabel_____2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_____2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_____2.setText("________________________________________________");
        getContentPane().add(jLabel_____2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 350, 30));

        jPanelExit.setBackground(new java.awt.Color(0, 0, 0));
        jPanelExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Close.png"))); // NOI18N
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitButtonMouseClicked(evt);
            }
        });
        jPanelExit.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        getContentPane().add(jPanelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 40, 40));

        jLabel_____1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_____1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_____1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_____1.setText("________________________________________________");
        getContentPane().add(jLabel_____1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 360, 30));

        jlabelShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Eye.png"))); // NOI18N
        jlabelShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabelShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabelShowMouseClicked(evt);
            }
        });
        getContentPane().add(jlabelShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, 30, 30));

        jlabelDisable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelDisable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Invisible.png"))); // NOI18N
        jlabelDisable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlabelDisable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabelDisableMouseClicked(evt);
            }
        });
        getContentPane().add(jlabelDisable, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 230, 30, 30));

        jlabelUserImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelUserImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        getContentPane().add(jlabelUserImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 30, 30));

        jCheckBoxPasswordLembrar.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxPasswordLembrar.setBorderPainted(true);
        jCheckBoxPasswordLembrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBoxPasswordLembrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxPasswordLembrarActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxPasswordLembrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 190, 30));

        jLabelLembrarSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLembrarSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelLembrarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Lembrar da senha.png"))); // NOI18N
        jLabelLembrarSenha.setAutoscrolls(true);
        getContentPane().add(jLabelLembrarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 190, 30));

        jLabelEsqueceu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEsqueceu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEsqueceu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Esqueceu.png"))); // NOI18N
        jLabelEsqueceu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabelEsqueceu, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 190, 30));

        jButtonLogar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonLogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iniciar jornada.png"))); // NOI18N
        jButtonLogar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 240, 40));

        jLabelImagemCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Não é um.png"))); // NOI18N
        getContentPane().add(jLabelImagemCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, -1, -1));

        jLabelCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Primeira Jornada.png"))); // NOI18N
        jLabelCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabelCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, -1, -1));

        FundoImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FundoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Fundo Estrelado Horizontal.png"))); // NOI18N
        FundoImage.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(FundoImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 450));

        setSize(new java.awt.Dimension(950, 452));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitButtonMouseClicked
       System.exit(0);
    }//GEN-LAST:event_ExitButtonMouseClicked

    private void jCheckBoxPasswordLembrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxPasswordLembrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxPasswordLembrarActionPerformed

    private void jButtonLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLogarActionPerformed

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    private void jlabelDisableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelDisableMouseClicked
     jPasswordFieldSenha.setEchoChar((char)0);
     jlabelDisable.setVisible(false);
     jlabelDisable.setEnabled(false);
     jlabelShow.setVisible(true);
     jlabelShow.setEnabled(true);

    }//GEN-LAST:event_jlabelDisableMouseClicked

    private void jlabelShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelShowMouseClicked
     jPasswordFieldSenha.setEchoChar((char)8226);
     jlabelDisable.setVisible(true);
     jlabelDisable.setEnabled(true);
     jlabelShow.setVisible(false);
     jlabelShow.setEnabled(false);
    }//GEN-LAST:event_jlabelShowMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
          for(double i = 0.0; i <=1.0; i = i+0.1){
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
            } catch(Exception e){
            
        }
    }    
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AstronautaImage;
    private javax.swing.JLabel ExitButton;
    private javax.swing.JLabel FundoImage;
    private javax.swing.JLabel TítuloImage;
    private javax.swing.JButton jButtonLogar;
    private javax.swing.JCheckBox jCheckBoxPasswordLembrar;
    private javax.swing.JLabel jLabelCadastrar;
    private javax.swing.JLabel jLabelEsqueceu;
    private javax.swing.JLabel jLabelImagemCadastro;
    private javax.swing.JLabel jLabelLembrarSenha;
    private javax.swing.JLabel jLabelLoginImage;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelSubtítuloImage;
    private javax.swing.JLabel jLabelUsername1;
    private javax.swing.JLabel jLabel_____1;
    private javax.swing.JLabel jLabel_____2;
    private javax.swing.JPanel jPanelExit;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JLabel jlabelDisable;
    private javax.swing.JLabel jlabelShow;
    private javax.swing.JLabel jlabelUserImage;
    // End of variables declaration//GEN-END:variables
}