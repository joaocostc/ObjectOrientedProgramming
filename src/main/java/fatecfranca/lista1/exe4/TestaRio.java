package fatecfranca.lista1.exe4;

public class TestaRio {

    public static void main(String[] args) {
        Rio obj1 = new Rio();
        obj1.nome = "Rio Paraná";
        obj1.chover(2);
        obj1.poluir();
        System.out.println(obj1.mostra());
        
        Rio obj2 = new Rio("Tietê", 10, true);
        obj2.ensolarar(3);
        obj2.limpar();
        System.out.println(obj2.mostra());
        
    }
    
}
