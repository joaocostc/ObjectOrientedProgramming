package fatecfranca.lista3.exe1;

import java.util.ArrayList;

public class ShoppingCart {
    private int id;
    private ArrayList<CarItem> carItens;
    
    public ShoppingCart() {
        this.carItens = new ArrayList(); // aloca espaço na memória para o vetor
    }

    public ShoppingCart(int id, ArrayList<CarItem> carItens) {
        this.id = id;
        this.carItens = carItens;
    }
    
    public void addCarItem(CarItem carItem) {
        this.carItens.add(carItem);
    }
    
    public boolean removeCarItem(CarItem carItem){
        return this.carItens.remove(carItem); // retorna o resultado da tentativa de remoção
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<CarItem> getCarItens() {
        return carItens;
    }

    public void setCarItens(ArrayList<CarItem> carItens) {
        this.carItens = carItens;
    }
    
    public float calculateTotal(){
        float total = 0;
        for(int i = 0; i < carItens.size(); i++){
            total += (carItens.get(i).getQuantity() * carItens.get(i).
                    getProduct().getPrice());
        }
        return total;
    } 
    
    @Override
    public String toString() { // carItems irá percorer o vetor e chamar toString() de cada carItem
        return "ShoppingCart{" + "id=" + id + ", carItens=" + carItens + "\n Total:" +
                this.calculateTotal() + '}';
    }
}
