package fatecfranca.lista4.exe1;

public class Assistente extends Funcionario{
    private float horaExtra;
    
    public Assistente(){
        super(); // chamando construtor sem parâmetro do pai
    }

    public Assistente(float horaExtra, String nome, String endereco, String cpf, float salario) {
        super(nome, endereco, cpf, salario); // chamando o construtor com parâmetro do pai
        this.setHoraExtra(horaExtra);
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public final void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override // anula toString() da classe Funcionario
    public String toString() {
        return "Assistente{" + "horaExtra=" + horaExtra + super.toString() +'}';
    } 
    
    @Override // anula o calculaSalario() da classe Funcionario
    public float calculaSalario(){
        return this.salario + (this.horaExtra * 30);
    }
}
