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
        String sql="Insert into CLIENTE (NOMECLIENTE, DTANASCCLIENTE, CPFCLIENTE, EMAILCLIENTE, CIDADECLIENTE, RUACLIENTE, NUMCASACLIENTE, COMPLCLIENTE, CONTATOCLIENTE, IDEMPRESA) values(?,?,?,?,?,?,?,?,?,?)";
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
        String sql="Update CLIENTE set NOMECLIENTE=?, DTANASCCLIENTE=?, CPFCLIENTE=?, EMAILCLIENTE=?, CIDADECLIENTE=?, RUACLIENTE=?, NUMCASACLIENTE=?, COMPLCLIENTE=?, CONTATOCLIENTE=? where IDCLIENTE=?";
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
        String sql="delete from CLIENTE where IDCLIENTE=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, idcliente);
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<ClienteModel> pesquisar(String texto) throws Exception{
        ArrayList<ClienteModel> dados = new ArrayList<>();
        String[] palavras = texto.split(" ");
        String sql="Select * from CLIENTE where CPFCLIENTE like '%"+texto+"%'";
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            ClienteModel obj = new ClienteModel(rs.getInt("IDCLIENTE"),
                rs.getString("NOMECLIENTE"),
                rs.getString("DTANASCCLIENTE"),
                rs.getString("CPFCLIENTE"),
                rs.getString("EMAILCLIENTE"),
                rs.getString("CIDADECLIENTE"),
                rs.getString("RUACLIENTE"),
                rs.getString("NUMCASACLIENTE"),
                rs.getString("COMPLCLIENTE"),
                rs.getString("CONTATOCLIENTE"),
                new EmpresaModel(rs.getInt("IDEMPRESA"),
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
