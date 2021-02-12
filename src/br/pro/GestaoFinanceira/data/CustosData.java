/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.GestaoFinanceira.data;


import br.pro.GestaoFinanceira.model.CustosModel;
import br.pro.GestaoFinanceira.model.EmpresaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author heito
 */
public class CustosData extends Conexao{
    public CustosData() throws Exception{}
    
    public boolean incluir(CustosModel obj) throws Exception {
        String sql="insert into CUSTOS (VALORCUSTO, DATACUSTO, DETALHAMENTOCUSTO, VERIFCUSTO, IDEMPRESA) values(?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setFloat(1,obj.getValorcusto());
        ps.setString(2,obj.getDatacusto());
        ps.setString(3,obj.getDetalhamentocusto());
        ps.setBoolean(4, obj.isVerifcusto());
        ps.setInt(5, obj.getEmpresa().getIdempresa());
        return ps.executeUpdate()>0;
    }
     
    public boolean editar(CustosModel obj) throws Exception {
        String sql="Update CUSTOS set VALORCUSTO=?, DATACUSTO=?, DETALHAMENTOCUSTO=? where IDCUSTO=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setFloat(1,obj.getValorcusto());
        ps.setString(2,obj.getDatacusto());
        ps.setString(3,obj.getDetalhamentocusto());
        ps.setInt(4,obj.getIdcusto());
        return ps.executeUpdate()>0;
    }
    
    public boolean excluir(int idcusto) throws Exception {
        String sql="delete from CUSTOS where IDCUSTO=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, idcusto);
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<CustosModel> pesquisar(String texto) throws Exception{
        ArrayList<CustosModel> dados = new ArrayList<>();
        String sql="Select * from CUSTOS where DATACUSTO like '"+texto+"%'";
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            CustosModel obj = new CustosModel(rs.getInt("IDCUSTO"),
                rs.getFloat("VALORCUSTO"),
                rs.getString("DATACUSTO"),
                rs.getString("DETALHAMENTOCUSTO"),
                rs.getBoolean("VERIFCUSTO"),
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
    
    public boolean verificarrecebimento(CustosModel obj) throws Exception {
        String sql="Update CUSTOS set VERIFCUSTO=true where IDCUSTO=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,obj.getIdcusto());
        return ps.executeUpdate()>0;
    }
    
    public boolean atualizarregistros(CustosModel obj) throws Exception {
        String sql="Delete from CUSTOS where VERIFCUSTO=true";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        return ps.executeUpdate()>0;
    }
}
