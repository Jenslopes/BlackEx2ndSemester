import java.util.*;

/**
 * Created by Jennes on 06-09-2016.
 */
public class Kap11Opgave15 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5, 5));

        System.out.println(maxOccurrences(list));

    }

    public static Integer maxOccurrences(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : list) {
            if (!map.containsKey(i))
                map.put(i, 1);
            else {
                map.put(i, map.get(i)+1);
            }
        }
        return new TreeSet<>(map.values()).last();
    }
}
