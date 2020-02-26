package codeDay21;

public class TaskX {
    public static void main(String[] args) {


        String name = "Musiel";



        for (int x = 0; x < name.length(); x++) {
            System.out.println(name.substring(x, x + 1));

            if (name.substring(x, x + 1).equalsIgnoreCase("i")) {
                System.out.println("found it !!");
                break;
            }

            System.out.println("name = " + name.substring(x,x+1));

        }

    }

}