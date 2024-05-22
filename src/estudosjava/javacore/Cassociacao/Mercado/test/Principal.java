package estudosjava.javacore.Cassociacao.Mercado.test;

import estudosjava.javacore.Cassociacao.Mercado.domain.Data;
import estudosjava.javacore.Cassociacao.Mercado.domain.Mercado;
import estudosjava.javacore.Cassociacao.Mercado.domain.Prateleira;
import estudosjava.javacore.Cassociacao.Mercado.domain.Produto;

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto("Amaciante", Teclado.leDouble("Digite o preço do 1º produto: "),
                new Data(10, 04, 2014));
        Produto p2 = new Produto("Creme dental", Teclado.leDouble("Digite o preço do 2º produto: "),
                new Data(05, 05, 2015));
        Produto p3 = new Produto ("Leite Condensado", Teclado.leDouble("Digite o preço do 3º produto: "),
                new Data(04, 12, 2012));

        Prateleira prateleira1 = new Prateleira(p1, p2, p3);
        Prateleira prateleira2 = new Prateleira();

        Mercado mercado = new Mercado(prateleira1, prateleira2);

        prateleira2.getProd1().setNome("Cortina");
        prateleira2.getProd1().setPreco(167.98);
        prateleira2.getProd1().setDataValidade(new Data(13, 10, 2025));

        System.out.println(mercado.getPrat1().produtoMaisCaro());
        System.out.println(mercado.getPrat2().produtoMaisCaro());

    }
}
