package taskJava;

public class matrixScalar {
    public static void main(String[] args) {
        int arr1[][] = {
                {2,1,1},
                {2,1,1}

        };
        int[][] arr2={

                {2,3,2},
                {2,4,5},
                {2,3,4}
        };


        System.out.println(ScalarMatrix(arr1,arr2));
    }
    public static int ScalarMatrix(int [][]m1, int [][] m2){
        int sum=0;
        int r[][]=new int[2][2];

        for (int i=0; i<2; i++){
            for (int j=0; j<2;j++){
                for (int k=0; k<3; k++){
                    sum=sum + m1[i][k]*m2[k][j];
                }
                r[i][j] =sum;
            }

        }
        for (int i[] : r){
            for (int j:i){
                System.out.println(j);
            }
        }
        return sum;
    }
}











