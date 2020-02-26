package replit;

import java.util.Scanner;

public class repLit99 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        int count = 0;
        String prefix = str.substring(0, n);

        for (int i = 0; i <= str.length() -n; i++) {
            String currentString = str.substring(i, i + n);
            if (currentString.equals(prefix)) {

                count++;
            }
        }
            if (count > 1){
                System.out.println("true");
        }else {
                System.out.println("false");
            }
       /* if (str.substring(n).contains(prefix)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        */
    }
}

