package codeDay48;


import java.util.ArrayList;
import java.util.List;

public class BouncingParty {

    public static void main(String[] args) {

        Kangaroo b1 = new Kangaroo("Coco", 10);
        System.out.println("b1 = " + b1);
        b1.bounce();
        b1.eat();
        b1.carryChildInThePocket();
        b1.kickBox();

        // SuperType variableName = new SubType(...) ; THIS WORKS
//        List<Integer> lst = new ArrayList<>();
        Bouncible k1 = new Kangaroo("Toto",6);
        k1.bounce();

        Ball b2 = new Ball("Round", "Blue");
        b2.bounce();

        System.out.println(Bouncible.gravity);
    }
}
