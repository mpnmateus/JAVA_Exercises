package estudosjava.javacore.DherancaEpolimorfismo.Cadeiras.test;

import javax.swing.*;
import java.awt.Color;

import estudosjava.javacore.DherancaEpolimorfismo.Cadeiras.domain.Aluno;
import estudosjava.javacore.DherancaEpolimorfismo.Cadeiras.domain.Cadeira;
import estudosjava.javacore.DherancaEpolimorfismo.Cadeiras.domain.Cor;
import estudosjava.javacore.DherancaEpolimorfismo.Cadeiras.domain.Sala;

public class Principal {
    public static void main(String[] args) {
        //Cria 4 cadeiras solicitando os dados ao user
        System.out.println("--- Cadeira 1: ---");
        Cadeira cad1 = new Cadeira(new Cor(Teclado.leInt("Digite o parâmetro R da 1ª cadeira: "),
                Teclado.leInt("Digite o parâmetro G da 1ª cadeira: "),
                Teclado.leInt("Digite o parâmetro B da 1ª cadeira: ")));

        System.out.println("--- Cadeira 2: ---");
        Cadeira cad2 = new Cadeira(new Cor(Teclado.leInt("Digite o parâmetro R da 2ª cadeira: "),
                Teclado.leInt("Digite o parâmetro G da 2ª cadeira: "),
                Teclado.leInt("Digite o parâmetro B da 2ª cadeira: ")));

        System.out.println("--- Cadeira 3: ---");
        Cadeira cad3 = new Cadeira(new Cor(Teclado.leInt("Digite o parâmetro R da 3ª cadeira: "),
                Teclado.leInt("Digite o parâmetro G da 3ª cadeira: "),
                Teclado.leInt("Digite o parâmetro B da 3ª cadeira: ")));

        System.out.println("--- Cadeira 4: ---");
        Cadeira cad4 = new Cadeira(new Cor(Teclado.leInt("Digite o parâmetro R da 4ª cadeira: "),
                Teclado.leInt("Digite o parâmetro G da 4ª cadeira: "),
                Teclado.leInt("Digite o parâmetro B da 4ª cadeira: ")));

        //Cria uma sala com todos parâmetros necessários
        Sala sala = new Sala(cad1, cad2, cad3, cad4);

        //Imprime informações da sala
        System.out.println(sala);

        //Seis alunos tentam entrar na sala. Só há quatro cadeiras disponíveis.
        for (int i = 1; i <= 6; i++){
            Aluno aluno;
            if (cad1.getAluno() == null || cad2.getAluno() == null || cad3.getAluno() == null ||
                    cad4.getAluno() == null) {
                aluno = new Aluno(Teclado.leString("\nDigite o nome do " + i + "º aluno: "),
                        Teclado.leInt("Digite a idade do " + i + "º aluno: "));
                if(i ==1)
                    cad1.setAluno(aluno);
                if(i ==2)
                    cad2.setAluno(aluno);
                if(i ==3)
                    cad3.setAluno(aluno);
                if(i ==4)
                    cad4.setAluno(aluno);

                System.out.println(aluno);
            } else {
                System.out.println("Não há mais lugar na sala para o " + i + "º aluno.");
            }
        }

        //Procura um aluno na sala abrindo uma janela na cor da cadeira em que eke está sentado
        String nome = Teclado.leString("Digite o nome do aluno em que se quer saber a cor da cadeira: ");

        int r = 0;
        int g = 0;
        int b = 0;

        if (cad1.getAluno().getNome() == nome){
            r = cad1.getCor().getR();
            g = cad1.getCor().getR();
            b = cad1.getCor().getR();
        }
        if (cad2.getAluno().getNome() == nome){
            r = cad2.getCor().getR();
            g = cad2.getCor().getR();
            b = cad2.getCor().getR();
        }
        if (cad3.getAluno().getNome() == nome){
            r = cad3.getCor().getR();
            g = cad3.getCor().getR();
            b = cad3.getCor().getR();
        }
        if (cad4.getAluno().getNome() == nome){
            r = cad4.getCor().getR();
            g = cad4.getCor().getR();
            b = cad4.getCor().getR();
        }

        JFrame a = new JFrame();
        a.setSize(200, 200);
        a.setBackground(new Color(r, g, b));
        a.setVisible(true);
    }
}
