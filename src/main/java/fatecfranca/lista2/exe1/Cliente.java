package fatecfranca.lista2.exe1;

public class Cliente {
    
    private String numeroConta, numeroAgencia, nome;
    private float saldo;

    public Cliente() {
    }

    public Cliente(String numeroConta, String numeroAgencia, String nome, 
            float saldo) {
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public final void setNumeroConta(String numeroConta) {
        if (numeroConta.length() == 8){
            if(numeroConta.charAt(6) == '-'){
                this.numeroConta = numeroConta;
            }
        }
        else {
            this.numeroConta = "";
            System.out.println("Conta inválida, vai ficar vazia.");
        }
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public final void setNumeroAgencia(String numeroAgencia) {
        if(numeroAgencia.length() == 6 && numeroAgencia.charAt(4) == '-'){
            this.numeroAgencia = numeroAgencia;
        }
        else {
            this.numeroAgencia = "";
            System.out.println("Número de agência inválida, vai ficar vazia.");
        }
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        if(nome.length() > 30){
            this.nome = "";
            System.out.println("Nome inválido, vai ficar vazio.");
        } 
        else { 
            this.nome = nome;
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public final void setSaldo(float saldo) {
        if (saldo < 0){
            System.out.println("Saldo insufuciente.");
        }
        else {
            this.saldo = saldo;
        }
    }
    
    public void realizarDeposito(float x){
        this.setSaldo(this.saldo + x);
    }
    
    public void realizarSaque(float x){
        this.setSaldo (this.saldo - x);
    }

    @Override
    public String toString() {
        return "Cliente{" + "numeroConta=" + numeroConta + ", numeroAgencia=" + 
                numeroAgencia + ", nome=" + nome + ", saldo=" + saldo + '}';
    }
}
