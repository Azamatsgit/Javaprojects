package mehtodsWithReturn;

public class arraysReverse {
    public static void main(String[] args) {
        int[] list1 = {1,4,6,7,3,5};
        int[] list2 = reverse(list1);

        for (int element: list2){
            System.out.print(element+" ");
        }
    }
    public static int[] reverse(int[] list){
        int[] result = new int[list.length];
        for (int i=0, j = result.length -1; i < list.length; i++, j--){
            result[j]=result[i];
        }
        return result;
    }
}
