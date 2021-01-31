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
public class CustosFixosModel {

    public boolean isVerifcustofixo() {
        return verifcustofixo;
    }

    public void setVerifcustofixo(boolean verifcustofixo) {
        this.verifcustofixo = verifcustofixo;
    }

    public int getIdcustofixo() {
        return idcustofixo;
    }

    public void setIdcustofixo(int idcustofixo) {
        this.idcustofixo = idcustofixo;
    }

    public float getValorcustofixo() {
        return valorcustofixo;
    }

    public void setValorcustofixo(float valorcustofixo) {
        this.valorcustofixo = valorcustofixo;
    }

    public String getDetalhamentocustofixo() {
        return detalhamentocustofixo;
    }

    public void setDetalhamentocustofixo(String detalhamentocustofixo) {
        this.detalhamentocustofixo = detalhamentocustofixo;
    }

    public String getFrequenciacusto() {
        return frequenciacusto;
    }

    public void setFrequenciacusto(String frequenciacusto) {
        this.frequenciacusto = frequenciacusto;
    }

    public EmpresaModel getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModel empresa) {
        this.empresa = empresa;
    }
    
    private int idcustofixo;
    private float valorcustofixo;
    private String frequenciacusto;
    private String detalhamentocustofixo;
    private boolean verifcustofixo;
    private EmpresaModel empresa;

    public CustosFixosModel(int idcustofixo, float valorcustofixo, String frequenciacusto, String detalhamentocustofixo, boolean verifcustofixo, EmpresaModel empresa) {
        this.idcustofixo = idcustofixo;
        this.valorcustofixo = valorcustofixo;
        this.frequenciacusto = frequenciacusto;
        this.detalhamentocustofixo = detalhamentocustofixo;
        this.verifcustofixo = verifcustofixo;
        this.empresa = empresa;
    }

    public CustosFixosModel() {
        idcustofixo=0;
        valorcustofixo=0;
        detalhamentocustofixo = new String();
        frequenciacusto= new String();
        verifcustofixo= false;
        empresa = new EmpresaModel();
    }
    
    public void AtualizarStatus(boolean verifcustofixo){
        this.verifcustofixo=true;
    }
}
