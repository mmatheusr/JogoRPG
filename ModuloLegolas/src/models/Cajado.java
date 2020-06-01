package models;

public class Cajado extends Arma {
    
    private int comprimento;
    private String elemento;

    public Cajado() {
        
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }  
}