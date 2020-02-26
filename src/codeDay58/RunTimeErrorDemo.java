package codeDay58;

public class RunTimeErrorDemo {
    static int num  = 0 ;

    public static void main(String[] args) {
        num++;
        System.out.println("num = " + num);
        // call main method  again
        main(null);

    }
}
// Whenever method is called in java , a frame is placed in stack memory for that for that method call. if method calls itself recursively , another frame is placed on existing frame.
// if it keeps continuing