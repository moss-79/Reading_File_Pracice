package codeDay51;

import java.util.*;

public class Practice {

    public static void main(String[] args) {

        List<String> lst = new ArrayList<>();
        lst.add("ABC");

        List<Integer> lst2 = new ArrayList<>();
        lst2.add(1234);
        lst2.add(123);
        lst2.add(12);
        lst2.add(1);

        Collections.sort(lst2);
        System.out.println(lst2);

    }
}
