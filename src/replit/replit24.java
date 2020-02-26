package replit;
import java.util.Scanner;
public class replit24 {
    public static void main(String[] args) {
        //Enter your code here
        Scanner scan = new Scanner(System.in);
        System.out.println( "Welcome to the patient portal!");
        System.out.println("Please enter your personal information");


       // int  age,zipcode;
       // double height,weight;
       // boolean isMarried;
       // long workPhoneNumber,personalPhoneNumber;
       // street


        System.out.println("Enter your first name");
        String firstName=scan.nextLine();

        System.out.println("Enter your last name");
        String lastName=scan.nextLine();

        System.out.println("Enter your email");
        String email=scan.nextLine();


        System.out.println("Enter your street");
        String street=scan.nextLine();

        System.out.println("Enter your city");
        String city=scan.nextLine();

        System.out.println("Enter your state");
        String state=scan.nextLine();

        System.out.println("Enter your zip code");
        int zipcode= scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber= scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber= scan.nextLong();

        System.out.println("Enter your age");
        int age= scan.nextInt();

        System.out.println("Enter your height");
        double height= scan.nextDouble();

        System.out.println("Enter your weight");
        double weight= scan.nextDouble();

        System.out.println("Enter your last name");
        boolean isMarried= scan.nextBoolean();



        // System.out.println("Enter your last name");
        // String address= scan.next();

        //System.out.println("Enter your last name");
        //String contacts= scan.next();

        System.out.println("Patient personal information");
        System.out.println("Full name:"+firstName+", "+lastName);
        System.out.println("Address: "+street+", "+city+", "+state+" "+zipcode);
        System.out.println("Contacts: work phone number - "+workPhoneNumber+", personal phone number - "+personalPhoneNumber+",  email: "+email);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight+" pounds");
        System.out.println("Married?: "+isMarried);






        // this part is already provided DO NOT CHANGE
        //  System.out.println("Enter your email");
        //email = scan.next();
        //scan.nextLine();//to capture Enter key press
        //System.out.println("Enter your street");
        //street = scan.nextLine();
        // continue for city




    }
}














