package estudosjava.javacore.Earrays.ExerciciosGenericos.test;

import estudosjava.javacore.Earrays.ExerciciosGenericos.domain.Exercicios01;

public class Exercicios01Test {

    public static void main(String[] args) {
        Exercicios01 e = new Exercicios01 ();
        int [] arrayEx1 = {1,2,3,4,5,6,7,8,9};

        int [] a = {507, -15, 147, 2194, 300, 27, 888, -110, 0, 675};

        Exercicios01 teste = new Exercicios01();
        int [] valores = {1,2,3,4,5,6,7,8,9};

        e.exercicio1(arrayEx1);

        System.out.println(a[7]+2);
        System.out.println(a[a.length-1]);

        teste.imprime01(valores);
    }
}
