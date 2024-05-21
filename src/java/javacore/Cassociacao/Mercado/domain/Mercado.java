package java.javacore.Cassociacao.Mercado.domain;

public class Mercado {
    private Prateleira prat1, prat2;

    public Mercado (Prateleira p1, Prateleira p2){
        this.prat1 = p1;
        this.prat2 = p2;
    }

    //Método média valor dos produtos
    public double mediaValorProdutos(){
        double soma = 0;
        int contador = 0;
        //Prateleira 1
        if (prat1 != null){
            //Prateleira 1 -- Produto 1
            if(prat1.getProd1() != null){
                soma += prat1.getProd1().getPreco();
                contador++;
            }
            //Prateleira 1 -- Produto 2
            if (prat1.getProd2() != null){
                soma += prat1.getProd2().getPreco();
                contador++;
            }
            //Prateleira 1 -- Produto 3
            if (prat1.getProd3() != null){
                soma += prat1.getProd3().getPreco();
                contador++;
            }
        }
        //Prateleira 2
        if (prat2 != null){
            //Prateleira 2 -- Produto 1
            if(prat2.getProd1() != null){
                soma += prat2.getProd1().getPreco();
                contador++;
            }
            //Prateleira 2 -- Produto 2
            if (prat2.getProd2() != null){
                soma += prat2.getProd2().getPreco();
                contador++;
            }
            //Prateleira 2 -- Produto 3
            if (prat2.getProd3() != null){
                soma += prat2.getProd3().getPreco();
                contador++;
            }
        }
        return contador > 0 ? soma / contador : 0;

    }

    //Getters
    public Prateleira getPrat1() {
        return prat1;
    }

    public Prateleira getPrat2() {
        return prat2;
    }
}
