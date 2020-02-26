package codeDay55;

import java.util.List;

public class Course {

    String subject;
    List<String> studentsName;

    public Course(String subject, List<String> studentsName) {
        this.subject = subject;
        this.studentsName = studentsName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", studentsName=" + studentsName +
                '}';
    }

}
