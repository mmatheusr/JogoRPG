package revisao;

public class Eleicao {
    String nome, partido;
    int vr1, vr2, vr3;

    public Eleicao(String nome, String partido, int vr1, int vr2, int vr3) {
        this.nome = nome;
        this.partido = partido;
        this.vr1 = vr1;
        this.vr2 = vr2;
        this.vr3 = vr3;
    }
    @Override
    public String toString() {
        return "Condidato: "+nome+" - Partido: "+partido;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPartido() {
        return partido;
    }
    public void setPartido(String partido) {
        this.partido = partido;
    }
    public int getVr1() {
        return vr1;
    }
    public void setVr1(int vr1) {
        this.vr1 = vr1;
    }
    public int getVr2() {
        return vr2;
    }
    public void setVr2(int vr2) {
        this.vr2 = vr2;
    }
    public int getVr3() {
        return vr3;
    }
    public void setVr3(int vr3) {
        this.vr3 = vr3;
    }

    public int getTotalVotos() {
        return vr1 + vr2 + vr3;
    }
    
}
