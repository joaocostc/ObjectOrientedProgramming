package fatecfranca.prova1.exe2;

public abstract class Veiculo {
    protected String marca;

    public Veiculo() {
    }

    public Veiculo(String marca) {
        this.setMarca(marca);
    }

    public String getMarca() {
        return marca;
    }

    public final void setMarca(String marca) {
        this.marca = marca;
    }

    public String mostra() {
        return "Veiculo{" + "marca=" + marca + '}';
    }
}
