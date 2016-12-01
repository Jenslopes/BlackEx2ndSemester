package BL;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * Created by Jennes on 16-11-2016.
 */
public interface GroceryList2Interface {

    void add(GroceryItemOrder grocery);

    GroceryItemOrder get(int index);

    void getList() throws FileNotFoundException;

    int size();

    double getTotalCost();

    String toString();
}
