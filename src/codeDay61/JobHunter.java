package codeDay61;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JobHunter extends Job {
    public JobHunter(String companyName, String location, int salary) {
        super(companyName, location, salary);
    }

    public static void main(String[] args) {


        Job j1 = new Job("Abaas","Dubai",26000);
        Job j2 = new Job( "Sony","N/A",240000);
        Job j3 = new Job( "SAMMUS","Dallas",540000);

        System.out.println("j1.compareTo(j2) = " + j1.compareTo(j2));
        System.out.println("j2.compareTo(j3) = " + j2.compareTo(j3));



        List<Job> lst = new LinkedList<>() ;
        lst.add(new Job("Facebook","Ca",12000));
        lst.add(new Job("Amazon","Ga",25000));
        lst.add(new Job("BOFA","Va",32000));
        System.out.println("lst before= " + lst);





    }
}
