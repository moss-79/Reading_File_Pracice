package replit;

import java.util.Scanner;

public class repLit142
{


        // first use nested  for loop and use declared variable to count(find) the max
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            int rows = inp.nextInt(), cols = inp.nextInt();
            int[][] arr = new int[rows][cols];

            int maxi = 0, maxj = 0;
            for(int i=0 ;i<=rows-1;i++)
            {
                for(int j=0 ;j<=cols-1;j++)
                {
                    arr[i][j]=inp.nextInt();
                }//end for cols
            }//end for rows


            //TODO write your code below

            for(int i=0 ;i<=rows-1;i++)
            {
                for(int j=0 ;j<=cols-1;j++)
                {
                    if(arr[i][j] > arr[maxi][maxj]){
                        maxi=i;
                        maxj=j;
                    }

                }
            }System.out.println(arr[maxi][maxj]);






        }//end main
    }
