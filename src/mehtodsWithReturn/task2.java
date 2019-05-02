package mehtodsWithReturn;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[]arr=new int[7];
        System.out.println(Arrays.toString(Populates(arr)));
        String str = "laptop";
        //noondelete();

       System.out.println(uniqChars("java"));

    }
    public static int[] Populates(int[]arr){

        for (int i=0;i<arr.length; i++){
            arr[i]=i+1;

        }
        return arr;
    }
    public static String  delete(String str1, String str2){
        String newOne=str1.replace("a","");
       return "";
    }
    public static String uniqChars(String str) {
        String str1="";
        for (int i=0; i<str.length();i++){
            char ch =str.charAt(i);
            if (ch!=' '){
                str1=str1+ch;
                str=str.replace(ch,' ');
            }
        }
        return str1;


    }
    public static String reverese(String str){
        String result ="";
        for (int i=str.length()-1; i>=0;i--){
            result=result+str.charAt(i);
        }
        return result;

    }
    public static String extractNumber(String str){
        String str1 = str.trim();
        String digits ="";

        for (int i=0;i<str1.length(); i++){
            char ch = str1.charAt(i);
            if (Character.isDigit(ch))
                digits=digits+ch;
        }
        return digits;

    }
    public static boolean isError(String str){
        if (!str.contains("error"))
            return false;
        return true;
    }




}