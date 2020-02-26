package replit;
import java.util.Scanner;
public class replitPractice34{


    public static void main(String[] args) {

        /*Write a program that determines the change to be dispensed from a vending
machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent
increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single
dollar bill to pay for the item.

         */
        //int variable = itemPrice;
        //int variables quarters, dimes, nickels
        //- Scanner object

        //If itemPrice is less than 25 or more than 100 cents, then display an error message:
        //Invalid price!
        //
        //If itemPrice is not divisible by 5, then also display an error message:
        //Invalid price!
        //
        //use (itemPrice % 5 == 0) expression to find it is divisible by 5.
        //
        //Do not display anything else.
        Scanner scan = new Scanner(System.in);
        int itemPrice = scan.nextInt();
        int change = 100-itemPrice;
        int quarters = 25;
        int dimes = 1;
        int nickels = 5;

        if (itemPrice % 5 ==0 && itemPrice>= 25 || itemPrice <=100){
            System.out.println("Your change is "+itemPrice/4);
            System.out.println("Your change is "+change/25+" quarters, "+change%25/10+" dimes, and "+change%25%10/5+" nickels" );
        }

    }
}
