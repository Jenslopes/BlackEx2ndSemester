import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Jennes on 01-09-2016.
 */
public class Kap11Opgave09 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(9);
        set.add(11);
        set.add(13);
        set.add(15);
        set.add(16);

        System.out.println(hasEven(set));

    }

    public static boolean hasEven(Set<Integer> set) {

        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()) {
            if (itr.next() % 2 == 0) {
                return true;
            }
        }
        return false;

    }
}