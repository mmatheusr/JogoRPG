package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
   
    private final String BD_URL = "jdbc:derby://localhost:1527/Modulo_legolas";
    private final String BD_USUARIO = "zoid";
    private final String BD_SENHA = "zoid";
    private Connection conexao;
    
    public Conexao(){
        conexao = null;
    }
    
    public Connection conectar(){
        try{
            conexao = DriverManager.getConnection(BD_URL, BD_USUARIO, BD_SENHA);
        } catch(SQLException sqle) {
            System.out.println(sqle);
        }
        return conexao;
    }
}