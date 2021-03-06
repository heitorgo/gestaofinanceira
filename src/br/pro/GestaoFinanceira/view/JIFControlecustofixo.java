/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.GestaoFinanceira.view;
import br.pro.GestaoFinanceira.data.CustosFixosData;
import br.pro.GestaoFinanceira.model.CustosFixosModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author heito
 */
public class JIFControlecustofixo extends javax.swing.JInternalFrame {

    CustosFixosData DAO;
    CustosFixosModel obj;
    ArrayList<CustosFixosModel> lista;
    public JIFControlecustofixo() {
        //instanciação dos obj no construtor 
        try{
            lista = new ArrayList<>();
            obj = new CustosFixosModel();
            DAO = new CustosFixosData();
            initComponents();
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDados = new javax.swing.JTable();
        jbCheck = new javax.swing.JButton();
        jbAtualizarregistros = new javax.swing.JButton();
        jtPesquisa = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Controle de Custos Fixos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pesquise a data do CUSTO FIXO");

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/jbPesquisaIcon.png"))); // NOI18N
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jtbDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Valor", "Data", "Detalhamento", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbDados);

        jbCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/jbCheckIcon.png"))); // NOI18N
        jbCheck.setEnabled(false);
        jbCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCheckActionPerformed(evt);
            }
        });

        jbAtualizarregistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/jbAtualizarregistrosIcon.png"))); // NOI18N
        jbAtualizarregistros.setEnabled(false);
        jbAtualizarregistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarregistrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbAtualizarregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAtualizarregistros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
    try {
        lista = DAO.pesquisar(jtPesquisa.getText());
        DefaultTableModel mp = (DefaultTableModel) jtbDados.getModel();
        mp.setNumRows(0);
        for(CustosFixosModel ob: lista){
            mp.addRow(new String[]{""+ob.getIdcustofixo(),""+ob.getValorcustofixo(),ob.getFrequenciacusto(),ob.getDetalhamentocustofixo(),""+ob.isVerifcustofixo()});
        }
        jbAtualizarregistros.setEnabled(true);
        jbCheck.setEnabled(false);
    } catch (Exception e) {
       //JOptionPane.showMessageDialog(this, "Ocorreu um erro: "+e.getMessage());
       e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCheckActionPerformed
    try{
        if(atualizarObjeto()){    
                if(DAO.verificarrecebimento(obj)){
                    JOptionPane.showMessageDialog(rootPane, "Atualizado com sucesso", "Atualizar", JOptionPane.WARNING_MESSAGE);
                    br.pro.GestaoFinanceira.extras.Formularios.limparCampos(this);
                    obj.AtualizarStatus(true);
                    jbCheck.setEnabled(false);
                    jbPesquisarActionPerformed(evt);
                } 
            else {
                JOptionPane.showMessageDialog(this, "Erro ao Atualizar: ", "Atualizar-Projeção", JOptionPane.ERROR_MESSAGE);
            }
        }
    }catch (Exception e){
        JOptionPane.showMessageDialog(this, "Erro ao atualizar: " + e.getMessage(), "Atualizar-Projeção", JOptionPane.ERROR_MESSAGE);       
    }
    }//GEN-LAST:event_jbCheckActionPerformed

    private void jtbDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDadosMouseClicked
        try {
            int linha = jtbDados.getSelectedRow();
            if(linha>-1){
                jtPesquisa.setText(jtbDados.getValueAt(linha, 0).toString());
                jbCheck.setEnabled(true);
                jbAtualizarregistros.setEnabled(false);
            } else {
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao selecionar o registro: "+e.getMessage());
        }
    }//GEN-LAST:event_jtbDadosMouseClicked

    private void jbAtualizarregistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarregistrosActionPerformed
        try{    
            if(DAO.atualizarregistros(obj)){
                JOptionPane.showMessageDialog(rootPane, "Atualizado com sucesso", "Atualizar", JOptionPane.WARNING_MESSAGE);
                jbPesquisarActionPerformed(evt);
                jbCheck.setEnabled(false);
                jbAtualizarregistros.setEnabled(false);
                jtPesquisa.setText("");
            } 
            else {
                JOptionPane.showMessageDialog(this, "Erro ao Atualizar: ", "Atualizar-Rejistros", JOptionPane.ERROR_MESSAGE);
            }
        }catch (Exception e){
        JOptionPane.showMessageDialog(this, "Erro ao atualizar: " + e.getMessage(), "Atualizar-Registros", JOptionPane.ERROR_MESSAGE);       
    }    
    }//GEN-LAST:event_jbAtualizarregistrosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAtualizarregistros;
    private javax.swing.JButton jbCheck;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JFormattedTextField jtPesquisa;
    private javax.swing.JTable jtbDados;
    // End of variables declaration//GEN-END:variables
    
    
    private boolean atualizarObjeto() throws Exception{
        obj.setIdcustofixo(Integer.parseInt(jtPesquisa.getText()));  
    return true;    
    }
    
    private void formatarCampos() throws Exception{
        MaskFormatter maskdata = new MaskFormatter("##-##-####");
        maskdata.install(jtPesquisa);
    }
}
