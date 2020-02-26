package codeDay52.warmup;

public class BankTest {

    public static void main(String[] args) {

        Account a1 = new Account("Arya",10000);
        Account a2 = new Account("John Snow ",7000);

        System.out.println("a1 before = " + a1);
        System.out.println("a2 before  = " + a2);
//        a1.withdraw(5000);
//        a1.deposit(50000);
        a1.transferAll(a2);
        System.out.println("a1 after  = " + a1);
        System.out.println("a2 after = " + a2);


        a2.transferAll(a1);
        System.out.println("a1 after 2nd transfer = " + a1);
        System.out.println("a2 after 2nd transfer = " + a2);

        System.out.println("Dose a1 has Palindrome name  = " + a1.isPalindrome());
        System.out.println("Dose a2 has Palindrome name  = " + a2.isPalindrome());
    }
}
