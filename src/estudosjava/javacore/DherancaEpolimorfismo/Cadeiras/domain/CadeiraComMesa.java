package estudosjava.javacore.DherancaEpolimorfismo.Cadeiras.domain;

public class CadeiraComMesa extends Cadeira {
    private double larguraMesa, profundidadeMesa; //Largura e Profundidade da mesa acoplada

    public CadeiraComMesa(Cor cor, double largura, double profundidade){
        super(cor);
        this.larguraMesa = largura;
        this.profundidadeMesa = profundidade;
    }

    @Override
    public String toString(){
        return String.format(
                "Cadeira com Mesa: [Cor: %s, Largura: %f, Profundidade: %f]",
                super.toString(), this.larguraMesa, this.profundidadeMesa
        );
    }

    public double getLarguraMesa() {
        return larguraMesa;
    }

    public void setLarguraMesa(double larguraMesa) {
        this.larguraMesa = larguraMesa;
    }

    public double getProfundidadeMesa() {
        return profundidadeMesa;
    }

    public void setProfundidadeMesa(double profundidadeMesa) {
        this.profundidadeMesa = profundidadeMesa;
    }
}
