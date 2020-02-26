package codeDay32;

public class StringAction {
    public static void main(String[] args) {

        printStringWithDashInBetween("Hasan");
        printStringWithDashInBetween("Arya");
        printStringWithDashInBetween("Mussie");
     printStringWithDashInBetween("Haben");
     printStringWithDashInBetween("Habtom");

    }

    public static void printStringWithDashInBetween(String name) {

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            // if I am not at last index then I print
            if (i != name.length() - 1) {
                System.out.print("-");
            }


        }System.out.println();
    }
}



