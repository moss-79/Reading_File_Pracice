package replit;
import java.util.Scanner;
public class replit72 {
    public static void main(String[] args) {



        //substring will start at 0 and will end at txt length -1

        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        int x = txt.length()-1 ;
        System.out.println(txt.substring(0,x));
    }
}
