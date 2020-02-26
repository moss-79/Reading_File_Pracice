package replit;

public class repLit178 {
    public static String mergeStrings(String one, String two) {
        String merge = "";
        for(int i =0 ; i < one.length() ;i++  ){
            int count = 0 ;
            for(int j =0 ; j < two.length() ;j++  ){
                merge += one.charAt(i)+two.charAt(j);
            }
        }
        return merge ;

    }

    public static void main(String[] args){

        System.out.println();
    }
}

