package codeDay32;


public class MethodWithReturnIntro {
    public static void main(String[] args) {
        String name = giveMeMyName();
        System.out.println("name = " + name);

        int myResult = doubleTheNumber(10);
        System.out.println("myResult = " + myResult);

        //System.out.println(Arrays.toString(arrayObjectHere));
        // just like we can directly use the toString method above and print the value
        // we can print the result of a method call directly , if the method return a value
        System.out.println("result of doubling 100 is "+ doubleTheNumber(100));

        System.out.println("the result 14 and 16 "+add2Numbers(14,16));

    }public static int doubleTheNumber(int num ){

        System.out.println("I am going to double the value of "+ num);
        int result = num*2;
        return result;
    }
    // i want to create a static method callded giveMyName
    // it returns your name as result
    // it has no parameters
    public static String giveMeMyName (){

        return "Mussie";
    }
    // create a method callded add , accept 2 int parameter
    // and return the result as int
    //
    public static int add2Numbers(int num1 , int num2){
        // int sum = num1+num2;
        // return sum;
        return num1+num2;


    }

}
