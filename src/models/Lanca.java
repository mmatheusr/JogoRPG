package models;

public class Lanca extends Arma {
    
    private int comprimento;

    public Lanca() {
    
    }
    
    public Lanca(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }    
}