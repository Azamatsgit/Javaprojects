package WhileLoop;

import java.util.ArrayList;

public class whileLoopExample2 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(3);
        words.add("london");
        words.add("larry");
        words.add("chicago");

        String newWords="";
        for (String x: words){
            if (x.substring(0,1).equals("l")){
                newWords +=x;
            }
        }
        System.out.println(newWords);
    }
}
