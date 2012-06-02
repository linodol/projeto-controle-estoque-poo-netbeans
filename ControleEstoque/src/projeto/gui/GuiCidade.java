/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.gui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.erro.GeralException;
import projeto.modelo.fachada.Fachada;
import projeto.modelo.to.Cidade;

/**
 *
 * @author Daniel
 */
public class GuiCidade extends javax.swing.JDialog {
    
    ArrayList<Cidade> listaCidade = null;
    public static Fachada fachada = new Fachada();
    
    /**
     * Creates new form GuiCidade
     */
    public GuiCidade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public GuiCidade() {
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
            java.util.logging.Logger.getLogger(GuiCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                GuiCidade dialog = new GuiCidade(new javax.swing.JFrame(), true);
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFiltro = new javax.swing.JPanel();
        label2Cidade = new java.awt.Label();
        jTextFieldCampoCidade = new javax.swing.JTextField();
        jPanelLista = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPaneListaCidades = new javax.swing.JScrollPane();
        jTableListaCidade = new javax.swing.JTable();
        jButtonAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);

        jPanelFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        label2Cidade.setText("Cidade.:");

        jTextFieldCampoCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldCampoCidadeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelFiltroLayout = new javax.swing.GroupLayout(jPanelFiltro);
        jPanelFiltro.setLayout(jPanelFiltroLayout);
        jPanelFiltroLayout.setHorizontalGroup(
            jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jTextFieldCampoCidade)
                .addContainerGap())
        );
        jPanelFiltroLayout.setVerticalGroup(
            jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltroLayout.createSequentialGroup()
                .addGroup(jPanelFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCampoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanelLista.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista das cidades"));

        jButtonSalvar.setText("Novo");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Apagar");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jTableListaCidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Código", "Nome da Cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListaCidade.setColumnSelectionAllowed(true);
        jTableListaCidade.setDragEnabled(true);
        jTableListaCidade.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableListaCidade.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTableListaCidadeComponentShown(evt);
            }
        });
        jScrollPaneListaCidades.setViewportView(jTableListaCidade);

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelListaLayout = new javax.swing.GroupLayout(jPanelLista);
        jPanelLista.setLayout(jPanelListaLayout);
        jPanelListaLayout.setHorizontalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaLayout.createSequentialGroup()
                .addComponent(jScrollPaneListaCidades, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanelListaLayout.setVerticalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaLayout.createSequentialGroup()
                .addComponent(jButtonAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluir)
                .addGap(0, 218, Short.MAX_VALUE))
            .addComponent(jScrollPaneListaCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCampoCidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCampoCidadeKeyReleased
        pesquisarCidadeNome();
    }//GEN-LAST:event_jTextFieldCampoCidadeKeyReleased

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        GuiCidadeNova cdSalvar = new GuiCidadeNova();
        cdSalvar.setVisible(true);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        jTextFieldCampoCidade.setText(null);
        jTextFieldCampoCidade.requestFocus();
        atualizarTabelaCidade();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        jTextFieldCampoCidade.requestFocus();
        jTextFieldCampoCidade.setText("");
        excluirCidade();
        atualizarTabelaCidade();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableListaCidadeComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTableListaCidadeComponentShown
        atualizarComboCidade();
    }//GEN-LAST:event_jTableListaCidadeComponentShown

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        alterarCidade();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    
    /**
     * Define o padrão da tabela e insere os dados da tabela Cidade em um ArrayList;
     * @param listaCidade
     * @return
     */
    private DefaultTableModel geramodelo(ArrayList<Cidade> listaCidade) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nome da Cidade");

        ArrayList<String> valores;
        int i = 0;
        for (Cidade cd : listaCidade) {
            valores = new ArrayList<String>();
            valores.add(Integer.toString(cd.getCidades_Codigo()));
            valores.add(cd.getCidades_Nome());
            modelo.insertRow(i, valores.toArray());
            i++;
        }
        return modelo;
    }

    /**
     * Método para atualizar a tela trazendo a lista atualizada;
     */
    public void atualizarTabelaCidade() {
        try {
            listaCidade = (ArrayList<Cidade>) fachada.listarCidadeTudo();
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        DefaultTableModel modelo = geramodelo(listaCidade);
        jTableListaCidade.setModel(modelo);
    }

    /**
     * Método que filtra a lista pelo nome da cidade informada;
     */
    public void pesquisarCidadeNome() {
        try {
            if ((jTextFieldCampoCidade.getText() == null) || (jTextFieldCampoCidade.getText().equals(""))) {
                listaCidade = (ArrayList<Cidade>) fachada.listarCidadeTudo();
            } else {
                listaCidade = (ArrayList<Cidade>) fachada.listarCidadeNome(jTextFieldCampoCidade.getText());
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        DefaultTableModel modelo = geramodelo(listaCidade);
        jTableListaCidade.setModel(modelo);
    }

    /**
     * Método para efetuar a alteração em um registro selecionado na lista;
     */
    private void alterarCidade() {
        int resposta;
        try {
            Cidade cdOld = listaCidade.get(jTableListaCidade.getSelectedRow());

            resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente Alterar?", "", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                GuiCidadeAlterar guiCidadeAlterar = new GuiCidadeAlterar();
                guiCidadeAlterar.jTextFieldCidadeOld.setText(cdOld.getCidades_Nome());
                guiCidadeAlterar.setVisible(true);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione a cidade!");
        }
    }

    /**
     * Método para efetuar a exclusão de um registro selecionado na lista;
     */
    private void excluirCidade() {
        int resposta;
        try {
            Cidade cd = listaCidade.get(jTableListaCidade.getSelectedRow());

            resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente Apagar ?", "", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                Cidade cdConsult = fachada.consultarCidade(cd.getCidades_Nome());
                if (cdConsult != null) {
                    fachada.excluirCidade(cdConsult.getCidades_Codigo());
                    atualizarTabelaCidade();
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Selecione a cidade!");
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    /**
     * Método que cria um ArrayList para ser mostrado na tela;
     */
    private void atualizarComboCidade() {
        try {
            listaCidade = (ArrayList<Cidade>) fachada.listarCidadeTudo();
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        DefaultTableModel modelo = geramodelo(listaCidade);
        jTableListaCidade.setModel(modelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JPanel jPanelFiltro;
    private javax.swing.JPanel jPanelLista;
    private javax.swing.JScrollPane jScrollPaneListaCidades;
    public javax.swing.JTable jTableListaCidade;
    private javax.swing.JTextField jTextFieldCampoCidade;
    private java.awt.Label label2Cidade;
    // End of variables declaration//GEN-END:variables
}