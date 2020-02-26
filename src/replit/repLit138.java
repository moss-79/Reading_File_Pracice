package replit;

import java.util.Arrays;
import java.util.Scanner;

public class repLit138 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] reversed = sentence.split(" ");
        System.out.println(Arrays.toString(reversed));
        //TODO: start your code here
        String x = "";
        for(int i = reversed.length-1; i >= 0; i--){

            System.out.print(reversed[i]);
            if(i !=0){
                System.out.print(" ");
            }
            x += reversed[i];
//            for(int k = 0; k < i; k++){
//                System.out.print(" ");
//            }
        }
      //  System.out.println( x);


        //End your code here. do not modify below statement


    }
}

