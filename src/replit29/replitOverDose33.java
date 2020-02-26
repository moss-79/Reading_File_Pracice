package replit29;

import java.util.Scanner;

public class replitOverDose33 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");
        int numberOfBedrooms = scan.nextInt();

        //int startingPrice;

        //WRITE YOUR CODE HERE
        if (numberOfBedrooms == 1) {
            int startingPrice = 1100;
            System.out.println("One Bedroom Selected");
            System.out.println("set startingPrice as " + startingPrice);
        } else if (numberOfBedrooms == 2) {
            int startingPrice = 1850;
            System.out.println("Two Bedroom Selected");
            System.out.println("set startingPrice as " + startingPrice);
        } else if (numberOfBedrooms == 3) {
            int startingPrice = 2550;
            System.out.println("Two Bedroom Selected");
            System.out.println("set startingPrice as " + startingPrice);
        } else {
            System.out.println("No such Bedrooms available");
        }
        //System.out.println("Starting Price: "+startingPrice);


    }
}