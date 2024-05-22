package estudosjava.javacore.Cassociacao.Mercado.domain;

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String n, double p, Data dV){
        this.nome = n;

        if (p > 0){
            this.preco = p;
        } else {
            this.preco = 0;
            System.out.println("O preço do produto deve ser maior do que 0.");
        }


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
