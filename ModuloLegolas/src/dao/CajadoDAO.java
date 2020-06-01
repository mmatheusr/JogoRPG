package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.Cajado;

public class CajadoDAO {
    
    private Connection bd;
    
    public CajadoDAO() {
        Conexao conexao = new Conexao();
        bd = conexao.conectar();
    }
    
    public void inserir(Cajado cajado){
        
        try{	
            PreparedStatement stmt = bd.prepareStatement("insert into ARMAS (nome, arma, dano, defesa, durabilidade, agilidade, comprimento, elemento) values (?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, cajado.getNome());
            stmt.setString(2, cajado.getArma());
            stmt.setInt(3, cajado.getDano());
            stmt.setInt(4, cajado.getDefesa());
            stmt.setInt(5, cajado.getDurabilidade());
            stmt.setInt(6, cajado.getAgilidade());
            stmt.setInt(7, cajado.getComprimento());
            stmt.setString(8, cajado.getElemento());

            stmt.execute();
            stmt.close();
            bd.close();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void excluir(Cajado cajado){
        
        try{	
            PreparedStatement stmt = bd.prepareStatement("delete from ARMAS where id = ?");
            stmt.setInt(1, cajado.getId());

            stmt.execute();
            stmt.close();
            bd.close();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}