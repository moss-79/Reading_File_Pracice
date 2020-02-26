package codeDay27;

public class ArraysTask {
    public static void main(String[] args) {

         /*Task 02
           Write a program that can find the minimum number from int array

           write a program that can find the second number for an array
           DO NOT use sort method

         */

    int[] scores = {100,90,145,62,45,3,129};

    int min = 9999999;

    for(int i =0 ;i < scores.length; i++){

        if(min > scores[i]){
            min = scores[i];

        }
    }
        System.out.println("minmum number: "+min);
    int secondMin = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]== min) {
                continue;
            }
            if (secondMin > scores[i]){
                secondMin = scores[i];
            }
            System.out.println("second minimum is :"+ secondMin);
            }
        }
}

