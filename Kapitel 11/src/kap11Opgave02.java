import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;

/**
 * Created by Jennes on 30-08-2016.
 */
public class kap11Opgave02 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(7);
        list2.add(10);
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(15);
        list2.add(16);
        list2.add(17);
        System.out.println(list1.lastIndexOf(1));
        System.out.print(alternate(list1, list2));


    }
    public static ArrayList<Integer> alternate(ArrayList list1, ArrayList list2){

        ArrayList<Integer> list3 = new ArrayList<>();

            int count = 1;
            for (int i=0; i<list1.size()||i<list2.size(); i++) {
                if (list1.size() >= i + 1){
                    list3.add((Integer)list1.get(i));
                }
                if (list2.size() >= count) {
                    list3.add((Integer)list2.get(i));
                count++;
                }
            }
            return list3;



        /*  if(list1.size() >= list2.size()) {
            int count = 1;
            for (int i = 0; i < list1.size(); i= i+2) {
                list3.add((Integer) list1.get(i));
                list3.add((Integer) list2.get(i));
                count=count+2;
            }

            }
            return list3;*/
        }
    }

