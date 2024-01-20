package fatecfranca.prova1.exe2;

public class Moto extends Veiculo{
    private String corCarenagem;

    public Moto() {
        super();
    }

    public Moto(String corCarenagem, String marca) {
        super(marca);
        this.setCorCarenagem(corCarenagem);
    }

    public String getCorCarenagem() {
        return corCarenagem;
    }

    public final void setCorCarenagem(String corCarenagem) {
        this.corCarenagem = corCarenagem;
    }

    @Override
    public String mostra() {
        return "Moto{" + "corCarenagem=" + corCarenagem + super.mostra() +'}';
    }  
}
