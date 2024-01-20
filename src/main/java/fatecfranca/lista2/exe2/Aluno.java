package fatecfranca.lista2.exe2;

public class Aluno {
    private int numeroAluno;
    private String nome;
    private int idade;
    private float p1, p2;

    public Aluno() {
    }

    public Aluno(int numeroAluno, String nome, int idade, float p1, float p2) {
        this.setNumeroAluno(numeroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }

    public int getNumeroAluno() {
        return numeroAluno;
    }

    public final void setNumeroAluno(int numeroAluno) {
        String convert = Integer.toString(numeroAluno);
        if (convert.length() == 6){
            this.numeroAluno = numeroAluno;
        }
        else {
            this.numeroAluno = 0;
            System.out.println("O número do aluno deve conter 6 números, vai ficar com 0.");
        }
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else {
            this.nome = "";
            System.out.println("O nome não pode ultrapasar 30 caracteres, vai ficar vazio");
        }
    }

    public int getIdade() {
        return idade;
    }

    public final void setIdade(int idade) {
        if (idade < 0){
            this.idade = 0;
            System.out.println("A idade não pode ser negativa, vai ficar com 0.");
        }
        else {
            this.idade = idade;
        }
    }

    public float getP1() {
        return p1;
    }

    public final void setP1(float p1) {
        if(p1 < 0){
            System.out.println("A nota da prova 1 não pode ser negativa, vai ficar com 0.");
        }
        else {
            this.p1 = p1;
        }
    }

    public float getP2() {
        return p2;
    }

    public final void setP2(float p2) {
        if (p2 < 0 ){
            System.out.println("A nota da prova 2 não pode ser negativa, vai ficar com 0.");
        }
        else {
            this.p2 = p2;
        }
    }
    
    public void notaFinal() {
        float media = (p1 + p2) / 2;
        System.out.println("A média final do aluno é: " + media);
    }
    
    @Override
    public String toString() {
        return "Aluno{" + "numeroAluno=" + numeroAluno + ", nome=" + nome + ", idade=" + idade + '}';
    }
}

