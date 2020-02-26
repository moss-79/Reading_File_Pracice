package replit29;

import java.util.Scanner;

public class replitShopping30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();
        System.out.println("Item1 is "+item1+", count is "+count1+", price is "+price1);


        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();
        System.out.println("Item2 is "+item2+", count is "+count2+", price is "+price2);

        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();
        System.out.println("Item3 is "+item2+", count is "+count3+", price is "+price3);

        double totalPrice = price1+count1 + price2+count2 + price3+count3;



        if (price1*count1> 0 && price2*count2> 0 && price3*count3 >0) {

            System.out.println("Item1: " + item1 + " Price: " + price1*count1 + ", Item2: " + item2 + " Price: " + price2*count2 + ", Item3: " + item3 + " Price: " + price3*count3);
            System.out.println("Total price: " + totalPrice);
        }else if (price1*count1> 0 && price2*count2> 0 ){
            System.out.println("Item1: " + item1 + " Price: " + price1*count1 + ", Item2: " + item2 + " Price: " + price2*count2);// + ", Item3: " + item3 + " Price: " + price3*count3);
            System.out.println("Total price: " +price1*count1+price2*count2 );
        }else if (price1*count1> 0 && price3*count3 >0){
            System.out.println("Item1: " + item1 + " Price: " + price1*count1 + ", Item3: " + item3 + " Price: " + price3*count3);
            System.out.println("Total price: " +price1*count1+price3*count3 );
        }




    }
}