package codeDay61;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {
    public static void main(String[] args) {

      //  List<String> lst = new ArrayList<>();
        List<String> lst = new LinkedList<>();
        lst.add("Zebib");
        lst.add("Ershat");
        lst.add("Kamira");
        lst.add("Sabira");

        System.out.println("lst = " + lst);

        lst.remove("Ershat");
        System.out.println("lst = " + lst);
    }
}
