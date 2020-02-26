package replit;
import java.util.Scanner;
public class replit68 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        String reverse = " ";

        int x = word.length()/2 -1;
        System.out.println("x = " + x);
        if (word.length() == 5) {
            for (int i = word.length()-1; i >= 0; i--) {

                reverse = reverse + word.charAt(i);
            }
            System.out.println(reverse);

        } else if (word.length() < 5) {

            System.out.println("too short");
        } else {
            System.out.println("too big");
        }
    }
}
