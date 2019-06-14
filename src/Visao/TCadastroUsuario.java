package Visao;
import Dados.Usuario;
import Exceptions.FalhaNoCadastroException;
import Exceptions.FalhaNaBuscaException;
import Exceptions.FalhaNaRemocaoException;
import Exceptions.FalhaNaEdicaoException;
import Negocios.FachadaUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class TCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TCadastroUsuario
     */
    public TCadastroUsuario() {
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

        jButtonVoltar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonCadastrar = new javax.swing.JButton();
        jTextFieldCEmail = new javax.swing.JTextField();
        jTextFieldCNome = new javax.swing.JTextField();
        jTextFieldCSenha = new javax.swing.JTextField();
        jTextFieldCLogin = new javax.swing.JTextField();
        jLabelCadastro = new javax.swing.JLabel();
        jLabelCEmail = new javax.swing.JLabel();
        jLabelCNome = new javax.swing.JLabel();
        jLabelCSenha = new javax.swing.JLabel();
        jLabelCLogin = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Usuario");
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(270, 230, 90, 21);

        jButtonSair.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSairMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(170, 230, 90, 21);

        jButtonCadastrar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(370, 230, 90, 23);
        getContentPane().add(jTextFieldCEmail);
        jTextFieldCEmail.setBounds(110, 180, 120, 28);
        getContentPane().add(jTextFieldCNome);
        jTextFieldCNome.setBounds(110, 140, 120, 28);
        getContentPane().add(jTextFieldCSenha);
        jTextFieldCSenha.setBounds(110, 100, 120, 28);
        getContentPane().add(jTextFieldCLogin);
        jTextFieldCLogin.setBounds(110, 60, 120, 28);

        jLabelCadastro.setFont(new java.awt.Font("Freestyle Script", 1, 48)); // NOI18N
        jLabelCadastro.setText("Cadastro de Usuário:");
        getContentPane().add(jLabelCadastro);
        jLabelCadastro.setBounds(20, 10, 360, 40);

        jLabelCEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCEmail.setText("Email:");
        getContentPane().add(jLabelCEmail);
        jLabelCEmail.setBounds(20, 180, 50, 30);

        jLabelCNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCNome.setText("Nome:");
        getContentPane().add(jLabelCNome);
        jLabelCNome.setBounds(20, 140, 50, 30);

        jLabelCSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCSenha.setText("Senha:");
        getContentPane().add(jLabelCSenha);
        jLabelCSenha.setBounds(20, 100, 50, 30);

        jLabelCLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCLogin.setText("Login:");
        getContentPane().add(jLabelCLogin);
        jLabelCLogin.setBounds(20, 60, 50, 30);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo1.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 600, 280);

        setSize(new java.awt.Dimension(602, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
            Usuario usuario = new Usuario(jTextFieldCLogin.getText(),String.valueOf(jTextFieldCSenha.getText()),jTextFieldCNome.getText(),jTextFieldCEmail.getText());
				try {
					FachadaUsuario.getInstance().cadastrar(usuario);
					JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso !");
					TelaLogin tela = new TelaLogin();
					tela.setVisible(true);
					dispose();
				} catch (FalhaNoCadastroException e1) {
					e1.getMessage();
				}
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSairMouseClicked
        dispose();
    }//GEN-LAST:event_jButtonSairMouseClicked

    private void jButtonVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseClicked
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarMouseClicked

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
            java.util.logging.Logger.getLogger(TCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelCEmail;
    private javax.swing.JLabel jLabelCLogin;
    private javax.swing.JLabel jLabelCNome;
    private javax.swing.JLabel jLabelCSenha;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JTextField jTextFieldCEmail;
    private javax.swing.JTextField jTextFieldCLogin;
    private javax.swing.JTextField jTextFieldCNome;
    private javax.swing.JTextField jTextFieldCSenha;
    // End of variables declaration//GEN-END:variables
}