package revisao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexao {
    // link de conexao com o banco
    private String URL_DB = "jdbc:derby://localhost:1527/REVISAO";
    /// Objeto de Conexao com o banco
    private Connection conexaoDB;
        // Comando SQL para ler o banco
    private String consulta = "SELECT * FROM REVISAO";

    public Conexao() {
        try{
            conexaoDB = DriverManager.getConnection(URL_DB, "userbd", "userbd");            
        }catch(SQLException e){
            System.out.println("Erro " + e);
        }
    }
    
    public void inserirBanco(Eleicao a){
       try{
           Statement comando = conexaoDB.createStatement();
           
           String inserir = "INSERT INTO REVISAO (candidato, partido, vr1, vr2, vr3, total_votos) values ('" + a.getNome() + "','" + a.getPartido() + "'," + a.getVr1() + ","+ a.getVr2() + "," + a.getVr3() + ","+ a.getTotalVotos() +")";
           comando.execute(inserir);
       }catch(SQLException e){
           System.out.println("Erro: " + e);
       }
   }
    
    public ArrayList<Eleicao> lerBanco(){
        ArrayList lista = new ArrayList();
        
        try{
           Statement comando = conexaoDB.createStatement();
           ResultSet resultado = comando.executeQuery(consulta);
           
           //3 - Percorre todos os resultados
           while(resultado.next()){
             // Cria um objeto aluno para cada registro retornado
             String nome    = resultado.getString("candidato");
             String partido = resultado.getString("partido");
             int vr1        = resultado.getInt("vr1");
             int vr2        = resultado.getInt("vr2");
             int vr3        = resultado.getInt("vr3");
             
             Eleicao e = new Eleicao(nome, partido, vr1, vr2, vr3);
             lista.add(e);
           }
        }catch(SQLException e){
            System.out.println("Erro: " + e);
        }
        return lista;
    }
    
    public int getTotalVotos(){
        int total = 0;
        try{
           Statement comando = conexaoDB.createStatement();
           String query = "SELECT SUM(vr1) as vr1, SUM(vr2) as vr2, SUM(vr3) as vr3 FROM REVISAO";
           ResultSet resultado = comando.executeQuery(query);
           //3 - Percorre todos os resultados
           while(resultado.next()){
             total = resultado.getInt("vr1") + resultado.getInt("vr2") + resultado.getInt("vr3");
           }
        }catch(SQLException e){
            System.out.println("Erro: " + e);
        }
        return total;
    }
    
     public String getGanhador(){
        String nome = "";
        
        try{
            Statement comando = conexaoDB.createStatement();
            String query = "SELECT candidato FROM USERBD.REVISAO order by total_votos DESC";
            ResultSet resultado = comando.executeQuery(query);
            //3 - Percorre todos os resultados
            while(resultado.next()){
                nome = resultado.getString("candidato");
                return nome;
            }
        }catch(SQLException e){
            System.out.println("Erro: " + e);
        }
        return nome;
    }
    
    
}
