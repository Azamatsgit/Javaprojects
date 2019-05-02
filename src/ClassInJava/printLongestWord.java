package ClassInJava;

public class printLongestWord {
    public static void main(String[] args) {
        String [] fruit = {"banana", "apple","Strawberry","lemo","cherry"};
        String largest="";
        for(String x: fruit){
            if (x.length()>=largest.length()){
                largest=x;
            }
        }
        System.out.println(largest);
    }
}
