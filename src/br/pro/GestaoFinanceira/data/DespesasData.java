/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.GestaoFinanceira.data;

import br.pro.GestaoFinanceira.model.CustosModel;
import br.pro.GestaoFinanceira.model.DespesasModel;
import br.pro.GestaoFinanceira.model.EmpresaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author heito
 */
public class DespesasData extends Conexao{
    public DespesasData() throws Exception{}
    
    public boolean incluir(DespesasModel obj) throws Exception {
        String sql="insert into DESPESAS (VALORDESPESA, DATADESPESA, DETALHAMENTODESPESA, VERIFDESPESA, IDEMPRESA) values(?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setFloat(1,obj.getValordespesa());
        ps.setString(2,obj.getDatadespesa());
        ps.setString(3,obj.getDetalhamentodespesa());
        ps.setBoolean(4,obj.isVerifdespesa());
        ps.setInt(5, obj.getEmpresa().getIdempresa());
        return ps.executeUpdate()>0;
    }
    
    public boolean editar(DespesasModel obj) throws Exception {
        String sql="Update DESPESAS set VALORDESPESA=?, DATADESPESA=?, DETALHAMENTODESPESA=? where IDDESPESA=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setFloat(1,obj.getValordespesa());
        ps.setString(2,obj.getDatadespesa());
        ps.setString(3,obj.getDetalhamentodespesa());
        ps.setInt(4,obj.getIddespesa());
        return ps.executeUpdate()>0;
    }
    
    public boolean excluir(int iddespesa) throws Exception {
        String sql="delete from DESPESAS where IDDESPESA=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, iddespesa);
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<DespesasModel> pesquisar(String texto) throws Exception{
        ArrayList<DespesasModel> dados = new ArrayList<>();
        String sql="Select * from DESPESAS where DATADESPESA like '"+texto+"%'";
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            DespesasModel obj = new DespesasModel(rs.getInt("IDDESPESA"),
                rs.getFloat("VALORDESPESA"),
                rs.getString("DATADESPESA"),
                rs.getString("DETALHAMENTODESPESA"),
                rs.getBoolean("VERIFDESPESA"),
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
    
    public boolean verificarrecebimento(DespesasModel obj) throws Exception {
        String sql="Update DESPESAS set VERIFDESPESA=true where IDDESPESA=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,obj.getIddespesa());
        return ps.executeUpdate()>0;
    }
    
    public boolean atualizarregistros(DespesasModel obj) throws Exception {
        String sql="Delete from DESPESAS where VERIFDESPESA=true";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        return ps.executeUpdate()>0;
    }
}
