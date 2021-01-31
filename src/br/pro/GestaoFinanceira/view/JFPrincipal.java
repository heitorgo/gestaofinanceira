/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.GestaoFinanceira.view;

/**
 *
 * @author heito
 */
public class JFPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFPrincipal
     */
    public JFPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jdpPrincipal = new javax.swing.JDesktopPane();
        jlCadastrocustos = new javax.swing.JLabel();
        jlCadastrodespesas = new javax.swing.JLabel();
        jlCadastroempresas = new javax.swing.JLabel();
        jlCadastrocustosfixo = new javax.swing.JLabel();
        jlCadastrodespesasfixas = new javax.swing.JLabel();
        jlCadastrovendas = new javax.swing.JLabel();
        jlCadastroservico = new javax.swing.JLabel();
        jlBackground = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmProjecoes = new javax.swing.JMenu();
        jmiProjecaobaixas = new javax.swing.JMenuItem();
        jmiProjecaoreceitas = new javax.swing.JMenuItem();
        jmControle = new javax.swing.JMenu();
        jmControlecustos = new javax.swing.JMenuItem();
        jmControlecustosfixos = new javax.swing.JMenuItem();
        jmControledespesas = new javax.swing.JMenuItem();
        jmControledespesasfixas = new javax.swing.JMenuItem();
        jmControleprestacaoservico = new javax.swing.JMenuItem();
        jmControlevendas = new javax.swing.JMenuItem();
        jmiControleprojsaida = new javax.swing.JMenuItem();
        jmControleprojreceita = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1250, 675));

        jdpPrincipal.setMaximumSize(new java.awt.Dimension(2500, 1250));
        jdpPrincipal.setMinimumSize(new java.awt.Dimension(1250, 675));

        jlCadastrocustos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCadastrocustos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/JIFCustosIcon.png"))); // NOI18N
        jlCadastrocustos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Cadastro Custos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jlCadastrocustos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCadastrocustosMouseClicked(evt);
            }
        });
        jdpPrincipal.add(jlCadastrocustos);
        jlCadastrocustos.setBounds(20, 20, 140, 80);

        jlCadastrodespesas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCadastrodespesas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/JIFDespesasIcon.png"))); // NOI18N
        jlCadastrodespesas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Cadastro Despesas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jlCadastrodespesas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCadastrodespesasMouseClicked(evt);
            }
        });
        jdpPrincipal.add(jlCadastrodespesas);
        jlCadastrodespesas.setBounds(170, 20, 140, 80);

        jlCadastroempresas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCadastroempresas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/ControleEmpresaIcon.png"))); // NOI18N
        jlCadastroempresas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Cadastro Empresas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jlCadastroempresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCadastroempresasMouseClicked(evt);
            }
        });
        jdpPrincipal.add(jlCadastroempresas);
        jlCadastroempresas.setBounds(680, 20, 140, 80);

        jlCadastrocustosfixo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCadastrocustosfixo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/JIFCustosIcon.png"))); // NOI18N
        jlCadastrocustosfixo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Cadastro Custos Fixos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jlCadastrocustosfixo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCadastrocustosfixoMouseClicked(evt);
            }
        });
        jdpPrincipal.add(jlCadastrocustosfixo);
        jlCadastrocustosfixo.setBounds(320, 20, 160, 80);

        jlCadastrodespesasfixas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCadastrodespesasfixas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/JIFDespesasIcon.png"))); // NOI18N
        jlCadastrodespesasfixas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Cadastro Despesas Fixas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jlCadastrodespesasfixas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCadastrodespesasfixasMouseClicked(evt);
            }
        });
        jdpPrincipal.add(jlCadastrodespesasfixas);
        jlCadastrodespesasfixas.setBounds(500, 20, 170, 80);

        jlCadastrovendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCadastrovendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/JIFVendasIcon.png"))); // NOI18N
        jlCadastrovendas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Cadastro de Vendas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jlCadastrovendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCadastrovendasMouseClicked(evt);
            }
        });
        jdpPrincipal.add(jlCadastrovendas);
        jlCadastrovendas.setBounds(830, 20, 140, 80);

        jlCadastroservico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCadastroservico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/Icon/JIFPrestacaoServicoIcon.png"))); // NOI18N
        jlCadastroservico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "Cadastro de Prestação de Serviços", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jlCadastroservico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCadastroservicoMouseClicked(evt);
            }
        });
        jdpPrincipal.add(jlCadastroservico);
        jlCadastroservico.setBounds(980, 20, 250, 80);

        jlBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/pro/GestaoEmpresarial/images/background_JFPrincipal.jpg"))); // NOI18N
        jlBackground.setToolTipText("");
        jlBackground.setMaximumSize(new java.awt.Dimension(2500, 1250));
        jlBackground.setMinimumSize(new java.awt.Dimension(1250, 675));
        jlBackground.setPreferredSize(new java.awt.Dimension(1250, 675));
        jdpPrincipal.add(jlBackground);
        jlBackground.setBounds(-80, 0, 2500, 1250);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jmProjecoes.setText("Projeção");

        jmiProjecaobaixas.setText("Cadastro Projeção Custos/Despesas");
        jmiProjecaobaixas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmiProjecaobaixas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmiProjecaobaixas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProjecaobaixasActionPerformed(evt);
            }
        });
        jmProjecoes.add(jmiProjecaobaixas);

        jmiProjecaoreceitas.setText("Cadastro Projeção Receitas");
        jmiProjecaoreceitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmiProjecaoreceitas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmiProjecaoreceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProjecaoreceitasActionPerformed(evt);
            }
        });
        jmProjecoes.add(jmiProjecaoreceitas);

        jMenuBar1.add(jmProjecoes);

        jmControle.setText("Controle");

        jmControlecustos.setText("Controle de Custos");
        jmControlecustos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmControlecustos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmControlecustos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmControlecustosActionPerformed(evt);
            }
        });
        jmControle.add(jmControlecustos);

        jmControlecustosfixos.setText("Controle de Custos Fixos");
        jmControlecustosfixos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmControlecustosfixos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmControlecustosfixos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmControlecustosfixosActionPerformed(evt);
            }
        });
        jmControle.add(jmControlecustosfixos);

        jmControledespesas.setText("Controle de Despesas");
        jmControledespesas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmControledespesas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmControledespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmControledespesasActionPerformed(evt);
            }
        });
        jmControle.add(jmControledespesas);

        jmControledespesasfixas.setText("Controle de Despesas Fixas");
        jmControledespesasfixas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmControledespesasfixas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmControledespesasfixas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmControledespesasfixasActionPerformed(evt);
            }
        });
        jmControle.add(jmControledespesasfixas);

        jmControleprestacaoservico.setText("Controle de Prestação de Serviço");
        jmControleprestacaoservico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmControleprestacaoservico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmControleprestacaoservico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmControleprestacaoservicoActionPerformed(evt);
            }
        });
        jmControle.add(jmControleprestacaoservico);

        jmControlevendas.setText("Controle de Vendas");
        jmControlevendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmControlevendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmControlevendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmControlevendasActionPerformed(evt);
            }
        });
        jmControle.add(jmControlevendas);

        jmiControleprojsaida.setText("Controle de Projeção Custos/Despesas");
        jmiControleprojsaida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmiControleprojsaida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmiControleprojsaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiControleprojsaidaActionPerformed(evt);
            }
        });
        jmControle.add(jmiControleprojsaida);

        jmControleprojreceita.setText("Controle de Projeções de Receitas");
        jmControleprojreceita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmControleprojreceita.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jmControleprojreceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmControleprojreceitaActionPerformed(evt);
            }
        });
        jmControle.add(jmControleprojreceita);

        jMenuBar1.add(jmControle);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1593, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1609, 731));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jlCadastrocustosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCadastrocustosMouseClicked
        JIFCadCustos janela = new JIFCadCustos();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jlCadastrocustosMouseClicked

    private void jlCadastrodespesasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCadastrodespesasMouseClicked
        JIFCadDespesas janela = new JIFCadDespesas();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jlCadastrodespesasMouseClicked

    private void jlCadastroempresasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCadastroempresasMouseClicked
        JIFCadEmpresa janela = new JIFCadEmpresa();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jlCadastroempresasMouseClicked

    private void jlCadastrocustosfixoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCadastrocustosfixoMouseClicked
        JIFCadCustosFixos janela = new JIFCadCustosFixos();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jlCadastrocustosfixoMouseClicked

    private void jlCadastrodespesasfixasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCadastrodespesasfixasMouseClicked
        JIFCadDespesasFixas janela = new JIFCadDespesasFixas();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jlCadastrodespesasfixasMouseClicked

    private void jmiProjecaobaixasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProjecaobaixasActionPerformed
        JIFCadProjecaoSaida janela = new JIFCadProjecaoSaida();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jmiProjecaobaixasActionPerformed

    private void jmiProjecaoreceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProjecaoreceitasActionPerformed
        JIFCadProjecaoReceita janela = new JIFCadProjecaoReceita();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jmiProjecaoreceitasActionPerformed

    private void jlCadastrovendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCadastrovendasMouseClicked
        JIFCadVendas janela = new JIFCadVendas();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jlCadastrovendasMouseClicked

    private void jlCadastroservicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCadastroservicoMouseClicked
        JIFCadPrestacaoServico janela = new JIFCadPrestacaoServico();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jlCadastroservicoMouseClicked

    private void jmiControleprojsaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiControleprojsaidaActionPerformed
        JIFControleprojecaosaida janela = new JIFControleprojecaosaida();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jmiControleprojsaidaActionPerformed

    private void jmControleprojreceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmControleprojreceitaActionPerformed
        JIFControleprojecaoreceita janela = new JIFControleprojecaoreceita();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jmControleprojreceitaActionPerformed

    private void jmControlecustosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmControlecustosActionPerformed
        JIFControlecusto janela = new JIFControlecusto();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jmControlecustosActionPerformed

    private void jmControlecustosfixosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmControlecustosfixosActionPerformed
        JIFControlecustofixo janela = new JIFControlecustofixo();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jmControlecustosfixosActionPerformed

    private void jmControledespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmControledespesasActionPerformed
        JIFControledespesa janela = new JIFControledespesa();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jmControledespesasActionPerformed

    private void jmControledespesasfixasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmControledespesasfixasActionPerformed
        JIFControledespesafixa janela = new JIFControledespesafixa();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jmControledespesasfixasActionPerformed

    private void jmControleprestacaoservicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmControleprestacaoservicoActionPerformed
        JIFControleprestacaoservico janela = new JIFControleprestacaoservico();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jmControleprestacaoservicoActionPerformed

    private void jmControlevendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmControlevendasActionPerformed
        JIFControlevenda janela = new JIFControlevenda();
        jdpPrincipal.add(janela);
        janela.setVisible(true);
    }//GEN-LAST:event_jmControlevendasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JLabel jlBackground;
    private javax.swing.JLabel jlCadastrocustos;
    private javax.swing.JLabel jlCadastrocustosfixo;
    private javax.swing.JLabel jlCadastrodespesas;
    private javax.swing.JLabel jlCadastrodespesasfixas;
    private javax.swing.JLabel jlCadastroempresas;
    private javax.swing.JLabel jlCadastroservico;
    private javax.swing.JLabel jlCadastrovendas;
    private javax.swing.JMenu jmControle;
    private javax.swing.JMenuItem jmControlecustos;
    private javax.swing.JMenuItem jmControlecustosfixos;
    private javax.swing.JMenuItem jmControledespesas;
    private javax.swing.JMenuItem jmControledespesasfixas;
    private javax.swing.JMenuItem jmControleprestacaoservico;
    private javax.swing.JMenuItem jmControleprojreceita;
    private javax.swing.JMenuItem jmControlevendas;
    private javax.swing.JMenu jmProjecoes;
    private javax.swing.JMenuItem jmiControleprojsaida;
    private javax.swing.JMenuItem jmiProjecaobaixas;
    private javax.swing.JMenuItem jmiProjecaoreceitas;
    // End of variables declaration//GEN-END:variables
}
