import java.util.*;

/**
 * Created by Jennes on 06-09-2016.
 */
public class Kap11Opgave17 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        map1.put("Smith", "949-0504");
        map1.put("Marty", "206-9024");

        map2.put("Marty", "206-9024");
        map2.put("Hawking", "213-4567");
        map2.put("Smith", "949-0504");
        map2.put("Newton", "123-4567");

        System.out.println(subMap(map1, map2));
    }
    public static boolean subMap(Map<String, String> map1, Map<String, String> map2) {
        int count = 0;
        for (Map.Entry<String,String> entry : map1.entrySet()){
           if (map2.containsKey(entry.getKey())) {
               if (map2.get(entry.getKey()).equals(entry.getValue())) {
                   count++;
               }
               if (count >= map1.size()) {
                   return true;
               }
           }
       }

       return  false;
    }
}

        /*
        if(map3.size() > map2.size()) {
            return false;
        }
        return true;
        while (itr.hasNext()) {
            String val = itr.next();
            if (map2.containsKey(val)) {
                map2.get(val);
            }

            }*/
