/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.GestaoFinanceira.data;

import br.pro.GestaoFinanceira.data.Conexao;
import br.pro.GestaoFinanceira.model.ClienteModel;
import br.pro.GestaoFinanceira.model.EmpresaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author heito
 */
public class ClienteData extends Conexao{
    public ClienteData() throws Exception {}
    public boolean incluir(ClienteModel obj) throws Exception {
        String sql="Insert into CLIENTE (NOME_CLIENTE, DTA_NASC_CLIENTE, CPF_CLIENTE, EMAIL_CLIENTE, CIDADE_CLIENTE, RUA_CLIENTE, NUMCASA_CLIENTE, COMPL_CLIENTE, CONTATO_CLIENTE, ID_EMPRESA) values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getNomecliente());
        ps.setString(2, obj.getDatanasccliente());
        ps.setString(3,obj.getCpfcliente());
        ps.setString(4,obj.getEmailcliente());
        ps.setString(5,obj.getCidadecliente());
        ps.setString(6,obj.getRuacliente());
        ps.setString(7,obj.getNumcasacliente());
        ps.setString(8,obj.getComplcliente());
        ps.setString(9,obj.getContatocliente());
        ps.setInt(10, obj.getEmpresa().getIdempresa());
        return ps.executeUpdate()>0;
    }
    public boolean editar(ClienteModel obj) throws Exception {
        String sql="Update CLIENTE set NOME_CLIENTE=?, DTA_NASC_CLIENTE=?, CPF_CLIENTE=?, EMAIL_CLIENTE=?, CIDADE_CLIENTE=?, RUA_CLIENTE=?, NUMCASA_CLIENTE=?, COMPL_CLIENTE=?, CONTATO_CLIENTE=? where ID_CLIENTE=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getNomecliente());
        ps.setString(2, obj.getDatanasccliente());
        ps.setString(3,obj.getCpfcliente());
        ps.setString(4,obj.getEmailcliente());
        ps.setString(5,obj.getCidadecliente());
        ps.setString(6,obj.getRuacliente());
        ps.setString(7,obj.getNumcasacliente());
        ps.setString(8, obj.getComplcliente());
        ps.setString(9, obj.getContatocliente());
        ps.setInt(10,obj.getIdcliente());
        return ps.executeUpdate()>0;
    }
    public boolean excluir(int idcliente) throws Exception {
        String sql="delete from CLIENTE where ID_CLIENTE=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, idcliente);
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<ClienteModel> pesquisar(String texto) throws Exception{
        ArrayList<ClienteModel> dados = new ArrayList<>();
        String[] palavras = texto.split(" ");
        String sql="Select * from CLIENTE where CPF_CLIENTE like '%"+texto+"%'";
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            ClienteModel obj = new ClienteModel(rs.getInt("ID_CLIENTE"),
                rs.getString("NOME_CLIENTE"),
                rs.getString("DTA_NASC_CLIENTE"),
                rs.getString("CPF_CLIENTE"),
                rs.getString("EMAIL_CLIENTE"),
                rs.getString("CIDADE_CLIENTE"),
                rs.getString("RUA_CLIENTE"),
                rs.getString("NUMCASA_CLIENTE"),
                rs.getString("COMPL_CLIENTE"),
                rs.getString("CONTATO_CLIENTE"),
                new EmpresaModel(rs.getInt("ID_EMPRESA"),
                    "",
                    "",        
                    "",
                    "",
                    "",       
                    ""
                )    
            ); 
            dados.add(obj);
        }   
        return dados;
    }
    
}
