package java.javacore.Cassociacao.Funcionario.test;

import java.javacore.Cassociacao.Funcionario.domain.Calculadora;
import java.javacore.Cassociacao.Funcionario.domain.Empresa;
import java.javacore.Cassociacao.Funcionario.domain.FuncionarioCaixa;
import java.javacore.Cassociacao.Livro.test.Teclado;

public class FuncionarioTest {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora(Teclado.leString("Digite a cor da calculadora: "));
        FuncionarioCaixa funcionario = new FuncionarioCaixa(Teclado.leString("Digite o nome do Funcionário do Caixa: "),
                Teclado.leString("Digite o endereço do Funcionário do Caixa: "), Teclado.leChar("Digite o gênero do Funcionário do Caixa: "),
                calc);
        FuncionarioCaixa funcionario2 = new FuncionarioCaixa(Teclado.leString("Digite o nome do 2º Funcionário do Caixa: "),
                Teclado.leString("Digite o endereço do 2º Funcionário do Caixa: "), Teclado.leChar("Digite o gênero do 2º Funcionário do Caixa: "), calc);
        Empresa empresa1 = new Empresa(Teclado.leString("Informe o nome da Empresa: "),
                funcionario, funcionario2);

        //Operações e impressões para funcionario
        funcionario.soma(2, 2);
        funcionario.subtracao(5, 4);
        funcionario.multiplicacao(2, 3);
        funcionario.divisao(6, 3);
        funcionario.elevaAoQuadrado(7);
        funcionario.elevaAoCubo(8);
        funcionario.imprimeInfo();

        //Impressão dados da Empresa
        empresa1.toString();
    }
}
