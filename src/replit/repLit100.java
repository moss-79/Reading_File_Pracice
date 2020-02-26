package replit;

import java.util.Scanner;

public class repLit100 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();


        int firstBread = str.indexOf("bread");
        int lastBread = str.lastIndexOf("bread");
        if (firstBread != lastBread)
            System.out.println(str.substring(firstBread+5,lastBread));
        else
            System.out.println("nothing");



        //int countOfBread = 0;
        //     System.out.println(str.substring(str.indexOf(0), str.length()));
        /*for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+5).equals("bread")) {
                countOfBread++;
                System.out.println("i = " + i);
            }
        }
                if(countOfBread >= 2) {
            System.out.println(str.substring(str.indexOf("bread"),str.lastIndexOf("bread")).replace("bread", ""));

                }else {
            System.out.println("nothing");


        }

         */
    }
}
