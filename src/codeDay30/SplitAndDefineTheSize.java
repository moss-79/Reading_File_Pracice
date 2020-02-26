package codeDay30;

import java.util.*;

public class SplitAndDefineTheSize {
    public static void main(String[] args) {

        String sentence = "I Love Java Java Java" ;

        String[] wordsArray = sentence.split(" ",7);
        System.out.println("wordsArray = "+ Arrays.toString(wordsArray));

        System.out.println("wordsArray.length = " + wordsArray.length);
    }
}
