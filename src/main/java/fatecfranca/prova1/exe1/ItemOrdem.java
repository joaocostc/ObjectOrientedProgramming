package fatecfranca.prova1.exe1;

public class ItemOrdem {
   private String descricao;

    public ItemOrdem() {
    }

    public ItemOrdem(String descricao) {
        this.setDescricao(descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public final void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ItemOrdem{" + "descricao=" + descricao + '}';
    }   
}
