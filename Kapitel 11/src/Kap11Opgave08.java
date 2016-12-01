import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Jennes on 01-09-2016.
 */
public class Kap11Opgave08 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("jeg");
        set.add("er");
        set.add("super");
        set.add("elastisk");
        set.add("men");
        set.add("du");
        set.add("ved ");
        set.add("noget");
        set.add("om");
        set.add("relativitet");
        set.add("isjwhdvbkjwguflbewl");

        System.out.println(minLength(set));
    }

    public static int minLength(Set<String> set) {
        Iterator<String> itr = set.iterator();
        String first = itr.next();
        int shortest = first.length();

        if (!itr.hasNext()) {
            shortest = 0;
        }
        while (itr.hasNext()) {
            String element = itr.next();
            if (element.length() < shortest) {
                shortest = element.length();
            }
        }
        return shortest;
    }
}
