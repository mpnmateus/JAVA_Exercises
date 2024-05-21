package estudosjava.javacore.Cassociacao.Livro.domain;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;
    private int quantidadePaginas;

    public Livro(String titulo, String autor, double preco, int quantidadePaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.quantidadePaginas = quantidadePaginas;
    }

    public Livro (String titulo, String autor, double preco, int quantidadePaginas, int anoPublicacao){
        this(titulo, autor, preco, quantidadePaginas);
        this.anoPublicacao = anoPublicacao;
    }

    public double calcularPrecoPorPagina () {
        return this.preco / this.quantidadePaginas;
    }

    /**
     @Override
     public String toString () {
     return "Livro { Título do livro: " + this.titulo + "\nAutor do livro: " + this.autor + "\nAno da publicação do Livro: " +
     this.anoPublicacao + "\nPreço do livro: R$" + this.preco + "\nQuantidade de páginas do Livro :" + this.quantidadePaginas + "}";
     }
     **/

    @Override
    public String toString() {
        return String.format(
                "Livro [Título = %s, Autor = %s, Publicação = %d, Preco = R$%.2f, Páginas = %d, Preco por Página = R$%.2f]",
                this.titulo, this.autor, this.anoPublicacao, this.preco, this.quantidadePaginas, this.calcularPrecoPorPagina());
    }

    public void setTitulo(String titulo){ this.titulo = titulo; }
    public String getTitulo() { return this.titulo; }

    public void setAutor (String autor) { this.autor = autor; }
    public String getAutor () {return this.autor; }

    public void setAnoPublicacao (int anoPublicacao) { this.anoPublicacao = anoPublicacao; }
    public int getAnoPublicacao () { return this.anoPublicacao; }

    public void setPreco (double preco) { this.preco = preco; }
    public double getPreco() { return this.preco; }

    public void setQuantidadePaginas (int quantidadePaginas) { this.quantidadePaginas = quantidadePaginas; }
    public int getQuantidadePaginas () {return this.quantidadePaginas; }
}
