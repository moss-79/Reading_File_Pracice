package replit;

import java.util.Arrays;
import java.util.Scanner;

public class repLit119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
     String[] arrOfStr = email.split("@");
     if (email.contains("@") && email.indexOf("@") ==email.lastIndexOf("@")) {

         System.out.println("email " + arrOfStr[0]);
         System.out.println("email of domain" + arrOfStr[1]);
     }else
         System.out.println("invalid email");
    }
}


