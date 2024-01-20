package fatecfranca.lista4.exe1;

public abstract class Funcionario { // classe "abstract" não pode ser instanciada
    protected String nome, endereco, cpf; // pública para as filhas e privada para as outras classes do sistema
    protected float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String endereco, String cpf, float salario) {
        this.setNome(nome); // a partir do momento que define como final, as classes filhas não podem alterar esse atributo
        this.setEndereco(endereco);
        this.setCpf(cpf);
        this.setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public final void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public final void setSalario(float salario) {
        this.salario = salario;
    }

    @Override // anulação de método (herdo método da classe pai, mas eu escrevo esse método novamente na classe)
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + ", salario=" + salario + '}';
    }
    
    public abstract float calculaSalario();
    //Método criado forçadamente, não seria necessária criar (tem a mesma função do do getSalario). 
    // Toda vez que crio uma classe abstrato na classe pai, obrigatoriamente preciso implementar isso nas classes filhas
}
