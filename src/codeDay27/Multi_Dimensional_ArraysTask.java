package codeDay27;

import codeDay26.Array;

import java.util.*;

public class Multi_Dimensional_ArraysTask {
    public static void main(String[] args) {

        int [][] ages = {{10}, {12,13,14,16,17} , {19,20,21,22,23}};

        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++) {

                if (ages[i][j] % 2 != 0){
                    continue;
                }
                System.out.print(ages[i][j]+ " ");
            }
        }
        System.out.println();
        System.out.println("---------------------------------------------------");

        int[] arr1D = { 1,2,3};
        for (int each:arr1D){
            System.out.print(" " + each);

        }
        System.out.println();
        System.out.println("---------------------------------------------------");
        int [][] age = {{10}, {12,13,14,16,17} , {19,20,21,22,23}};
        for (int[] arr2D :
                age) {
            for (int eachelemnt :
                    arr2D) {
                System.out.print(" " + eachelemnt);
            }
        }
    }
}
