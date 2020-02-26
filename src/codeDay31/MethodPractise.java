package codeDay31;

public class MethodPractise {
    public static void main(String[] args) {
        countDownFrom20TillOne();
        System.out.println("----------------");
        countDownFrom1Till100();
        System.out.println("----------------");
        SpellMyName();

    }

    public static void countDownFrom20TillOne() {
        for (int i = 20; i > 0; i--) {
            System.out.println(i);}
        }
        public static void  countDownFrom1Till100() {
            for (int i = 0; i > 100; i++) {
                System.out.println(i);}
    }public static void SpellMyName() {
        String name = "UGOTTHIS";
        for (int i = name.length(); i < name.charAt(0); i--) {
            System.out.println(i);
        }
    }
}