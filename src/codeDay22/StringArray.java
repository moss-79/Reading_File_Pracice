package codeDay22;
import java.util.Scanner;
public class StringArray {

    public static void main(String[] args) {

        // create an String array with size that you define
        // and store all your household member names

        String [] memberNames =new String[5];
        Scanner scan = new Scanner(System.in);
        memberNames[0]= scan.next();
        memberNames[1]= scan.next();
        memberNames[2]= scan.next();
        memberNames[3]= scan.next();
        memberNames[4]= scan.next();

      //  System.out.println(memberNames[0]);
      //  System.out.println(memberNames[1]);
       // System.out.println(memberNames[2]);
       // System.out.println(memberNames[3]);
      //  System.out.println(memberNames[4]);


        int elementCount = memberNames.length;
        for (int i = 0; i < elementCount; i++) {
            System.out.println("i = " + i);
            System.out.println(memberNames[i]);

        }
        }
    }

