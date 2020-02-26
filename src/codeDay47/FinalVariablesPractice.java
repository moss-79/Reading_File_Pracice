package codeDay47;

public class FinalVariablesPractice {

    public static void main(String[] args){

        // declaring and initializing a variable
        // declaring and assigning initial value
        int x = 10 ;
        // re-assigning new value to the variable
        // storing/ giving new value to the variable
        // changing the original value of the variable
        x = 100 ;

        final int a = 20 ;
        // after final is assigned done deal no change value


        Student s1 = new Student(101);
        // can not reassign the value because it's final
        // s1 = new Student (102) ;
        // YOU can still change internal data attached to the object
        // as long ss its the same object s1 pointing to
        // al long as the address does not change
 //        s1.studentID = 200;
        System.out.println(s1.studentID);


        System.out.println(Student.SCHOOL);
        // can not reassign value because it's final
    //    Student.school = "abc";

        // INTELLIJ AUTOMATICALLY RECOGNIZE CONSTANT (public static final field )
        // it will automatically make it italic (This can not be done by programmer
        // easy way to distinguish between fields and methods is
        // by looking at () at the end
        System.out.println(Byte.MAX_VALUE);

        // PI in Java
            System.out.println(Math.PI);
    }
    /*
   *a void method that accept a number and print out doubled number
   * @param x
   *
     */
    // anywhere we declared a variable we have option to make it final (including method parameter)
    // making method parameter final
    // it will make the method only use the argument user passed without modifying it;
     public static void printDoubledNumber(final int x ){
      //  x = x *2; can not
      //  System.out.println("x*2 = "+x);

         System.out.println("x*2 = "+x*2);// do it this way/ works right? blink left eye from the coder

    }
}
