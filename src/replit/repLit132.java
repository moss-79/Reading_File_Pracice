package replit;

import java.util.Scanner;

public class repLit132 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            float[] score = new float[7];
            //WRITE YOUR CODE HERE

            for(int i = 0 ; i < 7 ; i++){
                System.out.println("Enter score for judge "+ i+1+":");
                score[i] = input.nextFloat();
            }

            System.out.println("Enter difficulty:");
            float difficulty = input.nextFloat();

            float min = score[0];
            for(int i = 0 ; i < 7 ; i++){
                if(min>score[i]){
                    min = score[i];
                }
            }

            float max = score[0];
            for(int i = 0 ; i < 7 ; i++){
                if(max <score[i]){
                    max = score[i];
                }
            }
            float sum = 0;
            for(int i = 0 ; i < 7 ; i++){
                sum+= score[i];
            }


            float total1 = min+max;
            float total2 = sum-total1;
            float total3 = difficulty*sum ;
            float total = total3*0.6f ;


            // FINAL OUTPUT
            System.out.printf("Total: %.2f", total);
        }
    }
