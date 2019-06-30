package Visao;

import Dados.Usuario;

/**
 *
 * @author paulo
 */
public class TConsultarColecao extends javax.swing.JFrame {

    static Usuario usuario;

    /**
     * Creates new form TConsultarColecao
     */
    public TConsultarColecao(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        jComboBoxColecaoManga.removeAllItems();
        jComboBoxColecaoManga.addItem("Selecione a coleção de Mangás:");
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
        jTextFieldValorGasto = new javax.swing.JTextField();
        jLabelValorGasto = new javax.swing.JLabel();
        jTextFieldNumVolumesTotal = new javax.swing.JTextField();
        jLabelDe = new javax.swing.JLabel();
        jTextFieldNumVolumes = new javax.swing.JTextField();
        jLabelNumVolumes = new javax.swing.JLabel();
        jComboBoxColecaoManga = new javax.swing.JComboBox<>();
        jLabelConsultarColecoes = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar Colecoes");
        setPreferredSize(null);
        setResizable(false);
        getContentPane().setLayout(null);

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVoltarMouseClicked(evt);
            }
        });
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(270, 230, 90, 23);
        getContentPane().add(jTextFieldValorGasto);
        jTextFieldValorGasto.setBounds(180, 180, 80, 25);

        jLabelValorGasto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelValorGasto.setText("Valor Gasto no total:");
        getContentPane().add(jLabelValorGasto);
        jLabelValorGasto.setBounds(20, 180, 150, 25);
        getContentPane().add(jTextFieldNumVolumesTotal);
        jTextFieldNumVolumesTotal.setBounds(330, 140, 30, 25);

        jLabelDe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDe.setText("De");
        getContentPane().add(jLabelDe);
        jLabelDe.setBounds(300, 140, 19, 25);
        getContentPane().add(jTextFieldNumVolumes);
        jTextFieldNumVolumes.setBounds(260, 140, 30, 25);

        jLabelNumVolumes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNumVolumes.setText("Números de volumes possuídos:");
        getContentPane().add(jLabelNumVolumes);
        jLabelNumVolumes.setBounds(20, 140, 230, 25);

        jComboBoxColecaoManga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxColecaoManga);
        jComboBoxColecaoManga.setBounds(20, 90, 215, 27);

        jLabelConsultarColecoes.setFont(new java.awt.Font("Freestyle Script", 1, 48)); // NOI18N
        jLabelConsultarColecoes.setText("Consultar Coleções");
        getContentPane().add(jLabelConsultarColecoes);
        jLabelConsultarColecoes.setBounds(20, 20, 280, 57);

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

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TConsultarColecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TConsultarColecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TConsultarColecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TConsultarColecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TConsultarColecao(usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxColecaoManga;
    private javax.swing.JLabel jLabelConsultarColecoes;
    private javax.swing.JLabel jLabelDe;
    private javax.swing.JLabel jLabelNumVolumes;
    private javax.swing.JLabel jLabelValorGasto;
    private javax.swing.JTextField jTextFieldNumVolumes;
    private javax.swing.JTextField jTextFieldNumVolumesTotal;
    private javax.swing.JTextField jTextFieldValorGasto;
    // End of variables declaration//GEN-END:variables
}
