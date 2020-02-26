package codeDay52.polymorphism;

public class AudioBook extends Book {

    double duration;

    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }

    // this is abstract method implementation from book class
    @Override
    public void displayInfo() {
        System.out.println("The name os audioBook is "+name+"and the author is "+author +", the durarion is "
        +duration+" min");
    }

    // this is abstract method implementation from KnowledgeBank inter
    @Override
    public void takeNotes() {

        System.out.println("Taking notes on the digital book by "+ name +
                " writing the provided digital table ");
    }

    // this is abstract method implementation from KnowledgeBank inter
    @Override
    public void showTableOfContent() {

        System.out.println("IF you want to see the table of contents swipe right");
    }
}
