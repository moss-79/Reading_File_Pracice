package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        String email = scan.nextLine();

        // does not contain character @ say invalid email
        // contains space say invalid email

       // boolean contains = email.contains("@");
       // boolean containss = email.contains(" ");

        //if it endsswith @gmail.com ---> gmail
       // boolean enswith = email.endsWith("@gmail");
        //if if enswith @yahoo.com  ----> yahoo email
       // boolean enswiths = email.endsWith("@yahoo");
        // if is ends with @gmail.ru ----> Russian email
       // boolean enswithr = email.endsWith("@yahoo");


        if (email.contains("@")&& email.contains(" ")){
            System.out.println(" It is invalid");
        }else if (email.endsWith("@gmail.com")){

            System.out.println( " IT is gmail");
        }else if (email.endsWith("@yahoo.com")){

            System.out.println( " IT is yahoo");
        }else if (email.endsWith("@gmail.ru")){

            System.out.println( " IT is Russian email");
        }
    }
}
