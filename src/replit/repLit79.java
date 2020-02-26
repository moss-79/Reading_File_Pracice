package replit;


import java.util.Scanner;

public class repLit79 {
    public static void main(String[] args) {

        //   Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.
        // first lets use if  and if else
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

    /*    char a = word.charAt(0);
        char b = word.charAt(word.length() - 1);



        if (a == 'x'|| a == 'X' && b == 'x' || b == 'X'){
            System.out.println(word.substring(1,word.length()-1));

            }
        else {
            System.out.println(word);


        }


     */

       if(word.substring(0,1).equalsIgnoreCase("x") && word.substring(word.length()-1).equalsIgnoreCase("x")){
           System.out.println(word.substring(1,word.length()-1));
       }else if(word.substring(0,1).equalsIgnoreCase("x")){
           System.out.println(word.substring(1,word.length()));
       }else if(word.substring(word.length()-1).equalsIgnoreCase("x")){
           System.out.println(word.substring(0,word.length()-1));
       }else {
           System.out.println(word);
       }
    }
    }