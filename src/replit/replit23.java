package replit;
import java.util.Scanner;
public class replit23 {

    public static void main(String[] args) {

        
        /*Write a program that asks user to input int values: areaCode and localNumber.

-Using concatenation put together in this format and assign to String phoneNumber  variable:

-(222)-3334444

-Write a print statement that displays (use phoneNumber variable ):
Calling number (222)-3334444

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("areaCode and localNumber.");
        //String areaCode = scan.next();
        //String localNumber = scan.next();
       // String phoneNumber = "("+areaCode+")"+"-"+localNumber;
       // System.out.println("phoneNumber = " + phoneNumber);

        
//l
        int areaCode = scan.nextInt();
        int localNumber = scan.nextInt();
        String phoneNumber = "("+areaCode+")"+"-"+localNumber;
        System.out.println("Calling number " + phoneNumber);

    }


    }

