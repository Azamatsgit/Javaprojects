package mehtodsWithReturn;

public class basicExample {

    public static void main(String[] args) {
        int[][] numberGrid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {0},
                {10, 11, 12}
        };

        for (int i = 0; i < numberGrid.length; i++) {
            for (int j = 0; j < numberGrid[i].length; j++) {
                System.out.print(numberGrid[i][j] + " ");
            }
            System.out.println();
            System.out.println("==================================");
        }
        for (int i[] : numberGrid) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        int[] arr = {1, 4, 5, 2};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;


                }


            }


        }
        System.out.println(arr[1]);


    }

}