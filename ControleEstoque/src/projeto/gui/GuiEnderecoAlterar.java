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
 * @author Daniel
 */
public class GuiEnderecoAlterar extends javax.swing.JDialog {
    
    public static Fachada fachada = new Fachada();

    /**
     * Creates new form GuiEnderecoAlterar
     */
    public GuiEnderecoAlterar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    GuiEnderecoAlterar() {
        initComponents();
        setLocationRelativeTo(null);
        atualizarComboCidade();
        bloquearTela();
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
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                GuiEnderecoAlterar dialog = new GuiEnderecoAlterar(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings({"unchecked", "CallToThreadDumpStack"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEndNew = new javax.swing.JPanel();
        jLabelLogradouroNew = new javax.swing.JLabel();
        jTextFieldEntradaLog = new javax.swing.JTextField();
        jLabelCidadeNew = new javax.swing.JLabel();
        jComboBoxCidade = new javax.swing.JComboBox();
        jButtonPesquisaCEPNew = new javax.swing.JButton();
        jLabelCEPNew = new javax.swing.JLabel();
        jButtonAlterar = new javax.swing.JButton();
        jButtonGerenciarCidade = new javax.swing.JButton();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jPanelEndOld = new javax.swing.JPanel();
        jLabelLogradouroOld = new javax.swing.JLabel();
        jTextFieldSaidaLog = new javax.swing.JTextField();
        jLabelCidadeOld = new javax.swing.JLabel();
        jTextFieldSaidaCidade = new javax.swing.JTextField();
        jLabelCEP = new javax.swing.JLabel();
        jFormattedTextFieldSaidaCEP = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar endereço");
        setModal(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanelEndNew.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço Novo"));

        jLabelLogradouroNew.setText("Logradouro.:");

        jLabelCidadeNew.setText("Cidade.:");

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

        try {
            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanelEndNewLayout = new javax.swing.GroupLayout(jPanelEndNew);
        jPanelEndNew.setLayout(jPanelEndNewLayout);
        jPanelEndNewLayout.setHorizontalGroup(
            jPanelEndNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEndNewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEndNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEndNewLayout.createSequentialGroup()
                        .addComponent(jLabelCidadeNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCidade, 0, 317, Short.MAX_VALUE))
                    .addGroup(jPanelEndNewLayout.createSequentialGroup()
                        .addComponent(jLabelCEPNew)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPesquisaCEPNew, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelLogradouroNew)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEndNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEndNewLayout.createSequentialGroup()
                        .addComponent(jButtonGerenciarCidade)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                    .addComponent(jTextFieldEntradaLog))
                .addGap(0, 0, 0))
        );
        jPanelEndNewLayout.setVerticalGroup(
            jPanelEndNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEndNewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEndNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPesquisaCEPNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelEndNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCEPNew)
                        .addComponent(jLabelLogradouroNew)
                        .addComponent(jTextFieldEntradaLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEndNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidadeNew)
                    .addComponent(jButtonGerenciarCidade)
                    .addComponent(jButtonAlterar))
                .addContainerGap())
        );

        jPanelEndOld.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço Antigo"));

        jLabelLogradouroOld.setText("Logradouro.:");

        jTextFieldSaidaLog.setEnabled(false);

        jLabelCidadeOld.setText("Cidade.:");

        jTextFieldSaidaCidade.setEnabled(false);

        jLabelCEP.setText("CEP.:");

