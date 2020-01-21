package repl_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task187 {

    public static String lameDb(String db, String op,String id,String data)
    {
        ArrayList<String> dbList = new ArrayList<>(Arrays.asList(db.split("#")));

        switch (op) {
            case "add":
                dbList.add(data);
                break;
            case "edit":
                dbList.set(Integer.parseInt(id), data);
            case "delete":
                dbList.remove(Integer.parseInt(id));
            default:
                return db;
        }
        String result = "";
        for (int i = 0; i < dbList.size(); i++) {
            result += dbList.get(i);
            if(i == dbList.size()-1){
                result += "#";
            }
        }
        return result;
    }
    //end lameDb


    public static void main(String[] args)
    {


        System.out.print(
                lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","delete","1","")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","none","1","")+"\n"
        );

    }
}
