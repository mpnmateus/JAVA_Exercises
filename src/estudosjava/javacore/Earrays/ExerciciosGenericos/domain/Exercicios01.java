package estudosjava.javacore.Earrays.ExerciciosGenericos.domain;

public class Exercicios01 {

    public void exercicio1(int [] array){
        for (int i = array.length-1; i >=0; i--)
            System.out.println(array[i]);

    }

    public void imprime01(int [] array){
        for (int i = 0; i < array.length; i++)
            if (i % 2 == 0)
                System.out.println(array[i++]+ "");
            else
                System.out.println(array[i--]+ "");
    }

}
