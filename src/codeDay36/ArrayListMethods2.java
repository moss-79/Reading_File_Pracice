package codeDay36;

import java.util.ArrayList;

public class ArrayListMethods2 {


    public static void main(String[] args) {

        // create a ArrayList object of long and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();

        //   C.R.U.D
        //  CREATE , READ , UPDATE , DELETE
        // ADD ITEM , INSERT AN ITEM . READ ITEM . UPDATE THE ITEM . REMOVE THE ITEM . CHECK THE LOCATION ....


        lst.add(12L); // 12L is automatically converted to new Long(12L) ; because ArrayList only store object
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);
       // lst.add(null); // we can use like this by doesn't have any meaning
        System.out.println("lst = " + lst);

        // I want to insert 125 between 100L
        lst.add(2,125L);
        System.out.println("lst = \n\t" + lst);
        System.out.println("lst  item count= \n\t" + lst.size());

        System.out.println("lst.get(3) = " + lst.get(3));

        lst.set(3,195L);
        System.out.println("lst.get(3) = " + lst.get(3));

        // removing item by its value
        lst.remove(100L);
        // removing item by it's index
        System.out.println("lst after removing 100 = "+ lst);
        // removing item by it's index
        lst.remove(2);
        System.out.println(" lst after removing item at index 2 = \n\t" + lst);

        // looking gor lcation of crtain item
        System.out.println("Location of 100L is using lst.indexOf(100L) = " + lst.indexOf(100L)   );

        System.out.println("Location of 100L is using lst.indexOf(100L)= " + lst.indexOf(23L)   );

        // Check whether a list is empty or not
        System.out.println("lst.size()>0 = "+(lst.size()>0));
        System.out.println("lst.isEmpty()= "+(lst.isEmpty()));

        // check whether we have certain item or not
        System.out.println("lst.contains(100L) = "+ lst.contains(100L));
        System.out.println("lst.contains(100L) = "+ lst.contains(10L));

        // how do i check whether a list contains an item without using contains
        // use indexOf method , if it return -1 , it means we don't have it

        System.out.println("Do I Have 10L = "+ (lst.indexOf(10L)!= -1) );



    }
}