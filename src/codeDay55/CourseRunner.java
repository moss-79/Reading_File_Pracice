package codeDay55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {

    public static void main(String[] args) {
        List<String> lst = new ArrayList<>(Arrays.asList("Mussie","Habtom","Haben","Siham","Merkeb //"));

        Course java = new Course("Java",lst);
        System.out.println("java = " + java);

        java.studentsName.add("Samsom");
        java.studentsName.add("Sirnay");
        java.studentsName.add("Zaydey");
        java.studentsName.add("Kifle");
        java.studentsName.add("Alekulkum");

        System.out.println("java = " + java.studentsName);
    }
}
