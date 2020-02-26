package codeDay52.polymorphism;

public interface KnowledgeBank {


    public abstract void takeNotes();

    public default void showTableOfContent(){
        System.out.println("Chapter 1 till Chapter 10 : you do the rest");
    }
}
