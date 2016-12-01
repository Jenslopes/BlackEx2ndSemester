import java.util.LinkedList;

/**
 * Created by Jennes on 30-08-2016.
 */
public class Kap11Opgave03 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);

        System.out.print(removeEvenInRange(list, 1, 20));

    }
        public static LinkedList<Integer> removeEvenInRange(LinkedList<Integer> list, int start, int end) {
            for (int i=end-2; i>=start-1; i--) {
                if (list.indexOf(i) % 2 == 0) {
                    list.remove(i);
                }
            }
                return list;

    }

}