import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Jennes on 01-09-2016.
 */
public class Kap11Opgave07 {
    public static void main(String[] args) {

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);

        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        list2.add(12);
        list2.add(13);

        System.out.print(countCommon(list1, list2));

    }
    public static int countCommon(List<Integer> list1, List<Integer> list2) {

        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        set1.retainAll(set2);

        return set1.size();


    }
}
