package ArrayListManupilation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWorks {
    public static void main(String[] args) {
        ArrayList<String> fruits1 = new ArrayList<>();
        List<String> fruits2 = new ArrayList<>();
        List<String> fruits3 = new ArrayList<>(10);
        ArrayList<String> fruits4 = new ArrayList<>(fruits1);
        List<String> fruits5 = Arrays.asList(new String[]{"Kiwi","Apple","Grape"});

        List<String> fruit6 = new ArrayList<>(fruits5);

        List<String> fruit7= new ArrayList<>(Arrays.asList(new String[]{"cherry","Plum","Mango"}));
        fruit7.add("pears");

        fruits1.add("Grapes");
        fruits1.add("Tomato");
        fruits1.add("Blueberry");
        fruits1.add("Blackberry");
        fruits1.add(0,"Orange");
        fruits1.add(4,"Cucumber");

        System.out.println(fruits1);

        fruits2.addAll(fruits1);
        fruits2.add("Dragon Fruit");

        System.out.println(fruits2);

        fruits2.removeAll(fruits1);
        System.out.println(fruits1);
        fruits1.clear();

        System.out.println(fruits2);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(5);
        nums.add(3);
        System.out.println(nums);
        nums.remove(new Integer(3));












    }
}
