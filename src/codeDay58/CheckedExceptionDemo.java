package codeDay58;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws Exception {

        System.out.println("Checked Exception in next line");
//        try {
            Thread.sleep(5000);
//        }catch (InterruptedException e ){
//            System.out.println("Exception was caught");
//        }
        System.out.println("After Thread.sleep");
    }
}
