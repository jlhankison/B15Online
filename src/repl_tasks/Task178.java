package repl_tasks;

public class Task178 {

    public static void main(String[] args) {
        System.out.println(mergeStrings("oh", "no"));
    }
    public static String mergeStrings(String one, String two) {

        int index = (one.length() > two.length()) ? two.length() : one.length();
        String merged = "";

        for (int i = 0; i < index; i++) {
            merged += one.charAt(i) + "" + two.charAt(i);
        }

        merged += (one.length() > two.length()) ? one.substring(index) : two.substring(index);

        return merged;
    }
}
