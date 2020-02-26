package codeDay58;
import java.util.*;
public class OutOfMemoryDemo {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i > 0; i++) {
          //  System.out.println("i = " + i);
            nums.add(i);
        }
    }
}
// this error happens when Heap Memory is full. Normally if we keep creating objects
// , or if we have One object that is very large.
//

