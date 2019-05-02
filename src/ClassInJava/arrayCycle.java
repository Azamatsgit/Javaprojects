package ClassInJava;

public class arrayCycle {
    public static void main(String[] args) {
        int[] numberArray=new int[10];
        for(int j=0; j<numberArray.length; j++)
        {
            System.out.print("| " + j + " ");
        }

        System.out.println("|");
        int k = 1;

        while(k <= 41){ System.out.print('-'); k++; }

        System.out.println();

        String[][] multiDArray = new String[10][10];


        for(int i = 0; i < multiDArray.length; i++)
        {
            // To get the length for the array in the array you must follow it
            // with brackets with the index between them like [i]
            for(int j = 0; j < multiDArray[i].length; j++)
            {
                multiDArray[i][j] = i + " " + j;
            }
        }
        k = 1;
        while(k <= 61){ System.out.print('-'); k++; }
        System.out.println();
        for (int i=0; i<multiDArray.length; i++){
            for(int j=0;j<multiDArray[i].length;j++){
                System.out.print("| " +multiDArray[i][j] + " ");
            }
            System.out.println("|");
        }
    }
}
