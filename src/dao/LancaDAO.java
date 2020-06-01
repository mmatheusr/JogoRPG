package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.Lanca;

public class LancaDAO {
    
    private Connection bd;
    
    public LancaDAO() {
        Conexao conexao = new Conexao();
        bd = conexao.conectar();
    }
    
    public void inserir(Lanca lanca){
        
        try{	
            PreparedStatement stmt = bd.prepareStatement("insert into ARMAS (nome, arma, dano, defesa, durabilidade, agilidade, comprimento) values (?,?,?,?,?,?,?)");
            
            stmt.setString(1, lanca.getNome());
            stmt.setString(2, lanca.getArma());
            stmt.setInt(3, lanca.getDano());
            stmt.setInt(4, lanca.getDefesa());
            stmt.setInt(5, lanca.getDurabilidade());
            stmt.setInt(6, lanca.getAgilidade());
            stmt.setInt(7, lanca.getComprimento());

            stmt.execute();
            stmt.close();
            bd.close();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void excluir(Lanca lanca){
        
        try{	
            PreparedStatement stmt = bd.prepareStatement("delete from ARMAS where id = ?");
            stmt.setInt(1, lanca.getId());

            stmt.execute();
            stmt.close();
            bd.close();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}