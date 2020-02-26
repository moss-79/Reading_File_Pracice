package replit;
import java.util.Scanner;
public class replit76 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String email = scan.next();
         //   In this task, you need to swap first name with last name in the email. If email doesn't contains underscore - do not anything.

            // i am going to if and then i am going to use substring to swap first name with last name if it contains underscore
            // first i created the variable of firstspace

            System.out.println("email = " + email);

            int firstSpaceIndex = email.indexOf("_");
            int secondSpaceIndex = email.indexOf("@");
            //String first = email.substring(0,firstSpaceIndex);
           // String last = email.substring(firstSpaceIndex+1,secondSpaceIndex);



            if (email.contains("_")) {
                System.out.println(email.substring(firstSpaceIndex+1,secondSpaceIndex)+ "_"+email.substring(0,firstSpaceIndex)+"gmail.com");

            }else{
                System.out.println(email);
            }

}
}
