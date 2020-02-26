package codeDay43;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Starbucks {

    public static void main(String[] args) {

        Coffee c1 = new Coffee();
        System.out.println("c1 = " + c1);

       Coffee c2 = new Coffee("Intensito", 9);
        System.out.println("c2 = " + c2);

        Coffee c3 = new Coffee("Blonde", 5,1.5);
        System.out.println("c3 = " + c3);

        Coffee c4 = new Coffee("Latte", 3,2.15);
        System.out.println("c4 = " + c4);





        //c1  = null;

        // any non-primitive type can be assigned to null
     //   String str = null;// we can write any String Object
    //    Scanner scan = null;// we can write down any Scanner Object
     //   Coffee cx = null;// any Coffee object





      //  List<String  > lst = new ArrayList<>();
     //   lst.add("abc");
      //  lst.add(null);
      //  lst.add(null);
      //  lst.add(null);


    }
}
