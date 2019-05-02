package ClassInJava;

public class reverseString {
    public static void main(String[] args) {

        String java = "Java is fun ";
        String[] splitted = java.split(" ");

        for ( int i=splitted.length -1; i>=0; i--){
            System.out.print(splitted[i] + " ");
        }


    }

}