        try {
            jFormattedTextFieldSaidaCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldSaidaCEP.setEnabled(false);

        javax.swing.GroupLayout jPanelEndOldLayout = new javax.swing.GroupLayout(jPanelEndOld);
        jPanelEndOld.setLayout(jPanelEndOldLayout);
        jPanelEndOldLayout.setHorizontalGroup(
            jPanelEndOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEndOldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCidadeOld)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldSaidaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelCEP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldSaidaCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelEndOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEndOldLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabelLogradouroOld)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldSaidaLog, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelEndOldLayout.setVerticalGroup(
            jPanelEndOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEndOldLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanelEndOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEndOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCEP)
                        .addComponent(jFormattedTextFieldSaidaCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEndOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldSaidaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCidadeOld)))
                .addGap(22, 22, 22))
            .addGroup(jPanelEndOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEndOldLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addGroup(jPanelEndOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextFieldSaidaLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelLogradouroOld))
                    .addContainerGap(53, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEndOld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEndNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButtonPesquisaCEPNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaCEPNewActionPerformed
        consultarCEP();
    }//GEN-LAST:event_jButtonPesquisaCEPNewActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        alterarEndereco();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonGerenciarCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerenciarCidadeActionPerformed
        gerenciarCidade();
    }//GEN-LAST:event_jButtonGerenciarCidadeActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //
    }//GEN-LAST:event_formComponentShown
    
    private void alterarEndereco() {
        Endereco end;
        String cepOld;
        String str_cepOld;
        String str_cepNew;
        String enderecos_CEP;
        Cidade cd;
        Endereco endAlterar;
        try {
            str_cepOld = jFormattedTextFieldSaidaCEP.getText();
            str_cepOld = str_cepOld.replace('-', ' ');
            str_cepOld = str_cepOld.replaceAll(" ", "");
            cepOld = str_cepOld;
            end = fachada.consultarEndCep(cepOld);
            cd = fachada.consultarCidade((String) jComboBoxCidade.getSelectedItem());
            str_cepNew = jFormattedTextFieldCEP.getText();
            str_cepNew = str_cepNew.replace('-', ' ');
            str_cepNew = str_cepNew.replaceAll(" ", "");
            enderecos_CEP = str_cepNew;
            endAlterar = new Endereco();
            endAlterar.setEnderecos_Codigo(end.getEnderecos_Codigo());
            endAlterar.setEnderecos_Logradouro(jTextFieldEntradaLog.getText());
            endAlterar.setEnderecos_CEP(enderecos_CEP);
            endAlterar.setCidades_Codigo(cd.getCidades_Codigo());
            fachada.alterarEndereco(endAlterar);

            JOptionPane.showMessageDialog(null, "Endereço alterado!");
            dispose();
            GuiEndereco guiEndereco = new GuiEndereco();
            guiEndereco.setVisible(true);

        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void consultarCEP() {
        int resComCadastro;
        int resSemCadastro;
        String str_cep;
        String enderecos_CEP;
        Endereco end;
        try {
            str_cep = jFormattedTextFieldCEP.getText();
            str_cep = str_cep.replace('-', ' ');
            str_cep = str_cep.replaceAll(" ", "");
            enderecos_CEP = str_cep;
            end = fachada.consultarEndCep(enderecos_CEP);
            if (end != null) {
                resComCadastro = JOptionPane.showConfirmDialog(null, "CEP já está existe!\nDeseja continuar?", "", JOptionPane.YES_NO_OPTION);
                if (resComCadastro == JOptionPane.NO_OPTION) {
                    limparCampos();
                    bloquearTela();
                } else {
                    liberarTela();
                    jFormattedTextFieldCEP.setText(end.getEnderecos_CEP());
                    jTextFieldEntradaLog.setText(end.getEnderecos_Logradouro());
                    jButtonAlterar.requestFocus();                    
                }
            } else {
                resSemCadastro = JOptionPane.showConfirmDialog(null, "CEP não está cadastrado!\nDeseja continuar?\nSe não informe outro CEP.", "", JOptionPane.YES_NO_OPTION);
                if (resSemCadastro == JOptionPane.YES_OPTION) {
                    liberarTela();
                    jTextFieldEntradaLog.requestFocus();
                } else {
                    limparCampos();
                    bloquearTela();
                }
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void gerenciarCidade(){
        String logOld = jTextFieldSaidaLog.getText();
        String cdOld = jTextFieldSaidaCidade.getText();
        String cepOld = jFormattedTextFieldSaidaCEP.getText();
        String cep = jFormattedTextFieldCEP.getText();
        String log = jTextFieldEntradaLog.getText();
        dispose();
        GuiCidade cidade = new GuiCidade();
        cidade.setVisible(true);
        GuiEnderecoAlterar guiEnderecoAlterar = new GuiEnderecoAlterar();
        guiEnderecoAlterar.jFormattedTextFieldCEP.setText(cep);
        GuiEnderecoAlterar.jTextFieldEntradaLog.setText(log);
        guiEnderecoAlterar.jTextFieldSaidaLog.setText(logOld);
        guiEnderecoAlterar.jTextFieldSaidaCidade.setText(cdOld);
        guiEnderecoAlterar.jFormattedTextFieldSaidaCEP.setText(cepOld);
        liberarTela();
        jComboBoxCidade.requestFocus();
        guiEnderecoAlterar.setVisible(true);
    }
    
    private void atualizarComboCidade() {
        Cidade cid;
        ArrayList<Cidade> listaCd;
        try {
            listaCd = (ArrayList<Cidade>) fachada.listarCidadeTudo();
            for (Iterator<Cidade> it = listaCd.iterator(); it.hasNext();) {
                cid = it.next();
                jComboBoxCidade.addItem(cid.getCidades_Nome());
            }
        } catch (GeralException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void liberarTela(){
        jTextFieldEntradaLog.setEnabled(true);
        jComboBoxCidade.setEnabled(true);
        jButtonGerenciarCidade.setEnabled(true);
        jButtonAlterar.setEnabled(true);
    }
    
    private void bloquearTela(){
        jFormattedTextFieldCEP.requestFocus();
        jTextFieldEntradaLog.setEnabled(false);
        jComboBoxCidade.setEnabled(false);
        jButtonGerenciarCidade.setEnabled(false);
        jButtonAlterar.setEnabled(false);
    }
    
    private void limparCampos(){
        jFormattedTextFieldCEP.setValue(null);
        jTextFieldEntradaLog.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton jButtonAlterar;
    private static javax.swing.JButton jButtonGerenciarCidade;
    private javax.swing.JButton jButtonPesquisaCEPNew;
    public static javax.swing.JComboBox jComboBoxCidade;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    public javax.swing.JFormattedTextField jFormattedTextFieldSaidaCEP;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCEPNew;
    private javax.swing.JLabel jLabelCidadeNew;
    private javax.swing.JLabel jLabelCidadeOld;
    private javax.swing.JLabel jLabelLogradouroNew;
    private javax.swing.JLabel jLabelLogradouroOld;
    private javax.swing.JPanel jPanelEndNew;
    private javax.swing.JPanel jPanelEndOld;
    public static javax.swing.JTextField jTextFieldEntradaLog;
    public javax.swing.JTextField jTextFieldSaidaCidade;
    public javax.swing.JTextField jTextFieldSaidaLog;
    // End of variables declaration//GEN-END:variables
}
