package estudosjava.javacore.DherancaEpolimorfismo.Cadeiras.domain;

public class CadeiraComRodinhas extends Cadeira { //um tipo de cadeira (cadeira com rodinhas)
    private Data dataUltimaManutencao; //manutencao das rodinhas

    public CadeiraComRodinhas(Cor cor, Data dataUltimaManutencao) {
        super(cor);
        this.dataUltimaManutencao = dataUltimaManutencao;
    }

    @Override
    public String toString(){
        return String.format(
                "Cadeira com Rodinhas: [Cor da cadeira = %s, Data da última manutenção = %s",
                super.toString(), this.dataUltimaManutencao.toString()
        );
    }



    public Data getDataUltimaManutencao() {
        return dataUltimaManutencao;
    }

    public void setDataUltimaManutencao(Data dataUltimaManutencao) {
        this.dataUltimaManutencao = dataUltimaManutencao;
    }
}
