package fatecfranca.lista1.exe3;

import javax.swing.JOptionPane;

public class TestaProduto {

    public static void main(String[] args) {
        // cria os objetos da Classe Produto
        // () indica a chamada de um método, especial chamado construtor (vai pegar os valores passados pelos valores e vai atribuir ao objeto)
        // método tem o mesmo nome da classe
        Produto obj1 = new Produto(1, "bolacha", "recheada com chocalte", 30, false, 3.20f);
        // toda Classe em Java recebe o pacote chamado "java.lang", que possui várias Classes
        obj1.mostraObjeto();
        obj1.comprar(3);
        obj1.vender(10);
        obj1.mostraObjeto();
        obj1.aumentarPreco(10);
        obj1.diminuirPreco(20);
        obj1.mostraObjeto();
        Produto obj2 = new Produto(2, "sorvete", "sabor baunilha", 12, true, 6.80f);
        // toda Classe em Java recebe o pacote chamado "java.lang", que possui várias Classes
        obj2.mostraObjeto();
        JOptionPane.showMessageDialog(null, " Id: " + obj2.id + "\n Nome: " + obj2.nome + "\n Descrição: " + 
                obj2.descricao + "\n Quantidade:" + obj2.qtde + "\n Preço: " + obj2.preco);
        Produto obj3 = new Produto();
    }
}
