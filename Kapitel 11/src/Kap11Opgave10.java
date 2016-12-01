import com.sun.deploy.panel.ITreeNode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Jennes on 01-09-2016.
 */
public class Kap11Opgave10 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("q");
        set.add("qw");
        set.add("qwe");
        set.add("qwer");
        set.add("qwert");
        set.add("qwerty");
        set.add("qwertyu");
        set.add("qwertyui");

        System.out.println(removeOddLength(set));
    }
    public static Set<String> removeOddLength(Set<String> set) {
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            String word = itr.next();
            if (word.length() % 2 !=0){
                itr.remove();
            }
        }
        return set;
    }
}
