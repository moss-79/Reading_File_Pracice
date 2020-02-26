package codeDay21;

public class LoopControlStatement {
    public static void main(String[] args) {


        for (int  x = 0;  x <= 100 ;  x++) {
            if (x %5 == 0 ){
                System.out.println("SKIPPING "+x);
                continue;
            }
            System.out.print( x+" |");
        }
    }
}
