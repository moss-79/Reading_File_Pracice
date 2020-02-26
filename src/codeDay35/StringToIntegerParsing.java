package codeDay35;

public class StringToIntegerParsing {
    public static void main(String[] args) {




        String strNum="100";
        int num = Integer.parseInt(strNum);
        System.out.println("num = " + num);

        String empID = "FB-457";
//        int id =Integer.parseInt(empID);
        /*
        *Integer class is class coming fom java.lang package
        * it's primarily used for wrapping up primitive value and treat it
        * what we will focus here is though
        * many useful static methods it provide already
        * paresInt is a static method of Integer class
        * it will turn a String that has only numbers and return int result
        * if we have any non- numerical character--->> it will throw NumberFormatException
         */

        // int id = Integer.parseInt( empID.split("-")(1));

        String[] empIDsplit = empID.split("-") ;
        String idStr = empIDsplit[1];
        int id =       Integer.parseInt(idStr);

        System.out.println("id = " + id);


        // I have a String called twoNumbers
        // String twoNumbers = "100,600";
        String num1 = "100";
        String num2 = "600";
        // i want you to add the and give the result 700

        int NUM1 =  Integer.parseInt(num1);
        int NUM2 =  Integer.parseInt(num2);

        System.out.println("the result is "+(NUM1+NUM2));
    }
}
