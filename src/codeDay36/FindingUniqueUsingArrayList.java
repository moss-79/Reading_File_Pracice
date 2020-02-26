package codeDay36;

import java.util.ArrayList;

public class FindingUniqueUsingArrayList {
    public static void main(String[] args) {

        int [] numbers = {11,33,44,11,33,44,22,55,44,33};

        ArrayList<Integer> uniqueLst = new ArrayList<>();
        


        for (int eachNum :
                numbers) {
            System.out.println("eachNum = " + eachNum);
            if(!uniqueLst.contains(eachNum)) {
                uniqueLst.add(eachNum);
            }
        }
        System.out.println("uniqueLst = " + uniqueLst);
    }
}
