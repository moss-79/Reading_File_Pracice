package codeDay21;

public class NumberStairCase {

    public static void main(String[] args) {



        for (char i = '*'; i <= 10; i++) {
            System.out.println(i);


            for (char j = '*'; j <= 14; j++) {
                System.out.println(j);

                for (char x = '*'; x <= j; x++) {
                    System.out.println(j);

                }
            }
        }
    }
}