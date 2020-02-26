package codeDay33;

public class WarmUp {
    public static void main(String[] args) {

        String spelledName = getSpelledName("Serra");
        System.out.println("spelledName = "+ spelledName);
        getSpelledName("Serra");
        System.out.println( getSpelledName("Zeynep"));


    }

    public static String getSpelledName (String name){
        // creating a variable for resulting String
        String result = "";
        for (int x = 0; x < name.length(); x++) {
            result = result + name.charAt(x);
            // concatenate dash(-)
            // if we are not at last character
            if (x != name.length ()-1){
                result = result +"-";
            }

        }

        return result;
    }public static String getSpelledName2 (String name){

        String result = "";
        for (int x = 0; x < name.length()-1; x++) {
            result = result + name.charAt(x);

            if (x != name.length ()-1){
                result = result +"-";
            }

        }

        return result;
    }
}
