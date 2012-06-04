/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.gui;

import javax.swing.JOptionPane;
import projeto.erro.GeralException;
import projeto.modelo.fachada.Fachada;
import projeto.modelo.to.Endereco;
import projeto.modelo.to.Fornecedor;
import projeto.validaCampo.ValidaCampo;

/**
 *
 * @author Daniel
 */
public class GuiFornecedorAlterar extends javax.swing.JDialog {

    public static Fachada fachada = new Fachada();

    /**
     * Creates new form GuiFornecedorAlterar
     */
    public GuiFornecedorAlterar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public GuiFornecedorAlterar() {
        initComponents();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(GuiFornecedorAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFornecedorAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFornecedorAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFornecedorAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                GuiFornecedorAlterar dialog = new GuiFornecedorAlterar(new javax.swing.JFrame(), true);
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

        jPanelForAtual = new javax.swing.JPanel();
        jLabelCNPJ1 = new javax.swing.JLabel();
        jLabelRazaoSocial1 = new javax.swing.JLabel();
        jTextFieldEntradaRS = new javax.swing.JTextField();
        jLabelCEP1 = new javax.swing.JLabel();
        jButtonPesquisaCNPJ = new javax.swing.JButton();
        jButtonPesquisaCEP = new javax.swing.JButton();
        jLabelCidade1 = new javax.swing.JLabel();
        jLabelNumero1 = new javax.swing.JLabel();
        jLabelLogradouro1 = new javax.swing.JLabel();
        jButtonAlterarFornecedor = new javax.swing.JButton();
        jFormattedTextFieldEntradaNumero = new javax.swing.JFormattedTextField();
        jFormattedTextFieldEntradaCNPJ = new javax.swing.JFormattedTextField();
        jFormattedTextFieldEntradaCEP = new javax.swing.JFormattedTextField();
        jTextFieldEntradaLog = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jTextFieldCidade = new javax.swing.JTextField();
        jPanelForAntigo = new javax.swing.JPanel();
        jLabelCNPJ = new javax.swing.JLabel();
        jLabelRazaoSocial = new javax.swing.JLabel();
        jTextFieldSaidaRS = new javax.swing.JTextField();
        jLabelCEP = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelLogradouro = new javax.swing.JLabel();
        jFormattedTextFieldSaidaNumero = new javax.swing.JFormattedTextField();
        jFormattedTextFieldSaidaCNPJ = new javax.swing.JFormattedTextField();
        jFormattedTextFieldSaidaCEP = new javax.swing.JFormattedTextField();
        jTextFieldSaidaLog = new javax.swing.JTextField();
        jTextFieldSaidaCidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Fornecedor");
        setModal(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanelForAtual.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedor Atual"));

        jLabelCNPJ1.setText("CNPJ.:");

        jLabelRazaoSocial1.setText("Razão Social.:");

        jLabelCEP1.setText("CEP.:");

        jButtonPesquisaCNPJ.setText("Pesquisar");
        jButtonPesquisaCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaCNPJActionPerformed(evt);
            }
        });

