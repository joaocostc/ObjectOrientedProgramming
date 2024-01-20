package fatecfranca.lista2.exe1;

public class TestaCliente {

    public static void main(String[] args) {
        Cliente obj1 = new Cliente("123456-7", "1234-5", "Fulano", 1000);
        obj1.realizarDeposito(1000);
        obj1.realizarSaque(500);
        System.out.println(obj1.toString());
        
        Cliente obj2 = new Cliente("1234-7", "124-5", "Beltrano", 1000);
        obj2.realizarDeposito(500);
        obj2.realizarSaque(2000);
        System.out.println(obj2.toString());
    }
    
}
