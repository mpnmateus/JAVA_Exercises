package estudosjava.javacore.Earrays.ExerciciosGenericos.test;

public class ExemploArrays01 {

    public static void main(String[] args) {
        double[] d = new double[100]; //posições de 0 até 99

        d[3] = 19;
        d[75] = 32;

        System.out.println("==> Tamanho do array: " + d.length);

        for(int i = 0; i < d.length; i++){
            d[i] = i;
        }

        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }

    }


}
