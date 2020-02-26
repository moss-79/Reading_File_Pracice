    package codeDay45;

    public class Fruit {

        // Always add no ARG constructor in super class
        // to avoid unnecessary error of sub class calling
        // super class's no ARG constructor
    public Fruit(){
        System.out.println("No Arg Fruit constructor message");
    }

       public Fruit(String str){
           System.out.println("One Arg Fruit constructor");
       }
    }
