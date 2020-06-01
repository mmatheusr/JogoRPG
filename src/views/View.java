package views;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import models.*;

public class View extends javax.swing.JFrame {
    
    public View() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelBackground = new images.PainelBackground();
        btnFechar = new javax.swing.JButton();
        labelDano = new javax.swing.JLabel();
        comboBoxArma = new javax.swing.JComboBox<>();
        labelNome = new javax.swing.JLabel();
        labelArmas = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        comboBoxDano = new javax.swing.JComboBox<>();
        painelArma = new javax.swing.JLabel();
        comboBoxAgilidade = new javax.swing.JComboBox<>();
        labelAgilidade = new javax.swing.JLabel();
        labelDefesa = new javax.swing.JLabel();
        comboBoxDefesa = new javax.swing.JComboBox<>();
        labelAtributosEspecificos = new javax.swing.JLabel();
        btnConstruirArma = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        labelEspessuraEspada = new javax.swing.JLabel();
        labelComprimentoEspada = new javax.swing.JLabel();
        comboBoxComprimentoEspada = new javax.swing.JComboBox<>();
        comboBoxEspessuraEspada = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        labelPesoMachado = new javax.swing.JLabel();
        comboBoxPesoMachado = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        labelLarguraArco = new javax.swing.JLabel();
        comboBoxLarguraArco = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        labelComprimentoCajado = new javax.swing.JLabel();
        comboBoxComprimentoCajado = new javax.swing.JComboBox<>();
        LabelElementoCajado = new javax.swing.JLabel();
        comboBoxElementoCajado = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        labelComprimentoLanca = new javax.swing.JLabel();
        comboBoxComprimentoLanca = new javax.swing.JComboBox<>();
        labelDurabilidade = new javax.swing.JLabel();
        comboBoxDurabilidade = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        labelArsenalArmas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);

        painelBackground.setImg(new ImageIcon(getClass().getResource("/images/background.jpg")));

        btnFechar.setText("Fechar");
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        labelDano.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        labelDano.setForeground(new java.awt.Color(255, 255, 255));
        labelDano.setText("Dano");

        comboBoxArma.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        comboBoxArma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espada", "Machado", "Arco e Flecha", "Cajado", "Lança" }));
        comboBoxArma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxArma.setName(""); // NOI18N

        labelNome.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        labelNome.setForeground(new java.awt.Color(255, 255, 255));
        labelNome.setText("Nome da Arma");

        labelArmas.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        labelArmas.setForeground(new java.awt.Color(255, 255, 255));
        labelArmas.setText("Armas");

        txtNome.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        txtNome.setMargin(new java.awt.Insets(10, 13, 10, 10));

        comboBoxDano.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        comboBoxDano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));
        comboBoxDano.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxDano.setName(""); // NOI18N

        painelArma.setIcon(new ImageIcon(getClass().getResource("/images/espada.png")));

        comboBoxAgilidade.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        comboBoxAgilidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));
        comboBoxAgilidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxAgilidade.setName(""); // NOI18N

        labelAgilidade.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        labelAgilidade.setForeground(new java.awt.Color(255, 255, 255));
        labelAgilidade.setText("Agilidade");

        labelDefesa.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        labelDefesa.setForeground(new java.awt.Color(255, 255, 255));
        labelDefesa.setText("Defesa");

        comboBoxDefesa.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        comboBoxDefesa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));
        comboBoxDefesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxDefesa.setName(""); // NOI18N

        labelAtributosEspecificos.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        labelAtributosEspecificos.setForeground(new java.awt.Color(255, 255, 255));
        labelAtributosEspecificos.setText("Atributos Específicos");

        btnConstruirArma.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        btnConstruirArma.setText("Construir Arma");
        btnConstruirArma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTabbedPane1.setEnabled(false);

        labelEspessuraEspada.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        labelEspessuraEspada.setText("Espessura");

        labelComprimentoEspada.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        labelComprimentoEspada.setText("Comprimento");

        comboBoxComprimentoEspada.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        comboBoxComprimentoEspada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));
        comboBoxComprimentoEspada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxComprimentoEspada.setName(""); // NOI18N

        comboBoxEspessuraEspada.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        comboBoxEspessuraEspada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));
        comboBoxEspessuraEspada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxEspessuraEspada.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBoxEspessuraEspada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelComprimentoEspada, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(comboBoxComprimentoEspada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelEspessuraEspada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelComprimentoEspada)
                .addGap(4, 4, 4)
                .addComponent(comboBoxComprimentoEspada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(labelEspessuraEspada)
                .addGap(4, 4, 4)
                .addComponent(comboBoxEspessuraEspada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Espada", jPanel1);

        labelPesoMachado.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        labelPesoMachado.setText("Peso");

        comboBoxPesoMachado.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        comboBoxPesoMachado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));
        comboBoxPesoMachado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxPesoMachado.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelPesoMachado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxPesoMachado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelPesoMachado)
                .addGap(4, 4, 4)
                .addComponent(comboBoxPesoMachado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Machado", jPanel2);

        labelLarguraArco.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        labelLarguraArco.setText("Largura");

        comboBoxLarguraArco.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        comboBoxLarguraArco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));
        comboBoxLarguraArco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxLarguraArco.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelLarguraArco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxLarguraArco, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelLarguraArco)
                .addGap(4, 4, 4)
                .addComponent(comboBoxLarguraArco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Arco e Fecha", jPanel3);

        labelComprimentoCajado.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        labelComprimentoCajado.setText("Comprimento");

        comboBoxComprimentoCajado.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        comboBoxComprimentoCajado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));
        comboBoxComprimentoCajado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxComprimentoCajado.setName(""); // NOI18N

        LabelElementoCajado.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        LabelElementoCajado.setText("Elemento");

        comboBoxElementoCajado.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        comboBoxElementoCajado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Água", "Fogo", "Terra", "Ar", "Divino", "Negro" }));
        comboBoxElementoCajado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxElementoCajado.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBoxElementoCajado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelComprimentoCajado, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(comboBoxComprimentoCajado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelElementoCajado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelComprimentoCajado)
                .addGap(4, 4, 4)
                .addComponent(comboBoxComprimentoCajado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(LabelElementoCajado)
                .addGap(4, 4, 4)
                .addComponent(comboBoxElementoCajado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cajado", jPanel4);

        labelComprimentoLanca.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        labelComprimentoLanca.setText("Comprimento");

        comboBoxComprimentoLanca.setFont(new java.awt.Font("Bookman Old Style", 3, 18)); // NOI18N
        comboBoxComprimentoLanca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));
        comboBoxComprimentoLanca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxComprimentoLanca.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelComprimentoLanca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxComprimentoLanca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelComprimentoLanca)
                .addGap(4, 4, 4)
                .addComponent(comboBoxComprimentoLanca, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lança", jPanel5);

        labelDurabilidade.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        labelDurabilidade.setForeground(new java.awt.Color(255, 255, 255));
        labelDurabilidade.setText("Durabilidade");

        comboBoxDurabilidade.setFont(new java.awt.Font("Bookman Old Style", 3, 24)); // NOI18N
        comboBoxDurabilidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));
        comboBoxDurabilidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboBoxDurabilidade.setName(""); // NOI18N

        jTable1.setFont(new java.awt.Font("Bookman Old Style", 3, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Arma", "Dano", "Desefa", "Durabilidade", "Agilidade"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setOpaque(false);
        jScrollPane2.setViewportView(jTable1);

        labelArsenalArmas.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        labelArsenalArmas.setForeground(new java.awt.Color(255, 255, 255));
        labelArsenalArmas.setText("Arsenal de Armas");

        javax.swing.GroupLayout painelBackgroundLayout = new javax.swing.GroupLayout(painelBackground);
        painelBackground.setLayout(painelBackgroundLayout);
        painelBackgroundLayout.setHorizontalGroup(
            painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBackgroundLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBackgroundLayout.createSequentialGroup()
                        .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelBackgroundLayout.createSequentialGroup()
                                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDano, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxDano, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelDefesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxDefesa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboBoxArma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelArmas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNome)))
                        .addGap(71, 71, 71)
                        .addComponent(painelArma, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(painelBackgroundLayout.createSequentialGroup()
                        .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelBackgroundLayout.createSequentialGroup()
                                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDurabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxDurabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelAgilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxAgilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelBackgroundLayout.createSequentialGroup()
                                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnConstruirArma, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAtributosEspecificos, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(155, 155, 155)
                                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                                    .addGroup(painelBackgroundLayout.createSequentialGroup()
                                        .addComponent(labelArsenalArmas, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        painelBackgroundLayout.setVerticalGroup(
            painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBackgroundLayout.createSequentialGroup()
                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBackgroundLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelArma, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelBackgroundLayout.createSequentialGroup()
                                .addComponent(labelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(labelArmas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBoxArma, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelDano)
                                    .addComponent(labelDefesa))
                                .addGap(14, 14, 14)
                                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBoxDano, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBoxDefesa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(painelBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBackgroundLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(labelAgilidade))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelDurabilidade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxAgilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxDurabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAtributosEspecificos)
                    .addComponent(labelArsenalArmas))
                .addGap(6, 6, 6)
                .addGroup(painelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelBackgroundLayout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnConstruirArma, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1183, 913));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void comboBoxArma(ActionListener al){
        comboBoxArma.addActionListener(al);
    }
    
    public void btnCriarArma (ActionListener al){
        btnConstruirArma.addActionListener(al);
    }
    
    public void btnFechar(ActionListener al){
        btnFechar.addActionListener(al);
    }
    
    public boolean validacao(){
        if(txtNome.getText().isEmpty()){
            return false;
        }
        return true;
    }
    
    public void resetar(){
        
        switch(comboBoxArma.getSelectedIndex()){
            case 0:
                comboBoxComprimentoEspada.setSelectedIndex(0);
                comboBoxEspessuraEspada.setSelectedIndex(0);
                break;
            case 1:
                comboBoxPesoMachado.setSelectedIndex(0);
                break;
            case 2:
                comboBoxLarguraArco.setSelectedIndex(0);
                break;
            case 3:
                comboBoxComprimentoCajado.setSelectedIndex(0);
                comboBoxElementoCajado.setSelectedIndex(0);
                break;
            case 4:
                comboBoxComprimentoLanca.setSelectedIndex(0);
        }
        
        txtNome.setText("");
        comboBoxArma.setSelectedIndex(0);
        comboBoxDano.setSelectedIndex(0);
        comboBoxDefesa.setSelectedIndex(0);
        comboBoxDurabilidade.setSelectedIndex(0);
        comboBoxAgilidade.setSelectedIndex(0);
    }
    
    public int getTipoArma(){
        return comboBoxArma.getSelectedIndex();
    }
    
    public Espada getEspada(){
        Espada espada = new Espada();
        espada.setNome(txtNome.getText());
        espada.setArma(comboBoxArma.getSelectedItem().toString());
        espada.setDano(Integer.parseInt(comboBoxDano.getSelectedItem().toString()));
        espada.setDefesa(Integer.parseInt(comboBoxDefesa.getSelectedItem().toString()));
        espada.setDurabilidade(Integer.parseInt(comboBoxDurabilidade.getSelectedItem().toString()));
        espada.setAgilidade(Integer.parseInt(comboBoxAgilidade.getSelectedItem().toString()));
        espada.setComprimento(Integer.parseInt(comboBoxComprimentoEspada.getSelectedItem().toString()));
        espada.setEspessura(Integer.parseInt(comboBoxEspessuraEspada.getSelectedItem().toString()));

        return espada;
    }
    
    public Machado getMachado(){
        Machado machado = new Machado();
        machado.setNome(txtNome.getText());
        machado.setArma(comboBoxArma.getSelectedItem().toString());
        machado.setDano(Integer.parseInt(comboBoxDano.getSelectedItem().toString()));
        machado.setDefesa(Integer.parseInt(comboBoxDefesa.getSelectedItem().toString()));
        machado.setDurabilidade(Integer.parseInt(comboBoxDurabilidade.getSelectedItem().toString()));
        machado.setAgilidade(Integer.parseInt(comboBoxAgilidade.getSelectedItem().toString()));
        machado.setPeso(Integer.parseInt(comboBoxPesoMachado.getSelectedItem().toString()));
        
        return machado;
    }
    
     public Arco getArco(){
        Arco arco = new Arco();
        arco.setNome(txtNome.getText());
        arco.setArma(comboBoxArma.getSelectedItem().toString());
        arco.setDano(Integer.parseInt(comboBoxDano.getSelectedItem().toString()));
        arco.setDefesa(Integer.parseInt(comboBoxDefesa.getSelectedItem().toString()));
        arco.setDurabilidade(Integer.parseInt(comboBoxDurabilidade.getSelectedItem().toString()));
        arco.setAgilidade(Integer.parseInt(comboBoxAgilidade.getSelectedItem().toString()));
        arco.setLargura(Integer.parseInt(comboBoxLarguraArco.getSelectedItem().toString()));
       
        return arco;
    }
     
    public Cajado getCajado(){
        Cajado cajado = new Cajado();
        cajado.setNome(txtNome.getText());
        cajado.setArma(comboBoxArma.getSelectedItem().toString());
        cajado.setDano(Integer.parseInt(comboBoxDano.getSelectedItem().toString()));
        cajado.setDefesa(Integer.parseInt(comboBoxDefesa.getSelectedItem().toString()));
        cajado.setDurabilidade(Integer.parseInt(comboBoxDurabilidade.getSelectedItem().toString()));
        cajado.setAgilidade(Integer.parseInt(comboBoxAgilidade.getSelectedItem().toString()));
        cajado.setComprimento(Integer.parseInt(comboBoxComprimentoCajado.getSelectedItem().toString()));
        cajado.setElemento(comboBoxElementoCajado.getSelectedItem().toString());
       
        return cajado;
    }
     
    public Lanca getLanca(){
        Lanca lanca = new Lanca();
        lanca.setNome(txtNome.getText());
        lanca.setArma(comboBoxArma.getSelectedItem().toString());
        lanca.setDano(Integer.parseInt(comboBoxDano.getSelectedItem().toString()));
        lanca.setDefesa(Integer.parseInt(comboBoxDefesa.getSelectedItem().toString()));
        lanca.setDurabilidade(Integer.parseInt(comboBoxDurabilidade.getSelectedItem().toString()));
        lanca.setAgilidade(Integer.parseInt(comboBoxAgilidade.getSelectedItem().toString()));
        lanca.setComprimento(Integer.parseInt(comboBoxComprimentoLanca.getSelectedItem().toString()));
       
        return lanca;
    }
    
    public void trocarArma(){
        switch(comboBoxArma.getSelectedIndex()){
            case 0:
                painelArma.setIcon(new ImageIcon(getClass().getResource("/images/espada.png")));
                jTabbedPane1.setSelectedIndex(0);
                break;
            case 1:
                painelArma.setIcon(new ImageIcon(getClass().getResource("/images/machado.png")));
                jTabbedPane1.setSelectedIndex(1);
                break;
            case 2:
                painelArma.setIcon(new ImageIcon(getClass().getResource("/images/arco_flecha.png")));
                jTabbedPane1.setSelectedIndex(2);
                break;
            case 3:
                painelArma.setIcon(new ImageIcon(getClass().getResource("/images/cajado.png")));
                jTabbedPane1.setSelectedIndex(3);
                break;
            case 4:
                painelArma.setIcon(new ImageIcon(getClass().getResource("/images/lanca.png")));
                jTabbedPane1.setSelectedIndex(4);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelElementoCajado;
    private javax.swing.JButton btnConstruirArma;
    private javax.swing.JButton btnFechar;
    private javax.swing.JComboBox<String> comboBoxAgilidade;
    private javax.swing.JComboBox<String> comboBoxArma;
    private javax.swing.JComboBox<String> comboBoxComprimentoCajado;
    private javax.swing.JComboBox<String> comboBoxComprimentoEspada;
    private javax.swing.JComboBox<String> comboBoxComprimentoLanca;
    private javax.swing.JComboBox<String> comboBoxDano;
    private javax.swing.JComboBox<String> comboBoxDefesa;
    private javax.swing.JComboBox<String> comboBoxDurabilidade;
    private javax.swing.JComboBox<String> comboBoxElementoCajado;
    private javax.swing.JComboBox<String> comboBoxEspessuraEspada;
    private javax.swing.JComboBox<String> comboBoxLarguraArco;
    private javax.swing.JComboBox<String> comboBoxPesoMachado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelAgilidade;
    private javax.swing.JLabel labelArmas;
    private javax.swing.JLabel labelArsenalArmas;
    private javax.swing.JLabel labelAtributosEspecificos;
    private javax.swing.JLabel labelComprimentoCajado;
    private javax.swing.JLabel labelComprimentoEspada;
    private javax.swing.JLabel labelComprimentoLanca;
    private javax.swing.JLabel labelDano;
    private javax.swing.JLabel labelDefesa;
    private javax.swing.JLabel labelDurabilidade;
    private javax.swing.JLabel labelEspessuraEspada;
    private javax.swing.JLabel labelLarguraArco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelPesoMachado;
    private javax.swing.JLabel painelArma;
    private images.PainelBackground painelBackground;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}