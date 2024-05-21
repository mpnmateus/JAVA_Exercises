package java.javacore.Cassociacao.Mercado.domain;

public class Mercado {
    private Prateleira prat1, prat2;

    public Mercado (Prateleira p1, Prateleira p2){
        this.prat1 = p1;
        this.prat2 = p2;
    }


    //Getters
    public Prateleira getPrat1() {
        return prat1;
    }

    public Prateleira getPrat2() {
        return prat2;
    }
}
