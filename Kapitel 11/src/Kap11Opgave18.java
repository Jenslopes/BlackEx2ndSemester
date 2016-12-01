import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Jennes on 08-09-2016.
 */
public class Kap11Opgave18 {
    public static void main(String[] args) {
        Map<String, String > map1 = new HashMap<>();
        map1.put("42", "Marty");
        map1.put("81", "Sue");
        map1.put("17", "Ed");
        map1.put("31", "Dave");
        map1.put("56", "Ed");
        map1.put("3", "Marty");
        map1.put("29", "Ed");

        System.out.println(reverse(map1));
    }
   public static Map<String, Set<String>> reverse(Map<String, String> map1) {

       //Set<String> set = new HashSet<>(map1.values());
       Map<String, Set<String>> rev = new HashMap<>();

       for (String key : map1.keySet())  {
           if (!rev.containsKey(map1.get(key))){
               Set<String> set1 = new HashSet<>();
               set1.add(key);
               rev.put(map1.get(key), set1);
           }

           else {
               Set<String> x = rev.get(map1.get(key));
               x.add(key);
               rev.put(map1.get(key), x);
           }
       }
       return rev;

   }
}
