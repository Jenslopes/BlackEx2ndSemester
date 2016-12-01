package BL;

/**
 * Created by Jennes on 16-11-2016.
 */
public interface GroceryItemOrderInterface {
    void GroceryItemOrder(String name);

    double getPpu();

    int getQuantity();

    String getName();

    double getCost();

    String toString();

    void setName(String name);

    void setQuantity(int quantity);

    void setPpu(int ppu);
}
