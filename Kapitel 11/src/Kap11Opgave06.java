import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Jennes on 01-09-2016.
 */
public class Kap11Opgave06 {
    public static void main(String[] Args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(0);
        list.add(0);
        list.add(3);
        list.add(4);

        System.out.print(countUnique(list));
    }

     public static int countUnique(List<Integer> list) {
         Set<Integer> set = new HashSet<>(list);

         set.size();

            return set.size();
    }
}
