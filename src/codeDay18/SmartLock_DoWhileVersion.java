package codeDay18;
import java.util.*;
public class SmartLock_DoWhileVersion {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word1 = scan.next();
            String word2 = scan.next();
            //YOUR CODE HERE
            int x =word1.length()-1+word2.length()-1;

            while(x>= 0)
            { System.out.println(word1.charAt(x));
                System.out.println(word2.charAt(x));
                --x;

            }

        }
    }