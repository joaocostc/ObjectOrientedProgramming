package fatecfranca.lista2.exe0;

public class TestaPc {

    public static void main(String[] args) {
        Pc obj1 = new Pc();
        obj1.setMarca("Lenovo");
        obj1.setModelo("IdeaPad 3");
        obj1.setProcessador("Ryzen 7");
        obj1.setDisco(128);
        obj1.setRam(8);
          
        System.out.println("Marca: " + obj1.getMarca() + "\nModelo: " + 
                obj1.getModelo() + "\nProcessador: " + obj1.getProcessador() +
                "\nDisco: " + obj1.getDisco() + "\nRam: " + obj1.getRam());
        
        Pc obj2 = new Pc("Dell", "Vosto 15", "i5", 32, 512);
        
        Pc obj3 = new Pc("Dell", "Vosto 15", "i5", 19, 200);
        
        System.out.println(obj3.toString());
        
    }
}
