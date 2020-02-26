package codeDay43;

public class StarbucksUtil {
    public static void main(String[] args) {


        //Coffee co = new Coffee("Blonde",5,1.6);
      //  printCoffeeInfo(co);
        String myString = new String("Hello");
        printStringInfo(myString);

        // we would need an object of current class if we wanted to call
        // an instance method of current class // if it's not method its instant method
        // Coffee cc = new Coffee;
        // util.


    }

    public static void printCoffeeInfo(Coffee co){

        System.out.println("This coffee is : " + co.getType());
        System.out.println("The price is  : " + co.getPrice());
        System.out.println("CaffeineLevel : " + co.getCaffeineLevel());
    }

    /*
    * a static method to print out first and last character of a String
    * @param Str
    *
     */
    public static void printStringInfo(String str){
        System.out.println("first character is "+str.charAt(0));
        System.out.println("last character is  " + str.charAt(str.length()-1));
    }
}
