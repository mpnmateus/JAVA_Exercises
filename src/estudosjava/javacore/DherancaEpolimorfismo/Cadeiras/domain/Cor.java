package estudosjava.javacore.DherancaEpolimorfismo.Cadeiras.domain;

public class Cor {
    private int r, g, b;

    public Cor (int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public String toString(){
        return String.format(
                "Cor: [R = %d, G = %d, B = %d]",
                this.r, this.g, this.b
        );
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
