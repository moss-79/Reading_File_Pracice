package codeDay47;

public class Student {

    // final INSTANCE FIELD
    final int studentID;

    // public final static field with initial value set
    // This type of field name always suggested to make all uppercase
    // to make it cleat that this is a public static final field that never change
    // other languages has specific term called CONSTANT for this
    // If interviewer asks how do I define CONSTANT in java?
    // you would say will create public static final field
    public static final String SCHOOL = "Cybertek";

    public Student(int studentID){
        this.studentID = studentID;
    }
}
