package mehtodsWithReturn;

public class duplicateInArray {
    public static void main(String[] args) {
        int[]a= {2,65,34,9,2,1,1};
        System.out.print("Duplicate values are: ");
        for (int i=0; i<a.length-1; i++){
            for (int j=i+1; j<a.length; j++){
                if ((a[i]==a[j]) && (i!=j)) {

                    System.out.print(a[j] + ",");

                }

            }
        }

    }
}
