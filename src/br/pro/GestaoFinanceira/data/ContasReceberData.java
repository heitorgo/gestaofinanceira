/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.GestaoFinanceira.data;

import br.pro.GestaoFinanceira.model.ContasReceberModel;
import br.pro.GestaoFinanceira.model.EmpresaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author heito
 */
public class ContasReceberData extends Conexao{
    
    public ContasReceberData() throws Exception{}
    
    public boolean incluir(ContasReceberModel obj) throws Exception{
        String sql="insert into CONTASRECEBER (VALORRECEBER, DATARECEBER, DETALHAMENTORECEBER, VERIFRECEBER, ID_EMPRESA) values(?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setFloat(1,obj.getValorreceber());
        ps.setString(2,obj.getDatareceber());
        ps.setString(3,obj.getDetalhamentoreceber());
        ps.setBoolean(4,obj.isVerifreceber());
        ps.setInt(5, obj.getEmpresa().getIdempresa());
        return ps.executeUpdate()>0;
    }
    
    public boolean editar(ContasReceberModel obj) throws Exception {
        String sql="Update CONTASRECEBER set VALORRECEBER=?, DATARECEBER=?, DETALHAMENTORECEBER=? where IDRECEBER=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setFloat(1,obj.getValorreceber());
        ps.setString(2,obj.getDatareceber());
        ps.setString(3,obj.getDetalhamentoreceber());
        ps.setInt(4,obj.getIdreceber());
        return ps.executeUpdate()>0;
    }
    
    public boolean excluir(int idreceber) throws Exception {
        String sql="delete from CONTASRECEBER where IDRECEBER=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, idreceber);
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<ContasReceberModel> pesquisar(String texto) throws Exception{
        ArrayList<ContasReceberModel> dados = new ArrayList<>();
        String sql="Select * from CONTASRECEBER where DATARECEBER like '"+texto+"%'";
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            ContasReceberModel obj = new ContasReceberModel(rs.getInt("IDRECEBER"),
                rs.getFloat("VALORRECEBER"),
                rs.getString("DATARECEBER"),
                rs.getString("DETALHAMENTORECEBER"),
                rs.getBoolean("VERIFRECEBER"),
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
    
    public boolean verificarrecebimento(ContasReceberModel obj) throws Exception {
        String sql="Update CONTASRECEBER set VERIFRECEBER=true where IDRECEBER=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,obj.getIdreceber());
        return ps.executeUpdate()>0;
    }
    
    public boolean atualizarregistros(ContasReceberModel obj) throws Exception {
        String sql="Delete from CONTASRECEBER where VERIFRECEBER=true";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        return ps.executeUpdate()>0;
    }
    
}
