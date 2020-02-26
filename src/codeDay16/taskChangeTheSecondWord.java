package codeDay16;

import javax.print.DocFlavor;

public class taskChangeTheSecondWord {

    public static void main(String[] args) {

        // given a sentence a
        // get the second word

        // steps :
        // second word is b/n first space and last space

        String sentence = "you Love Java";
        String secondWord;
        int fistSpaceIndex = sentence.indexOf(" ");
        System.out.println("fistSpaceIndex = "+fistSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        System.out.println(sentence.substring(2,6));
        secondWord = sentence.substring(fistSpaceIndex+1 , lastSpaceIndex);
        System.out.println("secondWord = "+ secondWord );

        // HOW TO GET FIRST WORD
        // in plain english : first word is stating from first character till first space

        String firstWord = sentence.substring(0, fistSpaceIndex);
// how do we print out a variable with value using shorcut : soutv then tab
        System.out.println("firstWord = " + firstWord);

        // HOW TO GET last WORD
        // in plain english : last word is stating from  last  space till end
        String lastWord = sentence.substring(lastSpaceIndex +1);
        System.out.println(lastWord);
    }
}
