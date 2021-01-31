/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.GestaoFinanceira.data;

import br.pro.GestaoFinanceira.model.UsuarioModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author heito
 */
public class UsuarioData extends Conexao{
     public UsuarioData() throws Exception{
        
    }
    public boolean incluir(UsuarioModel obj) throws Exception{
        String sql="insert into USUARIO (LOGIN,SENHA) values(?,?)";
        PreparedStatement pst = getConexao().prepareStatement(sql);
        pst.setString(1, obj.getLogin());
        pst.setString(2, obj.getSenha());
        ResultSet rs = pst.executeQuery();
        return pst.executeUpdate()>0;
    }
    public UsuarioModel verificarLogin(UsuarioModel obj) throws Exception {
             
        String sql = "SELECT * FROM USUARIO WHERE LOGIN=? AND SENHA=?";
        PreparedStatement pst = getConexao().prepareStatement(sql);
        
        pst.setString(1, obj.getLogin());
        pst.setString(2, obj.getSenha());
        ResultSet rs = pst.executeQuery();
        UsuarioModel usuario = null;
        if(rs.next()){
             usuario = new UsuarioModel(rs.getInt("COD_USUARIO"),rs.getString("LOGIN"), "");
        }
        return obj;
    }
        
    
}
