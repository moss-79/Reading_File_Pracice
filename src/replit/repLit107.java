package replit;

import java.util.Scanner;

public class repLit107 {
    public static void main(String[] args) {
        int num, digit1, digit2, digit3, digit4, digit5;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        System.out.println(num);

  /*      digit1 =num/10_000;
        num%=10_000;
        digit2=num/1_000;
        num%=1_000;
        digit3 =num/100;
        num%= 100;
        digit4=num/10;
        num%= 10;
        digit5 =num/1;
        num%= 1;

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);

   */
  String eachNum = num+"";
        for (int i = 0; i < num; i++) {
            System.out.println(eachNum.charAt(i));
        }
    }
}
