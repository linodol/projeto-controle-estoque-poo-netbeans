/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.gui;

import javax.swing.JOptionPane;
import projeto.erro.GeralException;
import projeto.modelo.fachada.Fachada;
import projeto.modelo.to.Endereco;
import projeto.modelo.to.Funcionario;

/**
 *
 * @author Thiago Evoa
 */
public class GuiFuncionarioNovo extends javax.swing.JFrame {

    public static Fachada fachada = new Fachada();
    
    private GuiFuncionario guiFu = new GuiFuncionario();
    /**
     * Creates new form GuiFuncionarioNovo
     */
    public GuiFuncionarioNovo() {
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
        JlNomeFuncionario = new javax.swing.JLabel();
        JcNomeFuncionario = new javax.swing.JTextField();
        JlNumeroResidencia = new javax.swing.JLabel();
        JcNumeroResidencia = new javax.swing.JTextField();
        JbSalvar = new javax.swing.JButton();
        JbConsultarCEP = new javax.swing.JButton();
        JlCEP = new javax.swing.JLabel();
        JcCEP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        JlNomeFuncionario.setText("Nome Funcionario.:");

        JlNumeroResidencia.setText("Número da Residência.:");

        JbSalvar.setText("Salvar");
        JbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbSalvarActionPerformed(evt);
            }
        });

        JbConsultarCEP.setText("Consultar CEP");
        JbConsultarCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbConsultarCEPActionPerformed(evt);
            }
        });

        JlCEP.setText("CEP.:");

        JcCEP.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(JlNumeroResidencia)
                                .addGap(18, 18, 18)
                                .addComponent(JcNumeroResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(JlNomeFuncionario)
                                .addGap(18, 18, 18)
                                .addComponent(JcNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(JlCEP)
                                .addGap(18, 18, 18)
                                .addComponent(JcCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(JbConsultarCEP)
                        .addGap(60, 60, 60)
                        .addComponent(JbSalvar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlNomeFuncionario)
                    .addComponent(JcNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlCEP)
                    .addComponent(JcCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlNumeroResidencia)
                    .addComponent(JcNumeroResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JbSalvar)
                    .addComponent(JbConsultarCEP))
                .addGap(40, 40, 40))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbSalvarActionPerformed
        // TODO add your handling code here:
        salvarFuncionario();
    }//GEN-LAST:event_JbSalvarActionPerformed

    private void JbConsultarCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbConsultarCEPActionPerformed
        // TODO add your handling code here:
        
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
            java.util.logging.Logger.getLogger(GuiFuncionarioNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiFuncionarioNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiFuncionarioNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiFuncionarioNovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GuiFuncionarioNovo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbConsultarCEP;
    private javax.swing.JButton JbSalvar;
    private javax.swing.JTextField JcCEP;
    private javax.swing.JTextField JcNomeFuncionario;
    private javax.swing.JTextField JcNumeroResidencia;
    private javax.swing.JLabel JlCEP;
    private javax.swing.JLabel JlNomeFuncionario;
    private javax.swing.JLabel JlNumeroResidencia;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void salvarFuncionario() {
    int funcionarios_Codigo = 0;
    int enderecos_Codigo = 0;    
    String funcionarios_Nome;
    String funcionarios_NumeroResidencia;
    int fu_cod = 0;
    String end_cod = "";
    try{
        Funcionario fu = fachada.consultarFuncionario(fu_cod);
        funcionarios_Codigo = fu.getEnderecos_Codigo();
        Endereco end = fachada.consultarEndCep(end_cod);
        enderecos_Codigo = end.getEnderecos_Codigo();
        funcionarios_Nome = JcNomeFuncionario.getText();
        funcionarios_NumeroResidencia = JcNumeroResidencia.getText();
        //Funcionario fu = new Funcionario (int funcionario_Codigo, int enderecos_Codigo, String funcionarios_Nome, String funcionarios_NumeroResidencia);
        fachada.salvarFuncionario(fu);
    }catch (GeralException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
    }
}
