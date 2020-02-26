package codeDay16;

public class indexOfWith2Paramerters {
    public static void main(String[] args) {


        String name = "I Love Java I Love Java Java Java";
        // how do i start from the location that get past first Java
        // basically starting point different that 0 so that it ger past first Java

        int firstJavaLocation = name.indexOf("Java");
        // starting point can be right after teh index of first character of the word/
        // or you can start here +4
       // or you can start write you finish the word you are searching , for the word java +4
        // if we do not know the length of the word ---> +word.length()
        int sratingPointToSearchSecondJava = firstJavaLocation + 1 ; 
        int secondJavaLocation = name.indexOf("Java" , sratingPointToSearchSecondJava);

        System.out.println("secondJavaLocation = " + secondJavaLocation);

        // i do not know how many word in this sentence
        //i only know there are 3+ words
        // and there is only one space in b/n words
        // i just want to know what is teh second word
        // the word in b/n first space and second space is second word

        int firstSpace = name.indexOf(" ");
        int secondSpace = name.indexOf(" " , firstJavaLocation + 1);

        System.out.println(" second word in this sentence is "+ name.substring(firstJavaLocation +1, secondSpace));

    }
}