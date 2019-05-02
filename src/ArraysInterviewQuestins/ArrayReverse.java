package ArraysInterviewQuestins;

public class ArrayReverse {
    public static void main(String[] args) {
        int arr[] = new int[] { 10,20,30,50,70 };
        System.out.println("reversing an array:");
        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        int arr1[] = new int[] { 10,20,30,50,70 };

        for (int i=0; i<arr1.length; i++){
            for (int j=i+1; j<arr1.length; j++){
                if (arr1[i]<arr1[j]){
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        System.out.println("Second largest numbe is: "+ arr1[1]);

        int arr2[] = new int[] { 10,20,30,50,70 };

        int biggest = arr2[0];
        int secondBig= arr2[0];

       for (int i=0; i<=arr2.length-1; i++){
           if (biggest < arr2[i]){
               secondBig=biggest;
               biggest=arr2[i];

           }
           if (arr2[i] > secondBig && biggest !=arr2[i]){
               secondBig=arr2[i];
           }
       }
        System.out.println(secondBig);










    }

}
