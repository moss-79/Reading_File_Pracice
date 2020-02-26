package codeDay19;

public class CharAndForLoop {

    public static void main(String[] args) {

        // each character has it's corresponding ascii calue
        // from ascii table
        //int x = 'A';
        //System.out.println(x);


        char myChar = 'A' ;
        System.out.println(myChar);

        System.out.println(++myChar);

        System.out.println(++myChar);

        System.out.println(++myChar);

        System.out.println(++myChar);

        System.out.println(++myChar);


        System.out.println('A'> 'B');
        for (char iChar = 'A'; iChar <= 'Z'; iChar++){
            System.out.println(iChar + " ");

        }
        System.out.println();

        for( char kChar = 'Z' ;  kChar >= 'A' ; kChar --){
            System.out.println(kChar +" ");
        }


    }
}
