package fatecfranca.lista5.exe2;

public class TestaPessoaCidade {

    public static void main(String[] args) {
        
        Pessoa fulano = new Pessoa(); //
        Cidade rp = new Cidade(); //
	rp.contrata(fulano);
	rp.contrata((Empregado) fulano); // Conversão de tipos
	rp.cobraDe(fulano);
	rp.registra(fulano);
	rp.alimenta(fulano);
        
    }
}