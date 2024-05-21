package estudosjava.javacore.Cassociacao.Livro.domain;

public class Cliente {
    private String nome;
    private int idade;
    private char sexo;
    private String email;
    private String senha;
    private Livro livro;

    public Cliente (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Cliente (String nome, int idade, char sexo, Livro livro) {
        this(nome, idade);
        this.sexo = sexo;
        this.livro = livro;
    }

    public Cliente (String nome, int idade, char sexo, Livro livro,
                    String email, String senha) {
        this(nome, idade, sexo, livro);
        this.email = email;
        this.senha = senha;
    }

    @Override
    public String toString (){
        String strLivro;
        if (this.livro == null)
            strLivro = "Indefinido";
        else
            strLivro = this.livro.toString();

        return String.format(
                "Cliente [Nome = %s, Idade = %d, Sexo = %c, E-mail = %s, Senha = %s, Livro = %s]",
                this.nome, this.idade, this.sexo, this.email, this.senha, strLivro
        );
    }

    public void imprimeInformacoes () {

        System.out.println(this);

        /**
         System.out.println("\nO nome do cliente é: "+ this.nome);
         System.out.println("\nA idade do cliente é: " + this.idade);
         System.out.println("\nO sexo do cliente é: " + this.sexo);
         System.out.println("\nO e-mail do cliente é: " + this.email);
         System.out.println("\nA senha do cliente é: " + this.senha);
         if (livro.getTitulo() != null) {
         System.out.println("--------------------------------------");
         System.out.println("\nO cliente possui um livro, cujos dados são: ");
         System.out.println("\n{ Título do Livro: " + livro.getTitulo() + "}");
         System.out.println("\n{ Autor do livro: " + livro.getAutor() + "}");
         System.out.println("\n{ Ano da publicaçãp do livro: " + livro.getAnoPublicacao() + "}");
         System.out.println("\n { Preço do livro: " + livro.getPreco() + "}");
         System.out.println("\nQuantidade de páginas do livro: " + livro.getQuantidadePaginas() + "}");
         }
         **/
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
