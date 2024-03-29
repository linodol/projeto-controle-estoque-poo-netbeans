/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.gui;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.erro.ConexaoException;
import projeto.erro.GeralException;
import projeto.modelo.fachada.Fachada;
import projeto.modelo.to.Cidade;
import projeto.modelo.to.PessoaJuridica;

/**
 *
 * @author Sandro
 */
public class GuiPessoaJuridica extends javax.swing.JDialog {
     ArrayList<PessoaJuridica> listaPJ = null;
     public static Fachada fachada = new Fachada();


    /**
     * Creates new form GuiPessoaJuridica
     */
    public GuiPessoaJuridica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    GuiPessoaJuridica() throws ConexaoException {
        initComponents();
        setLocationRelativeTo(null);
        limparCampos();
        atualizarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbNovo = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePJ = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jFormatTextCNPJ = new javax.swing.JFormattedTextField();
        jTextPJ = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextEnd = new javax.swing.JTextField();
        jCbBoxCidade = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jFormatTextCEP = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jbAtualizar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jTablePJ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Cliente", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTablePJ.setShowHorizontalLines(false);
        jTablePJ.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTablePJ);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Listagem");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtro de Pessoa Juridica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jLabel1.setText("CNPJ.:");

        jLabel3.setText("Razão Social.:");

