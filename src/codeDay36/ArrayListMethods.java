package codeDay36;

import java.util.ArrayList;

public class ArrayListMethods        {


    public static void main(String[] args) {

        // create a ArrayList object of long and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();

        //   C.R.U.D
        //  CREATE , READ , UPDATE , DELETE
        // ADD ITEM , INSERT AN ITEM . READ ITEM . UPDATE THE ITEM . REMOVE THE ITEM . CHECK THE LOCATION ....


        lst.add(12L)  ; // 12L is automatically converted to new Long(12L) ; because ArrayList only store object
        lst.add(100L) ;
        lst.add(200L) ;
        lst.add(110L);
        System.out.println("lst = " + lst);

        // Counting items inside ArrayList
        System.out.println("Counting items using "+ lst.size());

        System.out.println("First item is : lst.get(0) ="+ lst.get(0));


        // Task : GET THE SUM OF ABOVE ARRAYLIST ITEMS

        long sum = 0;
        for (int i = 0; i < lst.size(); i++) {


            sum =sum + lst.get(i);


        }
        System.out.println("sum = " + sum);


        long max =  lst.get(0);
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        } System.out.println("max = " + max);

        long min =  lst.get(0);
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) < min) {
                min = lst.get(i);
            }
        }
        System.out.println("min = " + max);
    }
}
