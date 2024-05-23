package estudosjava.javacore.DherancaEpolimorfismo.Cadeiras.domain;

public class Sala {
    private Cadeira cadeira1, cadeira2, cadeira3, cadeira4;

    public Sala(Cadeira cad1, Cadeira cad2, Cadeira cad3, Cadeira cad4){
        this.cadeira1 = cad1;
        this.cadeira2 = cad2;
        this.cadeira3 = cad3;
        this.cadeira4 = cad4;
    }

    public String toString(){
        return String.format(
                "Sala: [ Cadeira 1 = %s, " +
                "Cadeira 2 = %s, " +
                "Cadeira 3 = %s, " +
                "Cadeira 4 = %s ",
                this.cadeira1.toString(), this.cadeira2.toString(), this.cadeira3.toString(),
                this.cadeira4.toString()
        );
    }

    public Cadeira getCadeira1() {
        return cadeira1;
    }

    public void setCadeira1(Cadeira cadeira1) {
        this.cadeira1 = cadeira1;
    }

    public Cadeira getCadeira2() {
        return cadeira2;
    }

    public void setCadeira2(Cadeira cadeira2) {
        this.cadeira2 = cadeira2;
    }

    public Cadeira getCadeira3() {
        return cadeira3;
    }

    public void setCadeira3(Cadeira cadeira3) {
        this.cadeira3 = cadeira3;
    }

    public Cadeira getCadeira4() {
        return cadeira4;
    }

    public void setCadeira4(Cadeira cadeira4) {
        this.cadeira4 = cadeira4;
    }
}
