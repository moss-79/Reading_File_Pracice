package codeDay31;


public class MethodPractice2 {

        //write piece of reusable code to count from 1 to 10
        // give a name count1to10
        // no need for object when being called
        // it should be acccessible anywhere in your project
        // id does not return any calue
        // does not need and external data when being called



    public static void count1to10(){
        for (int i = 0; i <= 10; i++) {
            System.out.println(i+ " ");}
        System.out.println();

    }
    public static void main(String[] args) {

       count1to10();
       //we can use it using this MethodPractice2.count1to10(); too
        }
    }

