package replit;



import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

public class replit128 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //   int k = 0;
//        double total = 0;
//        double avgTemp = 0;
//        double[] temps = {scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
//                scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble()};
//
//        for (int i = 0; i < temps.length; i++) {
//
//
//            total = total + temps[i];
//
//        }
//        avgTemp = total / temps.length;
//        System.out.println(avgTemp);


        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        float lowestV = score[0];
        float highestV = score[0];
        float sum = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("Enter score for judge " + (i + 1) + ":");
            score[i] = scan.nextFloat();
            // max value
            if (highestV < score[i]) {
                highestV = score[i];
            }

            //  sum = sum +score[i];

        }

        for (int i = 0; i < 7; i++) {
            if (lowestV >= score[i]) {
                lowestV = score[i];
            }
        }
        System.out.println("lowestV = " + lowestV);
        System.out.println("highestV = " + highestV);
//        float degreeOfD = scan.nextFloat();
//        sum = sum*degreeOfD;
//        float total= sum*0.6f ;
//        // FINAL OUTPUT
//        System.out.printf("Total: %.2f", total);
    }
}