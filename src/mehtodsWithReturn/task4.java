package mehtodsWithReturn;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[] arr={1,1,1,1};
        System.out.println(badP(arr,5));
        System.out.println(Arrays.toString(Scalar(1,1)));

    }
    public static boolean badP(int[] product, int limit){

        int count = 0;
        for (int i=0; i<product.length; i++){
            if (product[i]==0 && limit<=3){
                count=count+=product[i];

            }

        }
        return false;


    }
    public static int[][] Scalar(int n , int n1){
        int matrix[][]= new int [10][10];
        for (int i=0; i<n; i++){
            for (int j=0;j<n1; j++){
                matrix[i][j]=n;
                matrix[i][j]=n1;
            }
        }
        int[][] matrix2 = new int[10][10];
        for (int i=0; i<n1; i++){
            for (int j=0; j<n; j++){
                matrix2[j][i]=matrix[i][j];
            }

        }
        for (int i=0; i<n; i++){
            for (int j=0;j<n1; j++){
                System.out.printf("%d\t", matrix2[i][j]);
            }
        }
        return matrix2;
    }
}















