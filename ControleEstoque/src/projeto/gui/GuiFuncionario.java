/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.gui;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.erro.GeralException;
import projeto.modelo.fachada.Fachada;
import projeto.modelo.to.Funcionario;

/**
 *
 * @author Thiago Evoa
 */
public class GuiFuncionario extends javax.swing.JFrame {

    ArrayList<Funcionario> listaFuncionario = null;
    
    public static Fachada fachada = new Fachada();
    
    /**
     * Creates new form GuiFuncionario
     */
    public GuiFuncionario() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JcFuncionario = new javax.swing.JTextField();
        JlFuncionario = new javax.swing.JLabel();
        JbPesquisar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtListarFuncionario = new javax.swing.JTable();
        JbNovo = new javax.swing.JButton();
        JbAlterar = new javax.swing.JButton();
        JbExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        JcFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JcFuncionarioKeyPressed(evt);
            }
        });

        JlFuncionario.setText("Funcionario.:");

        JbPesquisar.setText("...");
        JbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JlFuncionario)
                .addGap(18, 18, 18)
                .addComponent(JcFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbPesquisar)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JcFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlFuncionario)
                    .addComponent(JbPesquisar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        JtListarFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Funcionario", "Endereço", "Número Residência"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JtListarFuncionario.setShowHorizontalLines(false);
        JtListarFuncionario.setShowVerticalLines(false);
        jScrollPane1.setViewportView(JtListarFuncionario);

        JbNovo.setText("Novo");
        JbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbNovoActionPerformed(evt);
            }
        });

        JbAlterar.setText("Alterar");
        JbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAlterarActionPerformed(evt);
            }
        });

        JbExcluir.setText("Excluir");
        JbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JbAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JbNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JbExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(JbNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JbExcluir)
                .addContainerGap(149, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(106, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbNovoActionPerformed
        // TODO add your handling code here:
        GuiFuncionarioNovo fu = new GuiFuncionarioNovo();
        fu.setVisible(true);
    }//GEN-LAST:event_JbNovoActionPerformed

    private void JbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAlterarActionPerformed
        // TODO add your handling code here:
        try{
        GuiFuncionarioAlterar falterar = new GuiFuncionarioAlterar();
        
        
         //pegar o objeto selecionado
            Funcionario f = fSelecionado();
            
            falterar.JcNomeFuncionario.setText(f.getFuncionarios_Nome());
            falterar.jFormattedTextFieldCEP.setText(f.getEnderecos().getEnderecos_CEP());
            falterar.JcNumeroResidencia.setText(f.getFuncionarios_NumeroResidencia());
            
            
            try {
                Funcionario codFuncionario = fachada.consultarFuncionario(f.getFuncionarios_Nome());
                
                falterar.alterFuncionario.setFuncionarios_Codigo(codFuncionario.getFuncionarios_Codigo());
                falterar.alterFuncionario.setEnderecos_Codigo(f.getEnderecos_Codigo());
                
            } catch (GeralException ex) {
                Logger.getLogger(GuiFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        
        
        falterar.setVisible(true);
         
        } catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null, "Selecione o Funcionário!");
        }
    }//GEN-LAST:event_JbAlterarActionPerformed

    private void JbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbExcluirActionPerformed
        // TODO add your handling code here:
        int resposta;
        
        try{
            Funcionario fu = listaFuncionario.get(JtListarFuncionario.getSelectedRow());
            
            resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente Apagar ?", "", JOptionPane.YES_NO_OPTION);
            if(resposta == JOptionPane.YES_OPTION){
            Funcionario fuconsul = fachada.consultarFuncionario(fu.getFuncionarios_Nome());
            
                if(fuconsul != null){
                fachada.excluirFuncionario(fuconsul.getFuncionarios_Codigo());
                JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
                atualizarJTabela();
                }
            }
        }catch (ArrayIndexOutOfBoundsException ex){
           JOptionPane.showMessageDialog(null, "Selecione o usuário!");
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_JbExcluirActionPerformed

    private void JbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbPesquisarActionPerformed
        // TODO add your handling code here:
        pesquisarFuncionario();
    }//GEN-LAST:event_JbPesquisarActionPerformed

    private void JcFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JcFuncionarioKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pesquisarFuncionario();
        }
    }//GEN-LAST:event_JcFuncionarioKeyPressed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        atualizarJTabela();
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
            java.util.logging.Logger.getLogger(GuiFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GuiFuncionario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbAlterar;
    private javax.swing.JButton JbExcluir;
    private javax.swing.JButton JbNovo;
    private javax.swing.JButton JbPesquisar;
    private javax.swing.JTextField JcFuncionario;
    private javax.swing.JLabel JlFuncionario;
    private javax.swing.JTable JtListarFuncionario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

public Funcionario fSelecionado(){
        Funcionario f = listaFuncionario.get(JtListarFuncionario.getSelectedRow());
        return f;
    }
   
    //MODELO DA TABELA
private DefaultTableModel geramodelo(ArrayList<Funcionario> listaFuncionarios) {
       DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Funcionário", "Endereço", "Número Residência"}, 0) {

            public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;
            }
       };
        //modelo.addColumn("Funcionário");
       // modelo.addColumn("Endereço");
        //modelo.addColumn("Número Residência");

        ArrayList<String> valores;
        int i = 0;
        for (Funcionario fu : listaFuncionarios) {
            valores = new ArrayList<String>();
            valores.add(fu.getFuncionarios_Nome());
            valores.add(fu.getEnderecos().getEnderecos_Logradouro());
            valores.add(fu.getFuncionarios_NumeroResidencia());
            modelo.insertRow(i, valores.toArray());
            i++;
        }
        return modelo;
    }


    private void atualizarJTabela(){
        try {
            listaFuncionario = (ArrayList<Funcionario>) fachada.listarTodosFuncionario();
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        DefaultTableModel modelo = geramodelo(listaFuncionario);
        JtListarFuncionario.setModel(modelo); 
    }
    
    public void pesquisarFuncionario(){
         try{
            listaFuncionario = ( ArrayList<Funcionario>)fachada.listarFuncionario(JcFuncionario.getText());
        } catch (GeralException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
        }
          DefaultTableModel modelo = geramodelo(listaFuncionario);
          JtListarFuncionario.setModel(modelo); 
    }


}
