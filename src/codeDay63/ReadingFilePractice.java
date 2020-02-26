package codeDay63;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadingFilePractice {

    public static void main(String[] args) throws IOException {

        List<String> allData = Files.readAllLines(Paths.get("src/codeDay63/employeeData.txt"));

        for (String eachLine : allData  ) {
            System.out.println("eachLine = " + eachLine);

        }
    }
}
