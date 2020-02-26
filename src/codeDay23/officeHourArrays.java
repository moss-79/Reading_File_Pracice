package codeDay23;
import java.util.*;
public class officeHourArrays {

    public static void main(String[] args) {

        //  create an int array of 7 items
//  assign values
// 1,  print out in reverse order
// 2 , store last item in a variable called lastItem
        // print it out separately
// 3 , print the item right in the middle
//
// OPTIONALLY : find sum , find average , find max , find min

        int[] value = new int[7];
        value[0] = 1;
        value[1] = 2;
        value[2] = 3;
        value[3] = 4;
        value[4] = 5;
        value[5] = 6;
        value[6] = 7;


        for (int i = value.length - 1; i >= 0; i--) {
            System.out.println("value = " + value[i]);

        }


    int arraySize = value.length;
    int lastItemIndex = arraySize - 1;

    int lastItemValue = value[lastItemIndex];

        System.out.println("lastItemValue = "+lastItemValue);


        int middle = value.length /2;
        System.out.println("middle = " + middle);

        int sum = 0 ;
        for (int i = 0; i < arraySize; i++) {
            int currentItem = value[i];
            sum = sum + currentItem;

        }
            System.out.println("sum = " + sum);


    }


    }
