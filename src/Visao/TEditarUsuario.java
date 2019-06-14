package Visao;
import Dados.Usuario;
import Exceptions.FalhaNoCadastroException;
import Exceptions.FalhaNaBuscaException;
import Exceptions.FalhaNaRemocaoException;
import Exceptions.FalhaNaEdicaoException;
import Negocios.FachadaUsuario;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author paulo
 */
public class TEditarUsuario extends javax.swing.JFrame {
    	static Usuario usuario;
        
    public TEditarUsuario(Usuario usuario) throws FalhaNaBuscaException {
        initComponents();
        this.usuario=usuario;
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
        jButtonAtualizar = new javax.swing.JButton();
        jTextFieldEEmail = new javax.swing.JTextField();
        jLabelEEmail = new javax.swing.JLabel();
        jTextFieldENome = new javax.swing.JTextField();
        jLabelENome = new javax.swing.JLabel();
        jTextFieldESenha = new javax.swing.JTextField();
        jLabelESenha = new javax.swing.JLabel();
        jLabelEditarUsuario = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Usuario");
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
        jButtonVoltar.setBounds(270, 230, 90, 23);

        jButtonAtualizar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizar);
        jButtonAtualizar.setBounds(370, 230, 90, 23);
        getContentPane().add(jTextFieldEEmail);
        jTextFieldEEmail.setBounds(100, 180, 120, 28);

        jLabelEEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEEmail.setText("Email:");
        getContentPane().add(jLabelEEmail);
        jLabelEEmail.setBounds(30, 180, 50, 30);
        getContentPane().add(jTextFieldENome);
        jTextFieldENome.setBounds(100, 130, 120, 28);

        jLabelENome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelENome.setText("Nome:");
        getContentPane().add(jLabelENome);
        jLabelENome.setBounds(30, 130, 50, 30);
        getContentPane().add(jTextFieldESenha);
        jTextFieldESenha.setBounds(100, 80, 120, 28);

        jLabelESenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelESenha.setText("Senha:");
        getContentPane().add(jLabelESenha);
        jLabelESenha.setBounds(30, 80, 50, 30);

        jLabelEditarUsuario.setFont(new java.awt.Font("Freestyle Script", 1, 48)); // NOI18N
        jLabelEditarUsuario.setText("Editar Usuário:");
        jLabelEditarUsuario.setMaximumSize(new java.awt.Dimension(209, 22));
        jLabelEditarUsuario.setMinimumSize(new java.awt.Dimension(209, 22));
        jLabelEditarUsuario.setPreferredSize(new java.awt.Dimension(209, 22));
        getContentPane().add(jLabelEditarUsuario);
        jLabelEditarUsuario.setBounds(20, 20, 230, 40);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo1.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 600, 280);

        setSize(new java.awt.Dimension(602, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseClicked
        TUsuario tela = new TUsuario(usuario);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarMouseClicked

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
                Usuario usuarioA = new Usuario(usuario.getLogin(),(jTextFieldESenha.getText()),jTextFieldENome.getText(),jTextFieldEEmail.getText());
			try {
                                FachadaUsuario.getInstance().atualizar(usuarioA);
                                JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso !");
				TelaLogin tela = new TelaLogin(); 
				tela.setVisible(true);
				dispose();
				} catch (FalhaNaEdicaoException e1) {
					try {
						FachadaUsuario.getInstance().cadastrar(usuarioA);
					} catch (FalhaNoCadastroException e2) {
						
					}
				}
			
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(TEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TEditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    TEditarUsuario tela = new TEditarUsuario(usuario);
                    tela.setVisible(true);
                } catch (Exception e){
                
                }
        }
        });
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelEEmail;
    private javax.swing.JLabel jLabelENome;
    private javax.swing.JLabel jLabelESenha;
    private javax.swing.JLabel jLabelEditarUsuario;
    private javax.swing.JTextField jTextFieldEEmail;
    private javax.swing.JTextField jTextFieldENome;
    private javax.swing.JTextField jTextFieldESenha;
    // End of variables declaration//GEN-END:variables
}
