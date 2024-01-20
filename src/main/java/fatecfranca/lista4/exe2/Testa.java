package fatecfranca.lista4.exe2;

public class Testa {

    public static void show(Animal objeto){ // Polimorfismo (herança e anulação de método é necessário para ter o polimorfismo)
        System.out.println(objeto.move());
        System.out.println(objeto.toString());
    }    
    
    public static void main(String[] args) {
        
        Snake objSnake = new Snake (false, false, "Naja", 50);
        show(objSnake);
        
        Horse objHorse = new Horse (true, "Pé de Pano", 20);
        show(objHorse);
    }
}
