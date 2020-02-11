package repl_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task193{

    public static String combineRs(String[] r1,String[] r2)
    {

        String str = "";
        List<String> arryLst = new ArrayList<String>(Arrays.asList(r1));

        arryLst.addAll(Arrays.asList(r2));


        for (String each : arryLst) {
            str += each;
        }

        return str;
    }

}
