package codeDay45;

public class Book {


    // if we do not explicitly (visibly, manually) extends another class
    // we always automatically extends Object class
    // Object class is super
    public static void main(String[] args) {

        Book b1 = new Book();
      System.out.println("b1 = " + b1.toString());
    }

    public String toString (){
        return "my own version of toString";

    }
}
