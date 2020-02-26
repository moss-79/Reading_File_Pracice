package codeDay27;

import codeDay26.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview {
    public static void main(String[] args) {

        /*Array : a variable that  allows us to multiple values
        regular variables : we can only store one single value
        Array's size fixed

        decleration
        int a = 10 ;

        array variables :
        int[] arr = {1,2,3};
        index:       0 1 2

        retrive data :
        arrayName[indexNumber] ==> element of that index number
        ex:
        arr[2] ==> 3

        inorder to print an Array it has to be converted to String


         */

        int num = 10;
        int[] arr = {10,20,30,40,50,60};
        // length : returns the total number of elemnents from the array
              // last index num: arr.length-1
        int num1 = arr[arr.length-1];
        //                 6     -1  =  5
        System.out.println("num1 = " + num1);
        System.out.println("================================");


        // expected : 10 20 30 40 50 60
        for (int x = 0; x < arr.length; x++) {

            System.out.print(arr[x]+ " ");

        }
        System.out.println("================================");
        // Arrays.toString():
        // so let's change the array first to string
        String str = Arrays.toString(arr);

        System.out.println(str);

        /*Task 01:
         Write a program that asks user to enter a number 5 times.
         and store those number into array
         */

        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter an int number ");

            numbers[i]= scan.nextInt();
        }
        System.out.println((Arrays.toString(numbers)));

        Arrays.sort(numbers);

        int largestNumber = numbers[numbers.length-1];
        System.out.println("largestNumber = " + largestNumber);
        int mininmumNumber = numbers[0];
        System.out.println("mininmumNumber = " + mininmumNumber);



    }
}
