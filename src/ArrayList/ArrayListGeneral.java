package ArrayList;

import java.util.ArrayList;

public class ArrayListGeneral {
    public static void main(String[] args) {
        //Create a general(raw type ) arrayList
        //We can add any type of data type
        ArrayList list = new ArrayList();
        list.add("java");
        list.add("Eclipse");
        list.add("Sublime");
        list.add(1233);
        list.add(true);

        System.out.println(list);

        list.add(345.8);
        list.add('_');
        list.add("water");
        System.out.println(list.get(0));

        System.out.println(list.size());
    }
}
