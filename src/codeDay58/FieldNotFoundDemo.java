package codeDay58;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FieldNotFoundDemo {
    public static void main(String[] args) throws Exception{
        System.out.println("before try catch");
        Files.readAllLines(Paths.get("file.txt"));

//        try {
//            Files.readAllLines(Paths.get("file.txt"));
//        }catch (IOException e){
//            System.out.println("Exception happened and caught ");
//        }
        System.out.println(" After try catch");
    }
}