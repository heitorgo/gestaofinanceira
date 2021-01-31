/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.GestaoFinanceira.data;

import br.pro.GestaoFinanceira.model.ContasPagarModel;
import br.pro.GestaoFinanceira.model.EmpresaModel;
import br.pro.GestaoFinanceira.model.PrestacaoServicoModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author heito
 */
public class PrestacaoServicoData extends Conexao{
    public PrestacaoServicoData() throws Exception{}
    
    public boolean incluir(PrestacaoServicoModel obj) throws Exception {
        String sql="insert into PRESTACAOSERVICO (VALORSERVICO, DATASERVICO, DETALHAMENTOSERVICO, VERIFSERVICO, ID_EMPRESA) values(?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setFloat(1,obj.getValorservico());
        ps.setString(2,obj.getDataservico());
        ps.setString(3,obj.getDetalhamentoservico());
        ps.setBoolean(4,obj.isVerifservico());
        ps.setInt(5, obj.getEmpresa().getIdempresa());
        return ps.executeUpdate()>0;
    }
    
    public boolean editar(PrestacaoServicoModel obj) throws Exception {
        String sql="Update PRESTACAOSERVICO set VALORSERVICO=?, DATASERVICO=?, DETALHAMENTOSERVICO=? where IDSERVICO=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setFloat(1,obj.getValorservico());
        ps.setString(2,obj.getDataservico());
        ps.setString(3,obj.getDetalhamentoservico());
        ps.setInt(4,obj.getIdservico());
        return ps.executeUpdate()>0;
    }
    
    public boolean excluir(int idservico) throws Exception {
        String sql="delete from PRESTACAOSERVICO where IDSERVICO=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, idservico);
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<PrestacaoServicoModel> pesquisar(String texto) throws Exception{
        ArrayList<PrestacaoServicoModel> dados = new ArrayList<>();
        String sql="Select * from PRESTACAOSERVICO where DATASERVICO like '"+texto+"%'";
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            PrestacaoServicoModel obj = new PrestacaoServicoModel(rs.getInt("IDSERVICO"),
                rs.getFloat("VALORSERVICO"),
                rs.getString("DATASERVICO"),
                rs.getString("DETALHAMENTOSERVICO"),
                rs.getBoolean("VERIFSERVICO"),
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
    
    public boolean verificarpagamento(PrestacaoServicoModel obj) throws Exception {
        String sql="Update PRESTACAOSERVICO set VERIFSERVICO=TRUE where IDSERVICO=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,obj.getIdservico());
        return ps.executeUpdate()>0;
    }
    public boolean verificarrecebimento(PrestacaoServicoModel obj) throws Exception {
        String sql="Update PRESTACAOSERVICO set VERIFSERVICO=true where IDSERVICO=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,obj.getIdservico());
        return ps.executeUpdate()>0;
    }
    
    public boolean atualizarregistros(PrestacaoServicoModel obj) throws Exception {
        String sql="Delete from PRESTACAOSERVICO where VERIFSERVICO=true";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        return ps.executeUpdate()>0;
    }

}
