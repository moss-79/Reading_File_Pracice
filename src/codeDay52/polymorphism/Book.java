package codeDay52.polymorphism;

public abstract class Book implements KnowledgeBank {


    String name;
    String author;


    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public abstract void displayInfo();
}
