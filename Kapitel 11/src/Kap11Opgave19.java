import java.util.*;

/**
 * Created by Jennes on 14-09-2016.
 */
public class Kap11Opgave19 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Janet", 87);
        map1.put("Logan", 62);
        map1.put("Whitaker", 6);
        map1.put("Alyssa", 80);
        map1.put("Stefanie", 80);
        map1.put("Jeff", 80);
        map1.put("Kim", 52);
        map1.put("Sylvia", 87);

        System.out.println(rarest(map1));
    }

    public static Integer rarest(Map<String, Integer> map1) {
        Map<Integer, Integer> map2 = new TreeMap<>();
        int result = 0;
        if (map1.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            for (String key : map1.keySet()) {
                if (!map2.containsKey(map1.get(key))) {
                    map2.put(map1.get(key), 1);
                }
                else {
                    if (map2.containsKey(map1.get(key))) ;
                    Integer x = map2.get(map1.get(key));
                    map2.put(map1.get(key), x + 1);
                }
            }

            Integer min = Collections.min(map2.values());

            for (Integer key : map2.keySet()) {
                if (map2.get(key) == min) {
                    result = key;
                    break;
                }
            }

        }
        return result;
    }
}

