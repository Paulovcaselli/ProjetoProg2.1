package Visao;

import Dados.Manga;
import Dados.Usuario;
import Exceptions.FalhaNoCadastroException;
import Exceptions.FalhaNaBuscaException;
import Exceptions.FalhaNaRemocaoException;
import Exceptions.FalhaNaEdicaoException;
import Negocios.FachadaUsuario;
import Dados.Usuario;
import Exceptions.FalhaNoCadastroMangaException;
import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class TCadastroManga extends javax.swing.JFrame {

    static Usuario usuario;

    /**
     * Creates new form TCadastroManga
     */
    public TCadastroManga(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        jComboBoxColecaoManga.removeAllItems();
        jComboBoxColecaoManga.addItem("Selecione a coleção de Mangás:");
        jComboBoxVolumeManga.removeAllItems();
        jComboBoxVolumeManga.addItem("Selecione o volume do Mangá:");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxVolumeManga = new javax.swing.JComboBox<>();
        jComboBoxColecaoManga = new javax.swing.JComboBox<>();
        jTextFieldValorManga = new javax.swing.JTextField();
        jLabelValorManga = new javax.swing.JLabel();
        jTextFieldIdiomaManga = new javax.swing.JTextField();
        jLabelIdiomaManga = new javax.swing.JLabel();
        jTextFieldEditoraManga = new javax.swing.JTextField();
        jLabelEditoraManga = new javax.swing.JLabel();
        jTextFieldNomeManga = new javax.swing.JTextField();
        jLabelNomeManga = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jButtonCadastrarManga = new javax.swing.JButton();
        jLabelCadastrarManga = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Manga");
        setResizable(false);
        getContentPane().setLayout(null);

        jComboBoxVolumeManga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxVolumeManga);
        jComboBoxVolumeManga.setBounds(240, 160, 215, 27);

        jComboBoxColecaoManga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxColecaoManga);
        jComboBoxColecaoManga.setBounds(20, 160, 215, 27);
        getContentPane().add(jTextFieldValorManga);
        jTextFieldValorManga.setBounds(290, 110, 120, 28);

        jLabelValorManga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelValorManga.setText("Valor:");
        getContentPane().add(jLabelValorManga);
        jLabelValorManga.setBounds(220, 110, 50, 30);
        getContentPane().add(jTextFieldIdiomaManga);
        jTextFieldIdiomaManga.setBounds(90, 110, 120, 28);

        jLabelIdiomaManga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelIdiomaManga.setText("Idioma:");
        getContentPane().add(jLabelIdiomaManga);
        jLabelIdiomaManga.setBounds(20, 110, 60, 30);
        getContentPane().add(jTextFieldEditoraManga);
        jTextFieldEditoraManga.setBounds(290, 70, 120, 28);

        jLabelEditoraManga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEditoraManga.setText("Editora:");
        getContentPane().add(jLabelEditoraManga);
        jLabelEditoraManga.setBounds(220, 70, 60, 30);
        getContentPane().add(jTextFieldNomeManga);
        jTextFieldNomeManga.setBounds(90, 70, 120, 28);

        jLabelNomeManga.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNomeManga.setText("Nome:");
        getContentPane().add(jLabelNomeManga);
        jLabelNomeManga.setBounds(20, 70, 50, 30);

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(270, 230, 90, 23);

        jButtonCadastrarManga.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonCadastrarManga.setText("Cadastrar");
        jButtonCadastrarManga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarMangaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrarManga);
        jButtonCadastrarManga.setBounds(370, 230, 90, 23);

        jLabelCadastrarManga.setFont(new java.awt.Font("Freestyle Script", 1, 48)); // NOI18N
        jLabelCadastrarManga.setText("Cadastrar Mangá:");
        getContentPane().add(jLabelCadastrarManga);
        jLabelCadastrarManga.setBounds(20, 10, 270, 50);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo1.png"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 600, 270);

        setSize(new java.awt.Dimension(602, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVoltarMouseClicked
        TUsuario tela = new TUsuario(usuario);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarMouseClicked

    private void jButtonCadastrarMangaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarMangaActionPerformed
        Manga manga = new Manga(jTextFieldNomeManga.getText(), jTextFieldEditoraManga.getText(), jTextFieldIdiomaManga.getText(), jTextFieldValorManga.getText());
        try {
            FachadaUsuario.getInstance().cadastrar(manga);
            JOptionPane.showMessageDialog(null, "Mangá cadastrado com sucesso!");

        } catch (FalhaNoCadastroMangaException e1) {
            e1.getMessage();
        }
    }//GEN-LAST:event_jButtonCadastrarMangaActionPerformed

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
            java.util.logging.Logger.getLogger(TCadastroManga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TCadastroManga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TCadastroManga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TCadastroManga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TCadastroManga(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton jButtonCadastrarManga;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxColecaoManga;
    private javax.swing.JComboBox<String> jComboBoxVolumeManga;
    private javax.swing.JLabel jLabelCadastrarManga;
    private javax.swing.JLabel jLabelEditoraManga;
    private javax.swing.JLabel jLabelIdiomaManga;
    private javax.swing.JLabel jLabelNomeManga;
    private javax.swing.JLabel jLabelValorManga;
    private javax.swing.JTextField jTextFieldEditoraManga;
    private javax.swing.JTextField jTextFieldIdiomaManga;
    private javax.swing.JTextField jTextFieldNomeManga;
    private javax.swing.JTextField jTextFieldValorManga;
    // End of variables declaration//GEN-END:variables
}
