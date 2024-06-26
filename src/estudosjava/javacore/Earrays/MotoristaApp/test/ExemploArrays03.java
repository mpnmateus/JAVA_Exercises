package estudosjava.javacore.Earrays.MotoristaApp.test;

import estudosjava.javacore.Earrays.MotoristaApp.domain.MotoristaApp;

public class ExemploArrays03 {

    public void imprimeAvaliacoesMotorista(MotoristaApp[] motoristas, String nome) {
        System.out.println("Avaliações do motorista "+nome+":");
        for (int i = 0; i < motoristas.length; i++)
            if (motoristas[i] != null)
                if (motoristas[i].getNome().equalsIgnoreCase(nome)) //o nome do motorista está dentro do objeto
                    motoristas[i].imprimeAvaliacoes();
    }

    public static void main(String[] args) {
        MotoristaApp[] motoristas = new MotoristaApp[10];
        for (int i = 0; i < motoristas.length; i++) { //inicializar todas as posições com objetos
            motoristas[i] = new MotoristaApp("Fulano " + i, 100); //instanciar um objeto do tipo MotoristaApp para cada índice do array
        }

        //Inserir uma avaliação para um motorista específico (verificado através do nome)
        String nomeMotorista = Teclado.leString("Digite o nome do motorista para inserir a avaliação:");

        for(int i=0; i<motoristas.length; i++)
            if(motoristas[i].getNome().equalsIgnoreCase(nomeMotorista))
                if(motoristas[i].insereAvaliacao(Teclado.leDouble("Digite a nota do motorista" + nomeMotorista + ": ")))
                    System.out.println("Avaliação inserida com sucesso!");
                else
                    System.out.println("Erro ao inserir avaliação =(");

        ExemploArrays03 e = new ExemploArrays03();
        e.imprimeAvaliacoesMotorista(motoristas, Teclado.leString("Digite o nome do motorista: "));


    }

}