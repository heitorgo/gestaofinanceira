/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.GestaoFinanceira.data;

import br.pro.GestaoFinanceira.model.EmpresaModel;
import br.pro.GestaoFinanceira.model.VendasModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author heito
 */
public class VendasData extends Conexao{
    public VendasData() throws Exception{}
    
    public boolean incluir(VendasModel obj) throws Exception {
        String sql="insert into VENDAS (VALORVENDA, DATAVENDA, DETALHAMENTOVENDA, VERIFVENDA, ID_EMPRESA) values(?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setFloat(1,obj.getValorvenda());
        ps.setString(2,obj.getDatavenda());
        ps.setString(3,obj.getDetalhamentovenda());
        ps.setBoolean(4,obj.isVerifvenda());
        ps.setInt(5, obj.getEmpresa().getIdempresa());
        return ps.executeUpdate()>0;
    }
    
    public boolean editar(VendasModel obj) throws Exception {
        String sql="Update VENDAS set VALORVENDA=?, DATAVENDA=?, DETALHAMENTOVENDA=? where IDVENDA=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setFloat(1,obj.getValorvenda());
        ps.setString(2,obj.getDatavenda());
        ps.setString(3,obj.getDetalhamentovenda());
        ps.setInt(4,obj.getIdvenda());
        return ps.executeUpdate()>0;
    }
    
    public boolean excluir(int idvenda) throws Exception {
        String sql="delete from VENDA where IDVENDA=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, idvenda);
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<VendasModel> pesquisar(String texto) throws Exception{
        ArrayList<VendasModel> dados = new ArrayList<>();
        String sql="Select * from VENDAS where DATAVENDA like '"+texto+"%'";
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            VendasModel obj = new VendasModel(rs.getInt("IDVENDA"),
                rs.getFloat("VALORVENDA"),
                rs.getString("DATAVENDA"),
                rs.getString("DETALHAMENTOVENDA"),
                rs.getBoolean("VERIFVENDA"),
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
    public boolean verificarrecebimento(VendasModel obj) throws Exception {
        String sql="Update VENDAS set VERIFVENDA=true where IDVENDA=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,obj.getIdvenda());
        return ps.executeUpdate()>0;
    }
    
    public boolean atualizarregistros(VendasModel obj) throws Exception {
        String sql="Delete from VENDAS where VERIFVENDA=true";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        return ps.executeUpdate()>0;
    }
}
