package controllers;

import dao.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import music.Music;
import views.View;

public class Controller {
    
    private View view;
    private Music music;
    
    public Controller(){
        view = new View();
        music = new Music();
    }
    
    private class ComboBoxArma implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.trocarArma();
            music.replace();
        }
    
    }
    
    private class BtnFechar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    
    }
    
    private class BtnCriarArma implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(view.validacao()){
                switch(view.getTipoArma()){
                    case 0:
                        EspadaDAO espadaDAO = new EspadaDAO();
                        espadaDAO.inserir(view.getEspada());
                        break;
                    case 1:
                        MachadoDAO machadoDAO = new MachadoDAO();
                        machadoDAO.inserir(view.getMachado());
                        break;
                    case 2:
                        ArcoDAO arcoDAO = new ArcoDAO();
                        arcoDAO.inserir(view.getArco());
                        break;
                    case 3:
                        CajadoDAO cajadoDAO = new CajadoDAO();
                        cajadoDAO.inserir(view.getCajado());
                        break;
                    case 4:
                        LancaDAO lancaDAO = new LancaDAO();
                        lancaDAO.inserir(view.getLanca());
                        break;
                }
                view.resetar();
                JOptionPane.showMessageDialog(null, "ARMA CONSTRUÍDA COM SUCESSO !", "Aviso", 1);
            } else{
                JOptionPane.showMessageDialog(null, "INFORME O NOME DA ARMA !", "Aviso", 2);
            }
        }
    
    }
    
    public void start(){
        view.setVisible(true);
        view.comboBoxArma(new ComboBoxArma());
        view.btnFechar(new BtnFechar());
        view.btnCriarArma(new BtnCriarArma());
        
        music.background();
    }  
}