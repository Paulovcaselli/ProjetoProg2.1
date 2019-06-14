package Visao;
import Dados.Usuario;
import Exceptions.FalhaNoCadastroException;
import Exceptions.FalhaNaBuscaException;
import Exceptions.FalhaNaRemocaoException;
import Exceptions.FalhaNaEdicaoException;
import Negocios.FachadaUsuario;

/**
 *
 * @author paulo
 */
public class TCadastroColecao extends javax.swing.JFrame {
    	static Usuario usuario;
        
    /**
     * Creates new form TCadastroColecao
     */
    public TCadastroColecao() {
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
        jButtonCadastrar = new javax.swing.JButton();
        jTextFieldValorUnit = new javax.swing.JTextField();
        jLabelValorUnit = new javax.swing.JLabel();
        jTextFieldQuantColecao = new javax.swing.JTextField();
        jLabelQuantColecao = new javax.swing.JLabel();
        jTextFieldNomeColecao = new javax.swing.JTextField();
        jLabelNomeColecao = new javax.swing.JLabel();
        jLabelCadastrarNovaColecao = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastar Colecao");
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
        jButtonVoltar.setBounds(300, 240, 63, 21);

        jButtonCadastrar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        getContentPane().add(jButtonCadastrar);
        jButtonCadastrar.setBounds(370, 240, 90, 21);
        getContentPane().add(jTextFieldValorUnit);
        jTextFieldValorUnit.setBounds(220, 170, 190, 30);

        jLabelValorUnit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelValorUnit.setText("Digite o valor unitário:");
        getContentPane().add(jLabelValorUnit);
        jLabelValorUnit.setBounds(20, 170, 170, 30);
        getContentPane().add(jTextFieldQuantColecao);
        jTextFieldQuantColecao.setBounds(260, 120, 150, 30);

        jLabelQuantColecao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelQuantColecao.setText("Digite a quantidade de volumes:");
        getContentPane().add(jLabelQuantColecao);
        jLabelQuantColecao.setBounds(20, 120, 230, 30);
        getContentPane().add(jTextFieldNomeColecao);
        jTextFieldNomeColecao.setBounds(220, 70, 190, 30);

        jLabelNomeColecao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNomeColecao.setText("Digite o nome da coleção:");
        getContentPane().add(jLabelNomeColecao);
        jLabelNomeColecao.setBounds(20, 70, 190, 30);

        jLabelCadastrarNovaColecao.setFont(new java.awt.Font("Freestyle Script", 1, 48)); // NOI18N
        jLabelCadastrarNovaColecao.setText("Cadastrar nova coleção:");
        getContentPane().add(jLabelCadastrarNovaColecao);
        jLabelCadastrarNovaColecao.setBounds(20, 10, 350, 50);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo1.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 610, 300);

        setSize(new java.awt.Dimension(602, 320));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseClicked
        TUsuario tela = new TUsuario(usuario);
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
            java.util.logging.Logger.getLogger(TCadastroColecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TCadastroColecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TCadastroColecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TCadastroColecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TCadastroColecao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelCadastrarNovaColecao;
    private javax.swing.JLabel jLabelNomeColecao;
    private javax.swing.JLabel jLabelQuantColecao;
    private javax.swing.JLabel jLabelValorUnit;
    private javax.swing.JTextField jTextFieldNomeColecao;
    private javax.swing.JTextField jTextFieldQuantColecao;
    private javax.swing.JTextField jTextFieldValorUnit;
    // End of variables declaration//GEN-END:variables
}
