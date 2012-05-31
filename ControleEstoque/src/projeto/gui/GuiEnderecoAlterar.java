/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.gui;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import projeto.erro.GeralException;
import projeto.modelo.fachada.Fachada;
import projeto.modelo.to.Cidade;
import projeto.modelo.to.Endereco;

/**
 *
 * @author DANIEL VALENÇA
 */
public class GuiEnderecoAlterar extends javax.swing.JFrame {

    public static Fachada fachada = new Fachada();

    /**
     * Creates new form GuiEnderecoAlterar
     */
    public GuiEnderecoAlterar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiEnderecoAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiEnderecoAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiEnderecoAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiEnderecoAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GuiEnderecoAlterar().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEndOld = new javax.swing.JPanel();
        jLabelLogradouroOld = new javax.swing.JLabel();
        jTextFieldSaidaLogOld = new javax.swing.JTextField();
        jLabelCidadeOld = new javax.swing.JLabel();
        jTextFieldSaidaCepOld = new javax.swing.JTextField();
        jTextFieldSaidaCidadeOld = new javax.swing.JTextField();
        jLabelCEP = new javax.swing.JLabel();
        jPanelEndNew = new javax.swing.JPanel();
        jLabelLogradouroNew = new javax.swing.JLabel();
        jTextFieldEntradaLogNew = new javax.swing.JTextField();
        jLabelCidadeNew = new javax.swing.JLabel();
        jComboBoxCidadeNew = new javax.swing.JComboBox();
        jTextFieldEntradaCepNew = new javax.swing.JTextField();
        jButtonPesquisaLogNew = new javax.swing.JButton();
        jButtonPesquisaCEPNew = new javax.swing.JButton();
        jLabelCEPNew = new javax.swing.JLabel();
        jButtonAlterar = new javax.swing.JButton();
        jButtonGerenciarCidade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Endereço");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanelEndOld.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço Antigo"));

        jLabelLogradouroOld.setText("Logradouro.:");

        jTextFieldSaidaLogOld.setEditable(false);

        jLabelCidadeOld.setText("Cidade.:");

        jTextFieldSaidaCepOld.setEditable(false);

        jTextFieldSaidaCidadeOld.setEditable(false);

        jLabelCEP.setText("CEP.:");

        javax.swing.GroupLayout jPanelEndOldLayout = new javax.swing.GroupLayout(jPanelEndOld);
        jPanelEndOld.setLayout(jPanelEndOldLayout);
        jPanelEndOldLayout.setHorizontalGroup(
            jPanelEndOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEndOldLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jTextFieldSaidaCidadeOld, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jLabelCEP)
                .addGap(6, 6, 6)
                .addComponent(jTextFieldSaidaCepOld, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelEndOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEndOldLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelEndOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelEndOldLayout.createSequentialGroup()
                            .addComponent(jLabelLogradouroOld)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldSaidaLogOld, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
                        .addGroup(jPanelEndOldLayout.createSequentialGroup()
                            .addComponent(jLabelCidadeOld)
                            .addGap(0, 593, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanelEndOldLayout.setVerticalGroup(
            jPanelEndOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEndOldLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanelEndOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSaidaCidadeOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSaidaCepOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCEP))
                .addContainerGap())
            .addGroup(jPanelEndOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEndOldLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(jPanelEndOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldSaidaLogOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelLogradouroOld))
                    .addGap(17, 17, 17)
                    .addComponent(jLabelCidadeOld)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        jPanelEndNew.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço Novo"));

        jLabelLogradouroNew.setText("Logradouro.:");

        jLabelCidadeNew.setText("Cidade.:");

        jButtonPesquisaLogNew.setText("Consultar");
        jButtonPesquisaLogNew.setMaximumSize(new java.awt.Dimension(75, 23));
        jButtonPesquisaLogNew.setMinimumSize(new java.awt.Dimension(75, 23));
        jButtonPesquisaLogNew.setPreferredSize(new java.awt.Dimension(75, 23));
        jButtonPesquisaLogNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaLogNewActionPerformed(evt);
            }
        });

        jButtonPesquisaCEPNew.setText("Consultar");
        jButtonPesquisaCEPNew.setMaximumSize(new java.awt.Dimension(75, 23));
        jButtonPesquisaCEPNew.setMinimumSize(new java.awt.Dimension(75, 23));
        jButtonPesquisaCEPNew.setPreferredSize(new java.awt.Dimension(75, 23));
        jButtonPesquisaCEPNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaCEPNewActionPerformed(evt);
            }
        });

        jLabelCEPNew.setText("CEP.:");

        jButtonAlterar.setText("Alterar Endereço");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonGerenciarCidade.setText("Gerenciar Cidade");
        jButtonGerenciarCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerenciarCidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEndNewLayout = new javax.swing.GroupLayout(jPanelEndNew);
        jPanelEndNew.setLayout(jPanelEndNewLayout);
        jPanelEndNewLayout.setHorizontalGroup(
            jPanelEndNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEndNewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEndNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCEPNew)
                    .addComponent(jLabelCidadeNew))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEndNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelEndNewLayout.createSequentialGroup()
                        .addComponent(jTextFieldEntradaCepNew, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisaCEPNew, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelLogradouroNew))
                    .addComponent(jComboBoxCidadeNew, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEndNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEndNewLayout.createSequentialGroup()
                        .addComponent(jButtonGerenciarCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEndNewLayout.createSequentialGroup()
                        .addComponent(jTextFieldEntradaLogNew, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisaLogNew, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelEndNewLayout.setVerticalGroup(
            jPanelEndNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEndNewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEndNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisaLogNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisaCEPNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEntradaCepNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCEPNew)
                    .addComponent(jLabelLogradouroNew)
                    .addComponent(jTextFieldEntradaLogNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEndNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCidadeNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidadeNew)
                    .addComponent(jButtonGerenciarCidade)
                    .addComponent(jButtonAlterar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelEndNew, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEndOld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelEndOld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEndNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Chamada do método que vai verificar se já existe cadastro.
     * @param evt
     */
    private void jButtonPesquisaCEPNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaCEPNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPesquisaCEPNewActionPerformed

    /**
     * Chamada do método que altera um registro selecionado;
     * @param evt
     */
    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        alterarEndereco();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    /**
     * Chama a tela para gerenciar a cidade;
     * @param evt
     */
    private void jButtonGerenciarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerenciarCidadeActionPerformed
        GuiCidade cd = new GuiCidade();
        cd.setVisible(true);
    }//GEN-LAST:event_jButtonGerenciarCidadeActionPerformed

    /**
     * Chamada do método que vai verificar se já existe cadastro.
     * @param evt
     */
    private void jButtonPesquisaLogNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaLogNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPesquisaLogNewActionPerformed

    /**
     * Atualiza o "ComboBox Cidade", no carregamento da tela;
     * @param evt
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        jTextFieldEntradaCepNew.requestFocus();
        atualizarComboCidade();
    }//GEN-LAST:event_formComponentShown

    /**
     * Metodo que altera um registro selecionado;
     */
    private void alterarEndereco() {
        Endereco end;
        String cepOld;
        int enderecos_Codigo;
        try {
            cepOld = jTextFieldSaidaCepOld.getText();
            end = fachada.consultarEndCep(cepOld);
            Cidade cd = fachada.consultarCidade((String) jComboBoxCidadeNew.getSelectedItem());
            Endereco endAlterar = new Endereco();
            enderecos_Codigo = end.getEnderecos_Codigo();
            endAlterar.setEnderecos_Codigo(enderecos_Codigo);
            endAlterar.setEnderecos_Logradouro(jTextFieldEntradaLogNew.getText());
            endAlterar.setEnderecos_CEP(jTextFieldEntradaCepNew.getText());
            endAlterar.setCidades_Codigo(cd.getCidades_Codigo());
            fachada.alterarEndereco(endAlterar);

            JOptionPane.showMessageDialog(null, "Endereço alterado!");
            dispose();

        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
     * Método que trás a llista das cidades para ser mostrada no "ComboBox Cidade";
     */
    private void atualizarComboCidade() {
        Cidade cid;
        ArrayList<Cidade> listaCd;
        try {
            listaCd = (ArrayList<Cidade>) fachada.listarCidadeTudo();
            for (Iterator<Cidade> it = listaCd.iterator(); it.hasNext();) {
                cid = it.next();
                jComboBoxCidadeNew.addItem(cid.getCidades_Nome());
            }
        } catch (GeralException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonGerenciarCidade;
    private javax.swing.JButton jButtonPesquisaCEPNew;
    private javax.swing.JButton jButtonPesquisaLogNew;
    private javax.swing.JComboBox jComboBoxCidadeNew;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCEPNew;
    private javax.swing.JLabel jLabelCidadeNew;
    private javax.swing.JLabel jLabelCidadeOld;
    private javax.swing.JLabel jLabelLogradouroNew;
    private javax.swing.JLabel jLabelLogradouroOld;
    private javax.swing.JPanel jPanelEndNew;
    private javax.swing.JPanel jPanelEndOld;
    private javax.swing.JTextField jTextFieldEntradaCepNew;
    private javax.swing.JTextField jTextFieldEntradaLogNew;
    public javax.swing.JTextField jTextFieldSaidaCepOld;
    public javax.swing.JTextField jTextFieldSaidaCidadeOld;
    public javax.swing.JTextField jTextFieldSaidaLogOld;
    // End of variables declaration//GEN-END:variables
}