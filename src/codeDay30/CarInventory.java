package codeDay30;

public class CarInventory {
    public static void main(String[] args) {

                String[] cars = {"Acura-NSX",
                        "Chevrolet-Corvette",
                        "Chevrolet-Cavalier",
                        "BMW-3 Series",
                        "Pontiac-LeMans",
                        "BMW-7 Series",
                        "Oldsmobile-Achieva",
                        "Honda-Civic"};
                // Task1 : count Chevrolet and civic
        int chevyCount = 0;
        int civic = 0;
        for (String eachCar : cars ) {
            if (eachCar.toLowerCase().startsWith("chevrolet")){
              chevyCount++;
            }

            if(eachCar.toUpperCase().contains("CIVIC"));
            civic++;
        }

        System.out.println("chevyCount = " + chevyCount);
        System.out.println("civic = " + civic);
            }
}
