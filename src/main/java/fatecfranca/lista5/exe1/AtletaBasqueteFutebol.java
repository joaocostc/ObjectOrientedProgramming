package fatecfranca.lista5.exe1;

// A herança nós herdamos códigos e na interface nós implementamos comportamentos.
// A interface veio como uma alternativa para linguagens que não aceita herança múltipla.
public class AtletaBasqueteFutebol implements JogadorBasquete, JogadorFutebol{

    @Override
    public void arremessar() {
        System.out.println("Atleta arremessando.");
    }

    @Override
    public void fazerBandeja() {
        System.out.println("Atleta fazendo bandeja.");
    }

    @Override
    public void enterrar() {
        System.out.println("Atleta enterrando.");
    }

    @Override
    public void fazerCera() {
        System.out.println("Atleta fazendo cera.");
    }

    @Override
    public void fazerGol() {
        System.out.println("Atleta fazendo gol.");
    }

    @Override
    public void baterPenalti() {
        System.out.println("Atleta batendo penalti.");
    }
    
}
