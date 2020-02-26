package codeDay51;

public class ComparableString {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "xyz";

        // the only thing that matter is - or  + or 0
        System.out.println("s1.compareTo(s2) = " + s1.compareTo(s2));
        System.out.println("s2.compareTo(s1) = " + s2.compareTo(s1));
        System.out.println("s1.compareTo(s1) = " + s1.compareTo(s1));
    }
}