        jButtonPesquisaCEP.setText("Pesquisar");
        jButtonPesquisaCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaCEPActionPerformed(evt);
            }
        });

        jLabelCidade1.setText("Cidade.:");

        jLabelNumero1.setText("Número.:");

        jLabelLogradouro1.setText("Logradouro.:");

        jButtonAlterarFornecedor.setText("Alterar Fornecedor");
        jButtonAlterarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarFornecedorActionPerformed(evt);
            }
        });

        jFormattedTextFieldEntradaNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        try {
            jFormattedTextFieldEntradaCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldEntradaCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelForAtualLayout = new javax.swing.GroupLayout(jPanelForAtual);
        jPanelForAtual.setLayout(jPanelForAtualLayout);
        jPanelForAtualLayout.setHorizontalGroup(
            jPanelForAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelForAtualLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelForAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNumero1)
                    .addComponent(jLabelCEP1)
                    .addComponent(jLabelCNPJ1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelForAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelForAtualLayout.createSequentialGroup()
                        .addGroup(jPanelForAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextFieldEntradaCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(jFormattedTextFieldEntradaCEP))
                        .addGroup(jPanelForAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelForAtualLayout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(jLabelRazaoSocial1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEntradaRS))
                            .addGroup(jPanelForAtualLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanelForAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelForAtualLayout.createSequentialGroup()
                                        .addComponent(jButtonPesquisaCNPJ)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanelForAtualLayout.createSequentialGroup()
                                        .addComponent(jButtonPesquisaCEP)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelLogradouro1)
                                        .addGap(9, 9, 9)
                                        .addComponent(jTextFieldEntradaLog))))))
                    .addGroup(jPanelForAtualLayout.createSequentialGroup()
                        .addComponent(jFormattedTextFieldEntradaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCidade1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCidade)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVoltar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlterarFornecedor)))
                .addGap(5, 5, 5))
        );
        jPanelForAtualLayout.setVerticalGroup(
            jPanelForAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelForAtualLayout.createSequentialGroup()
                .addGroup(jPanelForAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelForAtualLayout.createSequentialGroup()
                        .addGroup(jPanelForAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCNPJ1)
                            .addComponent(jButtonPesquisaCNPJ)
                            .addComponent(jFormattedTextFieldEntradaCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCEP1))
                    .addGroup(jPanelForAtualLayout.createSequentialGroup()
                        .addGroup(jPanelForAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRazaoSocial1)
                            .addComponent(jTextFieldEntradaRS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelForAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLogradouro1)
                            .addComponent(jTextFieldEntradaLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPesquisaCEP)
                            .addComponent(jFormattedTextFieldEntradaCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelForAtualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAlterarFornecedor)
                            .addComponent(jLabelCidade1)
                            .addComponent(jFormattedTextFieldEntradaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNumero1)
                            .addComponent(jButtonVoltar)
                            .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanelForAntigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedor Antigo"));

        jLabelCNPJ.setText("CNPJ.:");

        jLabelRazaoSocial.setText("Razão Social.:");

        jTextFieldSaidaRS.setEditable(false);
        jTextFieldSaidaRS.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jTextFieldSaidaRS.setEnabled(false);

        jLabelCEP.setText("CEP.:");

        jLabelCidade.setText("Cidade.:");

        jLabelNumero.setText("Número.:");

        jLabelLogradouro.setText("Logradouro.:");

        jFormattedTextFieldSaidaNumero.setEditable(false);
        jFormattedTextFieldSaidaNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldSaidaNumero.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jFormattedTextFieldSaidaNumero.setEnabled(false);

        jFormattedTextFieldSaidaCNPJ.setEditable(false);
        try {
            jFormattedTextFieldSaidaCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldSaidaCNPJ.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jFormattedTextFieldSaidaCNPJ.setEnabled(false);

        jFormattedTextFieldSaidaCEP.setEditable(false);
        try {
            jFormattedTextFieldSaidaCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldSaidaCEP.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jFormattedTextFieldSaidaCEP.setEnabled(false);

        jTextFieldSaidaLog.setEditable(false);
        jTextFieldSaidaLog.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jTextFieldSaidaLog.setEnabled(false);

        jTextFieldSaidaCidade.setEditable(false);
        jTextFieldSaidaCidade.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        jTextFieldSaidaCidade.setEnabled(false);

        javax.swing.GroupLayout jPanelForAntigoLayout = new javax.swing.GroupLayout(jPanelForAntigo);
        jPanelForAntigo.setLayout(jPanelForAntigoLayout);
        jPanelForAntigoLayout.setHorizontalGroup(
            jPanelForAntigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelForAntigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelForAntigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNumero)
                    .addComponent(jLabelCEP)
                    .addComponent(jLabelCNPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelForAntigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFormattedTextFieldSaidaCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldSaidaCEP)
                    .addComponent(jFormattedTextFieldSaidaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanelForAntigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRazaoSocial)
                    .addComponent(jLabelLogradouro)
                    .addComponent(jLabelCidade))
                .addGap(18, 18, 18)
                .addGroup(jPanelForAntigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSaidaLog, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                    .addComponent(jTextFieldSaidaRS)
                    .addComponent(jTextFieldSaidaCidade))
                .addContainerGap())
        );
        jPanelForAntigoLayout.setVerticalGroup(
            jPanelForAntigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelForAntigoLayout.createSequentialGroup()
                .addGroup(jPanelForAntigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelForAntigoLayout.createSequentialGroup()
                        .addGroup(jPanelForAntigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCNPJ)
                            .addComponent(jFormattedTextFieldSaidaCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelForAntigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCEP)
                            .addComponent(jFormattedTextFieldSaidaCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelForAntigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNumero)
                            .addComponent(jFormattedTextFieldSaidaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelForAntigoLayout.createSequentialGroup()
                        .addGroup(jPanelForAntigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRazaoSocial)
                            .addComponent(jTextFieldSaidaRS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelForAntigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLogradouro)
                            .addComponent(jTextFieldSaidaLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelForAntigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCidade)
                            .addComponent(jTextFieldSaidaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelForAntigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelForAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelForAntigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelForAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisaCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaCNPJActionPerformed
        pesquisarCNPJ();
    }//GEN-LAST:event_jButtonPesquisaCNPJActionPerformed

    private void jButtonPesquisaCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaCEPActionPerformed
        pesquisarCEP();
    }//GEN-LAST:event_jButtonPesquisaCEPActionPerformed

    private void jButtonAlterarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarFornecedorActionPerformed
        alterarFornecedor();
    }//GEN-LAST:event_jButtonAlterarFornecedorActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        //
    }//GEN-LAST:event_formComponentShown

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void pesquisarCNPJ() {
        String str_cnpj;
        String fornecedores_CNPJ;
        int resComCadastro;
        int resSemCadastro;
        try {
            str_cnpj = jFormattedTextFieldEntradaCNPJ.getText();
            str_cnpj = str_cnpj.replace('.', ' ');
            str_cnpj = str_cnpj.replace('/', ' ');
            str_cnpj = str_cnpj.replace('-', ' ');
            str_cnpj = str_cnpj.replaceAll(" ", "");
            fornecedores_CNPJ = str_cnpj;
            if ((fornecedores_CNPJ == null) || (fornecedores_CNPJ.equals(""))) {
                JOptionPane.showMessageDialog(null, "Digite o CNPJ!");
                bloquearTela();
            } else {
                if (ValidaCampo.validaCNPJ(fornecedores_CNPJ) == true) {
                    Fornecedor f = fachada.consultarForCNPJ(fornecedores_CNPJ);
                    if (f != null) {
                        if (jFormattedTextFieldSaidaCNPJ.getText().equals(jFormattedTextFieldEntradaCNPJ.getText())) {
                            resComCadastro = JOptionPane.showConfirmDialog(null, "Deseja realmente alterar?", "", JOptionPane.YES_NO_OPTION);
                            if (resComCadastro == JOptionPane.YES_OPTION) {
                                liberarTela();
                                jTextFieldEntradaRS.setText(f.getFornecedores_RazaoSocial());
                                jFormattedTextFieldEntradaCEP.setText(f.getEnderecos_CEP());
                                jTextFieldEntradaLog.setText(f.getEnderecos_Logradouro());
                                jFormattedTextFieldEntradaNumero.setText(String.valueOf(f.getFornecedores_NumeroResidencia()));
                                jTextFieldCidade.setText(f.getCidades_Nome());
                                jFormattedTextFieldEntradaCNPJ.requestFocus();
                            } else {
                                limparCampos();
                                bloquearTela();
                            }
                        }
                    } else {
                        resSemCadastro = JOptionPane.showConfirmDialog(null, "CNPJ não está cadastrado!\nDeseja continuar?\nSe não informe outro CNPJ.", "", JOptionPane.YES_NO_OPTION);
                        if (resSemCadastro == JOptionPane.YES_OPTION) {
                            limparCampos();
                            liberarTela();
                            jTextFieldEntradaRS.requestFocus();
                        } else {
                            jFormattedTextFieldSaidaCNPJ.setValue(null);
                            limparCampos();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "CNPJ inválido!");
                    bloquearTela();
                }
            }
        } catch (GeralException ex) {
        }
    }

    private void pesquisarCEP() {
        int resComCadastro;
        int resSemCadastro;
        String str_cep;
        String enderecos_CEP;
        try {
            str_cep = jFormattedTextFieldEntradaCEP.getText();
            str_cep = str_cep.replace('-', ' ');
            str_cep = str_cep.replaceAll(" ", "");
            enderecos_CEP = str_cep;
            Endereco end = fachada.consultarEndCep(enderecos_CEP);
            if (end != null) {
                resComCadastro = JOptionPane.showConfirmDialog(null, "CEP já está existe!\nDeseja continuar?\nSe não informe outro CEP.", "", JOptionPane.YES_NO_OPTION);
                if (resComCadastro == JOptionPane.NO_OPTION) {
                    jFormattedTextFieldEntradaCEP.setValue(null);
                    jFormattedTextFieldEntradaCEP.requestFocus();
                } else {
                    jFormattedTextFieldEntradaCEP.setText(end.getEnderecos_CEP());
                    jFormattedTextFieldEntradaNumero.requestFocus();
                    jTextFieldEntradaLog.setText(end.getEnderecos_Logradouro());
                    jTextFieldCidade.setText(end.getCidades_Nome());
                }
            } else {
                resSemCadastro = JOptionPane.showConfirmDialog(null, "CEP não está cadastrado!\nDeseja cadastrar?", "", JOptionPane.YES_NO_OPTION);
                if (resSemCadastro == JOptionPane.YES_OPTION) {
                    GuiEnderecoNovo guiEnderecoNovo = new GuiEnderecoNovo();
                    GuiEnderecoNovo.jFormattedTextFieldCEP.setText(enderecos_CEP);
                    GuiEnderecoNovo.jTextFieldEntradaLog.requestFocus();
                    GuiEnderecoNovo.liberarTela();
                    guiEnderecoNovo.setVisible(true);
                } else {
                    jTextFieldEntradaLog.setEditable(true);
                    jTextFieldEntradaLog.requestFocus();
                }
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void alterarFornecedor() {
        int resposta;
        String fornecedores_CNPJ;
        String str_cep;
        String str_cnpjOld;
        String str_cnpjNew;
        String CNPJ_Old;
        Fornecedor fOld;
        try {
            //Faz a consulta do objeto através do CNPJ antigo para retirada do código do fornecedor.
            str_cnpjOld = jFormattedTextFieldSaidaCNPJ.getText();
            str_cnpjOld = str_cnpjOld.replace('.', ' ');
            str_cnpjOld = str_cnpjOld.replace('/', ' ');
            str_cnpjOld = str_cnpjOld.replace('-', ' ');
            str_cnpjOld = str_cnpjOld.replaceAll(" ", "");
            CNPJ_Old = str_cnpjOld;
            fOld = fachada.consultarForCNPJ(CNPJ_Old);

            //Captura o CNPJ novo para ser enviado no objeto UPDATE
            str_cnpjNew = jFormattedTextFieldSaidaCNPJ.getText();
            str_cnpjNew = str_cnpjNew.replace('.', ' ');
            str_cnpjNew = str_cnpjNew.replace('/', ' ');
            str_cnpjNew = str_cnpjNew.replace('-', ' ');
            str_cnpjNew = str_cnpjNew.replaceAll(" ", "");
            fornecedores_CNPJ = str_cnpjNew;

            //Faz a consulta do objeto através do CEP para retirada do código do endereço.
            str_cep = jFormattedTextFieldEntradaCEP.getText();
            str_cep = str_cep.replace('-', ' ');
            str_cep = str_cep.replaceAll(" ", "");
            Endereco end = fachada.consultarEndCep(str_cep);

            //Cria o objeto para fazer o UPDATE.
            Fornecedor fAlterar = new Fornecedor();
            fAlterar.setFornecedores_Codigo(fOld.getFornecedores_Codigo());
            fAlterar.setFornecedores_CNPJ(fornecedores_CNPJ);
            fAlterar.setFornecedores_RazaoSocial(jTextFieldEntradaRS.getText());
            fAlterar.setEnderecos_Codigo(end.getEnderecos_Codigo());
            fAlterar.setFornecedores_NumeroResidencia(Integer.parseInt(jFormattedTextFieldEntradaNumero.getText()));
            fachada.alterarFornecedor(fAlterar);
            resposta = JOptionPane.showConfirmDialog(null, "Registro alterado com sucesso!\nDeseja continuar?", "", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.NO_OPTION) {
                dispose();
            } else {
                limparCampos();
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    private void limparCampos() {
        jFormattedTextFieldEntradaCEP.setValue(null);
        jFormattedTextFieldEntradaNumero.setValue(null);
        jTextFieldEntradaLog.setText("");
        jTextFieldEntradaRS.setText("");
        jTextFieldCidade.setText("");
        jFormattedTextFieldEntradaCNPJ.requestFocus();
    }

    private void liberarTela() {
        jFormattedTextFieldEntradaCEP.setEnabled(true);
        jFormattedTextFieldEntradaNumero.setEnabled(true);
        jTextFieldEntradaLog.setEnabled(true);
        jTextFieldEntradaRS.setEnabled(true);
        jButtonAlterarFornecedor.setEnabled(true);
        jButtonAlterarFornecedor.setEnabled(true);
        jButtonPesquisaCEP.setEnabled(true);
    }

    private void bloquearTela() {
        jFormattedTextFieldEntradaCEP.setEnabled(false);
        jFormattedTextFieldEntradaNumero.setEnabled(false);
        jTextFieldEntradaLog.setEnabled(false);
        jTextFieldEntradaRS.setEnabled(false);
        jButtonAlterarFornecedor.setEnabled(false);
        jButtonAlterarFornecedor.setEnabled(false);
        jButtonPesquisaCEP.setEnabled(false);
        jTextFieldCidade.setEnabled(false);
        jFormattedTextFieldEntradaCNPJ.requestFocus();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarFornecedor;
    private javax.swing.JButton jButtonPesquisaCEP;
    private javax.swing.JButton jButtonPesquisaCNPJ;
    private javax.swing.JButton jButtonVoltar;
    public javax.swing.JFormattedTextField jFormattedTextFieldEntradaCEP;
    public javax.swing.JFormattedTextField jFormattedTextFieldEntradaCNPJ;
    public javax.swing.JFormattedTextField jFormattedTextFieldEntradaNumero;
    public javax.swing.JFormattedTextField jFormattedTextFieldSaidaCEP;
    public javax.swing.JFormattedTextField jFormattedTextFieldSaidaCNPJ;
    public javax.swing.JFormattedTextField jFormattedTextFieldSaidaNumero;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCEP1;
    private javax.swing.JLabel jLabelCNPJ;
    private javax.swing.JLabel jLabelCNPJ1;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCidade1;
    private javax.swing.JLabel jLabelLogradouro;
    private javax.swing.JLabel jLabelLogradouro1;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelNumero1;
    private javax.swing.JLabel jLabelRazaoSocial;
    private javax.swing.JLabel jLabelRazaoSocial1;
    private javax.swing.JPanel jPanelForAntigo;
    private javax.swing.JPanel jPanelForAtual;
    public javax.swing.JTextField jTextFieldCidade;
    public javax.swing.JTextField jTextFieldEntradaLog;
    public javax.swing.JTextField jTextFieldEntradaRS;
    public javax.swing.JTextField jTextFieldSaidaCidade;
    public javax.swing.JTextField jTextFieldSaidaLog;
    public javax.swing.JTextField jTextFieldSaidaRS;
    // End of variables declaration//GEN-END:variables
}