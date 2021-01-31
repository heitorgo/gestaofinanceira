/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.GestaoFinanceira.data;
import br.pro.GestaoFinanceira.model.EmpresaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author heito
 */
public class EmpresaData extends Conexao{
    public EmpresaData() throws Exception{};
    
    public boolean incluir(EmpresaModel obj) throws Exception {
        String sql="insert into EMPRESA (NOME_EMPRESA, EMAIL_EMPRESA, CONTATO_EMPRESA, CIDADE_EMPRESA, RUA_EMPRESA, NUM_EMPRESA) values(?,?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getNomeempresa());
        ps.setString(2,obj.getEmailempresa());
        ps.setString(3,obj.getContatoempresa());
        ps.setString(4,obj.getCidadeempresa());
        ps.setString(5,obj.getRuaempresa());
        ps.setString(6, obj.getNumempresa());
        return ps.executeUpdate()>0;
    }
    
    public boolean editar(EmpresaModel obj) throws Exception {
        String sql="Update EMPRESA set NOME_EMPRESA=?, EMAIL_EMPRESA=?, CONTATO_EMPRESA=?, CIDADE_EMPRESA=?, RUA_EMPRESA=?, NUM_EMPRESA=? where ID_EMPRESA=?";
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,obj.getNomeempresa());
        ps.setString(2,obj.getEmailempresa());
        ps.setString(3,obj.getContatoempresa());
        ps.setString(4,obj.getCidadeempresa());
        ps.setString(5,obj.getRuaempresa());
        ps.setString(6, obj.getNumempresa());
        ps.setInt(7,obj.getIdempresa());
        return ps.executeUpdate()>0;
    }
    
    public boolean excluir(int idempresa) throws Exception {
        String sql="delete from EMPRESA where ID_EMPRESA=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, idempresa);
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<EmpresaModel> pesquisar(String texto) throws Exception{
        ArrayList<EmpresaModel> dados = new ArrayList<>();
        String sql="Select * from EMPRESA where NOME_EMPRESA like '"+texto+"%'";
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            EmpresaModel obj = new EmpresaModel(rs.getInt("ID_EMPRESA"),
                rs.getString("NOME_EMPRESA"),
                rs.getString("EMAIL_EMPRESA"),
                rs.getString("CONTATO_EMPRESA"),
                rs.getString("CIDADE_EMPRESA"),
                rs.getString("RUA_EMPRESA"),
                rs.getString("NUM_EMPRESA")
            );
            dados.add(obj);
        }   
        return dados;
    }
    
    public ArrayList<EmpresaModel> carregarCombo() throws Exception{
        ArrayList<EmpresaModel> dados = new ArrayList<>();
        String sql="Select * from EMPRESA order by ID_EMPRESA";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            EmpresaModel obj = new EmpresaModel(rs.getInt("ID_EMPRESA"),
                rs.getString("NOME_EMPRESA"),
                rs.getString("EMAIL_EMPRESA"),
                rs.getString("CONTATO_EMPRESA"),
                rs.getString("CIDADE_EMPRESA"),
                rs.getString("RUA_EMPRESA"),
                rs.getString("NUM_EMPRESA")
            );
            dados.add(obj);
        }   
        return dados;
    }
}
