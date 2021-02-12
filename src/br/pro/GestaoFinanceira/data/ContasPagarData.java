/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.GestaoFinanceira.data;

import br.pro.GestaoFinanceira.model.ContasPagarModel;
import br.pro.GestaoFinanceira.model.EmpresaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author heito
 */
public class ContasPagarData extends Conexao{
    
    public ContasPagarData() throws Exception{}
    
    public boolean incluir(ContasPagarModel obj) throws Exception {
        String sql="insert into CONTASPAGAR (VALORPAGAR, DATAPAGAR, DETALHAMENTOPAGAR, VERIFPAGAR, IDEMPRESA) values(?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setFloat(1,obj.getValorpagar());
        ps.setString(2,obj.getDatapagar());
        ps.setString(3,obj.getDetalhamentopagar());
        ps.setBoolean(4, obj.isVerifpagar());
        ps.setInt(5, obj.getEmpresa().getIdempresa());
        return ps.executeUpdate()>0;
    }
    
    public boolean editar(ContasPagarModel obj) throws Exception {
        String sql="Update CONTASPAGAR set VALORPAGAR=?, DATAPAGAR=?, DETALHAMENTOPAGAR=? where IDPAGAR=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setFloat(1,obj.getValorpagar());
        ps.setString(2,obj.getDatapagar());
        ps.setString(3,obj.getDetalhamentopagar());
        ps.setInt(4,obj.getIdpagar());
        return ps.executeUpdate()>0;
    }
    
    public boolean excluir(int idpagar) throws Exception {
        String sql="delete from CONTASPAGAR where IDPAGAR=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, idpagar);
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<ContasPagarModel> pesquisar(String texto) throws Exception{
        ArrayList<ContasPagarModel> dados = new ArrayList<>();
        String sql="Select * from CONTASPAGAR where DATAPAGAR like '"+texto+"%'";
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            ContasPagarModel obj = new ContasPagarModel(rs.getInt("IDPAGAR"),
                rs.getFloat("VALORPAGAR"),
                rs.getString("DATAPAGAR"),
                rs.getString("DETALHAMENTOPAGAR"),
                rs.getBoolean("VERIFPAGAR"),
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
    
    public boolean verificarpagamento(ContasPagarModel obj) throws Exception {
        String sql="Update CONTASPAGAR set VERIFPAGAR=true where IDPAGAR=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,obj.getIdpagar());
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<ContasPagarModel> pesquisarprojecao(String texto) throws Exception{
        ArrayList<ContasPagarModel> dados = new ArrayList<>();
        String sql="Select * from CONTASPAGAR where DATAPAGAR like '"+texto+"%'";
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            ContasPagarModel obj = new ContasPagarModel(rs.getInt("IDPAGAR"),
                rs.getFloat("VALORPAGAR"),
                rs.getString("DATAPAGAR"),
                rs.getString("DETALHAMENTOPAGAR"),
                rs.getBoolean("VERIFPAGAR"),
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
    public boolean atualizarregistros(ContasPagarModel obj) throws Exception {
        String sql="Delete from CONTASPAGAR where VERIFPAGAR=true";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        return ps.executeUpdate()>0;
    }
}
