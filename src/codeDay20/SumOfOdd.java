package codeDay20;

public class SumOfOdd {
    public static void main(String[] args) {


        /* C
        create a class called sumofodd
        give me the sum of odd numbers from
        10 - 100 , use for loop

        hint : create a variable sum as int
        loop through 10 - 100
        in each itertion check it's a even number or not
        if it's add that number to sum
        e
      eventually after the loop  -----> print out sum value
         */
        int sumOfEven = 0;
        int sumOfOdd = 0;


        for (int i = 1; i <= 100; i++ ) {

            if (i % 2 == 0) {
                sumOfEven = sumOfEven + 1;
            } else {
                sumOfOdd = sumOfOdd + 1;
            }
        }
            System.out.println("sum of odd = " + sumOfOdd);
            System.out.println("sum of odd = " + sumOfEven);

        }


    }

