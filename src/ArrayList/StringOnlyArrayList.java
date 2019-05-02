package ArrayList;

import java.util.ArrayList;

public class StringOnlyArrayList {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        names.add("2344");
        names.add("Aza");
        names.add("Rob");
        names.add("bob");
        System.out.print(names);
        String first= names.get(0);
        System.out.println();
        System.out.println(first);
        names.remove(0);
        System.out.println(names);
        names.remove("Rob");
        System.out.println(names);
    }
}
