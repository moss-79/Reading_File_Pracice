package codeDay20;

public class palindromeTest {

    public static void main(String[] args) {


        // if you reverse a String it does change it means
        // it means the String is  Palindrome

        // level , kayak , elle madam , aziza
        String name = "kayaka";
        System.out.println("name = " + name);
        String reversedName = "";

        for (int x = name.length()-1 ; x>= 0 ; x--){
            reversedName = reversedName + name.charAt(x);
        }
        System.out.println("reversedName = " + reversedName);


        if (name.equalsIgnoreCase(reversedName)){
            System.out.println("palidrome test has passed");
        }else {
            System.out.println("palidrome test has failed");
        }
    }
}
