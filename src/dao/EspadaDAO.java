package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.Espada;

public class EspadaDAO {
    
    private Connection bd;
    
    public EspadaDAO() {
        Conexao conexao = new Conexao();
        bd = conexao.conectar();
    }
    
    public void inserir(Espada espada){
        
        try{	
            PreparedStatement stmt = bd.prepareStatement("insert into ARMAS (nome, arma, dano, defesa, durabilidade, agilidade, comprimento, espessura) values (?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, espada.getNome());
            stmt.setString(2, espada.getArma());
            stmt.setInt(3, espada.getDano());
            stmt.setInt(4, espada.getDefesa());
            stmt.setInt(5, espada.getDurabilidade());
            stmt.setInt(6, espada.getAgilidade());
            stmt.setInt(7, espada.getComprimento());
            stmt.setInt(8, espada.getEspessura());

            stmt.execute();
            stmt.close();
            bd.close();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void excluir(Espada espada){
        
        try{	
            PreparedStatement stmt = bd.prepareStatement("delete from ARMAS where id = ?");
            stmt.setInt(1, espada.getId());

            stmt.execute();
            stmt.close();
            bd.close();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}