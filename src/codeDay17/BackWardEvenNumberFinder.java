package codeDay17;

public class BackWardEvenNumberFinder{
    public static void main(String[] args) {


        int number = 100;
        while (number > 0) {


            if (number % 2 == 0) {
                System.out.println(number + "is even");
          //  } else if (number % 2 != 0) {
              //  System.out.println(number + "is odd");
            }
            --number;
            System.out.println("number = " + number);
            //you have to be thankful for what you have
        }
    }
}