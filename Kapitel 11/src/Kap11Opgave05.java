import java.util.*;

/**
 * Created by Jennes on 01-09-2016.
 */
public class Kap11Opgave05 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(3);
        list.add(-1);
        list.add(12);
        list.add(6);
        list.add(31);
        list.add(51);
        list.add(41);
        list.add(-4);


        System.out.print(sortAndRemoveDuplicates(list));
    }

    public static List<Integer> sortAndRemoveDuplicates(List<Integer> list) {

        Set<Integer> set = new HashSet<Integer>(list);

        list.clear();
        list.addAll(set);
        Collections.sort(list);

        return list;
    }

}
