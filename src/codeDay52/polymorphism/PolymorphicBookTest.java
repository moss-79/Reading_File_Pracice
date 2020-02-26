package codeDay52.polymorphism;

import java.util.Arrays;
import java.util.List;

public class PolymorphicBookTest {
    public static void main(String[] args) {


        // we can refer the paper book object using
        // --- its own type : paperBook
        // ---- or it's super type : Book , Readable , Knowledgeable , Object

        Book b1 = new PaperBook("Java","Akbar",3);
        b1.displayInfo();

        KnowledgeBank kb = b1;
        b1.takeNotes();
        b1.showTableOfContent();
        System.out.println("------------");

        Book b2 = new PaperBook("Selenium","Vasyl",2);
        b2.showTableOfContent();
        b2.displayInfo();
        System.out.println("b2 = " + b2);
        Book b3 = new AudioBook("Agile","Guljannat",1.8);
        Book b4 = new PaperBook("Think and Grow Rich", "Napolion Hill ",3);
        Book b5 = new PaperBook("Icon","Steve Jobs",4);


        List<Book> bookList = Arrays.asList(b1,b2,b3,b4,b5);

        int pCount = 0 ;
        for (Book each :
                bookList) {
            String className = each.getClass().getSimpleName();
            System.out.println("className = " + className);
            if(className.equals("PaperBook")){
                ++pCount;
            }
        }
        System.out.println("Paper Book Count = " + pCount);
    }
}
