package fatecfranca.lista1.exe2;

public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;
    
    public Cliente(){
    }
    
    public Cliente (int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public void realizarDeposito(float deposito){
        if (deposito < 0) {
            System.out.println ("Valor de depósito inválido!");
        }
        else{
            this.saldo = saldo + deposito;
        }
    }
    
    public void realizarSaque(float saque){
        if (saque < 0 && saque > saldo){
            System.out.println ("Valor de saque inválido!");
        }
        else {
            this.saldo = this.saldo - saque;
        }
    }
    
    public String dadosConta(){
        return "O número da conta é: " + this.numeroConta + "\nO nome do cliente é: " + 
                this.nome + "\nO saldo atual da conta é: " + this.saldo;
    }   
}
