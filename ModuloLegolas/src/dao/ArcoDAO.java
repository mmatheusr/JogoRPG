package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.Arco;

public class ArcoDAO {
    
    private Connection bd;
    
    public ArcoDAO() {
        Conexao conexao = new Conexao();
        bd = conexao.conectar();
    }
    
    public void inserir(Arco arco){
        
        try{	
            PreparedStatement stmt = bd.prepareStatement("insert into ARMAS (nome, arma, dano, defesa, durabilidade, agilidade, largura) values (?,?,?,?,?,?,?)");
            
            stmt.setString(1, arco.getNome());
            stmt.setString(2, arco.getArma());
            stmt.setInt(3, arco.getDano());
            stmt.setInt(4, arco.getDefesa());
            stmt.setInt(5, arco.getDurabilidade());
            stmt.setInt(6, arco.getAgilidade());
            stmt.setInt(7, arco.getLargura());

            stmt.execute();
            stmt.close();
            bd.close();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void excluir(Arco arco){
        
        try{	
            PreparedStatement stmt = bd.prepareStatement("delete from ARMAS where id = ?");
            stmt.setInt(1, arco.getId());

            stmt.execute();
            stmt.close();
            bd.close();
            
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}