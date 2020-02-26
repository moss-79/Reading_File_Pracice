package replit;

import java.util.Scanner;

public class repLit102 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();
        int indexOfMyId= html.indexOf("id=");
        boolean htmlCtn = html.contains("html");
        if(htmlCtn)
            System.out.println(html.substring(indexOfMyId+4,indexOfMyId+8));
        else
            System.out.println("Invalid input!");

    }
}
