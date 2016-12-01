import java.util.Scanner;

/**
 * Created by Jennes on 22-09-2016.
 */
public class main {
    public static void main(String[] args) throws MyException2 {

        int x = 1;
        do {
            Scanner input = new Scanner(System.in);
            try {
                System.out.println("Divide 2 numbers, (can't be 0)");
                System.out.println("type in the number you wish to be divided ");
                int num1 = input.nextInt();
                System.out.println("type in number you with to divide by");
                int num2 = input.nextInt();
                if(num1 == 0 || num2 == 0) throw new MyException("You cant divide by zero, Try again \n");
                int result = num1 / num2;
                System.out.println("The result is " + result);
                x++;
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (x == 1);

         /*
        int x = 1;
        do {
            try {
                Scanner input = new Scanner(System.in);
                int[] tal = {1, 2, 3, 4, 5};
                System.out.println("please pick the index u would like to view");
                int index = input.nextInt();
                if (index >= tal.length) throw new MyException2("there is nothing in that index, please try again.");
                x++;
                System.out.println(tal[index]);
            } catch (MyException2 e) {
                System.out.println(e);
            }
        } while (x ==1); */
    }
}


