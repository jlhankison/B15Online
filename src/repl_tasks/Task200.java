package repl_tasks;

public class Task200 {

    public static boolean isError(String line)
    {
        if (line.substring(0, "error".length()).equals("error")){
            return true;
        }else{
            return false;
        }
    }
}
