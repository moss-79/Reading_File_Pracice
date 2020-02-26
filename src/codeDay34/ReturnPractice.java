package codeDay34;



public class ReturnPractice {
    public static void main(String[] args) {

        // what is return key word is used

        // break VS return
        // break -->> loop : break out of the loop
           // ---> switch : break out of the case
        // -->> can we use it to exit method ?? Noo!!!!
        // return -- >> inside a method
        // return the value out of a method with return type
        // the moment the return keyword is reached it will terminate the method
        // can it be used in void method?
        // yes BUT ONLY IN THIS WAY : return ;
        // what is the benefit of using in void method
        // to terminate the method early
        printMin4CharacterLengthName("Jon");
        printMin4CharacterLengthName("Java Shark");

    }
    public static void printMin4CharacterLengthName(String name ){
        // if the name has less than 4 chars , get out of the method
        //
        if(name.length() < 4 ){
            System.out.println("INVALID NAME !!!!!");
            return ;
        }
        System.out.println(name);
    }
}
