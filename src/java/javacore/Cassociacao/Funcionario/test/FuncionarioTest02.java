package java.javacore.Cassociacao.Funcionario.test;

import java.javacore.Cassociacao.Funcionario.domain.Calculadora;
import java.javacore.Cassociacao.Funcionario.domain.Empresa;
import java.javacore.Cassociacao.Funcionario.domain.FuncionarioCaixa;
import java.javacore.Cassociacao.Livro.test.Teclado;

public class FuncionarioTest02 {
    public static void main (String args[])
    {
        Calculadora calc = new Calculadora(Teclado.leString("Digite uma cor para a Calculadora: "));
        //public FuncionarioCaixa(String n, String e, char s, Calculadora c)
        FuncionarioCaixa funcionario = new FuncionarioCaixa(Teclado.leString("Digite o nome do funcionário: "),
                Teclado.leString("Digite o endereço do funcionário: "),
                Teclado.leChar("Digite o gênero do funcionário: "),
                calc);

        System.out.printf("%n------ Calculadora %S ------%n", (funcionario.getCalculadora()).getCor());
        double n1 = Teclado.leDouble("-> Digite o primeiro número: ");
        double n2 = Teclado.leDouble("-> Digite o segundo número: ");
        System.out.printf("Soma: %.2f", funcionario.soma(n1, n2));
        System.out.printf("%nSubtração: %.2f", funcionario.subtracao(n1, n2));
        System.out.printf("%nMultiplicação: %.2f", funcionario.multiplicacao(n1, n2));
        System.out.printf("%nDivisão: %.2f", funcionario.divisao(n1, n2));
        int n3 = Teclado.leInt("\n-> Digite um número: ");
        System.out.printf("Elevado ao Quadrado: %d", funcionario.elevaAoQuadrado(n3));
        System.out.printf("Elevado ao Cubo: %d%n", funcionario.elevaAoCubo(Teclado.leInt("\n-> Digite um número: ")));
        System.out.println("------------------------------");

        Calculadora calc2 = new Calculadora(Teclado.leString("\nDigite uma cor para a Calculadora: "));
        //public FuncionarioCaixa(String n, String e, char s, Calculadora c)
        FuncionarioCaixa funcionario2 = new FuncionarioCaixa(Teclado.leString("Digite o nome do funcionário: "),
                Teclado.leString("Digite o endereço do funcionário: "),
                Teclado.leChar("Digite o gênero do funcionário: "),
                calc2);
        //public Empresa(String n, FuncionarioCaixa fC1, FuncionarioCaixa fC2)
        Empresa empresa = new Empresa(Teclado.leString("\nDigite o nome da Empresa: "),
                funcionario, funcionario2);

        System.out.println();
        empresa.imprimeInfo();
        //calc2.setCor("Preto");
        (funcionario2.getCalculadora()).setCor("Preto");
    }
}
