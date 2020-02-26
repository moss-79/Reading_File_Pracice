package codeDay32;

import codeDay26.Array;

import java.util.Arrays;

public class ArrayPracticeWithMethod {
    public static void main(String[] args) {
        PrinterArray(new int[]{1, 2, 3, 5, 6, 9});


        // this is assigning the array object into a variable
        // and then pass it into the method

        int[] scores = {2, 5, 8, 9, 4, 3, 15};
        PrinterArray(scores);


        printMaxOfInArray(new int[]{1, 5, 7, 9, 3, 45});

        printMinOfInArray(new int[] {6,5,45,12,6});

        printSumOfIntArray(new int[] {6,5,45,12,6});

        compare2arraySize(new String[]{"mso,moss,habtezgi"},new String[]{"habtish,moss,habtezgi"});

    }

    // PrinterArray
    // create a methode that has one int array as a parameter
    // print out each item in this format
    // arrays has items : ---> all the items here

    public static void PrinterArray(int[] nums) {

        System.out.println("arrays has items :" + Arrays.toString(nums));
    }

    // printMaxOfInArray
    // this method has one int array as parameter
    // and it will print the max number inside the array
    public static void printMaxOfInArray(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println(max);

    }

    public static void printMinOfInArray(int[] num) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < max) {
                max = num[i];
            }
        }
        System.out.println(max);
    }
    public static void printSumOfIntArray(int[]nums){
        int sum = 0;
        for (int each :nums
             ) {
            sum = sum + each;

        }
        System.out.println("sum = " + sum);
    }
    /*compare2arraySize
    create a method that accept 2 array object
     and compaare the item counts inside these 2 arrays
     if arr1 is more then print array 1 has more item
     if arr2 iis more then print array 2 has more item
     else print then


     */
    public static void compare2arraySize(String[] arr1,String[] arr2){
        if (arr1.length>arr2.length ) {
            System.out.println("array 1 has more item");
        }else if (arr1.length<arr2.length ) {
            System.out.println("array 1 has more item");
        }else {
            System.out.println("they are equal");
        }
        }
    }







    // OPTIONALLY
// checkScoresAllMoreThan60
// this method has one int array as parameter
// and it will check whether each and every numbers are more than 60
// if so print everyone passed
// if not print someone has failed
