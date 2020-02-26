package replit;
import java.util.Scanner;
public class repLit92 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         // int n = scan.nextInt();
        int n = 5;

        for (int i = 5; n > 0; i--) {

            i *= n--;
            System.out.println(i);

        }


        {
            for (char i = 'z'; i >= 'v'; i--) {
                for (char j = 'z'; j >= 'v'; j--) {

                    System.out.println(i + "" + j);
                }
            }

            int counter = 5;
            int factorial = 1;

            do {
                factorial *= counter--; /* Multiply, then decrement. */
            } while (counter > 0);

            System.out.println("The factorial of 5 is " + factorial);

//============================================//
// The below function does the same as above. //
//============================================//

            //scan.nextInt()
            int counter1 = 16;
            int factorial1 = 1;

            while (counter1 > 0) {
                factorial1 *= counter1--; /* Multiply, then decrement. */
            }

            System.out.println("The factorial of 5 is " + factorial1);

            int i = 1;
            while (i > 0) {
                i *= i--;

            }
            System.out.println();


        }
    }


}