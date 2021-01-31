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
public class ContasPagarModel {

    public boolean isVerifpagar() {
        return verifpagar;
    }

    public void setVerifpagar(boolean verifpagar) {
        this.verifpagar = verifpagar;
    }

    public EmpresaModel getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModel empresa) {
        this.empresa = empresa;
    }

    public int getIdpagar() {
        return idpagar;
    }

    public void setIdpagar(int idpagar) {
        this.idpagar = idpagar;
    }

    public float getValorpagar() {
        return valorpagar;
    }

    public void setValorpagar(float valorpagar) {
        this.valorpagar = valorpagar;
    }

    public String getDatapagar() {
        return datapagar;
    }

    public void setDatapagar(String datapagar) {
        this.datapagar = datapagar;
    }

    public String getDetalhamentopagar() {
        return detalhamentopagar;
    }

    public void setDetalhamentopagar(String detalhamentopagar) {
        this.detalhamentopagar = detalhamentopagar;
    }
    
    private int idpagar;
    private float valorpagar;
    private String datapagar;
    private String detalhamentopagar;
    private boolean verifpagar;
    private EmpresaModel empresa;

    public ContasPagarModel(int idpagar, float valorpagar, String datapagar, String detalhamentopagar, boolean verifcontapagar, EmpresaModel empresa) {
        this.idpagar = idpagar;
        this.valorpagar = valorpagar;
        this.datapagar = datapagar;
        this.detalhamentopagar = detalhamentopagar;
        this.verifpagar = verifcontapagar;
        this.empresa = empresa;
    }

    public ContasPagarModel() {
        idpagar=0;
        valorpagar=0;
        datapagar= new String();
        verifpagar= false;
        empresa = new EmpresaModel();
    }
    
    public void AtualizarStatus(boolean verifpagar){
        this.verifpagar=true;
    }
    
}
