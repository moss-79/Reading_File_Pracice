package replit;

import java.util.Scanner;

public class repLit157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */
        // 12:00:00PM
        String []  splited = s.split(":");
        int hour = Integer.parseInt(splited[0]);
        int min = Integer.parseInt(splited[1]);
        String last = splited[splited.length-1];
        int sec = Integer.parseInt(last.substring(0,last.length()/2));
        String ampm = last.substring(last.length()/2,last.length()-1);

        String military = "";

        if(last.contains("P")){
            military = String.format("%02d:%02d:%02d",hour+12 ,min,sec);
            System.out.println(military);
            if(hour == 12){
                military = String.format("%02d:%02d:%02d",hour ,min,sec);
                System.out.println(military);
            }
        }else if (last.contains("A")){
            military = String.format("%02d:%02d:%02d",hour-12 ,min,sec);
            System.out.println(military);
            if(hour < 12){
                military = String.format("%02d:%02d:%02d",hour ,min,sec);
                System.out.println(military);
            }
        }

    }
}