        try {
            jFormatTextCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormatTextCNPJ.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jTextPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPJActionPerformed(evt);
            }
        });

        jButton6.setText("Pesquisa");

        jLabel2.setText("Endereço.:");

        jTextEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEndActionPerformed(evt);
            }
        });

        jCbBoxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbBoxCidadeActionPerformed(evt);
            }
        });

        jLabel5.setText("CEP.:");

        try {
            jFormatTextCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormatTextCEP.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormatTextCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormatTextCEPActionPerformed(evt);
            }
        });

        jLabel6.setText("Cidade.:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextPJ))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jFormatTextCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jFormatTextCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCbBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 288, Short.MAX_VALUE))
                                    .addComponent(jTextEnd))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFormatTextCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jFormatTextCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCbBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        // TODO add your handling code here:
        GuiPessoaJuridicaNovo pj = new GuiPessoaJuridicaNovo();
        pj.setVisible(true);
        atualizarComboCidade();
        atualizarTabela();

    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
        alterarPessoaJuridica();
        atualizarComboCidade();
        atualizarTabela();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jTextPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPJActionPerformed

    private void jTextEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEndActionPerformed

    private void jCbBoxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbBoxCidadeActionPerformed
        // TODO add your handling code here:
        pesquisarCidade((String) jCbBoxCidade.getSelectedItem());
    }//GEN-LAST:event_jCbBoxCidadeActionPerformed

    private void jFormatTextCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormatTextCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormatTextCEPActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here
        excluirPessoaJuridica();
        atualizarComboCidade();
        atualizarTabela();
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        atualizarComboCidade();
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(GuiPessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPessoaJuridica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                GuiPessoaJuridica dialog = new GuiPessoaJuridica(new javax.swing.JFrame(), true);
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
    
    
            private void alterarPessoaJuridica() {
        int resposta;
        try {
            PessoaJuridica PJ = listaPJ.get(jTablePJ.getSelectedRow());

            resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente Alterar?", "", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
               /* GuiPessoaJuridicaAlterar guiPJ_Alterar = new GuiPessoaJuridicaAlterar();
                guiPF_Alterar.jFormatTextAlteraCPF.setText(PF.getPessoasFisica_CPF());
                guiPF_Alterar.jTextAlteraNome.setText(PF.getPessoasFisica_Nome());
                guiPF_Alterar.jTextAlteraLogradouro.setText(PF.getEndereco().getEnderecos_Logradouro());
                guiPF_Alterar.jTextAlteraNumero.setText(PF.getClientes_NumeroResidencia());
                guiPF_Alterar.jTextAlteraCidade.setText(PF.getEndereco().getCidade().getCidades_Nome());
                //guiPF_Alterar.jTextFieldSaidaCidade.setText(fOld.getCidades_Nome());
                guiPF_Alterar.setVisible(true);*/
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione um Registro!");
        }
    }
    
    private void excluirPessoaJuridica() {
        int resposta;

        try {
            PessoaJuridica pj = listaPJ.get(jTablePJ.getSelectedRow());

            resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente Excluir?", "", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                PessoaJuridica pjConsult = fachada.consultarPessoaJuridicaCNPJ(pj.getPessoasJuridica_CNPJ());
                if (pjConsult != null) {
                    fachada.excluirPessoaJuridica(pjConsult.getClientes_Codigo());
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione um Registro!");
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    private void pesquisarCNPJ() {
        String str_cnpj;
        String pj_CNPJ;
        try {
            str_cnpj = jFormatTextCNPJ.getText();
            str_cnpj = str_cnpj.replace('.', ' ');
            str_cnpj = str_cnpj.replace('/', ' ');
            str_cnpj = str_cnpj.replace('-', ' ');
            str_cnpj = str_cnpj.replaceAll(" ", "");
            pj_CNPJ = str_cnpj;
            if ((pj_CNPJ == null) || (pj_CNPJ.equals(""))) {
                listaPJ = (ArrayList<PessoaJuridica>) fachada.listarPessoaJuridica();
            } else {
                listaPJ = (ArrayList<PessoaJuridica>) fachada.listarPessoaJuridica();
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        DefaultTableModel modelo = geramodeloPJ(listaPJ);
        jTablePJ.setModel(modelo);
    }
    
    private void pesquisarRazaoSocial() {
        try {
            if ((jTextPJ.getText() == null) || (jTextPJ.getText().equals(""))) {
                listaPJ = (ArrayList<PessoaJuridica>) fachada.listarPessoaJuridica();
            } else {
                listaPJ = (ArrayList<PessoaJuridica>) fachada.listarPessoaJuridica();
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        DefaultTableModel modelo = geramodeloPJ(listaPJ);
        jTablePJ.setModel(modelo);
    }
    
    private void pesquisarCEP() {
        String str_cep;
        String pj_CEP;
        try {
            str_cep = jFormatTextCEP.getText();
            str_cep = str_cep.replace('-', ' ');
            str_cep = str_cep.replaceAll(" ", "");
            pj_CEP = str_cep;
            if ((pj_CEP == null) || (pj_CEP.equals(""))) {
                listaPJ = (ArrayList<PessoaJuridica>) fachada.listarPessoaJuridica();
            } else {
                listaPJ = (ArrayList<PessoaJuridica>) fachada.listarPessoaJuridica();
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        DefaultTableModel modelo = geramodeloPJ(listaPJ);
        jTablePJ.setModel(modelo);
    }
    
    private void pesquisarLogradouro(){
        try {
            if ((jTextEnd.getText() == null) || (jTextEnd.getText().equals(""))) {
                listaPJ = (ArrayList<PessoaJuridica>) fachada.listarPessoaJuridica();
            } else {
                listaPJ = (ArrayList<PessoaJuridica>) fachada.listarPessoaJuridica();
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        DefaultTableModel modelo = geramodeloPJ(listaPJ);
        jTablePJ.setModel(modelo);
    }
    
    private void pesquisarCidade(String cidades_Nome) {
        try{
            listaPJ = (ArrayList<PessoaJuridica>) fachada.listarPjCidade(cidades_Nome);
        } catch (GeralException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        DefaultTableModel modelo = geramodeloPJ(listaPJ);
        jTablePJ.setModel(modelo);
    }
    
    private void atualizarTabela() {
        try {
            listaPJ = (ArrayList<PessoaJuridica>) fachada.listarPessoaJuridica();
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        DefaultTableModel modelo = geramodeloPJ(listaPJ);
        jTablePJ.setModel(modelo);
    }
    
    private void atualizarComboCidade() {
        Cidade cid;
        ArrayList<Cidade> listaCd;
        try {
            listaCd = (ArrayList<Cidade>) fachada.listarCidadeTudo();
            for (Iterator<Cidade> it = listaCd.iterator(); it.hasNext();) {
                cid = it.next();
                jCbBoxCidade.addItem(cid.getCidades_Nome());
            }
        } catch (GeralException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void limparCampos() {
        jFormatTextCNPJ.setValue(null);
        jFormatTextCEP.setValue(null);
        jTextEnd.setText("");
        jTextPJ.setText("");
    }
    
    private DefaultTableModel geramodeloPJ(ArrayList<PessoaJuridica> listaPJ) {
        DefaultTableModel modeloPJ = new DefaultTableModel();
        modeloPJ.addColumn("CNPJ");
        modeloPJ.addColumn("Razão Social");
        modeloPJ.addColumn("Logradouro");
        modeloPJ.addColumn("Número");
        modeloPJ.addColumn("Cidade");
        modeloPJ.addColumn("CEP");

        ArrayList<String> valores;
        int i = 0;
        for (PessoaJuridica pj : listaPJ) {
            valores = new ArrayList<String>();
            valores.add(pj.getPessoasJuridica_CNPJ());
            valores.add(pj.getPessoasJuridica_RazaoSocial());
            valores.add(pj.getEndereco().getEnderecos_Logradouro());
            valores.add(String.valueOf(pj.getClientes_NumeroResidencia()));
            valores.add(pj.getEndereco().getCidade().getCidades_Nome());
            valores.add(pj.getEndereco().getEnderecos_CEP());
            modeloPJ.insertRow(i, valores.toArray());
            i++;
        }
        return modeloPJ;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jCbBoxCidade;
    private javax.swing.JFormattedTextField jFormatTextCEP;
    private javax.swing.JFormattedTextField jFormatTextCNPJ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePJ;
    private javax.swing.JTextField jTextEnd;
    private javax.swing.JTextField jTextPJ;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSair;
    // End of variables declaration//GEN-END:variables
}
