package daily_classes.day052;

public abstract class Book implements KnowledgeBank {

    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public abstract void displayBookInfo();
}

class PaperBook extends Book implements Readable{

    int weight;
    int pageCount;

    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;
    }

    public PaperBook(String name, String author, int weight, int pageCount) {
        this(name, author, weight);
        this.pageCount = pageCount;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Paper book name: " + name);
        System.out.println("Author: " + author);
        System.out.println("weight: " + weight);
    }
    @Override
    public void read (){
        System.out.println("Reading " + name);
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }

    @Override
    public void takeNote() {
        System.out.println("Taking notes on " + name + " paper book.");
    }

    @Override
    public void showTableOfContents() {
        System.out.println(name + " table of contents displayed");
    }
}

class AudioBook extends Book{

    double duration;

    public AudioBook(String name, String author, double duration) {
        super(name, author);
        this.duration = duration;
    }

    @Override
    public void displayBookInfo() {
        System.out.println("Audio book name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Duration: " + duration);
    }

    public void listen(){
        System.out.println("Listening to " + name);
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", duration=" + duration +
                '}';
    }

    @Override
    public void takeNote() {
        System.out.println("Taking notes on " + name + " audio book.");
    }

    @Override
    public void showTableOfContents() {
        System.out.println(name + " table of contents displayed");
    }
}
