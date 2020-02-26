package replit;

import java.util.Scanner;

public class repLit88 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        String wordForDogs = word;

        while(word.contains("cat")){
            word = word.substring(word.indexOf("cat")+3);
            countOfCats++;
        }
        while(wordForDogs.contains("dog")){
            wordForDogs = wordForDogs.substring(wordForDogs.indexOf("dog")+3);
            countOfDogs++;
        }
        if(countOfCats==countOfDogs){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        while (word.contains("cat")) {
            word = word.substring(word.indexOf("cat")+3);
            countOfCats++;
        }
        while (wordForDogs.contains("dog")) {
            wordForDogs = wordForDogs.substring(wordForDogs.indexOf("dog")+3);
            countOfDogs++;
        }
        if (countOfCats == countOfDogs) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }





        String str = scan.next();
        int n = scan.nextInt();
        int count = 0;
        String prefix = str.substring(0, n);

        for (int i = 0;i <= str.length() - n; i++) {

            String currentString = str.substring(i, i + n);

            if (currentString.equals(prefix)) {

                count++;
            }
        }
        if (count > 1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
