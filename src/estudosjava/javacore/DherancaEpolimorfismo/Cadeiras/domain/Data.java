package estudosjava.javacore.DherancaEpolimorfismo.Cadeiras.domain;

public class Data {
    private int dia, mes, ano;

    public Data (int dia, int mes, int ano){
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    @Override
    public String toString(){
        return String.format(
                "%d/%d/%d",
                this.dia, this.mes, this.ano
        );
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
