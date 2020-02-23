package daily_classes.day064;

import java.util.*;

public class RepresentingTableData {

    public static void main(String[] args) {

        // for single row
        // I want to get the value by it's column name
        // so i choose Map

        Map<String, String> row1 = new LinkedHashMap<>();

        row1.put("First_name", "Regan");
        row1.put("email", "rboichat0@1688.com");
        row1.put("gender", "Female");

        //for one row I would use a one map
        // if I have many rows I would use LIST!
        // IE keys of First_name, email, and gender represent each column in an excel sheet

        Map<String, String > row2 = new LinkedHashMap<>();

        row2.put("First_name", "Carleen");
        row2.put("email", "cmorillasl@blog.com");
        row2.put("gender", "Female");

        List< Map<String, String> > rowMapList = new ArrayList<>();
        rowMapList.add(row1);
        rowMapList.add(row2);

        System.out.println("rowMapList = " + rowMapList);

        System.out.println("rowMapList.get(1).get(\"email\") = " + rowMapList.get(1).get("email"));

        rowMapList.get(1).replace("First_name", "Garret");

        System.out.println("rowMapList.get(1).get(\"First_name\") = " + rowMapList.get(1).get("First_name"));

    }
}
