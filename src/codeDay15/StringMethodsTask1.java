package codeDay15;



public class StringMethodsTask1 {
    public static void main(String[] args) {


        //String methods :
        //length()
        //equals()
        //equalsIgnoreCase()
        //toUpperCase()
        //toLowerCase()
        //contains()
        //startsWith()
        //endsWith()
        //indexOf()
        //lastIndexOf()
        //isEmpty() //isBlank()
        //trim()
        //replace()
        //substring()
        //String tasks :
        //Task 1:
        //Given a String with any possible length including 0
        //print first 2 characters only if the String has more than 1 character
        //if the String is empty print Empty String
        //else print the first char twice in same Link
        //    for example :
        //        "abcde" --> ab
        //        ""        --> empty String
        //        "J"       --> JJ

     String name = "Mark";
     if (name.length()>1) {
         System.out.println(name.substring(0,2));
     }else if (name.isEmpty()){
         System.out.println("empty String");
     }else {
         System.out.println(name.charAt(0)+""+name.charAt(0));
     }

    }
}