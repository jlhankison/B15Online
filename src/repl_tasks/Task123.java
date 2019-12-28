package repl_tasks;

public class Task123 {

    public static void main(String[] args) {

        int treeSize = 0,
                growth = 0;

        for (int i = 1; i <= 10; i++) {
            if (i <=3){
                growth = 1;
            }else {
                growth = 2;
            }
            treeSize += growth;
            System.out.println("year " + i + " - growth " + growth + " cm");
            System.out.println("tree size: " + treeSize + "cm");
        }
    }
}
