package models;

public class Espada extends Arma {
    
    private int comprimento;
    private int espessura;

    public Espada() {
        
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getEspessura() {
        return espessura;
    }

    public void setEspessura(int espessura) {
        this.espessura = espessura;
    }   
}