package replit29;

import java.util.Scanner;

public class replit32 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds:");

        int inputSeconds = scan.nextInt();
        int  hours,minutes,seconds;

        hours = inputSeconds/3660;
        minutes =  (inputSeconds/60)%60;
        seconds = inputSeconds%60;
        System.out.println( hours+"hours, "+minutes+" minutes, and "+seconds +" seconds");



    }
}
