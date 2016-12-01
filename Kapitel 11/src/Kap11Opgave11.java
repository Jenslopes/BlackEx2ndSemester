import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Jennes on 01-09-2016.
 */
public class Kap11Opgave11 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(4);
        set1.add(7);
        set1.add(9);

        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        System.out.println(symmetricSetDifference(set1, set2));
    }
    public static Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new HashSet<> ();

        set3.addAll(set1);
        set1.retainAll(set2);
        set3.addAll(set2);
        set3.removeAll(set1);
        return set3;


        }

}
