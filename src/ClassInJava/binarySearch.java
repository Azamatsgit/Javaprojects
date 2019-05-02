package ClassInJava;

import java.util.Arrays;

public  class  binarySearch {
    public static void main(String[] args) {
        String[] names={"John","Adams","Don"};
                Arrays.sort(names);
        Arrays.binarySearch(names,"bob");
        System.out.println(Arrays.binarySearch(names,"Sara"));

    }
}
