package replit;

import java.util.Scanner;

public class repLit144 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        int matches = 0;

        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
                if(i==j){
                    matches++;


                }
            }//end for cols
        }//end for rwos

        //your code here







        System.out.print("matches: "+matches);
    }//end main
}

