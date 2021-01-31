/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.GestaoFinanceira.model;

/**
 *
 * @author heito
 */
public class PrestacaoServicoModel {

    public int getIdservico() {
        return idservico;
    }

    public void setIdservico(int idservico) {
        this.idservico = idservico;
    }

    public float getValorservico() {
        return valorservico;
    }

    public void setValorservico(float valorservico) {
        this.valorservico = valorservico;
    }

    public String getDataservico() {
        return dataservico;
    }

    public void setDataservico(String dataservico) {
        this.dataservico = dataservico;
    }

    public String getDetalhamentoservico() {
        return detalhamentoservico;
    }

    public void setDetalhamentoservico(String detalhamentoservico) {
        this.detalhamentoservico = detalhamentoservico;
    }

    public boolean isVerifservico() {
        return verifservico;
    }

    public void setVerifservico(boolean verifservico) {
        this.verifservico = verifservico;
    }

    public EmpresaModel getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModel empresa) {
        this.empresa = empresa;
    }
    
    private int idservico;
    private float valorservico;
    private String dataservico;
    private String detalhamentoservico;
    private boolean verifservico;
    private EmpresaModel empresa;

    public PrestacaoServicoModel(int idservico, float valorservico, String dataservico, String detalhamentoservico, boolean verifservico, EmpresaModel empresa) {
        this.idservico = idservico;
        this.valorservico = valorservico;
        this.dataservico = dataservico;
        this.detalhamentoservico = detalhamentoservico;
        this.verifservico = verifservico;
        this.empresa = empresa;
    }

    public PrestacaoServicoModel() {
        idservico=0;
        valorservico=0;
        dataservico = new String();
        verifservico = false;
        empresa = new EmpresaModel();
    }
    
    public void AtualizarStatus(boolean verifservico){
        this.verifservico=true;
    }
}
