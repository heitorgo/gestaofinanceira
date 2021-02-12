/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.GestaoFinanceira.data;

import br.pro.GestaoFinanceira.model.CustosFixosModel;
import br.pro.GestaoFinanceira.model.EmpresaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author heito
 */
public class CustosFixosData extends Conexao{
    public CustosFixosData() throws Exception{}
    
    public boolean incluir(CustosFixosModel obj) throws Exception {
        String sql="insert into CUSTOSFIXOS (VALORCUSTOFIXO, FREQUENCIACUSTO, DETALHAMENTOCUSTOFIXO, VERIFCUSTOFIXO, IDEMPRESA) values(?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setFloat(1,obj.getValorcustofixo());
        ps.setString(2,obj.getFrequenciacusto());
        ps.setString(3,obj.getDetalhamentocustofixo());
        ps.setBoolean(4,obj.isVerifcustofixo());
        ps.setInt(5, obj.getEmpresa().getIdempresa());
        return ps.executeUpdate()>0;
    }
    
    public boolean editar(CustosFixosModel obj) throws Exception {
        String sql="Update CUSTOSFIXOS set VALORCUSTOFIXO=?, FREQUENCIACUSTO=?, DETALHAMENTOCUSTOFIXO=? where IDCUSTOFIXO=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setFloat(1,obj.getValorcustofixo());
        ps.setString(2,obj.getFrequenciacusto());
        ps.setString(3,obj.getDetalhamentocustofixo());
        ps.setInt(4,obj.getIdcustofixo());
        return ps.executeUpdate()>0;
    }
    
    public boolean excluir(int idcustofixo) throws Exception {
        String sql="delete from CUSTOSFIXOS where IDCUSTOFIXO=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, idcustofixo);
        return ps.executeUpdate()>0;
    }
    
    public ArrayList<CustosFixosModel> pesquisar(String texto) throws Exception{
        ArrayList<CustosFixosModel> dados = new ArrayList<>();
        String sql="Select * from CUSTOSFIXOS where FREQUENCIACUSTO like '"+texto+"%'";
        System.out.println(sql);
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            CustosFixosModel obj = new CustosFixosModel(rs.getInt("IDCUSTOFIXO"),
                rs.getFloat("VALORCUSTOFIXO"),
                rs.getString("FREQUENCIACUSTO"),
                rs.getString("DETALHAMENTOCUSTOFIXO"),
                rs.getBoolean("VERIFCUSTOFIXO"),
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
    public boolean verificarrecebimento(CustosFixosModel obj) throws Exception {
        String sql="Update CUSTOSFIXOS set VERIFCUSTOFIXO=true where IDCUSTOFIXO=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1,obj.getIdcustofixo());
        return ps.executeUpdate()>0;
    }
    
    public boolean atualizarregistros(CustosFixosModel obj) throws Exception {
        String sql="Delete from CUSTOSFIXOS where VERIFCUSTOFIXO=true";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        return ps.executeUpdate()>0;
    }
}
