import java.util.*;

/**
 * Created by Jennes on 02-09-2016.
 */
public class Kap11Opgave13 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Marthy", "Stepp");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Amanda", "Happy");
        map.put("Hal", "Perkins");
        map.put("Jens", "Happy");

        System.out.println(isUnique(map));
    }
        public static boolean isUnique(Map<String, String> map) {
            Set<String> set = new HashSet<String>(map.values());

            if(set.size() == map.size()) {
                return true;
            }
    return false;
    }
}
