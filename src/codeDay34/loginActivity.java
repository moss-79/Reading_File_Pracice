package codeDay34;

import java.util.Scanner;

public class loginActivity {
    public static void main(String[] args) {
       String username = "user";
       String password= "abc123";
        loginVoid("user","abc123");


        boolean result = loginReturn("user","abc123");
        System.out.println(result);

    }

    public static void loginVoid(String username, String password){
        Scanner scan = new Scanner(System.in);

        if(username.equals("user")&& password.equals("abc123")) {
            System.out.println("LOG IN SUCCESSFUL");
        }
        else {
            System.out.println("LOG IN FAILED");
        }
    }

    public static boolean loginReturn(String username, String password) {


        if(username.equals("user") && password.equals("abc123")) {
            return true;
        }else {
            return false;
        }
    }
}
