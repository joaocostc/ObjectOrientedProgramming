package fatecfranca.lista1.exe4;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;
    
    public Rio(){
    }
    
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    public void poluir (){
        this.poluido = true;
    }
    
    public void limpar() {
        this.poluido = false;
    }
    
    public void chover (float x) {
        this.nivel += x;
    }
    
    public void ensolarar(float x){
        if (x <= this.nivel) {
            this.nivel -= x;
        }
        else this.nivel = 0;
    }
    
    public String mostra(){
        return "Nome: " + this.nome + "\nNível: " + this.nivel + "\nEstá poluído: " +((this.poluido) ? 
                "Sim" : "Não");
    }
}
