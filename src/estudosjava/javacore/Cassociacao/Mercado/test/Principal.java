package estudosjava.javacore.Cassociacao.Mercado.test;

import estudosjava.javacore.Cassociacao.Mercado.domain.Data;
import estudosjava.javacore.Cassociacao.Mercado.domain.Produto;

public class Principal {
    public static void main(String[] args) {


        Produto p1 = new Produto("Amaciante", Teclado.leDouble("Digite o preço do 1º produto: "),
                new Data(10, 04, 2014));
        Produto p2 = new Produto("Creme dental", Teclado.leDouble("Digite o preço do 2º produto: "),
                new Data(05, 05, 2015));
        Produto p3 = new Produto ("Leite Condensado", Teclado.leDouble("Digite o preço do 3º produto: "),
                new Data(04, 12, 2012));

    }
}
