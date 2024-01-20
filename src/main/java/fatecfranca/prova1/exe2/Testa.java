package fatecfranca.prova1.exe2;

public class Testa {
    
    public static void exibe(Veiculo objeto){
        System.out.println(objeto.mostra());
    }

    public static void main(String[] args) {
        Carro objCarro = new Carro ("Marrom", "Fiat");
        exibe(objCarro);
        
        Moto objMoto = new Moto ("Azul", "Yamaha");
        exibe(objMoto);
    }
    
}
