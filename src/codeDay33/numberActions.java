package codeDay33;

public class numberActions {
    public static void main(String[] args) {

        System.out.println( getSumFrom1toX(6));

        System.out.println(build_GOT_Email("Arya" ,"Stark" ));
    }

    /*
     * getSumFrom1toX
     * this method should calculate the sum of
     * the numbers from 1 to the number user passed
     * @param x final number to be added
     * @return the sum of numbers from 1 to x as int
     *
     */
    public static int getSumFrom1toX (int x){

        int sum = 0;
        //TODO: your code goes here
        for (int i = 1; i <= x; i++) {
            sum += i ;// sum = sum +1;


        }
        return sum;
    }
/*
 * build_GOT_Email
 * this method should build email using user's first and last name
// * for example Jone Snow ===>> JSnow@NightWatch.com
* @param firstaName user's first name
* @param lastName user's last name
* @return the email created using
* firstName initial + lastName + @NightWatch.com
 */
  public static String build_GOT_Email (String firstName, String lastName){

      String email = firstName.charAt(0) + lastName + "@NightWatch.com";
      return email;



  }



}


