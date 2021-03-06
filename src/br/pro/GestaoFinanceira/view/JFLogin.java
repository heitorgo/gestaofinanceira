/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.GestaoFinanceira.view;

import br.pro.GestaoFinanceira.model.UsuarioModel;
import br.pro.GestaoFinanceira.data.UsuarioData;
import javax.swing.JOptionPane;



/**
 *
 * @author Martinez & Carvalho
 */
public class JFLogin extends javax.swing.JFrame {
    
    UsuarioModel usuario;
    UsuarioData DAOUsuario;
    
    

    
    
    public JFLogin() {
        try{
            usuario = new UsuarioModel();
            DAOUsuario = new UsuarioData();
            initComponents();
        } catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
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

        jbConfirmarLogin = new javax.swing.JButton();
        jbCancelarLogin = new javax.swing.JButton();
        jlUsuario = new javax.swing.JLabel();
        jlSenha = new javax.swing.JLabel();
        jtUserlogin = new javax.swing.JTextField();
        jtSenhalogin = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jbConfirmarLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/jbCheckIcon.png"))); // NOI18N
        jbConfirmarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jbConfirmarLogin);
        jbConfirmarLogin.setBounds(40, 270, 50, 40);

        jbCancelarLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/jbCancelarIcon.png"))); // NOI18N
        jbCancelarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelarLogin);
        jbCancelarLogin.setBounds(100, 270, 50, 40);

        jlUsuario.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jlUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlUsuario.setText("Usuário:");
        getContentPane().add(jlUsuario);
        jlUsuario.setBounds(30, 160, 100, 40);

        jlSenha.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jlSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSenha.setText("Senha:");
        jlSenha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jlSenha);
        jlSenha.setBounds(30, 220, 100, 40);
        getContentPane().add(jtUserlogin);
        jtUserlogin.setBounds(130, 160, 237, 40);
        getContentPane().add(jtSenhalogin);
        jtSenhalogin.setBounds(130, 220, 237, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/JIFLoginIcon.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(177, 11, 128, 128);

        setSize(new java.awt.Dimension(534, 385));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbConfirmarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarLoginActionPerformed
        if(validarCampos()){
            JFPrincipal tela = new JFPrincipal();
            tela.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbConfirmarLoginActionPerformed

    private void jbCancelarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarLoginActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbCancelarLoginActionPerformed

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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbCancelarLogin;
    private javax.swing.JButton jbConfirmarLogin;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField jtSenhalogin;
    private javax.swing.JTextField jtUserlogin;
    // End of variables declaration//GEN-END:variables

    private boolean validarCampos(){
        if(jtUserlogin.getText().equals("admin")&& jtSenhalogin.getPassword().equals("admin")){
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Falha no login", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;   
        }
    }    
}
