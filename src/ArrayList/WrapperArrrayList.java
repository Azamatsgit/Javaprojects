package ArrayList;

import java.util.ArrayList;

public class WrapperArrrayList {

    public static void main(String[] args) {
        Integer nums = 100;
        int n2 = 100;
        ArrayList<Integer> n = new ArrayList<>();
        n.add(121213);
        n.add(212);
        n.add(3131);
        System.out.println(n);

        for (Integer x: n){
            System.out.println(x);

        }
        for (Integer i=0; i<n.size(); i++){
            System.out.println(n.get(i));
        }
    }
}
