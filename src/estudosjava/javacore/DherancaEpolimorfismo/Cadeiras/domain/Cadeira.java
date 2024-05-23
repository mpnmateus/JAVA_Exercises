package estudosjava.javacore.DherancaEpolimorfismo.Cadeiras.domain;

public class Cadeira {
    private Cor cor;
    private Aluno aluno; //indica se o aluno está ocupando a cadeira.

    public Cadeira(Cor cor){ //Uma cadeira criada não está ocupada (sem atributo de aluno no construtor)
        this.cor = cor;
    }

    @Override
    public String toString() {
        String strAluno = "";
        if (aluno != null) {
            strAluno += "Aluno = ";
            strAluno += aluno.toString();
        }
        return this.cor.toString() + strAluno;

    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
