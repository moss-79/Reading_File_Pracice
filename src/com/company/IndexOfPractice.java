package com.company;

public class IndexOfPractice {

    public static void main(String[] args) {
        // indexof --->
        // find out index fo another string inside this string
        //             012345678901
        String name = "GAME OF JAVA";
        // Find out the location of java
        // Find out the location of letter 0
        // Find out the location of first space

        System.out.println( name.indexOf("JAVA") );
        System.out.println( name.indexOf("O") );

        // if the location in not found , we got negative one
        System.out.println( name.indexOf('o') );// like lower case

        System.out.println("find the location of  first space ");
        System.out.println( name.indexOf(" ") );


    }
}
