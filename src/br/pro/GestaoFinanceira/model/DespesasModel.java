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
public class DespesasModel {

    public boolean isVerifdespesa() {
        return verifdespesa;
    }

    public void setVerifdespesa(boolean verifdespesa) {
        this.verifdespesa = verifdespesa;
    }

    public int getIddespesa() {
        return iddespesa;
    }

    public void setIddespesa(int iddespesa) {
        this.iddespesa = iddespesa;
    }

    public float getValordespesa() {
        return valordespesa;
    }

    public void setValordespesa(float valordespesa) {
        this.valordespesa = valordespesa;
    }

    public String getDatadespesa() {
        return datadespesa;
    }

    public void setDatadespesa(String datadespesa) {
        this.datadespesa = datadespesa;
    }

    public String getDetalhamentodespesa() {
        return detalhamentodespesa;
    }

    public void setDetalhamentodespesa(String detalhamentodespesa) {
        this.detalhamentodespesa = detalhamentodespesa;
    }

    public EmpresaModel getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModel empresa) {
        this.empresa = empresa;
    }
    private int iddespesa;
    private float valordespesa;
    private String datadespesa;
    private String detalhamentodespesa;
    private boolean verifdespesa;
    private EmpresaModel empresa;

    public DespesasModel(int iddespesa, float valordespesa, String datadespesa, String detalhamentodespesa, boolean verifdespesa, EmpresaModel empresa) {
        this.iddespesa = iddespesa;
        this.valordespesa = valordespesa;
        this.datadespesa = datadespesa;
        this.detalhamentodespesa = detalhamentodespesa;
        this.verifdespesa = verifdespesa;
        this.empresa = empresa;
    }

    public DespesasModel() {
        iddespesa=0;
        valordespesa=0;
        datadespesa = new String();
        detalhamentodespesa = new String();
        verifdespesa=false;
        empresa = new EmpresaModel();
    }
    
    public void AtualizarStatus(boolean verifdespesa){
        this.verifdespesa=true;
    }
}
