
package br.pro.GestaoFinanceira.data;

import java.sql.*;


public class Conexao {
    
   private Connection con;
    public Connection getConexao(){
        return con;
    }
   
    public Conexao() throws Exception{
        String driver = "org.postgresql.Driver";
        String url="jdbc:postgresql://localhost:5432/GestaoFinanceira";
        Class.forName(driver);
        con = DriverManager.getConnection(url, "postgres", "pgadmin");
    }

    
}
