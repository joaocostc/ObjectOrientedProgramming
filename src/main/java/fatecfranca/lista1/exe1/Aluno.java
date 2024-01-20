package fatecfranca.lista1.exe1;

public class Aluno {
    public int numero, idade;
    public String nome;
    public float p1, p2;
    // construtores
    
    public Aluno() {    
    }
    
    public Aluno (int numero, int idade, String nome, float p1, float p2) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public String dadosAluno(){
        return "Número:" + this.numero + "\nNome: " + this.nome + "\nIdade: " + this.idade
        + "\nMédia: " + this.notaFinal() + "\nFoi " + this.passou();
    }
    
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    
    public String passou(){
        return (this.notaFinal() >= 6) ? "Aprovado": "Reprovado";
    }
}
