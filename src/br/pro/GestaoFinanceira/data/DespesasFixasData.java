/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.GestaoFinanceira.data;

import br.pro.GestaoFinanceira.model.CustosFixosModel;
import br.pro.GestaoFinanceira.model.DespesasFixasModel;
import br.pro.GestaoFinanceira.model.EmpresaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author heito
 */
public class DespesasFixasData extends Conexao{
    public DespesasFixasData() throws Exception{}
    
    public boolean incluir(DespesasFixasModel obj) throws Exception {
        String sql="insert into DESPESASFIXAS (VALORDESPESAFIXA, FREQUENCIADESPESA, DETALHAMENTODESPESAFIXA, VERIFDESPESAFIXA, ID_EMPRESA) values(?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setFloat(1,obj.getValordespesafixa());
        ps.setString(2,obj.getFrequenciadespesa());
        ps.setString(3,obj.getDetalhamentodespesafixa());
        ps.setBoolean(4,obj.isVerifdespesafixa());
        ps.setInt(5, obj.getEmpresa().getIdempresa());
        return ps.executeUpdate()>0;
    }
    
    public boolean editar(DespesasFixasModel obj) throws Exception {
        String sql="Update DESPESASFIXAS set VALORDESPESAFIXA=?, FREQUENCIADESPESA=?, DETALHAMENTODESPESAFIXA=? where IDDESPESAFIXA=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setFloat(1,obj.getValordespesafixa());
        ps.setString(2,obj.getFrequenciadespesa());
        ps.setString(3,obj.getDetalhamentodespesafixa());
        ps.setInt(4,obj.getIddespesafixa());
        return ps.executeUpdate()>0;
    }
    
    public boolean excluir(int iddespesafixa) throws Exception {
        String sql="delete from DESPESASFIXAS where IDDESPESAFIXA=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, iddespesafixa);
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<DespesasFixasModel> pesquisar(String texto) throws Exception{
        ArrayList<DespesasFixasModel> dados = new ArrayList<>();
        String sql="Select * from DESPESASFIXAS where FREQUENCIADESPESA like '"+texto+"%'";
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            DespesasFixasModel obj = new DespesasFixasModel(rs.getInt("IDDESPESAFIXA"),
                rs.getFloat("VALORDESPESAFIXA"),
                rs.getString("FREQUENCIADESPESA"),
                rs.getString("DETALHAMENTODESPESAFIXA"),
                rs.getBoolean("VERIFDESPESAFIXA"),
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
    public boolean verificarrecebimento(DespesasFixasModel obj) throws Exception {
        String sql="Update DESPESASFIXAS set VERIFDESPESAFIXA=true where IDDESPESAFIXA=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,obj.getIddespesafixa());
        return ps.executeUpdate()>0;
    }
    
    public boolean atualizarregistros(DespesasFixasModel obj) throws Exception {
        String sql="Delete from DESPESASFIXAS where VERIFDESPESAFIXA=true";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        return ps.executeUpdate()>0;
    }
}
