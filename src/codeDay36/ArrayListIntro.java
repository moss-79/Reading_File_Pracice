package codeDay36;

import codeDay26.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntro {
    public static void main(String[] args) {

        // How do we create a ArrayList Object

        ArrayList <String> lst1 = new ArrayList<>();
        // IT WILL ONLY STORE OBJECT!!! NOT PRIMITIVE
       // ArrayList<int> list2 = new ArrayList<int>();// THIS DOES NOT WORK

        // Correct way to create arrayList object that store whole number
        // is to use Wrapper class type . primitive type is FORBIDDEN!!!!

        ArrayList<Integer> lst2 = new  ArrayList<>();// new ArrayList<Integer>();

        ArrayList<Long> lst3 = new  ArrayList<>();// new ArrayList<Long>();

        ArrayList<Double> lst4 = new  ArrayList<>();// new ArrayList<Double>();

        // OPTIONALLY YOU CAN CREATE IN THIS WAY

        // List is a more general data type compared to ArrayList is more concrete type
        // ArrayList is one type of list
        // Just like Dog is one type of Animal
        List<String> myLst= new ArrayList<>();

    }
}
