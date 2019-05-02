package StringBuilder;

public class StringBuilder2 {
    public static void main(String[] args) {

        StringBuilder builder1 = new StringBuilder("java");
        StringBuilder builder2 = new StringBuilder("java");
        System.out.println(builder1==builder2);//Since both object are different location

        System.out.println(builder1.equals(builder2));
        //How to compare StringBuilder?

       boolean equals= builder1.toString().equals(builder2.toString());
        System.out.println(equals);


    }
}
