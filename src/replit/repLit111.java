package replit;

public class repLit111 {
    public static void main(String[] args) {

        int k = 1;
        int total = 0 ;
        do {

           k++;
            total=total+(k*k++);

        }while (k <= 50) ;

        System.out.println("total "+total);
    }
}
