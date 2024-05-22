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


        //Mostra as informações dos produtos vencidos (supondo a data 25/04/2023)
        System.out.println("\n---- (!!) Produtos vencidos (!!) -----");
        Data dataAtual = new Data(25, 04, 2025);
        if (mercado.getPrat1().getProd1()!= null){
            if (mercado.getPrat1().getProd1().verificaProdutoVencido(dataAtual)){
                System.out.println(mercado.getPrat1().getProd1());
                System.out.println();
            }
        }
        if (mercado.getPrat1().getProd2() != null){
            if(mercado.getPrat1().getProd2().verificaProdutoVencido(dataAtual)){
                System.out.println(mercado.getPrat1().getProd2());
                System.out.println();
            }
        }

        //Imprime as informações do produto mais caro do mercado
        System.out.println("\n\n--- Produto mais caro ---");
        if (mercado.getPrat1() != null){

        }

        //Imprime a média de preço dos produtos do mercado
        System.out.println("\n\n---- Média de preço dos produtos -----");
        System.out.printf("Média de preço: R$ %.2f", mercado.mediaValorProdutos());

        /**
        System.out.println("\n------Prateleira 1--------");
        System.out.println(mercado.getPrat1());
        System.out.println("\n------Prateleira 2--------");
        System.out.println(mercado.getPrat2());
        **/
    }
}
