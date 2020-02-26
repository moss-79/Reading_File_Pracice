package codeDay17;

public class NamePrint {

    public static void main(String[] args) {

        String name = "Alexander";

     //   System.out.println(name.charAt(0));
       // System.out.println(name.charAt(1));
        //System.out.println(name.charAt(2));
        //System.out.println(name.charAt(3));
        //System.out.println(name.charAt(4));
        //System.out.println(name.charAt(5));
        //System.out.println(name.charAt(6));
        //System.out.println(name.charAt(7));
        //System.out.println(name.charAt(8));

        int x = 0 ;

        while (x < name.length())
        {
            System.out.print(""+ x+" ");
            System.out.println(name.charAt(x));

            ++x;
        }
    }
}
