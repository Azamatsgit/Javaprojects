package ClassInJava;

public class isertionSort2 {
    public static void main(String[] args) {
        int[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] arr2 = (arr1);
        for (int i : arr2) {insertionSort(arr1);
            System.out.print(i);
            System.out.print(", ");
        }
    }
    public static int[] insertionSort (int [] list){

        int i,j,key,temp;

        for (i =1; i<list.length;i++){
            key=list[i];
            j =i-1;
            while (j>0 && key <list[j]) {
                temp = list[j];
                list[j]=list[j+1];
                list[j+1]=temp;
                j--;
            }
        }
    return list;
    }


}
