package revisao;

import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

public class View extends javax.swing.JFrame {
    private DefaultListModel<Eleicao> listaCandidatos;
    public View() {
        listaCandidatos = new DefaultListModel<Eleicao>();
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        partidojTextField = new javax.swing.JTextField();
        vr1jTextField = new javax.swing.JTextField();
        vr2jTextField = new javax.swing.JTextField();
        vr3jTextField = new javax.swing.JTextField();
        totjButton = new javax.swing.JButton();
        totjTextField = new javax.swing.JTextField();
        GanhadorjButton = new javax.swing.JButton();
        ganhadorjTextField = new javax.swing.JTextField();
        inserirjButton = new javax.swing.JButton();
        inserirbdjButton = new javax.swing.JButton();
        limparjButton = new javax.swing.JButton();
        lerBancojButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listajList = new javax.swing.JList<Eleicao>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Candidato:");

        jLabel2.setText("Partido:");

        jLabel3.setText("Nº Votos Região 1:");

        jLabel4.setText("Nº Votos Região 2:");

        jLabel5.setText("Nº Votos Regiao3:");

        totjButton.setText("Totalizar Votos");

        GanhadorjButton.setText("Ganhador");

        inserirjButton.setText("Inserir Lista");

        inserirbdjButton.setText("Inserir Banco");

        limparjButton.setText("Limpar Lista");

        lerBancojButton.setText("Carregar Banco");

        listajList.setModel(listaCandidatos);
        jScrollPane1.setViewportView(listajList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(partidojTextField)
                            .addComponent(nomejTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vr3jTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(vr2jTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(vr1jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totjButton)
                            .addComponent(GanhadorjButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totjTextField)
                            .addComponent(ganhadorjTextField))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inserirjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inserirbdjButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(limparjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lerBancojButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inserirjButton)
                    .addComponent(inserirbdjButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(partidojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(vr1jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(limparjButton)
                            .addComponent(lerBancojButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(vr2jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(vr3jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totjButton)
                            .addComponent(totjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GanhadorjButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ganhadorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Obter Objeto
    public Eleicao obterDados(){
         // Obtem os dados nos componentes visuais
         String nome       = nomejTextField.getText();
         String partido    = partidojTextField.getText();
         String vr1        = vr1jTextField.getText();
         String vr2        = vr2jTextField.getText();
         String vr3        = vr3jTextField.getText();
         //conversao de dados
         int aux1          = Integer.parseInt(vr1);
         int aux2          = Integer.parseInt(vr2);
         int aux3          = Integer.parseInt(vr3);
         // Cria uma instancia da classe Eleicao
         Eleicao e = new Eleicao(nome, partido, aux1, aux2, aux3);
         // Retorna o candidato
        return(e);
    }
    public void insereLista(Eleicao e){
        listaCandidatos.addElement(e);        
    }
    public void addInsereListener(ActionListener l){
        inserirjButton.addActionListener(l);        
    }
    public void addLeBancoListener(ActionListener l){
        lerBancojButton.addActionListener(l);
    }
    public void addInsereBancoListener(ActionListener l){
        inserirbdjButton.addActionListener(l);
    }
    public void addLimparBtnLimpar(ActionListener l){
        limparjButton.addActionListener(l);
    } 
    public void addTotaldeVotos(ActionListener l){
        totjButton.addActionListener(l);
    }
    public void setTotal(int a){
        totjTextField.setText("" + a);
    }
    public void addGanhador(ActionListener l){
        GanhadorjButton.addActionListener(l);
    }
    public void setGanhador(String b){
        ganhadorjTextField.setText(b);
    }
    public void limpaListaListener(){
        listaCandidatos.clear();        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GanhadorjButton;
    private javax.swing.JTextField ganhadorjTextField;
    private javax.swing.JButton inserirbdjButton;
    private javax.swing.JButton inserirjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lerBancojButton;
    private javax.swing.JButton limparjButton;
    private javax.swing.JList<Eleicao> listajList;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JTextField partidojTextField;
    private javax.swing.JButton totjButton;
    private javax.swing.JTextField totjTextField;
    private javax.swing.JTextField vr1jTextField;
    private javax.swing.JTextField vr2jTextField;
    private javax.swing.JTextField vr3jTextField;
    // End of variables declaration//GEN-END:variables
}
