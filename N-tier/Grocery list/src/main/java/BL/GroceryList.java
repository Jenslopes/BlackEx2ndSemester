package BL;

/**
 * Created by Jennes on 29-08-2016.
 */
public class GroceryList implements GroceryListInterface {

    private GroceryItemOrder[] list = new GroceryItemOrder[10];
    private int boks = 0;
    public void Grocerylist() {
    }

    public void add(GroceryItemOrder grocery) {
        if (boks < 10) {
            list[boks] = grocery;
            boks++;
        }
    }
    public GroceryItemOrder get(int index){
        return list[index];
    }

    public GroceryItemOrder[] getList() {
        return  list;
    }


    public int size() {
        return boks;
    }

    public void getTotalCost() {
        double totalCost = 0;
        for (int y = 0; y <= 9; y++) {
            double cost = list[y].getCost();
            totalCost += cost;
        }
            System.out.println("Total Cost: "+totalCost+",-");
    }

    public String toString() {
        String line = "";
        for (int i = 0; i <boks; i++) {
            line += (list[i].getName()+" ");
            line += "| price: ";
            line += (list[i].getPpu()+",-"+"| ") ;
            line += "quantity: ";
            line += (list[i].getQuantity());
            line += ("| total price "+list[i].getCost()+",-");
            line += "\n";
        }
        return line;
    }

}

