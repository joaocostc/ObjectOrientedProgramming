package fatecfranca.lista5.exe1;

public class Testa {

    public static void main(String[] args) {
        JogadorBasquete objJB = new AtletaBasqueteFutebol();
        
        objJB.arremessar();
        objJB.enterrar();
        objJB.fazerBandeja();
        
        AtletaBasqueteFutebol objABF = new AtletaBasqueteFutebol();
        
        objABF.arremessar();
        objABF.fazerBandeja();
        objABF.enterrar();
        objABF.fazerCera();
        objABF.baterPenalti();
        objABF.fazerGol();
    }
    
}
