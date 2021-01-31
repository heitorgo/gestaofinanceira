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
public class ContasReceberModel {

    public EmpresaModel getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModel empresa) {
        this.empresa = empresa;
    }

    public int getIdreceber() {
        return idreceber;
    }

    public void setIdreceber(int idreceber) {
        this.idreceber = idreceber;
    }

    public float getValorreceber() {
        return valorreceber;
    }

    public void setValorreceber(float valorreceber) {
        this.valorreceber = valorreceber;
    }

    public String getDatareceber() {
        return datareceber;
    }

    public void setDatareceber(String datareceber) {
        this.datareceber = datareceber;
    }

    public String getDetalhamentoreceber() {
        return detalhamentoreceber;
    }

    public void setDetalhamentoreceber(String detalhamentoreceber) {
        this.detalhamentoreceber = detalhamentoreceber;
    }

    public boolean isVerifreceber() {
        return verifreceber;
    }

    public void setVerifreceber(boolean verifreceber) {
        this.verifreceber = verifreceber;
    }

    
    private int idreceber;
    private float valorreceber;
    private String datareceber;
    private String detalhamentoreceber;
    private boolean verifreceber;
    private EmpresaModel empresa;

    public ContasReceberModel(int idreceber, float valorreceber, String datareceber, String detalhamentoreceber, boolean verifreceber, EmpresaModel empresa) {
        this.idreceber = idreceber;
        this.valorreceber = valorreceber;
        this.datareceber = datareceber;
        this.detalhamentoreceber = detalhamentoreceber;
        this.verifreceber = verifreceber;
        this.empresa = empresa;
    }

    public ContasReceberModel() {
        idreceber=0;
        valorreceber=0;
        datareceber = new String();
        detalhamentoreceber = new String();
        verifreceber = false;
        empresa = new EmpresaModel();
    }
    
    public void AtualizarStatus(boolean verifreceber){
        this.verifreceber=true;
    }
}
