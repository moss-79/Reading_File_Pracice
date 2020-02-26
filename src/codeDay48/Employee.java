package codeDay48;

public abstract class Employee {

    String name;
    int id ;

    public Employee(){

    }
    // Why do we have constructor here
    // we can not create an object out of it ?
    // what is the point ?
    // so that sub class can reuse the code of setting id and

    public Employee(String name , int id ){
        this.id = id ;
        this.name = name ;
    }


    public abstract void calculateAnnualSalary ();

    public abstract String toString();
}
