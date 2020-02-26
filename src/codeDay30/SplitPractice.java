package codeDay30;

import java.util.Arrays;

public class SplitPractice {
    public static void main(String[] args) {
        String car = "Lexus-IS-F";
        String[] CarSplit = car.split("-",2);
        System.out.println("CarSplit = " + Arrays.toString(CarSplit));

        String model = CarSplit[1];
        System.out.println("model = " + model);
        System.out.println(CarSplit[0]+" "+CarSplit[1]);

      //       car = String
        //     carsplitted = array [String]
    }
}
