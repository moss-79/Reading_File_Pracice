package codeDay34;

public class OverLoadingPractice {
    public static void main(String[] args) {


        add(10);
        add(10,11);
        add(10,11,12);
        add(100,200);

    }
   /*
		has 1 int parameter and add 100 to that number
		and print out the result
	2, add
		has 2 int parameters and add them to get sum
		and print out the result
	3, add
		has 3 int parameters and add them to get sum
		and print out the result
	4, add
		has 2 long parameters and add them to get sum
		and print out the result
     */

    public static void add(int x){
        x = x+100;
        System.out.println(x);
    }public static void add(int x , int y){
        int sum = x + y ;
        System.out.println(sum);
    } public static void add(int x , int y, int z) {
        int result = x + y + z;
        System.out.println(result);
    }public static void add(long x , long y) {
        long sum = x + y;
        System.out.println(sum);
    }

}
