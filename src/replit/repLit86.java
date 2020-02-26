package replit;
import javax.swing.*;
import java.util.Scanner;
public class repLit86 {
    public static void main(String[] args) {

/*Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guest.
 If yes - take input from.
If not - finish the program and print list of the guests.

Example of the program:

Please enter guest name:
Nick
Do you want to enter new guest name:
yes
Please enter guest name:
Linda
Do you want to enter new guest name:
no

Guest's list: Nick, Linda/*
    }
    }
 */
//1 first i am going to import scanner
        // and to ask user by using scanner
        //
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String name = scan.nextLine();
        System.out.println("Do you want to enter new guest name:");
        String answer = scan.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            while(answer.equalsIgnoreCase("yes")) {
               // if (answer.equalsIgnoreCase("yes"))
                    System.out.println("Please enter guest name:");
                    String name1 = scan.nextLine();
                    System.out.println("Do you want to enter new guest name:");
                    answer = scan.nextLine();
                    name = name +", "+name1;






            }System.out.print("Guest's list: " + name);

            }else if(answer.equalsIgnoreCase("no")){
            System.out.print("Guest's list: "+name);
        }





    }}
