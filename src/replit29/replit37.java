package replit29;
import java.util.Scanner;
public class replit37 {

    public static void main(String[] args) {
        //Display prompt: "Enter number of coupons:"
        //13
        //Display prompt: "Number of Candies: 1"
        //Display prompt: "Number of Gumballs: 1"

        Scanner scan = new Scanner(System.in);
        System.out.println("Number of Candies: coupons"   );
        int coupons = scan.nextInt();

        int Candies = coupons/10;
        System.out.println("Number of Candies: "+Candies);
        int Gumballs = coupons%10/3;
        System.out.println("Number of Candies: "+Gumballs);




    }
}
