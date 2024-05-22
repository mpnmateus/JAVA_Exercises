package estudosjava.javacore.Cassociacao.Mercado.test;

import estudosjava.javacore.Cassociacao.Mercado.domain.Data;
import estudosjava.javacore.Cassociacao.Mercado.domain.Mercado;
import estudosjava.javacore.Cassociacao.Mercado.domain.Prateleira;
import estudosjava.javacore.Cassociacao.Mercado.domain.Produto;

public class Principal02 {
    public static void main(String[] args) {
        // cria uma prateleira com 3 produtos
        System.out.println("-- Cadastro de produtos Prateleira 1 ---");
        double preco;
        System.out.println("-> Produto 1");
        do {
            preco = Teclado.leDouble("Digite o preço do produto: R$ ");
            if (preco <= 0) {
                System.out.println("O preço deve ser maior do que zero! Tente novamente!");
            }
        } while (preco <= 0);
        //public Produto(String n, double p, Data dV)
        Produto p1 = new Produto("Amaciante", preco, new Data(10, 4, 2014));

        System.out.println("-> Produto 2");
        do {
            preco = Teclado.leDouble("Digite o preço do produto: R$ ");
            if (preco <= 0) {
                System.out.println("O preço deve ser maior do que zero! Tente novamente!");
            }
        } while (preco <= 0);
        Produto p2 = new Produto("Creme Dental", preco, new Data(5, 5, 2015));

        System.out.println("-> Produto 3");
        do {
            preco = Teclado.leDouble("Digite o preço do produto: R$ ");
            if (preco <= 0) {
                System.out.println("O preço deve ser maior do que zero! Tente novamente!");
            }
        } while (preco <= 0);
        Produto p3 = new Produto("Leite Condensado", preco, new Data(4, 12, 2012));

        Prateleira prat1 = new Prateleira(p1, p2, p3);

        // cria uma prateleira sem produtos e adiciona a cortina
        System.out.println("\n-- Cadastro de produtos Prateleira 2 --");
        Produto cortina = new Produto("cortina", 167.98, new Data(13, 10, 2025));
        //public Prateleira()
        Prateleira prat2 = new Prateleira();
        prat2.setProd1(cortina);
        System.out.printf("%s", cortina.toString());

        // cria um mercado com as duas prateleiras
        //public Mercado(Prateleira p1, Prateleira p2)
        Mercado mercado = new Mercado(prat1, prat2);

        System.out.println("\n\n\t-------- MERCADO JAVA --------");
        System.out.print(prat1.toString());
        System.out.print((mercado.getPrat2()).toString());

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

        // imprime as informações do produto mais caro do mercado
        System.out.print("\n\n-- Produto mais Caro --");
        if ((mercado.getPrat1()).produtoMaisCaro() != null)
        {
            if (((mercado.getPrat1()).produtoMaisCaro()).getPreco() > ((mercado.getPrat2()).getProd1()).getPreco())
                System.out.printf("\n%s R$ %.2f", ((mercado.getPrat1()).produtoMaisCaro()).getNome(),((mercado.getPrat1()).produtoMaisCaro()).getPreco());
            else if (((mercado.getPrat2()).getProd1()).getPreco() > ((mercado.getPrat1()).produtoMaisCaro()).getPreco())
                System.out.printf("\n%s R$ %.2f", ((mercado.getPrat2()).getProd1()).getNome(),((mercado.getPrat2()).getProd1()).getPreco());
            else{
                System.out.print("\nDois preços iguais: ");
                System.out.printf("\n%s R$ %.2f", ((mercado.getPrat1()).produtoMaisCaro()).getNome(),((mercado.getPrat1()).produtoMaisCaro()).getPreco());
                System.out.printf("\n%s R$ %.2f", ((mercado.getPrat2()).getProd1()).getNome(),((mercado.getPrat2()).getProd1()).getPreco());
            }
        }

        // imprime a média de preço dos produtos do mercado
        System.out.println("\n\n-- Média de preço dos produtos --");
        System.out.printf("Média de preço: R$ %.2f", mercado.mediaValorProdutos());
    }
}
