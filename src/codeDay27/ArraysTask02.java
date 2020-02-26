package codeDay27;

public class ArraysTask02 {

    public static void main(String[] args) {

        int[] nums = {100, 10000, 999, 8888, 1237, 2456};

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) ;
            max = nums[i];
        }
        System.out.println(" Muximum number = " + max);

        int secondMax = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (secondMax < nums[i] && nums[i] != max) ;
            secondMax = nums[i];
        }
        System.out.println(secondMax);
    }
}