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
public class DespesasFixasModel {

    public boolean isVerifdespesafixa() {
        return verifdespesafixa;
    }

    public void setVerifdespesafixa(boolean verifdespesafixa) {
        this.verifdespesafixa = verifdespesafixa;
    }

    public int getIddespesafixa() {
        return iddespesafixa;
    }

    public void setIddespesafixa(int iddespesafixa) {
        this.iddespesafixa = iddespesafixa;
    }

    public float getValordespesafixa() {
        return valordespesafixa;
    }

    public void setValordespesafixa(float valordespesafixa) {
        this.valordespesafixa = valordespesafixa;
    }

    public String getFrequenciadespesa() {
        return frequenciadespesa;
    }

    public void setFrequenciadespesa(String frequenciadespesa) {
        this.frequenciadespesa = frequenciadespesa;
    }

    public String getDetalhamentodespesafixa() {
        return detalhamentodespesafixa;
    }

    public void setDetalhamentodespesafixa(String detalhamentodespesafixa) {
        this.detalhamentodespesafixa = detalhamentodespesafixa;
    }

    public EmpresaModel getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModel empresa) {
        this.empresa = empresa;
    }
    
    private int iddespesafixa;
    private float valordespesafixa;
    private String frequenciadespesa;
    private String detalhamentodespesafixa;
    private boolean verifdespesafixa;
    private EmpresaModel empresa;

    public DespesasFixasModel(int iddespesafixa, float valordespesafixa, String frequenciadespesa, String detalhamentodespesafixa, boolean verifdespesafixa, EmpresaModel empresa) {
        this.iddespesafixa = iddespesafixa;
        this.valordespesafixa = valordespesafixa;
        this.frequenciadespesa = frequenciadespesa;
        this.detalhamentodespesafixa = detalhamentodespesafixa;
        this.verifdespesafixa = verifdespesafixa;
        this.empresa = empresa;
    }

    

    public DespesasFixasModel() {
        iddespesafixa=0;
        valordespesafixa=0;
        frequenciadespesa= new String();
        detalhamentodespesafixa = new String();
        verifdespesafixa=false;
        empresa = new EmpresaModel();
    }
    
    public void AtualizarStatus(boolean verifdespesafixa){
        this.verifdespesafixa=true;
    }
}
