package estudosjava.javacore.Cassociacao.Funcionario.domain;

public class Empresa {
    private String nome;
    private FuncionarioCaixa funcionarioCaixa1;
    private FuncionarioCaixa funcionarioCaixa2;

    //Construtores
    public Empresa(String nome, FuncionarioCaixa fC1, FuncionarioCaixa fC2){
        this.nome = nome;
        this.funcionarioCaixa1 = fC1;
        this.funcionarioCaixa2 = fC2;
    }
    public Empresa(String nome){
        this.nome = nome;
        this.funcionarioCaixa1 = null;
        this.funcionarioCaixa2 = null;
    }
    public Empresa(){
        this.funcionarioCaixa1 = null;
        this.funcionarioCaixa2 = null;
        this.nome = "FuncionarioPadrão";
    }

    //Método de impressão
    @Override
    public String toString(){
        return String.format(
                "Empresa: [Nome = %s, \nFuncionario Caixa 01 = %s, \nFuncionario Caixa 02 = %s]",
                this.nome, this.funcionarioCaixa1, this.funcionarioCaixa2
        );
    }
    public void imprimeInfo(){
        System.out.println("------ DADOS DA EMPRESA ------");
        System.out.println("Razão Social: " + nome);
        System.out.println("-------- Funcionários --------");
        funcionarioCaixa1.imprimeInfo();//imprimeInfo() da classe FuncionarioCaixa
        System.out.println();
        funcionarioCaixa2.imprimeInfo();//imprimeInfo() da classe FuncionarioCaixa
        System.out.println("------------------------------");
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FuncionarioCaixa getFuncionarioCaixa1() {
        return funcionarioCaixa1;
    }

    public void setFuncionarioCaixa1(FuncionarioCaixa fC1) {
        this.funcionarioCaixa1 = fC1;
    }

    public FuncionarioCaixa getFuncionarioCaixa2() {
        return funcionarioCaixa2;
    }

    public void setFuncionarioCaixa2(FuncionarioCaixa fC2) {
        this.funcionarioCaixa2 = fC2;
    }
}
