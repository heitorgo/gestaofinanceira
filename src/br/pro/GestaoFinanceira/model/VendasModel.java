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
public class VendasModel {

    public boolean isVerifvenda() {
        return verifvenda;
    }

    public void setVerifvenda(boolean verifvenda) {
        this.verifvenda = verifvenda;
    }

    public EmpresaModel getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModel empresa) {
        this.empresa = empresa;
    }

    public int getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }

    public float getValorvenda() {
        return valorvenda;
    }

    public void setValorvenda(float valorvenda) {
        this.valorvenda = valorvenda;
    }

    public String getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(String datavenda) {
        this.datavenda = datavenda;
    }

    public String getDetalhamentovenda() {
        return detalhamentovenda;
    }

    public void setDetalhamentovenda(String detalhamentovenda) {
        this.detalhamentovenda = detalhamentovenda;
    }
    
    private int idvenda;
    private float valorvenda;
    private String datavenda;
    private String detalhamentovenda;
    private boolean verifvenda;
    private EmpresaModel empresa;

    public VendasModel(int idvenda, float valorvenda, String datavenda, String detalhamentovenda, boolean verifvenda, EmpresaModel empresa) {
        this.idvenda = idvenda;
        this.valorvenda = valorvenda;
        this.datavenda = datavenda;
        this.detalhamentovenda = detalhamentovenda;
        this.verifvenda = verifvenda;
        this.empresa = empresa;
    }

    public VendasModel() {
        idvenda=0;
        valorvenda=0;
        datavenda = new String();
        detalhamentovenda = new String();
        verifvenda=false;
        empresa = new EmpresaModel();    
    }
    
    public void AtualizarStatus(boolean verifvenda){
        this.verifvenda=true;
    }
}
