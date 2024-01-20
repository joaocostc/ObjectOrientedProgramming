package fatecfranca.prova1.exe2;

public class Carro extends Veiculo{
    private String corInterior;

    public Carro() {
        super();
    }

    public Carro(String corInterior, String marca) {
        super(marca);
        this.setCorInterior(corInterior);
    }

    public String getCorInterior() {
        return corInterior;
    }

    public final void setCorInterior(String corInterior) {
        this.corInterior = corInterior;
    }

    @Override
    public String mostra() {
        return "Carro{" + "corInterior=" + corInterior + super.mostra() +'}';
    }
}
