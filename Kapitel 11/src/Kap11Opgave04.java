import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Jennes on 01-09-2016.
 */
public class Kap11Opgave04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(6);
        list.add(2);
        list.add(7);
        list.add(54);
        list.add(65);
        list.add(77);
        list.add(24);
        list.add(3325);
        list.add(28);
        list.add(364);
        list.add(32);
        list.add(25);
        list.add(8);

        int E = 20;

        System.out.print(partition(list, E));
    }
        public static List<Integer> partition(List<Integer> list, int E) {

            ArrayList<Integer> save = new ArrayList<>();
            Iterator<Integer> itr = list.iterator();

            while(itr.hasNext()) {
                int element = itr.next();
                if (element>E){
                    save.add(element);
                    itr.remove();
                }
            }
            list.addAll(save);
            return list;
        }

}
