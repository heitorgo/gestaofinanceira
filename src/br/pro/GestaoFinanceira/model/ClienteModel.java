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
public class ClienteModel {

    public EmpresaModel getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaModel empresa) {
        this.empresa = empresa;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public String getDatanasccliente() {
        return datanasccliente;
    }

    public void setDatanasccliente(String datanasccliente) {
        this.datanasccliente = datanasccliente;
    }

    public String getCpfcliente() {
        return cpfcliente;
    }

    public void setCpfcliente(String cpfcliente) {
        this.cpfcliente = cpfcliente;
    }

    public String getEmailcliente() {
        return emailcliente;
    }

    public void setEmailcliente(String emailcliente) {
        this.emailcliente = emailcliente;
    }

    public String getCidadecliente() {
        return cidadecliente;
    }

    public void setCidadecliente(String cidadecliente) {
        this.cidadecliente = cidadecliente;
    }

    public String getRuacliente() {
        return ruacliente;
    }

    public void setRuacliente(String ruacliente) {
        this.ruacliente = ruacliente;
    }

    public String getNumcasacliente() {
        return numcasacliente;
    }

    public void setNumcasacliente(String numcasacliente) {
        this.numcasacliente = numcasacliente;
    }

    public String getComplcliente() {
        return complcliente;
    }

    public void setComplcliente(String complcliente) {
        this.complcliente = complcliente;
    }

    public String getContatocliente() {
        return contatocliente;
    }

    public void setContatocliente(String contatocliente) {
        this.contatocliente = contatocliente;
    }
    private int idcliente;
    private String nomecliente;
    private String datanasccliente;
    private String cpfcliente;
    private String emailcliente;
    private String cidadecliente;
    private String ruacliente;
    private String numcasacliente;
    private String complcliente;
    private String contatocliente;
    private EmpresaModel empresa;

    public ClienteModel(int idcliente, String nomecliente, String datanasccliente, String cpfcliente, String emailcliente, String cidadecliente, String ruacliente, String numcasacliente, String complcliente, String contatocliente, EmpresaModel empresa) {
        this.idcliente = idcliente;
        this.nomecliente = nomecliente;
        this.datanasccliente = datanasccliente;
        this.cpfcliente = cpfcliente;
        this.emailcliente = emailcliente;
        this.cidadecliente = cidadecliente;
        this.ruacliente = ruacliente;
        this.numcasacliente = numcasacliente;
        this.complcliente = complcliente;
        this.contatocliente = contatocliente;
        this.empresa = empresa;
    }

    

    public ClienteModel() {
        idcliente=0;
        nomecliente=new String();
        datanasccliente=new String();
        cpfcliente=new String();
        emailcliente=new String();
        cidadecliente =new String();
        ruacliente=new String();
        numcasacliente=new String();
        complcliente=new String();
        contatocliente=new String();
        empresa = new EmpresaModel();
    }
    
    
}
