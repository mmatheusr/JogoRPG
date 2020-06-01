package revisao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class Controller {
    View view;
    Conexao conexao;
     public void executar(){
        // Criar objetos view 
        view = new View();
        conexao = new Conexao();
        // Colocar listeners
        view.addInsereListener(new InsereListener());
        view.addLeBancoListener(new LeBancoListener());
        view.addInsereBancoListener(new InsereBancoListener());
        view.addLimparBtnLimpar(new AddLimparBtnLimpar());
        view.addTotaldeVotos(new AddTotaldeVotos());
        view.addGanhador(new AddGanhador());
        // Disparar Views
        view.setVisible(true);
    };
    // Criar uma classe Listener para o botao INSERE
    public class InsereListener implements ActionListener{
      @Override
        public void actionPerformed(ActionEvent e) {
           /// Codigo para inserir 
           // 1 - Obter objeto digitado nos campos de entrada
          Eleicao a = view.obterDados();
           // 2 - Chamar metodo de inserir na lista
           view.insereLista(a);           
        }        
    }
    // Criar uma classe Lister para o botao Le BANCO
    public class LeBancoListener implements ActionListener{
         @Override
        public void actionPerformed(ActionEvent e) {          
            view.limpaListaListener();
            /// 2 - obter a lista da dados do banco
            ArrayList<Eleicao> lista = conexao.lerBanco();
            Iterator<Eleicao> it = lista.iterator();
            while(it.hasNext()){
                Eleicao a = it.next();
                view.insereLista(a);
            } 
            
            
        }
        
    }
    //Criar classe listenes para  botao Insere Banco
    public class InsereBancoListener implements ActionListener{
         @Override
        public void actionPerformed(ActionEvent e) {
           //Inserir no banco de dados
            // 1 - Obter objeto digitado nos campos de entrada
           Eleicao a = view.obterDados();
           // 3 - Chamar metodo para inserir no banco de dados 
           conexao.inserirBanco(a);
        }
        
    }
    
    public class AddLimparBtnLimpar implements ActionListener{
         @Override
        public void actionPerformed(ActionEvent e) {
            view.limpaListaListener();
        }
        
    }
    public class AddTotaldeVotos implements ActionListener{
         @Override
        public void actionPerformed(ActionEvent e) {
              view.setTotal(conexao.getTotalVotos());
        }
       
    }
    public class AddGanhador implements ActionListener{
         @Override
        public void actionPerformed(ActionEvent e) {
           view.setGanhador(conexao.getGanhador());
        }
        
    }
}
