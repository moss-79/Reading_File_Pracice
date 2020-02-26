package codeDay24;


import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        double [] prizes = { 21.5,12.5,35.2};
        String S = Arrays.toString(prizes);

        System.out.println("S = " + S);
        for (int i = 0; i < S.length(); i++) {
            System.out.print(" " + S.charAt(i));
        }
    }
}
