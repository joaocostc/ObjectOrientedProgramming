package fatecfranca.lista4.exe1;

public class Diretor extends Funcionario{
    private float acoesEmpresa; // quantidade de ações
    
    public Diretor(){
        super();  // chamando construtor sem parâmetro do pai
    }

    public Diretor(float acoesEmpresa, String nome, String endereco, String cpf, float salario) {
        super(nome, endereco, cpf, salario); // chamando o construtor com parâmetro do pai
        this.setAcoesEmpresa(acoesEmpresa);
    }

    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public final void setAcoesEmpresa(float acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override // anula toString() da classe Funcionário
    public String toString() {
        return "Diretor{" + "acoesEmpresa=" + acoesEmpresa + super.toString() +'}';
    }
    
    @Override // anula o calculaSalario() da classe Funcionário
    public float calculaSalario(){
        return this.salario + (this.acoesEmpresa * 8) / 12;
    }
}
