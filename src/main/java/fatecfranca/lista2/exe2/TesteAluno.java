package fatecfranca.lista2.exe2;

public class TesteAluno {
    
    public static void main(String[] args) {
        Aluno obj1 = new Aluno (123456, "Fulano", 27, 8,8);
        obj1.notaFinal();
        System.out.println(obj1.toString());
        
        Aluno obj2 = new Aluno (123456, "Ciclano", 33, 10,7);
        obj2.notaFinal();
        System.out.println(obj2.toString());
    } 
}
