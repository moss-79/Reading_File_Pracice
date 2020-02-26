package replit;

import java.util.Scanner;

public class repLit87 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        for (int i = 0; i < inhabitants; i++) {
            inhabitants = inhabitants/2;
            System.out.println("day "+i+" ["+inhabitants+"]");


        }

       // int x =0;
        //do {
     //       System.out.println("day"+"["+inhabitants+"]");
      //  } while (x)

        for (int i = 0; i < inhabitants; i++) {

            inhabitants = inhabitants/2;

            System.out.println("Day "+ i  +" ["+inhabitants+"]");


        }


        System.out.println("---- EXTINCT ----");

    }
}


