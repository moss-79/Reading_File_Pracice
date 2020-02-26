package replit;

import java.util.Scanner;

public class replIit77 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();



        int firstSpaceIndex = email.indexOf("_");
        int secondSpaceIndex = email.indexOf("@");
        int lastSpaceIndex = email.indexOf(".");
        int finish = email.length();
        String first = email.substring(0,firstSpaceIndex);

        String b=email.charAt(0)+"";

        String c=""+email.charAt(email.indexOf("_")+1);
            System.out.println("First name: "+b.toUpperCase()+email.substring(1,email.indexOf("_")));
           System.out.println("Last name: "+c.toUpperCase()+email.substring(email.indexOf("_")+2,email.indexOf("@")));

        System.out.println("Domain: "+email.substring(secondSpaceIndex+1,lastSpaceIndex));
        System.out.println("Top-Level Domain: "+email.substring(lastSpaceIndex+1,finish));


// String b=email.charAt(0)+"";
// String c=""+email.charAt(email.indexOf("_")+1);
//            System.out.println("First name: "+b.toUpperCase()+email.substring(1,email.indexOf("_")));
//            System.out.println("Last name: "+c.toUpperCase()+email.substring(email.indexOf("_")+2,email.indexOf("@")));


    }
}
