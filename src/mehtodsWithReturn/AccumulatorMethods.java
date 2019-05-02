package mehtodsWithReturn;

public class AccumulatorMethods {
    public static void main(String[] args) {
        //System.out.println( getStars(99));

        int[] arr ={5,1,1,1,1,1,5,0};
        for (int n: arr){
            System.out.println(getStars(n));
        }

        //Method getStars that accepts an int and return a String
        //it will return that  many * s from methods
        //getStar(5)*****

        /*
        Method sumTon: accepts an int and return sum of int starting from
        1 to that int
        sumTon(3)->6 (1+2+3)
         */
    }
    public static String getStars(int star){
        String star1="";
        for (int i=1; i<=star; i++){
            star1+="*";

        }
       return star1;
    }
}
