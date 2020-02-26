package replit;

import java.util.Scanner;

public class repLit120 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {

            words[i] = input.nextLine();

        }

        //write your code below

        String longest = "";
        for (String eachWord :
                words) {
            

            if (longest.length() < eachWord.length()) {
                longest = eachWord;
            }
        }
        System.out.println(longest);
    }

}