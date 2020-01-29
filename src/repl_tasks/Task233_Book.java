package repl_tasks;

public class Task233_Book {

    String title, author, tableOfContents = "";

    int nextPage = 1;

    public Task233_Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void addChapter (String chapter, int numPages){

        tableOfContents += "\n" + chapter + "..." + nextPage;
        nextPage += numPages;
    }

    public int getPages() {
        return nextPage;
    }

    public String getTableOfContents() {
        return tableOfContents;
    }

    @Override
    public String toString() {
        return title + "\n" + author;
    }

    public static void main(String[] args) {
        Task233_Book b1 = new Task233_Book ("Lord of the Rings", "JRR Tolkien");

        b1.addChapter("Concerning Hobbits", 35);
        b1.addChapter("Long Expected Party", 45);

        System.out.println(b1);
        System.out.println(b1.getPages());
        System.out.println(b1.getTableOfContents());

    }
}
