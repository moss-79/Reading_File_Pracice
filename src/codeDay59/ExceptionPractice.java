package codeDay59;

import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {

        // This simple program will get certain character from furkan's name
        // according to the index user provided
        System.out.println("The start" );
        String name  = "Furkan";

        Scanner scan = new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkan's name ?");
        int targetIndex = scan.nextInt();

        try {
            System.out.println(name.charAt(targetIndex) );
        }catch (Exception e){
            System.out.println("Something unusual happen!!!");
        }
        System.out.println("The End");
    }
}
