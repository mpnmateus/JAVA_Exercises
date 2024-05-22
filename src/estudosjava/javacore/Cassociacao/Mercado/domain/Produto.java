package estudosjava.javacore.Cassociacao.Mercado.domain;

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
        return
                String.format(
                "\n[Nome = %s, \nPreço = %f, \nData de Validade = %s]",
                this.nome, this.preco, dataValidade.toString()
        );
    }

    //Método produto vencido
    /**
     * Retorna o false se o produto não está vencido de acordo com a dataRecebida (data atual) e a dataValidade.
     * Retorna o true se o produto está vencido de acordo com a dataRecebida.
     */
    public boolean verificaProdutoVencido(Data dataRecebida){
        if(dataRecebida.getAno() < dataValidade.getAno())
            return false;
        else if (dataRecebida.getAno() == dataValidade.getAno())
            if (dataRecebida.getMes() < dataValidade.getMes())
                return false;
            else if (dataRecebida.getMes() == dataValidade.getMes())
                if (dataRecebida.getDia() < dataValidade.getDia())
                    return false;
        return true;
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
