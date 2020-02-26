package replit;

import java.util.Scanner;

public class repLit108 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String star = "*";
        for(i = 1; i <= n; i++) {

            for (j = 0; j < i; j++) {

                System.out.print(star);

            }
            System.out.println();
        }

    }
}

