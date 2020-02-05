package daily_classes.day052;

public interface KnowledgeBank {

    void takeNote();

    default void showTableOfContents(){
        System.out.println("No table of contents available");
    }
}
