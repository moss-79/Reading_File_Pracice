package codeDay48;

import java.util.Arrays;
import java.util.List;

public class HR_Stuff {

    public static void main(String[] args) {

        // Employee is abstract super type
        // HourlyEmployee and FulltimeEmployee is specific type

        // if we have Employee data type for e1 variable
        // we can write down the address of anything IS-A Employee
        Employee e1 = new HourlyEmployee("Subi", 101,55,2000);
//        e1.calculateAnnualSalary();
//                       e1 = new FulltimeEmployee("Ainura", 103,10000);
//                       e1.calculateAnnualSalary();
        Employee e2 = new HourlyEmployee("Roksana", 102, 57, 2080);
        Employee e3 = new FulltimeEmployee("Dennis", 104,13000);


        List<Employee> allEmployee = Arrays.asList(e1,e2,e3);

        for (Employee each :
                allEmployee) {
            // Sytem.out.println('each ="+each);
            System.out.println("Name is :"+each.name);
            each.calculateAnnualSalary();

        }
    }
}
