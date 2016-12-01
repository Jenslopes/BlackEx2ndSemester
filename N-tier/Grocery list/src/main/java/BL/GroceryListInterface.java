package BL;

/**
 * Created by Jennes on 16-11-2016.
 */
public interface GroceryListInterface {
    void Grocerylist();

    void add(GroceryItemOrder grocery);

    GroceryItemOrder get(int index);

    GroceryItemOrder[] getList();

    int size();

    void getTotalCost();

    String toString();
}
