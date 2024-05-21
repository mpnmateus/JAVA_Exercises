package estudosjava.javacore.Cassociacao.Funcionario.domain;

public class Calculadora {
    private int memoria;
    private String cor;

    public Calculadora(String cor){
        this.memoria = 0;
        this.cor = cor;
    }

    //métodos das operações matemáticas
    public double soma (double a, double b){
        return a + b;
    }

    public double subtracao (double a, double b){
        return a - b;
    }
    public double multiplicacao (double a, double b){
        return a * b;
    }
    public double divisao (double a, double b){
        return a / b;
    }

    public int elevaAoQuadrado (int a){
        return (int )Math.pow(a, 2);
    }
    public int elevaAoCubo (int a){
        return (int) Math.pow(a, 3);
    }

    //método de impressão

    public void imprimeInfo(){
        System.out.println("Memória: " + memoria);
        System.out.println("Cor: " + cor);
    }

    //getters and setters
    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
