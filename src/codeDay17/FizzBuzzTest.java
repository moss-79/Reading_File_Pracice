package codeDay17;

public class FizzBuzzTest {

    public static void main(String[] args) {

        // if a mumber can be divided by both 3 and 5 ---> fizz buzz number
        //if a mumber can be divided by 5 ---> fizz number
        //if a mumber can be divided by  3 ---> buzz number

       // int num = 14;
     //   if (num % 5 == 0 && num % 3 == 0) {
     //       System.out.println(num + " is fizz buzz number");
     //   } else if (num % 5 == 0) {
     //       System.out.println(num + " is fizz  number");
     //   } else if (num % 3 == 0) {
     //       System.out.println(num + " is buzz number");

      //  }


        int num1 = -1;
        while (num1 <= 100) {

            if (num1 % 5 == 0 && num1 % 3 == 0) {
                System.out.println(num1 + " is fizz buzz number");
            } else if (num1 % 5 == 0) {
                System.out.println(num1 + " is fizz  number");
            } else if (num1 % 3 == 0) {
                System.out.println(num1 + " is buzz number");
            }
            num1++;
        }
    }
}