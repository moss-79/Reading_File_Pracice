package replit;

import java.util.Scanner;

public class  repLit89 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();

        for (int i = 0; i < inhabitants; i++) {



            System.out.println("Day "+ i  +" ["+inhabitants+"]");

            inhabitants = inhabitants/2;

        }


        System.out.println("---- EXTINCT ----");

    }
}

