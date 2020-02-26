package replit;
import java.util.*;

public class repLit188 {
    //WRITE YOUR CODE HERE

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        // double sized = scan.nextDouble();

        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();


        }
//        double [] numsd = new double[size];
        //  int maxInt = nums[0] ;

    }


    public int findMax(int[] nums) {

        int maxInt = nums[0];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxInt) {
                maxInt = nums[i];
                index = i;

            }
            return nums[index];

        }
        return nums[index];
    }
        public void findMax (double[] nums){

            double maxDouble = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > maxDouble) {
                    maxDouble = nums[i];
                }
            }


        }
//    }
}