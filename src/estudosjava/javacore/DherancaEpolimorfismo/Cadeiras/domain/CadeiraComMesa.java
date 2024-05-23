package estudosjava.javacore.DherancaEpolimorfismo.Cadeiras.domain;

public class CadeiraComMesa extends Cadeira {
    private double largura, profundidade;

    public CadeiraComMesa(Cor cor, double largura, double profundidade){
        super(cor);
        this.largura = largura;
        this.profundidade = profundidade;
    }
}
