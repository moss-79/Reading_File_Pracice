package codeDay21;

public class WakeUpTask1_NamePrinter {
    public static void main(String[] args) {

        /*
        DAY 21 :
Create a class called WakeUpTask1_NamePrinter
Given your name stored in a variable myName as String
 for example :  String myName = "My name is Yourname here" :
 1, loop through each and every character print them out like this :  M->y-> >n->a->m->e-> and so on
 put arrow in beterrn the character
Optionally
 2 , print the sentence by 2 character at a time
 		just by incrementing by 1
 3 , print the sentence by 3 character at a time
 4 , print the sentence by 4 character at a time
 String name = "Seyma";
        int charCount = name.length();
        int lastCharIndex = charCount - 1;
        for (int i = 0; i <= lastCharIndex - 1; i++ ){
            System.out.println(name.substring(i, i + 2));
        }

         */

       // String name = "Seyma";
        //  int charCount = name.length();
        // int lastCharIndex = charCount - 1;
        // for (int i = 0; i <= lastCharIndex - 1; i++ ){
        //   System.out.println(name.substring(i, i + 2));

/*
        String myName = "My name is YourName here";
        int charCount = myName.length();
        int n = 2;
        for (int x = 0; x <= charCount - n; x++) ;

       // System.out.println(myName.substring(x, x + n));
*/

        String msg = "Hello World";

        int charCount1 = msg.length();

        int n1 = 7;

        //  x <= charCount-n

        for (int x = 0; x <= charCount1 - n1; x++) {

            System.out.println(msg.substring(x, x + n1));

        }
    }
}


