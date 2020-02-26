package replit29;


import java.util.Scanner;

public class StringEquality59 {
    public static void main(String[] args) {
        System.out.println("Enter full name:");
        Scanner scan = new Scanner(System.in);
        String fullName = scan.nextLine();

        if (fullName.equalsIgnoreCase("Max Payne") ) {
            System.out.println("User found!");
        }
        else if(fullName.equalsIgnoreCase("Alan Wake")){

            System.out.println("User found!");
        }
        else{
            System.out.println("User not found!");
        }
    }

}

