package codeDay45;

public class Phone extends Electronic{

    // Sub class inherit every visible instance field static field
    //Sub class inherit every visible instance method and  static method

    // String brand;
    // static boolean useElectricity = true;

    double size;
    double price;

    // bad idea to hae main here
    // but we are doing it anyway for less screen to look at
    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.size = 12;
        p1.price = 399;
        p1.brand = "Apple";

        System.out.println(Electronic.useElectricity );
        System.out.println(Phone.useElectricity);

        // directly accessing teh static field of same class in static method
        System.out.println(useElectricity  );
        // as long as u can access the inheritance class u have an access to everything


        // how to call showBrand method
        p1.showBrand();

        // how to call displayUseElectricity static method
        displayUseElectricity();

        //Static way
        Electronic.displayUseElectricity(); //OR
        Phone.displayUseElectricity();


    }
}
