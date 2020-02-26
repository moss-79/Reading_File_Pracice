package codeDay23;

public class ArrayLong {

    public static void main(String[] args) {


        long[] salaries = new long[]{80000L, 90000L, 100000L, 110000L, 120000L};


        for (long eachSalary : salaries) {
            System.out.println("Each Salary = " + eachSalary);

        }
        for (long blabla : salaries) {
            if (blabla > 100000L) {
                System.out.println("blabla = " + blabla);
            }

            if (blabla < 100000L) {
                continue;
            }
            System.out.println("skip = " + blabla);
        }

        long salary = salaries[0];
        for (long max :
                salaries) {
            if ((salary < max)) {

                salary = max;
            }
        }
        System.out.println("salary = " + salary);
    }
}