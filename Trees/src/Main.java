/**
 * Created by Jennes on 17-11-2016.
 */
public class Main {
    public static void main(String[] args) {
        IntTree theTree = new IntTree();

        theTree.add(3);
        theTree.add(2);
        theTree.add(5);
        theTree.add(6);
        theTree.add(4);
        theTree.add(1);

        System.out.println(theTree.countEvenBranches());


    }



}
