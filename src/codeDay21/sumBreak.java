package codeDay21;

public class sumBreak {
    public static void main(String[] args) {


        int sum = 0 ;
        for (int x = 0; x <= 10; x++) {

            System.out.println("sum =" + sum);

        if (sum+x>+40) {
            break;
            // here we are checking whether after adding the next number
            // it will go over 40 or not ,
            // that's why we should use sum + x to see whether it will go over before we acrually add them}
          } sum = sum +x;

            }
            // we need to add the sum after we make sure it did not go over 40

        System.out.println(" sum = " + sum);

        }

}
