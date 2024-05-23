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
        return "-- Cadeira -- " + "\nCor: " + this.cor.toString() + strAluno;

    }



}
