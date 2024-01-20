package fatecfranca.lista5.exe1;

// Interfaces servem para definir comportamentos de uma classe. São úteis para tratamento de eventos do usuário. 
// Você quer jogar volei? Você tem que saber sacar, fazer rodizio e cortar. Você quer jogar basquete? Você tem que saber enterrar, arremessar e fazer bandeja.
public class AtletaBasqueteVolei implements JogadorBasquete, JogadorVolei{ // Uma classe pode implementar várias interfaces.

    @Override
    public void sacar() {
        System.out.println("Atleta sacando.");
    }

    @Override
    public void rodizio() {
        System.out.println("Atleta fazendo rodizio.");
    }

    @Override
    public void cortar() {
        System.out.println("Atleta cortando.");
    }

    @Override
    public void arremessar() {
        System.out.println("Atleta arremesando.");
    }

    @Override
    public void fazerBandeja() {
        System.out.println("Atleta fazendo bandeja.");
    }

    @Override
    public void enterrar() {
        System.out.println("Atleta enterrando.");
    }
}
