package daily_classes.day026;

public class SplitPractice2 {

    public static void main(String[] args) {

        String students = "Abbos, Zulyar ,Zhibek, Hasan, Muge, Orhan, Susan";

        String [] studentArray = students.split(",");

        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = studentArray[i].strip();
            char[] currentStudent = studentArray[i].toCharArray();

            for (int j = 0; j < currentStudent.length; j++) {
                System.out.print(currentStudent[j]);
                if(j == currentStudent.length-1){
                    System.out.println();
                    break;
                }
                System.out.print("-");
            }

        }
    }
}
