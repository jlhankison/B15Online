package repl_tasks;

public class Task191 {

    public static String reverse(String input)
    {
        String tupni = "";

        for(int i = input.length() - 1 ; i >= 0 ; i --){
            tupni += input.charAt(i);
        }
        return tupni;

    }

    public static void main(String[] args) {

        System.out.println(reverse("Student"));
    }
}
