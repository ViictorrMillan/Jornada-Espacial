/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package stel.jornadaespacial;
import javax.swing.DefaultListCellRenderer;
import java.awt.Component;
import javax.swing.JList;

/**
 *
 * @author user
 */
public class TelaCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroUsuario
     */
    public TelaCadastroUsuario() {
        initComponents();
       fechar.setBackground(new java.awt.Color(0,0,0,1));
       eyeSenha.setBackground(new java.awt.Color(0,0,0,1));
       eyeConfirmeASenha.setBackground(new java.awt.Color(0,0,0,1));
       foto.setBackground(new java.awt.Color(0,0,0,1));
       pronto.setBackground(new java.awt.Color(0,0,0,1));
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastrarUsuario = new javax.swing.JLabel();
        nomeCompleto = new javax.swing.JLabel();
        fechar = new javax.swing.JButton();
        txtNomeCompleto = new javax.swing.JTextField();
        linhaNomeCompleto = new javax.swing.JLabel();
        idade = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        linhaIdade = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        txtSexo = new javax.swing.JComboBox<>();
        email = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        linhaEmail = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        linhaCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        nomeDoViajante = new javax.swing.JLabel();
        txtNomeDoViajante = new javax.swing.JTextField();
        linhaNomeDoViajante = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        linhaSenha = new javax.swing.JLabel();
        senha1 = new javax.swing.JLabel();
        txtConfirmeASenha = new javax.swing.JPasswordField();
        foto = new javax.swing.JButton();
        pronto = new javax.swing.JButton();
        linhaSenha1 = new javax.swing.JLabel();
        eyeSenha = new javax.swing.JToggleButton();
        eyeConfirmeASenha = new javax.swing.JToggleButton();
        txtFoto = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(950, 450));
        setUndecorated(true);
        getContentPane().setLayout(null);

        cadastrarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CadastrarUsuario.png"))); // NOI18N
        getContentPane().add(cadastrarUsuario);
        cadastrarUsuario.setBounds(280, 10, 380, 44);

        nomeCompleto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/NomeCompleto.png"))); // NOI18N
        nomeCompleto.setText("jLabel1");
        getContentPane().add(nomeCompleto);
        nomeCompleto.setBounds(10, 60, 170, 30);

        fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Close.png"))); // NOI18N
        fechar.setBorderPainted(false);
        fechar.setContentAreaFilled(false);
        fechar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });
        getContentPane().add(fechar);
        fechar.setBounds(910, 10, 30, 20);

        txtNomeCompleto.setBackground(new java.awt.Color(0, 0, 0));
        txtNomeCompleto.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txtNomeCompleto.setForeground(new java.awt.Color(255, 206, 0));
        txtNomeCompleto.setBorder(null);
        txtNomeCompleto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtNomeCompleto);
        txtNomeCompleto.setBounds(190, 60, 300, 30);

        linhaNomeCompleto.setForeground(new java.awt.Color(255, 255, 255));
        linhaNomeCompleto.setText("___________________________________________");
        getContentPane().add(linhaNomeCompleto);
        linhaNomeCompleto.setBounds(190, 60, 310, 50);

        idade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Idade.png"))); // NOI18N
        getContentPane().add(idade);
        idade.setBounds(10, 110, 60, 30);

        txtIdade.setBackground(new java.awt.Color(0, 0, 0));
        txtIdade.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txtIdade.setForeground(new java.awt.Color(255, 206, 0));
        txtIdade.setBorder(null);
        txtIdade.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdade);
        txtIdade.setBounds(80, 110, 40, 30);

        linhaIdade.setForeground(new java.awt.Color(255, 255, 255));
        linhaIdade.setText("_____");
        getContentPane().add(linhaIdade);
        linhaIdade.setBounds(80, 120, 40, 30);

        sexo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Sexo.png"))); // NOI18N
        getContentPane().add(sexo);
        sexo.setBounds(10, 140, 60, 70);

        txtSexo.setBackground(new java.awt.Color(0, 0, 0));
        txtSexo.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txtSexo.setForeground(new java.awt.Color(255, 206, 0));
        txtSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino", "Outro" }));
        txtSexo.setToolTipText("");
        getContentPane().add(txtSexo);
        txtSexo.setBounds(70, 160, 130, 31);

        email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/E-Mail.png"))); // NOI18N
        getContentPane().add(email);
        email.setBounds(10, 210, 80, 40);

        txtEmail.setBackground(new java.awt.Color(0, 0, 0));
        txtEmail.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 206, 0));
        txtEmail.setBorder(null);
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(90, 210, 260, 30);

        linhaEmail.setForeground(new java.awt.Color(255, 255, 255));
        linhaEmail.setText("_____________________________________");
        getContentPane().add(linhaEmail);
        linhaEmail.setBounds(90, 210, 270, 50);

        cpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CPF.png"))); // NOI18N
        getContentPane().add(cpf);
        cpf.setBounds(10, 260, 50, 30);

        linhaCPF.setForeground(new java.awt.Color(255, 255, 255));
        linhaCPF.setText("____________________");
        getContentPane().add(linhaCPF);
        linhaCPF.setBounds(70, 270, 150, 20);

        txtCPF.setBackground(new java.awt.Color(0, 0, 0));
        txtCPF.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txtCPF.setForeground(new java.awt.Color(255, 206, 0));
        txtCPF.setBorder(null);
        txtCPF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });
        getContentPane().add(txtCPF);
        txtCPF.setBounds(70, 260, 140, 30);

        nomeDoViajante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/NomeDoViajante.png"))); // NOI18N
        getContentPane().add(nomeDoViajante);
        nomeDoViajante.setBounds(10, 300, 190, 50);

        txtNomeDoViajante.setBackground(new java.awt.Color(0, 0, 0));
        txtNomeDoViajante.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        txtNomeDoViajante.setForeground(new java.awt.Color(255, 206, 0));
        txtNomeDoViajante.setText("Será utilizado para login");
        txtNomeDoViajante.setToolTipText("");
        txtNomeDoViajante.setBorder(null);
        txtNomeDoViajante.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNomeDoViajante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDoViajanteActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeDoViajante);
        txtNomeDoViajante.setBounds(200, 310, 200, 30);

        linhaNomeDoViajante.setForeground(new java.awt.Color(255, 255, 255));
        linhaNomeDoViajante.setText("_____________________________");
        getContentPane().add(linhaNomeDoViajante);
        linhaNomeDoViajante.setBounds(200, 320, 210, 30);

        senha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Senha.png"))); // NOI18N
        getContentPane().add(senha);
        senha.setBounds(10, 350, 80, 40);

        txtSenha.setBackground(new java.awt.Color(0, 0, 0));
        txtSenha.setForeground(new java.awt.Color(255, 206, 0));
        txtSenha.setBorder(null);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(90, 360, 150, 16);

        linhaSenha.setForeground(new java.awt.Color(255, 255, 255));
        linhaSenha.setText("_____________________");
        getContentPane().add(linhaSenha);
        linhaSenha.setBounds(90, 360, 150, 30);

        senha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Confirme a Senha.png"))); // NOI18N
        getContentPane().add(senha1);
        senha1.setBounds(10, 390, 200, 50);

        txtConfirmeASenha.setBackground(new java.awt.Color(0, 0, 0));
        txtConfirmeASenha.setForeground(new java.awt.Color(255, 206, 0));
        txtConfirmeASenha.setBorder(null);
        getContentPane().add(txtConfirmeASenha);
        txtConfirmeASenha.setBounds(210, 400, 150, 30);

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        foto.setBorderPainted(false);
        foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotoActionPerformed(evt);
            }
        });
        getContentPane().add(foto);
        foto.setBounds(630, 120, 220, 190);

        pronto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Pronto.png"))); // NOI18N
        getContentPane().add(pronto);
        pronto.setBounds(660, 330, 160, 60);

        linhaSenha1.setForeground(new java.awt.Color(255, 255, 255));
        linhaSenha1.setText("_____________________");
        getContentPane().add(linhaSenha1);
        linhaSenha1.setBounds(210, 410, 180, 30);

        eyeSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Eye.png"))); // NOI18N
        eyeSenha.setBorderPainted(false);
        eyeSenha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                eyeSenhaPropertyChange(evt);
            }
        });
        getContentPane().add(eyeSenha);
        eyeSenha.setBounds(250, 350, 40, 30);

        eyeConfirmeASenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Eye.png"))); // NOI18N
        eyeConfirmeASenha.setBorderPainted(false);
        eyeConfirmeASenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eyeConfirmeASenhaActionPerformed(evt);
            }
        });
        getContentPane().add(eyeConfirmeASenha);
        eyeConfirmeASenha.setBounds(380, 400, 40, 30);

        txtFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/AdicioneSuaFoto.png"))); // NOI18N
        getContentPane().add(txtFoto);
        txtFoto.setBounds(590, 80, 290, 30);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Fundo Estrelado Horizontal.png"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 950, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_fecharActionPerformed

    private void txtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtNomeDoViajanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDoViajanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDoViajanteActionPerformed

    private void fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fotoActionPerformed

    private void eyeConfirmeASenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eyeConfirmeASenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eyeConfirmeASenhaActionPerformed

    private void eyeSenhaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_eyeSenhaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_eyeSenhaPropertyChange

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadastrarUsuario;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel email;
    private javax.swing.JToggleButton eyeConfirmeASenha;
    private javax.swing.JToggleButton eyeSenha;
    private javax.swing.JButton fechar;
    private javax.swing.JButton foto;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel idade;
    private javax.swing.JLabel linhaCPF;
    private javax.swing.JLabel linhaEmail;
    private javax.swing.JLabel linhaIdade;
    private javax.swing.JLabel linhaNomeCompleto;
    private javax.swing.JLabel linhaNomeDoViajante;
    private javax.swing.JLabel linhaSenha;
    private javax.swing.JLabel linhaSenha1;
    private javax.swing.JLabel nomeCompleto;
    private javax.swing.JLabel nomeDoViajante;
    private javax.swing.JButton pronto;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel senha1;
    private javax.swing.JLabel sexo;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JPasswordField txtConfirmeASenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtFoto;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNomeCompleto;
    private javax.swing.JTextField txtNomeDoViajante;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JComboBox<String> txtSexo;
    // End of variables declaration//GEN-END:variables
}