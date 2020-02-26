package codeDay15;
import java.util.Scanner;

public class TaskStringStore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int count = name.length();

        if ( count >= 4   && count<=11){
            System.out.println("It is medium name");
        }   else if(count<11){
            System.out.println("It is longer name");
        } else{
            System.out.println("invalid data");

            }
        System.out.println("---------------------------------");
}}
