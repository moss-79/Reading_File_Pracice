package codeDay17;
import java.util.Scanner;
public class FizzBuzzTestScanner {

   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);



    int num1 = -1;
        while(num1 <=100){

        if (num1 % 5 == 0 && num1 % 3 == 0) {
            System.out.println(num1 + " is fizz buzz number");
        } else if (num1 % 5 == 0) {
            System.out.println(num1 + " is fizz  number");
        } else if (num1 % 3 == 0) {
            System.out.println(num1 + " is buzz number");
        }
        num1++;

       int num2 = scan.nextInt();
    }
}
}