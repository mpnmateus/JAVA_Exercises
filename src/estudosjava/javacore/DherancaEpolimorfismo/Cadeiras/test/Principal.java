package estudosjava.javacore.DherancaEpolimorfismo.Cadeiras.test;

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

        Sala sala = new Sala(cad1, cad2, cad3, cad4);

        System.out.println(sala);
    }
}
