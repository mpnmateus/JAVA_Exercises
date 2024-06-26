package estudosjava.javacore.Earrays.ExerciciosGenericos.test;

public class ExemploArrays02 {

    public int procuraNome(String[] nomes, String nome){
        for (int i = 0; i < nomes.length; i++){
            if (nomes[i].equalsIgnoreCase(nome))
                return i;
        }
        return -1;
    }

    public double calculaMedia(double[] valores){
        double somaValores = 0;
        for (int i = 0; i < valores.length; i++){
            somaValores += valores[i];
        }
        return somaValores / valores.length;
    }


    public static void main(String[] args) {
        String [] nomes = {"João", "Mateus", "Carlos", "Tiririca"};
        String nome = "Mateus";

        double [] valores = {10, 5.2, 6.3, 7.6, 8};

        ExemploArrays02 e = new ExemploArrays02();

        int posicaoNome = e.procuraNome(nomes, nome);
        double media = e.calculaMedia(valores);

        System.out.println("A posição do nome procurado (" + nome + "), é : " + posicaoNome);
        System.out.println("A média dos valores é: "+ media);


    }

}
