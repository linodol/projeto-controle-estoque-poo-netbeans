/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.gui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projeto.erro.GeralException;
import projeto.modelo.fachada.Fachada;
import projeto.modelo.to.Endereco;
import projeto.modelo.to.Funcionario;

/**
 *
 * @author Thiago Evoa
 */
public class GuiFuncionarioAlterar extends javax.swing.JFrame {

    Fachada fachada = new Fachada();
    
    Funcionario alterFuncionario = new Funcionario();
    
    private GuiFuncionario guiFu = null;
    /**
     * Creates new form GuiFuncionarioAlterar
     */
    public GuiFuncionarioAlterar() {
        initComponents();
        guiFu = new GuiFuncionario();
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
        JlNomeFuncionario = new javax.swing.JLabel();
        JcNomeFuncionario = new javax.swing.JTextField();
        JlNumeroResidencia = new javax.swing.JLabel();
        JcNumeroResidencia = new javax.swing.JTextField();
        JbAlterar = new javax.swing.JButton();
        JbConsultarCEP = new javax.swing.JButton();
        JlCEP = new javax.swing.JLabel();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JlNomeFuncionario.setText("Nome Funcionario.:");

        JcNomeFuncionario.setEditable(false);

        JlNumeroResidencia.setText("Número da Residência.:");

        JbAlterar.setText("Alterar");
        JbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbAlterarActionPerformed(evt);
            }
        });

        JbConsultarCEP.setText("Consultar CEP");
        JbConsultarCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbConsultarCEPActionPerformed(evt);
            }
        });

        JlCEP.setText("CEP.:");

        try {
            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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
                                .addComponent(JlNumeroResidencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JcNumeroResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JlCEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JbConsultarCEP)))
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JlNomeFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JcNomeFuncionario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(JbAlterar)))
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlNomeFuncionario)
                    .addComponent(JcNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JbConsultarCEP)
                        .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JlCEP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlNumeroResidencia)
                    .addComponent(JcNumeroResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JbAlterar)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbAlterarActionPerformed
        // TODO add your handling code here:
        
        alterFuncionario.setFuncionarios_Nome(JcNomeFuncionario.getText());
        alterFuncionario.setFuncionarios_NumeroResidencia(JcNumeroResidencia.getText());
        
        
        try {
            
            String str_cep = jFormattedTextFieldCEP.getText();
            str_cep = str_cep.replace('-', ' ');
            str_cep = str_cep.replaceAll(" ", "");
            String enderecos_CEP = str_cep;
            Endereco e = fachada.consultarEndCep(enderecos_CEP);
            
               alterFuncionario.setEnderecos_Codigo(e.getEnderecos_Codigo());
             
            fachada.alterarFuncionario(alterFuncionario);
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            dispose();
            
        } catch (GeralException ex) {
            Logger.getLogger(GuiFuncionarioAlterar.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_JbAlterarActionPerformed

    private void JbConsultarCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbConsultarCEPActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            
            String str_cep = jFormattedTextFieldCEP.getText();
            str_cep = str_cep.replace('-', ' ');
            str_cep = str_cep.replaceAll(" ", "");
            String enderecos_CEP = str_cep;
            Endereco e = fachada.consultarEndCep(enderecos_CEP);
            
            if(e == null){
                GuiEnderecoNovo gENovo = new GuiEnderecoNovo();
                gENovo.setVisible(true);
            }else{
                
                alterFuncionario.setEnderecos_Codigo(e.getEnderecos_Codigo());
                
            JOptionPane.showMessageDialog(null, "CEP OK");
            
            }
        } catch (GeralException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_JbConsultarCEPActionPerformed

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
            java.util.logging.Logger.getLogger(GuiFuncionarioAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFuncionarioAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFuncionarioAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFuncionarioAlterar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GuiFuncionarioAlterar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbAlterar;
    private javax.swing.JButton JbConsultarCEP;
    public javax.swing.JTextField JcNomeFuncionario;
    public javax.swing.JTextField JcNumeroResidencia;
    private javax.swing.JLabel JlCEP;
    private javax.swing.JLabel JlNomeFuncionario;
    private javax.swing.JLabel JlNumeroResidencia;
    public javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
