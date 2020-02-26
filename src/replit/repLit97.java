package replit;

import java.util.Scanner;

public class repLit97 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int length = word.length()-1;
        int count = 0;

        for(int i = 0; i <= length -3 ;i++){

            if(word.substring(i,i+4).equalsIgnoreCase("java")){
                count++;//           equalsIgnoreCase
            }

        }System.out.println(count);

    }

}


