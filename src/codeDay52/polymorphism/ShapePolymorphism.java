package codeDay52.polymorphism;

public class ShapePolymorphism {

    public static void main(String[] args) {


//        Circle  s1 = new Circle("penny",5);
        Shape  s1 = new Circle("penny",5);
//        Object s1 = new Circle("penny", 5);
        Shape  s2 = new Rectangle("Book", 10,5);
        printAnyShapeArea(s2);
//

        printAnyShapeArea(new Square("Bob",6));

//
//        System.out.println(s1.toString());
//
//        // How do I know what is the actual object type
//        System.out.println(s1.getClass().getSimpleName());


    }

    public static void drawShape3Times(Shape anyShape){


    }

    public static void printAnyShapeArea(Shape anyShape){

        anyShape.calculateArea();
        System.out.println(anyShape.name+ "'s area is = "+anyShape.area);
    }

}