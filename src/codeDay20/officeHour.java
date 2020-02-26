package codeDay20;

import java.util.Scanner;

public class officeHour {
    public static void main(String[] args) {


//  HOMEWORK
        // CREATE AN INTERACTIVE PROGRAM TO ASK USER
        // STARTING CHARACTER AND ENDING CHARACTER
        // THEN PRINT EVERYTHING IN BETWEEN
        // IT COULD BE STARTING CHARACTER IS AFTER ENDING CHARACTER
        // FOR EXAMPLE USER CAN ENTER  Z A  , or A K
        // Can we ask user character ? NO!!!!
        // Ask user for String and pick first character by charAt(0)

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter 1 st word with single character to start with ");
        String first = scanner.next();
        char firstAsChar = first.charAt(0);



        System.out.println(" Enter 2 nd word with single character to start with ");
        String second = scanner.next();
        char secondAsChar = first.charAt(0);

        for (char iChar =(char) (firstAsChar+1); iChar <= secondAsChar; iChar++) {
            System.out.println(iChar+ " ");

        }
    }
}