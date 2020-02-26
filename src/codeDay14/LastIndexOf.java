package codeDay14;
import java.util.Scanner;
public class LastIndexOf {

    public static void main(String[] args) {
        //
        Scanner scan = new Scanner(System.in);

        String name = scan.next();//"GAME OF JAVA"; // lenngth is 12 . last char index is 11

        // find out last location the letter a shows up so
        System.out.println(name.lastIndexOf(name));

        // find out last location the character
        System.out.println("find out last location the space shows uo");
        System.out.println( name.lastIndexOf(" "));

        // find out last location letter GA shows up
        System.out.println("find out last location the letter ga shows uo");
        System.out.println( name.lastIndexOf("Ga"));

        // find out last location the letter kawa shows up
        System.out.println("find out last location the space shows uo");
        System.out.println( name.lastIndexOf("Kawa"));

        // if i DONT USE contains method , what would be my condition to check
        // whether we have kawa in this string, either using indexof or lastIndex

        if (name.indexOf("Kawa") > -1){

            System.out.println(" KAWA FOUND!!");
        }else {

            System.out.println(" KAWA  NOT FOUND!!");
        }


    }
}
