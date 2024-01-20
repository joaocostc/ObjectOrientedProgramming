package fatecfranca.lista1.exe3;

public class Produto {
    // variáveis da classe
    public int id; // int é tipo de dado primitivo
    public String nome; // String é um tipo de dados de Classe 
    public int qtde; // int é um tipo de dado primitivo
    public float preco; // float é um tipo de dado primitivo
    public boolean estoqueCritico; // boolean é um tipo de dado primitivo
    public String descricao; // String é um tipo de dado de Classe
    // outros exemplos do tipo Classe: Integer, Float, Boolean
    
   public Produto() {  
   }
    
    // método construtor de objetos
    // "this" representa o objeto que chama o método
    public Produto(int id, String nome, String descricao, int qtde, boolean estoqueCritico, float preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.qtde = qtde;
        this.estoqueCritico = estoqueCritico;
        this.preco = preco;
    }
    
    // métodos que apoiam a utilizam dos objetos
    public void mostraObjeto() {
         System.out.println(" Id: " + this.id + "\n Nome: " + this.nome + "\n Descrição: " + this.descricao +
            "\n Quantidade: " + this.qtde + "\n Preço: " + this.preco + "\n Estoque critico: " + (this.estoqueCritico ? "Sim" : "Não")); // imprime na tela e "pula de linha"
    } 
    
    // Crie um método para comprar um produto. A quantidade
    // a ser comprada deve ser passado como parâmetro
    public void comprar(int x){
       this.qtde = this.qtde + x;
       System.out.println("Compra realizada com sucesso.");
    }
    
    public void vender(int x) {
        if (x <= this.qtde) {
            this.qtde = this.qtde - x;
            System.out.println("Venda realizada com sucesso.");
            if (this.qtde <= 3){
                this.estoqueCritico = true;
            }
        }
        else {
            System.out.println("Estoque indsuficiente.");
        }
    } 
    
    // Aumentar o preço do produto em X% (float) passado como parâmetro
    public void aumentarPreco(float x) {
        this.preco = this.preco + (this.preco * (x / 100));
        System.out.println("Aumento realizado com sucesso.");
    }
    
    // Diminuir o preço do produto em X% (float) passado como parâmetro 
    public void diminuirPreco(float x) {
        float desconto = (this.preco * x)/100;
        if (desconto <= this.preco){
            this.preco -=desconto;
            System.out.println("Desconto realizado com sucesso.");
        }
        else {
            System.out.println("Desconto não permitido.");
        }
    }
}
