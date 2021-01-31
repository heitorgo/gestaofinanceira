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
public class EmpresaModel {

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public String getNomeempresa() {
        return nomeempresa;
    }

    public void setNomeempresa(String nomeempresa) {
        this.nomeempresa = nomeempresa;
    }

    public String getEmailempresa() {
        return emailempresa;
    }

    public void setEmailempresa(String emailempresa) {
        this.emailempresa = emailempresa;
    }

    public String getContatoempresa() {
        return contatoempresa;
    }

    public void setContatoempresa(String contatoempresa) {
        this.contatoempresa = contatoempresa;
    }

    public String getCidadeempresa() {
        return cidadeempresa;
    }

    public void setCidadeempresa(String cidadeempresa) {
        this.cidadeempresa = cidadeempresa;
    }

    public String getRuaempresa() {
        return ruaempresa;
    }

    public void setRuaempresa(String ruaempresa) {
        this.ruaempresa = ruaempresa;
    }

    public String getNumempresa() {
        return numempresa;
    }

    public void setNumempresa(String numempresa) {
        this.numempresa = numempresa;
    }
    private int idempresa;
    private String nomeempresa;
    private String emailempresa;
    private String contatoempresa;
    private String cidadeempresa;
    private String ruaempresa;
    private String numempresa;

    public EmpresaModel(int idempresa, String nomeempresa, String emailempresa, String contatoempresa, String cidadeempresa, String ruaempresa, String numempresa) {
        this.idempresa = idempresa;
        this.nomeempresa = nomeempresa;
        this.emailempresa = emailempresa;
        this.contatoempresa = contatoempresa;
        this.cidadeempresa = cidadeempresa;
        this.ruaempresa = ruaempresa;
        this.numempresa = numempresa;
    }

    public EmpresaModel() {
        idempresa =0;
        nomeempresa = new String();
        emailempresa = new String();
        contatoempresa = new String();
        cidadeempresa = new String();
        ruaempresa = new String();
        numempresa = new String();
    }
    
}
