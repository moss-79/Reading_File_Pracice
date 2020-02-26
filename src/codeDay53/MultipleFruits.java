package codeDay53;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleFruits {

    public static void main(String[] args) {

        Apple a1 =  new Apple("Sweet","red","Fuji");
        Fruit f1 = a1;

        Fruit f2 = new Apple("Crispy but tasteless","hot red","Gala");

        Fruit f3 = new Orange("sour","orange",12);

        Fruit f4 = new Orange("very Sweet","Blood red",18);

        Fruit [] myFruits = {f1,f2,f3,f4};
        for (Fruit eachFruit :
                myFruits) {
            eachFruit.getDigested();
        }

        // in this way , it's not resizable | adding removing will not work | everything else works 
       // List<Fruit> fruitList = Arrays.asList(f1,f2,f3,f4);
        
        List<Fruit> fruitList = new ArrayList<>(Arrays.asList(f1,f2,f3,f4));

        for (Fruit eachFru :
                fruitList) {
            System.out.println("eachFru.toString() = " + eachFru.toString());
            System.out.println("Class Type : "+ eachFru.getClass().getSimpleName());
        }
    }
}


