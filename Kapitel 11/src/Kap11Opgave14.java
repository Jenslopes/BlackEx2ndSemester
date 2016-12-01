import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

/**
 * Created by Jennes on 04-09-2016.
 */
public class Kap11Opgave14 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        Map<String, Integer> map2 = new HashMap<String, Integer>();

        map1.put("Janet", 87);
        map1.put("Logan", 62);
        map1.put("Whitaker", 46);
        map1.put("Alyssa", 100);
        map1.put("Stefanie", 80);
        map1.put("Jeff", 88);
        map1.put("Kim", 52);
        map1.put("Sylvia", 95);

        map2.put("Logan", 62);
        map2.put("Kim",52);
        map2.put("Whitaker", 52);
        map2.put("Jeff", 88);
        map2.put("Stefanie", 80);
        map2.put("Brian", 60);
        map2.put("Lisa", 83);
        map2.put("Sylvia", 87);

        System.out.println(intersect(map1, map2));
    }
        public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
            Map<String, Integer> map3 = new HashMap<String, Integer>();

        for (String s : map1.keySet()) {
            if (map2.containsKey(s) && map2.get(s).equals(map1.get(s))) {
                map3.put(s, map1.get(s));
            }
        }
            return map3;

        }
}
