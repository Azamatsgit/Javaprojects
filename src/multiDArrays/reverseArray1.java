package multiDArrays;

public class reverseArray1 {
    public static void main(String[] args) {
        int[] arr = {485,-4958,-494,-34};

        for (int i=0; i<arr.length; i++)
        {
            for (int j=i+1; j<arr.length; j++)
            {
                if (arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("Second largest number: " +arr[1]);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }

    }

}
