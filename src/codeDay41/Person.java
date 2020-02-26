package codeDay41;

public class Person {

    private String name;
    private int age;
    private long ssn;
    // write a method to give value to the filed
    public void setAll (String newName, int newAge , long newSsn){
        // YOU


        name = newName;
        age = newAge;
        ssn = newSsn;

    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }
    public void setName(String newName){
        name = newName;
    }
    public void setAge( int newAge){

    }
}
