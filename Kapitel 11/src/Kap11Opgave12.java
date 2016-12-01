import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Jennes on 01-09-2016.
 */
public class Kap11Opgave12 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("jeg");
        list.add("jeg");
        list.add("jeg");
        list.add("er");
        list.add("du");
        list.add("du");
        list.add("at");

        System.out.println(contains3(list));
    }
        public static boolean contains3(List<String> list) {
            Map<String, Integer> map = new HashMap<>();
            Iterator<String> itr = list.iterator();

            while (itr.hasNext()) {
                String word = itr.next();

                if (!map.containsKey(word)) {
                    map.put(word, 1);
                }
                    else {
                        int a = map.get(word);
                        map.put(word, a++);
                    }
                }
                if (map.containsValue(3)) {
                    return true;
            }
            return false;
        }
}
