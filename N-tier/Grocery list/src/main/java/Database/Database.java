package Database;
import BL.GroceryItemOrder;
import BL.GroceryItemOrderInterface;
import BL.GroceryList;
import BL.GroceryList2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Database implements Data {
    private ArrayList<GroceryItemOrderInterface> list;

    public Database() {

        list = new ArrayList<GroceryItemOrderInterface>();
    }

     public ArrayList GetGList() {
        return list;
    }

    public void getFile() throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\Users\\Jennes\\OneDrive\\Dokumenter\\Java\\2. Semester\\BLACK ex\\N-tier\\Grocery list\\src\\main\\java\\Database\\list.txt"));

        while (input.hasNextLine()) {
            while (input.hasNext()) {
                list.add(new GroceryItemOrder(input.next(), input.nextDouble(), input.nextInt()));
            }
        }
    }
}
