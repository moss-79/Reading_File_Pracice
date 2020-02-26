package codeDay35;

public class WrapperClassIntro {
    public static void main(String[] args) {

        int x = 10 ;
        // primitive data types are pure value has no attribute or behaviour

        // each primitive type has wrapper class that turn it into object so we can treat it as

        Integer oldObject1= new Integer(12);

        Integer oldObject2 = Integer.valueOf(10);
        Integer oldObject3 = Integer.valueOf("10");


        byte bValue = oldObject2.byteValue();
        System.out.println("bValue = " + bValue);
        double dValue = oldObject2.doubleValue();
        System.out.println("dValue = " + dValue);



    }
}
