package replit;

import java.util.Scanner;

public class repLit101 {
    public static void main(String[] args) {



    Scanner scan = new Scanner(System.in);
    String sentence = scan.nextLine();
    int countOfJava =0;
    int countOfPython =0;

    for(int i = 0 ; i < sentence.length()-5; i++){
        String valueOfJava = sentence.substring(i,i+4);
        String valueOfPython = sentence.substring(i,i+6);
        if(valueOfJava.equals("java")) {
            countOfJava += 1;
            System.out.println("idiot 1");
        }
        if (valueOfPython.equals("python")) {
            ++countOfPython;
            System.out.println("idiot 2");
        }
    }
        System.out.println(countOfJava==countOfPython);
   /*if(countOfPython == countOfJava)
            System.out.println("true");
    else
            System.out.println("false");

    */



}
}


