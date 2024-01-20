package fatecfranca.lista5.exe2;

public class Pessoa extends Animal implements Cidadao, Contribuinte, Professor {
    
    private int rg;
    private int cpf;
    
    @Override
    public void vota() {
        System.out.println("Pessoa votou!");
    }

    @Override
    public void tiraRG() {
        this.rg = (int) (Math.random() * 100); // Biblioteca para gerar um número randômico
        System.out.println("RG: " + this.rg);
    }

    @Override
    public void pagaIR() {
        System.out.println("Pessoa pagou Imposto de Renda!");
    }

    @Override
    public void tiraCPF() {
        this.cpf = (int) (Math.random() * 100); // Biblioteca para gerar um número randômico
        System.out.println("CPF: " + this.cpf);
    }

    @Override
    public void ensina() {
        System.out.println("Pessoa ensinou!");
    }

    @Override
    public void trabalha() {
        System.out.println("Pessoa trabalhou!");
    }
}