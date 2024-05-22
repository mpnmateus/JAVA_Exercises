package estudosjava.javacore.Cassociacao.Mercado.domain;

public class Prateleira {
    private Produto prod1, prod2, prod3;

    public Prateleira(Produto p1, Produto p2, Produto p3){
        this.prod1 = p1;
        this.prod2 = p2;
        this.prod3 = p3;
    }

    public Prateleira (){
    }

    //Impressão
    public String toString(){
        return
                String.format(
                "\nPrateleira: [\nProduto 1 = %s, \nProduto 2 = %s, \nProduto 3 = %s]",
                this.prod1, this.prod2, this.prod3
        );

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

    //Getters and Setters

    public Produto getProd1() {
        return prod1;
    }

    public void setProd1(Produto prod1) {
        this.prod1 = prod1;
    }

    public Produto getProd2() {
        return prod2;
    }

    public void setProd2(Produto prod2) {
        this.prod2 = prod2;
    }

    public Produto getProd3() {
        return prod3;
    }

    public void setProd3(Produto prod3) {
        this.prod3 = prod3;
    }
}
