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
public class CustosModel {

    public boolean isVerifcusto() {
        return verifcusto;
    }

    public void setVerifcusto(boolean verifcusto) {
        this.verifcusto = verifcusto;
    }

    public int getIdcusto() {
        return idcusto;
    }

    public void setIdcusto(int idcusto) {
        this.idcusto = idcusto;
    }

    public float getValorcusto() {
        return valorcusto;
    }

    public void setValorcusto(float valorcusto) {
        this.valorcusto = valorcusto;
    }

    public String getDatacusto() {
        return datacusto;
    }

    public void setDatacusto(String datacusto) {
        this.datacusto = datacusto;
    }

    public String getDetalhamentocusto() {
        return detalhamentocusto;
    }

    public void setDetalhamentocusto(String detalhamentocusto) {
        this.detalhamentocusto = detalhamentocusto;
    }

    public EmpresaModel getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModel empresa) {
        this.empresa = empresa;
    }
    
    private int idcusto;
    private float valorcusto;
    private String datacusto;
    private String detalhamentocusto;
    private boolean verifcusto;
    private EmpresaModel empresa;

    public CustosModel(int idcusto, float valorcusto, String datacusto, String detalhamentocusto, boolean verifcusto, EmpresaModel empresa) {
        this.idcusto = idcusto;
        this.valorcusto = valorcusto;
        this.datacusto = datacusto;
        this.detalhamentocusto = detalhamentocusto;
        this.verifcusto = verifcusto;
        this.empresa = empresa;
    }

    public CustosModel() {
        idcusto=0;
        valorcusto=0;
        datacusto= new String();
        detalhamentocusto = new String();
        verifcusto = false;
        empresa = new EmpresaModel();
    }
    
    public void AtualizarStatus(boolean verifcusto){
        this.verifcusto=true;
    } 
}
