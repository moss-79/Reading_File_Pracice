package replit;

import java.util.Scanner;

public class repLit93 {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if(word.length() >1){
        if(word.substring(0,4).equalsIgnoreCase("java") || word.substring(1,5).equalsIgnoreCase("java")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }else {
            System.out.println("false");
        }
    }
}
