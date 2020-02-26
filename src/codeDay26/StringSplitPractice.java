package codeDay26;

public class StringSplitPractice {

    public static void main(String[] args) {

        String students = "Abbos, Zulyar,Zhibek,Hasan,Muge, Orhan,Susan"   ;
        // first get all the name into string array called nameArray
        // spell the name of each person in this format
           // A-b-b-o-s- ....
           // Z-u-l-y-a-r- ...
           //students=students.repeat( "  ",);
        String[] nameArray={students};
        String[] namesArray1 =students.split(" ");
        for (int x = 0; x < students.length(); x++) {

            //String name =name.charAt(x)
        }

        for (int i = 0; i <= students.length(); ) {

            System.out.print(students.charAt(i)+"-");
            i++;
        }
    }
}
