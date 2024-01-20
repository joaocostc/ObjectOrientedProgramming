package fatecfranca.prova1.exe1;

import java.util.ArrayList;

public class OrdemServico {
    private String identificacaoOrdem;
    private ArrayList<ItemOrdem> itemOrdem;
    
    public OrdemServico() {
        this.itemOrdem = new ArrayList();
}

    public OrdemServico(String identificacaoOrdem, ArrayList<ItemOrdem> itemOrdem) {
        this.identificacaoOrdem = identificacaoOrdem;
        this.itemOrdem = itemOrdem;
    }
    
    public void addItem(ItemOrdem itemOrdem) {
        this.itemOrdem.add(itemOrdem);
    }
    
    public boolean removeItem(ItemOrdem itemOrdem){
        return this.itemOrdem.remove(itemOrdem); // retorna o resultado da tentativa de remoção
    }

    public String getIdentificacaoOrdem() {
        return identificacaoOrdem;
    }

    public void setIdentificacaoOrdem(String identificacaoOrdem) {
        this.identificacaoOrdem = identificacaoOrdem;
    }

    public ArrayList<ItemOrdem> getItemOrdem() {
        return itemOrdem;
    }

    public void setItemOrdem(ArrayList<ItemOrdem> itemOrdem) {
        this.itemOrdem = itemOrdem;
    }

    @Override
    public String toString() {
        return "OrdemServico{" + "identificacaoOrdem=" + identificacaoOrdem + ", itemOrdem=" + itemOrdem + '}';
    }
}

