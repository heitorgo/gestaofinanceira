/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.GestaoFinanceira.view;

import br.pro.GestaoFinanceira.data.CustosFixosData;
import br.pro.GestaoFinanceira.data.EmpresaData;
import br.pro.GestaoFinanceira.model.CustosFixosModel;
import br.pro.GestaoFinanceira.model.EmpresaModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author heito
 */
public class JIFCadCustosFixos extends javax.swing.JInternalFrame {
    //objeto model
    EmpresaModel empresa;
    EmpresaData DAOEmpresa;
    ArrayList<EmpresaModel> listaEmpresa;
    CustosFixosData DAO;
    CustosFixosModel obj;
    ArrayList<CustosFixosModel> lista;
    /**
     * Creates new form JIFCadFuncionario
     */
    public JIFCadCustosFixos() {
       
        //instanciação dos obj no construtor 
        try{
            
            lista = new ArrayList<>();
            listaEmpresa = new ArrayList<>();
            obj = new CustosFixosModel();
            empresa = new EmpresaModel();
            DAO = new CustosFixosData();
            DAOEmpresa = new EmpresaData();
            listaEmpresa = DAOEmpresa.carregarCombo();
            initComponents();
            for(EmpresaModel e : listaEmpresa){
                jcbEmpresa.addItem(""+e.getIdempresa());
            }
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

        jtpEdicao = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jlIdcustofixo = new javax.swing.JLabel();
        jlIdcustofixo1 = new javax.swing.JLabel();
        jlEmpresa = new javax.swing.JLabel();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jcbEmpresa = new javax.swing.JComboBox<>();
        jlFrequenciacusto = new javax.swing.JLabel();
        jlValorcustofixo = new javax.swing.JLabel();
        jtValorcustofixo = new javax.swing.JTextField();
        jlDetalhamentocustofixo = new javax.swing.JLabel();
        jtDetalhamentocustofixo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtFrequenciacusto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtPesquisa = new javax.swing.JTextField();
        jlPesquisa = new javax.swing.JLabel();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jbSalvar1 = new javax.swing.JButton();
        jlFrequenciacusto1 = new javax.swing.JLabel();
        jtDetalhamentocustofixo1 = new javax.swing.JTextField();
        jlDetalhamentocustofixo1 = new javax.swing.JLabel();
        jlValorcustofixo1 = new javax.swing.JLabel();
        jtValorcustofixo1 = new javax.swing.JTextField();
        jbCancelar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbDados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtFrequenciacusto1 = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro/Edição de Custos Fixos");
        setEnabled(false);

        jPanel1.setLayout(null);

        jlIdcustofixo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlIdcustofixo.setText("*ID:");
        jPanel1.add(jlIdcustofixo);
        jlIdcustofixo.setBounds(10, 52, 100, 30);

        jlIdcustofixo1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jlIdcustofixo1);
        jlIdcustofixo1.setBounds(116, 52, 237, 30);

        jlEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlEmpresa.setText("Empresa:");
        jPanel1.add(jlEmpresa);
        jlEmpresa.setBounds(10, 244, 100, 30);

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/jbNovoIcon.png"))); // NOI18N
        jbNovo.setBorder(null);
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNovo);
        jbNovo.setBounds(10, 292, 50, 40);

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/jbSalvarIcon.png"))); // NOI18N
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalvar);
        jbSalvar.setBounds(130, 292, 50, 40);

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/jbCancelarIcon.png"))); // NOI18N
        jbCancelar.setEnabled(false);
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jbCancelar);
        jbCancelar.setBounds(70, 292, 50, 40);

        jPanel1.add(jcbEmpresa);
        jcbEmpresa.setBounds(114, 244, 237, 30);

        jlFrequenciacusto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFrequenciacusto.setText("*Frequência:");
        jPanel1.add(jlFrequenciacusto);
        jlFrequenciacusto.setBounds(10, 100, 100, 30);

        jlValorcustofixo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlValorcustofixo.setText("*Valor:");
        jPanel1.add(jlValorcustofixo);
        jlValorcustofixo.setBounds(10, 148, 100, 30);

        jtValorcustofixo.setEnabled(false);
        jPanel1.add(jtValorcustofixo);
        jtValorcustofixo.setBounds(116, 148, 237, 30);

        jlDetalhamentocustofixo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDetalhamentocustofixo.setText("*Detalhamento:");
        jPanel1.add(jlDetalhamentocustofixo);
        jlDetalhamentocustofixo.setBounds(12, 196, 100, 30);

        jtDetalhamentocustofixo.setEnabled(false);
        jPanel1.add(jtDetalhamentocustofixo);
        jtDetalhamentocustofixo.setBounds(116, 196, 237, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRO CUSTO FIXO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 8, 905, 33);

        jtFrequenciacusto.setEnabled(false);
        jPanel1.add(jtFrequenciacusto);
        jtFrequenciacusto.setBounds(116, 100, 237, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/JIFCadCustosIcon.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(370, 40, 520, 520);

        jtpEdicao.addTab("Cadastro", jPanel1);

        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyReleased(evt);
            }
        });

        jlPesquisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlPesquisa.setText("Pesquisa:");

        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/jbEditarIcon.png"))); // NOI18N
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/jbExcluirIcon.png"))); // NOI18N
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/jbSalvarIcon.png"))); // NOI18N
        jbSalvar1.setEnabled(false);
        jbSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvar1ActionPerformed(evt);
            }
        });

        jlFrequenciacusto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFrequenciacusto1.setText("*Frequência:");

        jtDetalhamentocustofixo1.setEnabled(false);

        jlDetalhamentocustofixo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDetalhamentocustofixo1.setText("*Detalhamento:");

        jlValorcustofixo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlValorcustofixo1.setText("*Valor:");

        jtValorcustofixo1.setEnabled(false);

        jbCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/jbCancelarIcon.png"))); // NOI18N
        jbCancelar1.setEnabled(false);
        jbCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelar1ActionPerformed(evt);
            }
        });

        jtbDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Valor", "Frequência", "Detalhamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        jScrollPane2.setViewportView(jtbDados);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pesquise a frequência para realizar Alteração/Exclusão de CUSTOS FIXOS ");

        jtFrequenciacusto1.setEnabled(false);

        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/jbPesquisaIcon.png"))); // NOI18N
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlValorcustofixo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlFrequenciacusto1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtValorcustofixo1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtFrequenciacusto1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(jlDetalhamentocustofixo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDetalhamentocustofixo1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(109, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDetalhamentocustofixo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDetalhamentocustofixo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtValorcustofixo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlValorcustofixo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFrequenciacusto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFrequenciacusto1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jtpEdicao.addTab("Edição", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtpEdicao, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jtpEdicao)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try{
            if(validarCampos()){
                if(preencherObjeto()){
                    if(DAO.incluir(obj)){
                        JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso", "Salvar", JOptionPane.WARNING_MESSAGE);
                        jbCancelarActionPerformed(evt);
                    }else{
                        JOptionPane.showMessageDialog(this, "Erro ao salvar: ", "Salvar-Custo Fixo", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }    
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Erro ao salvar: " + e.getMessage(), "Salvar-Custo Fixo", JOptionPane.ERROR_MESSAGE);   
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        //chamando metodos da classe formularios
        br.pro.GestaoEmpresarial.extras.Formularios.limparCampos(this);
        br.pro.GestaoEmpresarial.extras.Formularios.tratarCampos(this, true);
        br.pro.GestaoEmpresarial.extras.Formularios.limparTabela(jtbDados);
        //configurando os botões
        jlIdcustofixo1.setText("0");
        jbNovo.setEnabled(false);
        jbSalvar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jtpEdicao.setEnabled(false);
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        br.pro.GestaoEmpresarial.extras.Formularios.limparCampos(this);
        br.pro.GestaoEmpresarial.extras.Formularios.tratarCampos(this, false);
        br.pro.GestaoEmpresarial.extras.Formularios.limparTabela(jtbDados);
        jlIdcustofixo1.setText("0");
        jbNovo.setEnabled(true);
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jtPesquisa.setEnabled(true);
        jbPesquisar.setEnabled(true);
        jtpEdicao.setEnabled(true);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        br.pro.GestaoEmpresarial.extras.Formularios.tratarCampos(this, true);
        jcbEmpresa.setEnabled(false);
        jbSalvar1.setEnabled(true);
        jbCancelar1.setEnabled(true);
        jbExcluir.setEnabled(false);
        jbEditar.setEnabled(false);
        jbPesquisar.setEnabled(false);
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this ,"Você tem certeza que deseja Excluir o Custo Fixo ("+jlIdcustofixo1.getText()+")", "Exclusão",JOptionPane.YES_NO_OPTION);
        if (resposta == 0) {
            try {
                if(DAO.excluir(Integer.parseInt(jlIdcustofixo1.getText()))){
                    JOptionPane.showMessageDialog(this, "Excluído com sucesso");
                    jbCancelar1ActionPerformed(evt);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o registro: "+e.getMessage());
            }
        }else{  
            JOptionPane.showMessageDialog(this, "O registro não será excluído");
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyReleased
        
    }//GEN-LAST:event_jtPesquisaKeyReleased

    private void jtbDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDadosMouseClicked
         try {
            int linha = jtbDados.getSelectedRow();
            if(linha>-1){
                jlIdcustofixo1.setText(jtbDados.getValueAt(linha, 0).toString());
                jtValorcustofixo1.setText(jtbDados.getValueAt(linha, 1).toString());
                jtFrequenciacusto1.setText(jtbDados.getValueAt(linha, 2).toString());
                jtDetalhamentocustofixo1.setText(jtbDados.getValueAt(linha,3).toString());
                for(int i=0;i<listaEmpresa.size();i++){
                    if(listaEmpresa.get(i).getIdempresa() == lista.get(linha).getEmpresa().getIdempresa()){
                        jcbEmpresa.setSelectedIndex(i);
                    }
                }
                
                jbEditar.setEnabled(true);
                jbExcluir.setEnabled(true);
                jbCancelar1.setEnabled(true);
                jbPesquisar.setEnabled(false);
                jtpEdicao.setEnabled(false);
            } else {
                jbEditar.setEnabled(false);
                jbExcluir.setEnabled(false);
                jbCancelar1.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao selecionar o registro: "+e.getMessage());
        }

    }//GEN-LAST:event_jtbDadosMouseClicked

    private void jbSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvar1ActionPerformed
        try{
        if(validarCampos1()){
            if(atualizarObjeto()){    
                if(DAO.editar(obj)){
                    JOptionPane.showMessageDialog(rootPane, "Atualizado com sucesso", "Atualizar", JOptionPane.WARNING_MESSAGE);
                    jbCancelar1ActionPerformed(evt);
                } 
                else {
                    JOptionPane.showMessageDialog(this, "Erro ao Atualizar: ", "Atualizar-Custo Fixo", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }catch (Exception e){
        JOptionPane.showMessageDialog(this, "Erro ao atualizar: " + e.getMessage(), "Atualizar-Custo Fixo", JOptionPane.ERROR_MESSAGE);       
    }
    }//GEN-LAST:event_jbSalvar1ActionPerformed

    private void jbCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelar1ActionPerformed
        br.pro.GestaoEmpresarial.extras.Formularios.limparCampos(this);
        br.pro.GestaoEmpresarial.extras.Formularios.tratarCampos(this, false);
        br.pro.GestaoEmpresarial.extras.Formularios.limparTabela(jtbDados);
        jbSalvar1.setEnabled(false);
        jbCancelar1.setEnabled(false);
        jbEditar.setEnabled(false);
        jbExcluir.setEnabled(false);
        jtPesquisa.setText("");
        jtPesquisa.setEnabled(true);
        jbPesquisar.setEnabled(true);
        jtpEdicao.setEnabled(true);
    }//GEN-LAST:event_jbCancelar1ActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        try {
        lista = DAO.pesquisar(jtPesquisa.getText());
        DefaultTableModel mp = (DefaultTableModel) jtbDados.getModel();
        mp.setNumRows(0);
        for(CustosFixosModel ob: lista){
            mp.addRow(new String[]{""+ob.getIdcustofixo(),""+ob.getValorcustofixo(),""+ob.getFrequenciacusto(),ob.getDetalhamentocustofixo()});
        }
        jbPesquisar.setEnabled(false);
        jbCancelar1.setEnabled(true);
    } catch (Exception e) {
       //JOptionPane.showMessageDialog(this, "Ocorreu um erro: "+e.getMessage());
       e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_jbPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCancelar1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JButton jbSalvar1;
    private javax.swing.JComboBox<String> jcbEmpresa;
    private javax.swing.JLabel jlDetalhamentocustofixo;
    private javax.swing.JLabel jlDetalhamentocustofixo1;
    private javax.swing.JLabel jlEmpresa;
    private javax.swing.JLabel jlFrequenciacusto;
    private javax.swing.JLabel jlFrequenciacusto1;
    private javax.swing.JLabel jlIdcustofixo;
    private javax.swing.JLabel jlIdcustofixo1;
    private javax.swing.JLabel jlPesquisa;
    private javax.swing.JLabel jlValorcustofixo;
    private javax.swing.JLabel jlValorcustofixo1;
    private javax.swing.JTextField jtDetalhamentocustofixo;
    private javax.swing.JTextField jtDetalhamentocustofixo1;
    private javax.swing.JTextField jtFrequenciacusto;
    private javax.swing.JTextField jtFrequenciacusto1;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTextField jtValorcustofixo;
    private javax.swing.JTextField jtValorcustofixo1;
    private javax.swing.JTable jtbDados;
    private javax.swing.JTabbedPane jtpEdicao;
    // End of variables declaration//GEN-END:variables

    private boolean validarCampos(){
        
        if(jtFrequenciacusto.getText().trim().length()<5 ){
            JOptionPane.showMessageDialog(null, "Caractere frequencia Insuficiente(<5)", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(jtValorcustofixo.getText().trim().length()<1 ){
            JOptionPane.showMessageDialog(null, "Caractere valor Insuficiente(<1)", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(jtDetalhamentocustofixo.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Detalhamento Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    return true;
    }
    
    private boolean validarCampos1(){
        if(jtFrequenciacusto1.getText().trim().length()<5 ){
            JOptionPane.showMessageDialog(null, "Caractere frequencia Insuficiente(<5)", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(jtValorcustofixo1.getText().trim().length()<1 ){
            JOptionPane.showMessageDialog(null, "Caractere valor Insuficiente(<1)", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(jtDetalhamentocustofixo1.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Detalhamento Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private boolean preencherObjeto() throws Exception{
        obj.setIdcustofixo(Integer.parseInt(jlIdcustofixo1.getText()));
        obj.setFrequenciacusto(jtFrequenciacusto.getText());
        obj.setValorcustofixo(Float.parseFloat(jtValorcustofixo.getText()));
        obj.setDetalhamentocustofixo(jtDetalhamentocustofixo.getText());
        obj.setEmpresa(listaEmpresa.get(jcbEmpresa.getSelectedIndex()));
        
        return true;    
    }
    
    private boolean atualizarObjeto() throws Exception{
        obj.setIdcustofixo(Integer.parseInt(jlIdcustofixo1.getText()));
        obj.setFrequenciacusto(jtFrequenciacusto1.getText());
        obj.setValorcustofixo(Float.parseFloat(jtValorcustofixo1.getText()));
        obj.setDetalhamentocustofixo(jtDetalhamentocustofixo1.getText());
        obj.setEmpresa(listaEmpresa.get(jcbEmpresa.getSelectedIndex()));
        
        return true;    
    }
    
    
}
