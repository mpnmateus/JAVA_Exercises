package estudosjava.javacore.Cassociacao.Mercado.test;

import com.sun.security.jgss.GSSUtil;
import estudosjava.javacore.Cassociacao.Mercado.domain.Data;
import estudosjava.javacore.Cassociacao.Mercado.domain.Mercado;
import estudosjava.javacore.Cassociacao.Mercado.domain.Prateleira;
import estudosjava.javacore.Cassociacao.Mercado.domain.Produto;

public class Principal {
    public static void main(String[] args) {

        // Cria uma prateleira com 3 produtos
        System.out.println("----- Cadastro de Produtos - Prateleira 1 -----");
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

        // Cria uma prateleira sem produtos e adiciona a cortina
        System.out.println("----- Cadastro de Produtos - Prateleira 2 -----");
        Prateleira prateleira2 = new Prateleira();
        prateleira2.setProd1(new Produto("Cortina", 167.98, new Data(13,10,2022)));
        System.out.printf("%s", prateleira2.toString());

        //Relatório Produtos do mercado
        System.out.println("\n\n\t-------- PRODUTOS MERCADO --------");
        System.out.println(prateleira1.toString());
        System.out.println(prateleira2.toString());

        //Cria um mercado com as duas prateleiras
        Mercado mercado = new Mercado(prateleira1, prateleira2);


        System.out.print("\n-- Produtos Vencidos --");
        // mostra as informações dos produtos vencidos (supondo a data 25/04/2023)
        Data dataAtual = new Data(25, 4, 2023);
        //Prateleira 1
        if ((mercado.getPrat1()).getProd1() != null)
            if (((mercado.getPrat1()).getProd1()).verificaProdutoVencido(dataAtual))
                System.out.printf("\n%s: Produto Vencido", ((mercado.getPrat1()).getProd1()).getNome());

        if ((mercado.getPrat1()).getProd2() != null)
            if (((mercado.getPrat1()).getProd2()).verificaProdutoVencido(dataAtual))
                System.out.printf("\n%s: Produto Vencido", ((mercado.getPrat1()).getProd2()).getNome());

        if ((mercado.getPrat1()).getProd3() != null)
            if (((mercado.getPrat1()).getProd3()).verificaProdutoVencido(dataAtual))
                System.out.printf("\n%s: Produto Vencido", ((mercado.getPrat1()).getProd3()).getNome());

        //Prateleira 2
        if ((mercado.getPrat2()).getProd1() != null)
            if (((mercado.getPrat2()).getProd1()).verificaProdutoVencido(dataAtual))
                System.out.printf("\n%s: Produto Vencido", ((mercado.getPrat2()).getProd1()).getNome());

        if ((mercado.getPrat2()).getProd2() != null)
            if (((mercado.getPrat2()).getProd2()).verificaProdutoVencido(dataAtual))
                System.out.printf("\n%s: Produto Vencido", ((mercado.getPrat2()).getProd2()).getNome());

        if ((mercado.getPrat2()).getProd3() != null)
            if (((mercado.getPrat2()).getProd3()).verificaProdutoVencido(dataAtual))
                System.out.printf("\n%s: Produto Vencido", ((mercado.getPrat2()).getProd3()).getNome());

        //Imprime as informações do produto mais caro do mercado
        System.out.println("\n\n--- Produto mais caro ---");
        if (mercado.getPrat1().produtoMaisCaro() != null){
            if (mercado.getPrat1().produtoMaisCaro().getPreco() > mercado.getPrat2().produtoMaisCaro().getPreco())
                System.out.printf("\n%s R$ %.2f", mercado.getPrat1().produtoMaisCaro().getNome(), mercado.getPrat1().produtoMaisCaro().getPreco());
            else if (mercado.getPrat2().produtoMaisCaro().getPreco() > mercado.getPrat1().produtoMaisCaro().getPreco())
                System.out.printf("\n%s R$ %.2f", mercado.getPrat2().produtoMaisCaro().getNome(), mercado.getPrat2().produtoMaisCaro().getPreco());
            } else {
                System.out.println("-- Produtos com preços iguais --");
                System.out.printf("\n%s R$ %.2f", mercado.getPrat1().produtoMaisCaro().getNome(), mercado.getPrat1().produtoMaisCaro().getPreco());
                System.out.printf("\n%s R$ %.2f", mercado.getPrat2().produtoMaisCaro().getNome(), mercado.getPrat2().produtoMaisCaro().getPreco());
            }

        //Imprime a média de preço dos produtos do mercado
        System.out.println("\n\n---- Média de preço dos produtos -----");
        System.out.printf("Média de preço: R$ %.2f", mercado.mediaValorProdutos());


    }
}
