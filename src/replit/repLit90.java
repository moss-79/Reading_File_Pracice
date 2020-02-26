package replit;
import java.util.*;

public class repLit90 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);

        System.out.println("Split:");
        String split = scan.nextLine();
        int l = split.length();
        System.out.println("l = " + l);
        if (split.equalsIgnoreCase("yes") ){

            System.out.println("Number of people:");
            int count = scan.nextInt();
            System.out.println("Check amount:");
            Double Check = scan.nextDouble();

            System.out.println("Service Quality: ");
            String service = scan.next();




            if (service.equals("Poor")) {

                for (int i = 4; i < count ; i++) {
                    i = i+'&';


                }System.out.print("Number of people entered:");

                System.out.println("Total to pay: " + (Check*5/100 + Check));
                System.out.println("Total tip: " + Check*5/100);
                System.out.println("Total per person: " + (Check*5/100 + Check)/count);
                System.out.println("Tip per person: " + (Check*5/100)/count);
            } else if (service.equals("Fair")) {
                for (int i = 4; i < count ; i++) {
                    count = count+'&';
                    System.out.print("Number of people entered:"+count);

                }
                System.out.println("Total to pay: " + (Check*10/100 + Check));
                System.out.println("Total tip: " + Check*10/ 100);
                System.out.println("Total per person: " + (Check*10/100 +Check)/ count);
                System.out.println("Tip per person: " + (Check*10/100)/count);
            } else if (service.equals("Good")) {
                for (int i = 4; i < count ; i++) {
                    count = count+'&';
                    System.out.print("Number of people entered:"+count);

                }
                System.out.println("Total to pay: " + (Check*15/100 + Check));
                System.out.println("Total tip: " + Check*15/100);
                System.out.println("Total per person: " + (Check*15/100 + Check)/count);
                System.out.println("Tip per person: " + (Check*15/100)/count);
            } else if (service.equals("Great")) {
                for (int i = 4; i < count ; i++) {
                    count = count+'&';
                    System.out.print("Number of people entered:"+count);

                }

                System.out.println("Total to pay: " + (Check*20/100 + Check));
                System.out.println("Total tip: " + Check*20/100);
                System.out.println("Total per person: " + (Check*20/100 + Check)/ count);
                System.out.println("Tip per person: " + (Check*20/100)/count);
            } else if (service.equals("Excellent")) {
                for (int i = 4; i < count ; i++) {
                    count = count+'&';
                    System.out.print("Number of people entered:"+count);

                }
                System.out.println("Total to pay: " + (Check*25/100 + Check));
                System.out.println("Total tip: " + Check*25/100);
                System.out.println("Total per person: " + (Check*25/100 + Check)/count);
                System.out.println("Tip per person: " + (Check*25/100)/ count);
            }
        }else if(split.equalsIgnoreCase("no") ){
            System.out.print("Check amount:");
            int Check = scan.nextInt();
            System.out.println("Total to pay: " + Check * 5 / 100 + Check);
            System.out.println("Total tip: " + Check * 5 / 100);
            System.out.println("Total per person: " + (Check * 5 / 100 + Check));
            System.out.println("Tip per person: " + (Check * 5 / 100));



        }
    }
}