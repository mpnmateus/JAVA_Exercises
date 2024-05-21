package java.javacore.Cassociacao.Mercado.domain;

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String n, double p, Data dV){
        this.nome = n;
        this.preco = p;
        this.dataValidade = dV;
    }

    //Impressão
    public String toString(){
        return String.format(
                "Produto: [Nome = %s, Preço = %d, Data de Validade = %s]",
                this.nome, this.preco, this.dataValidade
        );
    }

    //Método produto vencido
    public boolean verificaProdutoVencido(Data d){
        if(d.getAno() < dataValidade.getAno()){
            return false;
        } else if (d.getMes() < dataValidade.getMes()){
            return false;
        } else if (d.getDia() < dataValidade.getDia()) {
            return false;
        } else {
            return true;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }
}
