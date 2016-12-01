import java.util.*;
import java.util.Iterator;

/**
 * Created by Jennes on 27-09-2016.
 */
public class Main {
    public static void main(String[] args) {

        /*
        MyStackImp jennes2 = new MyStackImp();

        jennes2.push(1);
        jennes2.push(2);
        jennes2.push(3);
        jennes2.push(4);
        jennes2.push(5);


        Iterator itr = jennes2.getIterator();



        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        */

        MyQueueImp<Integer> jennes = new MyQueueImp();

        jennes.add(1);
        jennes.add(2);
        jennes.add(3);
        jennes.add(4);
        jennes.add(5);
        jennes.remove();

        System.out.println(jennes);

        Iterator itr = jennes.getIterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }


    }
}
