package codeDay51;

public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // now this become a natural order for comparing Person Object
    @Override
    public int compareTo(Person otherPerson) {
//        if (this.age > otherPerson.age) {
//            return 1;
//        } else if (this.age < otherPerson.age) {
//            return -1;
//        } else {
//            return 0;
//        }
        // modify this method to make your natural order , comparing by name (first character)
        // then use it with sort method
    //
        if (this.name.charAt(0) > otherPerson.name.charAt(0)) {
            return 1;
        } else if (this.name.charAt(0) < otherPerson.name.charAt(0)) {
            return -1;
        } else {
            return 0;
        }

//         return this.name.compareTo(otherPerson.name);
//
    }

}