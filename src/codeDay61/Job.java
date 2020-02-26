package codeDay61;

public class Job implements Comparable{

   private String companyName ;
   private String location ;
   private int salary ;

    public Job(String companyName, String location, int salary) {
        this.companyName = companyName;
        this.location = location;
        this.salary = salary;
    }

    @Override
    public int compareTo(Job other){
        if(this.salary > other.salary) {
            return 1 ;
        }else if (this.salary < other.salary){
            return -1 ;
        }else {
            return 0 ;
        }
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Job{" +
                "companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }



}
