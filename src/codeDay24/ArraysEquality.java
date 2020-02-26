package codeDay24;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {

        int [] scores1 ={2,5,6,7,3,34,6};
        int [] scores2 ={22,45,6,37,3,6,9};
        int [] scores3 ={2,5,6,7,3,34,6};
        int [] scores4 = {6,5,67,3,2,34};

        System.out.println( scores1 == scores2);
        System.out.println( scores1 == scores3);
        // Arrays.sort(arrObject) does not return a value that we can store
        // it only takes action to reshuffle the index of original array object to keep it in sorted order

        boolean S1S2Equals = Arrays.equals(scores1,scores2);
        System.out.println(" is Score1 has same content as Score 2 = "+ S1S2Equals);


        boolean S1S3Equals = Arrays.equals(scores1,scores3);
        System.out.println(" is Score1 has same content as Score 3 = "+ S1S3Equals);

        boolean S1S4Equals = Arrays.equals(scores1,scores4);
        System.out.println(" is Score1 has same content as Score 4 = "+ S1S4Equals);

        System.out.println("Sorting score 3 and score 4 then compare equality ");
        Arrays.sort(scores3);
        Arrays.sort(scores4);


        System.out.println(" is Score1 has same content as Score 4 = "+ S1S4Equals);

    }
}
