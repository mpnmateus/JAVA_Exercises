package estudosjava.javacore.Cassociacao.Mercado.test;

import com.sun.security.jgss.GSSUtil;
import estudosjava.javacore.Cassociacao.Mercado.domain.Data;
import estudosjava.javacore.Cassociacao.Mercado.domain.Mercado;
import estudosjava.javacore.Cassociacao.Mercado.domain.Prateleira;
import estudosjava.javacore.Cassociacao.Mercado.domain.Produto;

public class Principal {
    public static void main(String[] args) {
        System.out.println("-------- PRATELEIRA 1 --------");
        double preco;

        System.out.println("\n----> Produto 1 <-----");
        do {
            preco = Teclado.leDouble("Digite o preço do produto: ");
            if (preco <= 0){
                System.out.println("Erro! O preço do produto deve ser maior que 0. Digite novamente.");
            }
        } while (preco <= 0);
        Produto p1 = new Produto("Amaciante", preco,
                new Data(10, 04, 2014));

        System.out.println("\n----> Produto 2 <-----");
        do{
            preco = Teclado.leDouble("Digite o preço do produto: ");
            if (preco <= 0){
                System.out.println("Erro! O preço do produto deve ser maior que 0. Digite novamente.");
            }
        } while (preco <= 0);
        Produto p2 = new Produto("Creme dental", preco,
                new Data(05, 05, 2015));

        System.out.println("\n----> Produto 3 <-----");
        do {
            preco = Teclado.leDouble("Digite o preço do produto: ");
            if (preco <= 0){
                System.out.println("Erro! O preço do produto deve ser maior que 0. Digite novamente.");
            }
        } while (preco <= 0);
        Produto p3 = new Produto ("Leite Condensado", preco,
                new Data(04, 12, 2012));

        Prateleira prateleira1 = new Prateleira(p1, p2, p3);
        Prateleira prateleira2 = new Prateleira();
        prateleira2.setProd1(new Produto("Cortina", 167.98, new Data(13,10,2025)));

        Mercado mercado = new Mercado(prateleira1, prateleira2);



        System.out.println("\n------Prateleira 1--------");
        System.out.println(mercado.getPrat1());
        System.out.println("\n------Prateleira 2--------");
        System.out.println(mercado.getPrat2());

    }
}
