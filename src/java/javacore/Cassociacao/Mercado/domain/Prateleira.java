package java.javacore.Cassociacao.Mercado.domain;

public class Prateleira {
    private Produto prod1, prod2, prod3;

    public Prateleira(Produto p1, Produto p2, Produto p3){
        this.prod1 = p1;
        this.prod2 = p2;
        this.prod3 = p3;
    }

    public Prateleira (){
    }

    public Produto produtoMaisCaro(){
        if (this.prod1 != null || this.prod2 != null || this.prod3 != null){
            if (this.prod1.getPreco() > this.prod2.getPreco() && this.prod1.getPreco() > this.prod3.getPreco()){
                return this.prod1;
            } else if (this.prod2.getPreco() > this.prod1.getPreco() && this.prod2.getPreco() > this.prod3.getPreco()) {
                return this.prod2;
            } else if(this.prod3.getPreco() > this.prod1.getPreco() && this.prod3.getPreco() > this.prod2.getPreco()){
                return this.prod3;
            } else {
                return null;
            }
        }
        return null;
    }
}
