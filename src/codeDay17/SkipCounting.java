package codeDay17;

public class SkipCounting {

    public static void main(String[] args) {

        int count = 0;
        while (count <= 50) {
            count += 2;
            System.out.print( + count + " ");
        }
        System.out.println("---------------------------");
        int count1 = -1;
        while (count1 < 50) {
            count1 += 2;
            System.out.print( + count1 + " ");
        }

    }
}