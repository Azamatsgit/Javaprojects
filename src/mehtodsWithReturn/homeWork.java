package mehtodsWithReturn;

import java.util.Arrays;

public class homeWork {
    public static void main(String[] args) {
        System.out.println(word("abcd",2));
        int[] arr1={1,3,4,8,9};
        int num=9;
       System.out.println(Arrays.toString(Deleter(arr1,num)));

        //System.out.println(Arrays.toString(nergR(arr1,num)));
        String[] str1 = {"1","2","aa","1","1","1." +
                ""};
        System.out.println(countDuplicates(str1));



    }
    public static String word(String str1, int n){

        String str11 = str1;
        return str11.substring(0,n);



    }
    public static String removeWords(String str1, String str2){
       String aza= str1.substring(0,3)+str2+str1.substring(3);
       return aza;
    }

    public static int[] addElements(int[] arr1, int[] arr2){
        int[] newArr=new int[arr1.length];
        for (int i=0; i<newArr.length; i++){
            newArr[i]=arr1[i]+arr2[i];
        }
        return newArr;
    }


    public static int[] Deleter(int[]arr, int num) {
        int[] newArr1 = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == num) {
                for (int j = i + 1; j < arr.length; j++)
                    arr[j - 1] = arr[j];
            }
            newArr1[i] = arr[i];

        }


        return newArr1;

    }

    public static int[] nergR(int[]arr,int[] arr1){
        int len = arr.length+arr1.length;
        int[] newArr=new int[len];
        int x=0;

        for (int i=0; i<arr.length; i++){
             newArr[x]=arr[i];
             x++;
            }
        for (int j=0; j<arr1.length;j++){
            newArr[x]=arr1[j];
            x++;
        }
        return newArr;



    }
    public static String[] words(String[] str){
        int count=0;
        for (int i=0; i<str.length; i++){
            for (int j=i+1; j<str.length; j++){
                if (str[i].equals(str[j])){
                    str[i]=str[j];

                    count++;

                }
            }
        }
        return str;
    }
    public static int countDuplicates(String[] arr){
        String unique ="";
        for (int outer=0; outer<arr.length; outer++){

            String currentStr=arr[outer];
            boolean duplicate=false;
            for (int inner=0; inner<arr.length; inner++){
                if (arr[inner].equals(currentStr) && inner!=outer){
                    duplicate= true;
                    break;
                }
            }
            if (duplicate==false) {
                unique+=currentStr+"";
            }
        }
        unique=unique.trim();
        String[] uniqueArr=unique.split("");
        int count = arr.length-uniqueArr.length;
        return count;
    }







}
