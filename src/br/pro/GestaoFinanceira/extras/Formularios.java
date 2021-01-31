/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.GestaoEmpresarial.extras;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author heito
 */
public class Formularios {
    
    public static void limparCampos(JInternalFrame form) {
         limparCampos(form.getContentPane().getComponents());
    }
    public static void limparCampos(JFrame form) {
         limparCampos(form.getContentPane().getComponents());
    }

    public static void limparCampos(Component componentes[]) {
        for(Component c: componentes){
            if(c instanceof JSpinner){
                ((JSpinner) c).setValue(0);
            }
            if(c instanceof JProgressBar){
                ((JProgressBar) c).setValue(0);
            }
            if(c instanceof JTextField){
                ((JTextField) c).setText(null);
            }
            if(c instanceof JTextComponent){
                ((JTextComponent) c).setText(null);
            }
            if(c instanceof JPasswordField){
                ((JPasswordField) c).setText(null);
            }
            if(c instanceof JTextPane){
                ((JTextPane) c).setText(null);
            }
            if(c instanceof JTextArea){
                ((JTextArea) c).setText(null);
            }
            if(c instanceof JComboBox){
                ((JComboBox) c).setSelectedIndex(0);
            }
            if(c instanceof JRadioButton){
                ((JRadioButton) c).setSelected(false);
            }
            if(c instanceof JCheckBox){
                ((JCheckBox) c).setSelected(false);
            }
            if(c instanceof JViewport){
                limparCampos(((JViewport) c).getComponents());
            }
            if(c instanceof JPanel){
                limparCampos(((JPanel) c).getComponents());
            }
            if(c instanceof JTabbedPane){
                limparCampos(((JTabbedPane) c).getComponents());
            }
            if(c instanceof JEditorPane){
                limparCampos(((JEditorPane) c).getComponents());
            }
            if(c instanceof JScrollPane){
                limparCampos(((JScrollPane) c).getComponents());
            }
            if(c instanceof JScrollBar){
                limparCampos(((JScrollBar) c).getComponents());
            }
        }
    }
    public static void tratarCampos(JInternalFrame form, boolean t) {
        tratarCampos(form.getContentPane().getComponents(),t);
    }
    public static void tratarCampos(JFrame form, boolean t) {
        tratarCampos(form.getContentPane().getComponents(),t);
    }
    public static void tratarCampos(Component componentes[], boolean t) {
        for(Component c: componentes){
            if(c instanceof JSpinner){
                ((JSpinner) c).setEnabled(t);
            }
            if(c instanceof JProgressBar){
                ((JProgressBar) c).setEnabled(t);
            }
            if(c instanceof JTextField){
                ((JTextField) c).setEnabled(t);
            }
            if(c instanceof JTextComponent){
                ((JTextComponent) c).setEnabled(t);
            }
            if(c instanceof JPasswordField){
                ((JPasswordField) c).setEnabled(t);
            }
            if(c instanceof JTextPane){
                ((JTextPane) c).setEnabled(t);
            }
            if(c instanceof JTextArea){
                ((JTextArea) c).setEnabled(t);
            }
            if(c instanceof JComboBox){
                ((JComboBox) c).setEnabled(t);
            }
            if(c instanceof JRadioButton){
                ((JRadioButton) c).setEnabled(t);
            }
            if(c instanceof JCheckBox){
                ((JCheckBox) c).setEnabled(t);
            }
            if(c instanceof JViewport){
                tratarCampos(((JViewport) c).getComponents(),t);
            }
            if(c instanceof JPanel){
                tratarCampos(((JPanel) c).getComponents(),t);
            }
            if(c instanceof JTabbedPane){
                tratarCampos(((JTabbedPane) c).getComponents(),t);
            }
            if(c instanceof JEditorPane){
                tratarCampos(((JEditorPane) c).getComponents(),t);
            }
            if(c instanceof JScrollPane){
                tratarCampos(((JScrollPane) c).getComponents(),t);
            }
            if(c instanceof JScrollBar){
                tratarCampos(((JScrollBar) c).getComponents(),t);
            }
        }
    }
    
    public static void limparTabela(JTable tabela)  {
        DefaultTableModel mp = (DefaultTableModel)tabela.getModel();
        mp.setNumRows(0);
    }
    
    
    
}
