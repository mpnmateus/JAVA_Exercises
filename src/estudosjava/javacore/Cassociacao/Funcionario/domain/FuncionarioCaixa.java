package estudosjava.javacore.Cassociacao.Funcionario.domain;

public class FuncionarioCaixa {
    private String nome;
    private String endereco;
    private char sexo;
    private Calculadora calculadora;
    private double resultadoSoma;
    private double resultadoSubtracao;
    private double resultadoMultiplicacao;
    private double resultadoDivisao;
    private int resultadoElevaAoQuadrado;
    private int resultadoElevaAoCubo;



    public FuncionarioCaixa(){
        this.nome = "Funcionário";
        this.endereco = "Endereco";
        this.sexo = 'F';
        //this.calculadora = calculadora;
        Calculadora calculadora = new Calculadora("Cor Padrão");
    }
    public FuncionarioCaixa(String nome, String endereco, char sexo, Calculadora calculadora){
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.calculadora = calculadora;
    }

    //métodos que herdam funções de cálculo do objeto calculadora
    public double soma(double a, double b){
        this.resultadoSoma = calculadora.soma(a, b);
        return resultadoSoma;
    }
    public double subtracao(double a, double b){
        this.resultadoSubtracao = calculadora.subtracao(a, b);
        return resultadoSubtracao;
    }
    public double multiplicacao(double a, double b){
        this.resultadoMultiplicacao = calculadora.multiplicacao(a, b);
        return resultadoMultiplicacao;
    }
    public double divisao(double a, double b){
        this.resultadoDivisao = calculadora.divisao(a, b);
        return resultadoDivisao;
    }
    public int elevaAoQuadrado(int a){
        this.resultadoElevaAoQuadrado = calculadora.elevaAoQuadrado(a);
        return resultadoElevaAoQuadrado;
    }
    public int elevaAoCubo(int a){
        this.resultadoElevaAoCubo = calculadora.elevaAoCubo(a);
        return resultadoElevaAoCubo;
    }

    //Método de impressão
    @Override
    public String toString(){
        return String.format(
                "Funcionário Caixa: [ Nome = %s, Endereço = %s, Sexo = %c, " +
                        "\nResultado da soma = %s, \nResultado da subtração = %s, \nResultado da multiplicação = %s, " +
                        "\nResultado da Divisão = %s, \nResultado da elevação ao Quadrado = %s, " +
                        "\nResultado da elevação ao cubo = %s ]",
                this.nome, this.endereco, this.sexo,
                this.resultadoSoma, this.resultadoSubtracao, this.resultadoMultiplicacao, this.resultadoDivisao,
                this.resultadoElevaAoQuadrado, this.resultadoElevaAoCubo
        );
    }
    public void imprimeInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Gênero: " + sexo);
        System.out.println("-> Calculadora <-");
        calculadora.imprimeInfo();//classe Calculadora
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Calculadora getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(Calculadora calculadora) {
        this.calculadora = calculadora;
    }
}
