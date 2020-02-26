package replit;

import java.util.Scanner;

public class repLit103 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();
        int fNameCnt = json.indexOf("firstName");
        int firstCommaAfterFN = json.indexOf(",",fNameCnt);
        System.out.println("First name: "+json.substring(fNameCnt+13,firstCommaAfterFN-1));

        int lNameCnt = json.indexOf("lastName");
        int endLName = json.lastIndexOf(",");
        System.out.println("Last name: "+json.substring(lNameCnt+12,endLName-1));

    }
}
