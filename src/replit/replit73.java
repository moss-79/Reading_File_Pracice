package replit;
import java.util.Scanner;
public class replit73 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        int x = word.length()/2;
        int y = word.length()/2-1;
        int z = word.length()/2+1;
        if(word.length()%2 !=0 && word.length() >= 5 ){
         //   System.out.print(word.substring(y));
            System.out.print(word.substring(y,x));
           System.out.print(word.substring(x,z));
            System.out.println(word.substring(z,x+2));

        }else {
            System.out.println(" Invalid entry");
        }

    }
}
