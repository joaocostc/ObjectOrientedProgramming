package fatecfranca.lista1.exe2;

public class TestaCliente {

    public static void main(String[] args) {
        
        Cliente obj1 = new Cliente();
        
        obj1.numeroConta = 1234567;
        obj1.numeroAgencia = 220021558;
        obj1.nome = "Fulano";
        obj1.saldo = 22520.80f;
        
        obj1.realizarDeposito(5.000f);
        obj1.realizarSaque(3.000f);
        System.out.println(obj1.dadosConta());
        
        
        Cliente obj2 = new Cliente(123459876, 220215484, "Beltrano", 10520.95f);
        
        obj2.realizarDeposito(5.000f);
        obj2.realizarSaque(3.000f);
        System.out.println(obj2.dadosConta());
        
    }
    
}
