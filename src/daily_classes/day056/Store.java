package daily_classes.day056;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Product> lst;

    public Store() {
        this.lst = new ArrayList(lst);
    }

    public Store(List<Product> lst) {
        this();

        this.lst.addAll(lst);

    }


}
