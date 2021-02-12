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
        String sql="insert into EMPRESA (NOMEEMPRESA, EMAILEMPRESA, CONTATOEMPRESA, CIDADEEMPRESA, RUAEMPRESA, NUMEMPRESA) values(?,?,?,?,?,?)";
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
        String sql="Update EMPRESA set NOMEEMPRESA=?, EMAILEMPRESA=?, CONTATOEMPRESA=?, CIDADEEMPRESA=?, RUAEMPRESA=?, NUMEMPRESA=? where IDEMPRESA=?";
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
        String sql="delete from EMPRESA where IDEMPRESA=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, idempresa);
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<EmpresaModel> pesquisar(String texto) throws Exception{
        ArrayList<EmpresaModel> dados = new ArrayList<>();
        String sql="Select * from EMPRESA where NOMEEMPRESA like '"+texto+"%'";
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            EmpresaModel obj = new EmpresaModel(rs.getInt("IDEMPRESA"),
                rs.getString("NOMEEMPRESA"),
                rs.getString("EMAILEMPRESA"),
                rs.getString("CONTATOEMPRESA"),
                rs.getString("CIDADEEMPRESA"),
                rs.getString("RUAEMPRESA"),
                rs.getString("NUMEMPRESA")
            );
            dados.add(obj);
        }   
        return dados;
    }
    
    public ArrayList<EmpresaModel> carregarCombo() throws Exception{
        ArrayList<EmpresaModel> dados = new ArrayList<>();
        String sql="Select * from EMPRESA order by IDEMPRESA";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            EmpresaModel obj = new EmpresaModel(rs.getInt("IDEMPRESA"),
                rs.getString("NOMEEMPRESA"),
                rs.getString("EMAILEMPRESA"),
                rs.getString("CONTATOEMPRESA"),
                rs.getString("CIDADEEMPRESA"),
                rs.getString("RUAEMPRESA"),
                rs.getString("NUMEMPRESA")
            );
            dados.add(obj);
        }   
        return dados;
    }
}
