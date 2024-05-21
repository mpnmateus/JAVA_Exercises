package java.javacore.Cassociacao.Livro.test;

import java.javacore.Cassociacao.Livro.domain.Cliente;
import java.javacore.Cassociacao.Livro.domain.Livro;

public class Principal {
    public static void main(String[] args) {

        System.out.println("DADOS CLIENTE 1");
        Cliente c1 = new Cliente(Teclado.leString("Nome do cliente: "), Teclado.leInt("Idade do cliente: "),
                Teclado.leChar("Sexo do cliente: "), new Livro(Teclado.leString("Título do Livro: "),
                Teclado.leString("Autor do livro: "), Teclado.leDouble("Digite o preço do Livro: "), Teclado.leInt("Digite a quantidade de páginas: ")),
                Teclado.leString("Digite seu e-mail: "), Teclado.leString("Digite sua senha: "));
        System.out.println(c1); //c1.toString()

        System.out.println("\nDADOS CLIENTE 2");
        Livro livro2 = new Livro(Teclado.leString("Título do Livro: "),
                Teclado.leString("Autor do livro: "), Teclado.leDouble("Digite o preço do Livro: "), Teclado.leInt("Digite a quantidade de páginas: "));
        Cliente c2 = new Cliente(Teclado.leString("Nome do cliente: "), Teclado.leInt("Idade do cliente: "),
                Teclado.leChar("Sexo do cliente: "), livro2, Teclado.leString("Digite seu e-mail: "), Teclado.leString("Digite sua senha: "));
        System.out.println(c2); //c2.toString()

        System.out.println("\nDADOS CLIENTE 3");
        Livro livro3 = new Livro(Teclado.leString("Título do Livro: "),
                Teclado.leString("Autor do livro: "), Teclado.leDouble("Digite o preço do Livro: "), Teclado.leInt("Digite a quantidade de páginas: "));
        Cliente c3 = new Cliente(Teclado.leString("Nome do cliente: "), Teclado.leInt("Idade do cliente: "),
                Teclado.leChar("Sexo do cliente: "), livro3, Teclado.leString("Digite seu e-mail: "), Teclado.leString("Digite sua senha: "));
        System.out.println(c3); //c3.toString()

        //Relatório Cliente1
        String precoFormatado = String.format("%.2f", c1.getLivro().calcularPrecoPorPagina());
        System.out.println("\n------------- RESUMO CLIENTE " + c1.getNome().toUpperCase() + "-----------------");
        System.out.println("\nO cliente " + c1.getNome() + " está com o livro " + c1.getLivro().getTitulo() + ", e o preço por página deste livro é R$" +
                precoFormatado);
        System.out.println("\n------------- RELATÓRIO CLIENTE " + c1.getNome().toUpperCase() + "-----------------");
        c1.imprimeInformacoes();

        //Relatório Cliente2
        precoFormatado = String.format("%.2f", c2.getLivro().calcularPrecoPorPagina());
        System.out.println("\n------------- RESUMO CLIENTE " + c2.getNome().toUpperCase() + "-----------------");
        System.out.println("\nO cliente " + c2.getNome() + " está com o livro " + c2.getLivro().getTitulo() + ", e o preço por página deste livro é R$" +
                precoFormatado);
        System.out.println("\n------------- RELATÓRIO CLIENTE " + c2.getNome().toUpperCase() + "-----------------");
        c2.imprimeInformacoes();

        //Relatório Cliente3
        precoFormatado = String.format("%.2f", c3.getLivro().calcularPrecoPorPagina());
        System.out.println("\n------------- RESUMO CLIENTE " + c3.getNome().toUpperCase() + "-----------------");
        System.out.println("\nO cliente " + c2.getNome() + " está com o livro " + c3.getLivro().getTitulo() + ", e o preço por página deste livro é R$" +
                precoFormatado);
        System.out.println("\n------------- RELATÓRIO CLIENTE " + c3.getNome().toUpperCase() + "-----------------");
        c3.imprimeInformacoes();

    }
}
