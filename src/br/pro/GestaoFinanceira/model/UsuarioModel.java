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
public class UsuarioModel {

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    private int idusuario;
    private String login;
    private String senha;

    public UsuarioModel(int idusuario, String login, String senha) {
        this.idusuario = idusuario;
        this.login = login;
        this.senha = senha;
    }
    
    public UsuarioModel() {
        idusuario=0;
        login = new String();
        senha = new String();
    }
    
    
}
