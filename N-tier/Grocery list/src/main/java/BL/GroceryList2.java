package BL;

import Database.Data;
import Database.Database;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jennes on 29-08-2016.
 */
public class GroceryList2 implements GroceryList2Interface {
    private List<GroceryItemOrder> list = new ArrayList<GroceryItemOrder>();


    public void add(GroceryItemOrder grocery) {
        list.add(grocery);
    }

    public GroceryItemOrder get(int index){
        return list.get(index);
    }

    public void getList() throws FileNotFoundException {
        Data dList = new Database();
        dList.getFile();
        list = dList.GetGList();

    }

    public int size() {
        return list.size();
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (int y = 0; y < list.size(); y++) {
            double cost = list.get(y).getCost();
            totalCost += cost;
        }
        return totalCost;
    }

    public String toString() {
        String line = "";
        for (int i = 0; i <list.size(); i++) {
            line += (list.get(i).getName()+" ");
            line += "| price: ";
            line += (list.get(i).getPpu()+",-"+"| ") ;
            line += "quantity: ";
            line += (list.get(i).getQuantity());
            line += ("| total price "+list.get(i).getCost()+",-");
            line += "\n";
        }
        return line;
    }

}



