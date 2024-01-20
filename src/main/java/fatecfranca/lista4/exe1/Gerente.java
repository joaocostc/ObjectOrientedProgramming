package fatecfranca.lista4.exe1;

public class Gerente extends Funcionario {
    private float bonus;
    
    public Gerente(){
        super(); // chamando construtor sem parâmetro do pai
    }

    public Gerente(float bonus, String nome, String endereco, String cpf, float salario) {
        super(nome, endereco, cpf, salario); // chamando o construtor com parâmetro do pai
        this.setBonus(bonus);
    }

    public float getBonus() {
        return bonus;
    }

    public final void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override // anula toString() da classe Funcionário
    public String toString() {
        return "Gerente{" + "bonus=" + bonus + super.toString() + '}';
    } 
    
    @Override // anula o calculaSalario() da classe Funcionário
    public float calculaSalario(){
        return this.salario + this.bonus;
    }
}
