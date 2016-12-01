import BL.ArrayListMy;
import Database.Database;

/**
 * Created by Jennes on 14-09-2016.
 */
public class main {
    public static void main(String[] args) {

       ArrayListMy<Integer> jens = new ArrayListMy<Integer>();
/*
        jens.add(1);
        jens.add(2);
        jens.add(3);
        jens.add(4);
        jens.add(5);
        jens.add(6);
        jens.add(7);
        jens.add(8);
        */

        Database d = new Database();
        jens = d.read();
        System.out.println(jens);


    }
}
