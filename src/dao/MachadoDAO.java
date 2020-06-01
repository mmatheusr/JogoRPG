package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.Machado;

public class MachadoDAO {
    
    private Connection bd;
    
    public MachadoDAO() {
        Conexao conexao = new Conexao();
        bd = conexao.conectar();
    }
    
    public void inserir(Machado machado){
        
        try{	
            PreparedStatement stmt = bd.prepareStatement("insert into ARMAS (nome, arma, dano, defesa, durabilidade, agilidade, peso) values (?,?,?,?,?,?,?)");
            
            stmt.setString(1, machado.getNome());
            stmt.setString(2, machado.getArma());
            stmt.setInt(3, machado.getDano());
            stmt.setInt(4, machado.getDefesa());
            stmt.setInt(5, machado.getDurabilidade());
            stmt.setInt(6, machado.getAgilidade());
            stmt.setInt(7, machado.getPeso());

            stmt.execute();
            stmt.close();
            bd.close();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void excluir(Machado machado){
        
        try{	
            PreparedStatement stmt = bd.prepareStatement("delete from ARMAS where id = ?");
            stmt.setInt(1, machado.getId());

            stmt.execute();
            stmt.close();
            bd.close();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}