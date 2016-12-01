package BL;

/**
 * Created by Jennes on 29-08-2016.
 */
public class GroceryItemOrder implements GroceryItemOrderInterface {
    private String name;
    private double ppu;
    private int quantity;

    public void GroceryItemOrder(String name) {
    this.name=name;
    this.quantity=1;
    }

    public GroceryItemOrder(String name, double ppu, int quantity) {
        this.ppu = ppu;
        this.name = name;
        this.quantity = quantity;
}

     public GroceryItemOrder(String name) {
         this.name = name;
         this.quantity = 1;
    }


    public double getPpu() {
        return ppu;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return ppu*quantity;
    }

    public String toString() {
        String item = "";
        item += name+"|" + quantity+"|" + ppu+"|" + getCost()+"-,";
        return item;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPpu(int ppu) {
        this.ppu = ppu;
    }
}
