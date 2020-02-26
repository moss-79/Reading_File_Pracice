package codeDay32;

public class CharacterActions {
    public static void main(String[] args) {
        //printAtoZ();
       // printAtoZ();
        //printZtoA();
        printAlphabetInRange('z','a');
        printAlphabetInRange('A', 'D');
        printAlphabetInRange('G', 'Z');
        printAlphabetInRange('F', 'A');

    }
    public static void printAlphabetInRange(char beginning, char ending ){
        
        if (beginning < ending){
            //"we need to increment from "+beginning+ "till"+ending);
            for (char Ichar = beginning; Ichar <= ending; Ichar++) {
                System.out.print(Ichar +" ");
                
            }
            System.out.println();
        }else if (beginning > ending) {
           // "we need to decrement from " + beginning + "till" + ending);
            for (char Ichar = beginning; Ichar <= ending; Ichar--) {
                System.out.print(Ichar +" ");
            }
            System.out.println();
        }else {
            System.out.println("ThE ARE THE SAME CHARACTER !!!");
        }
    }

    /*
     *printAtoZ
     * create a method that has no paramerer
     *and print A-Z in one line
     *
     */
    public static void printAtoZ() {
        for (char iChar = 'A'; iChar <= 'Z'; iChar++) {
            System.out.print(iChar + " ");

        }
        System.out.println(); // b/c we  want to move to the next line while printing
    }

    public static void printZtoA() {
        /*
         *printAtoZ
         * create a method that has no paramerer
         *and print A-Z in one line
         *START FROM last character and end at the start using decrement
         */
        for (char iChar = 'Z'; iChar >= 'A'; iChar--) {
            System.out.print(iChar + " ");

        }System.out.println();// b/c we  want to move to the next line while printing
    }
}