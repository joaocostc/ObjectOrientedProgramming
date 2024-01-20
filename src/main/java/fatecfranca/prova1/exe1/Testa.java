package fatecfranca.prova1.exe1;

public class Testa {

    public static void main(String[] args) {
        
        ItemOrdem objIO1 = new ItemOrdem ("Jogo de velas ignição");
        ItemOrdem objIO2 = new ItemOrdem ("Kit correia dentada");
        
        OrdemServico objOS1 = new OrdemServico();
        
        objOS1.setIdentificacaoOrdem("OS. 1050");
        
        objOS1.addItem(objIO1);
        objOS1.addItem(objIO2);
        System.out.println(objOS1.toString());
    }
}
