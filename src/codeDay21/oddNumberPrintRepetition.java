package codeDay21;

public class oddNumberPrintRepetition {

    public static void main(String[] args) {

        /*
         *count from1 to 10 -->> print only odd numbers
         *
         * repeat this 4 times
         *
         *
         * */


        for (int i = 1; i <= 4; i++) {
            System.out.print("Interation="+i );
            for (int j = 1; j <= 10; j++) {
                if (j % 2 != 0) {
                    System.out.print( j);

                }
                System.out.println();
            }

        }
    }

}
