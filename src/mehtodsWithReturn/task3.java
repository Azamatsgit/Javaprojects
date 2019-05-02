package mehtodsWithReturn;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("civic1"));
        System.out.println(isAngarm("silent","liste"));
    }
    public static boolean isPalindrome(String str){
        boolean equal=false;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)!= str.charAt(str.length()-(i+1))){
                break;

            }else {
                equal=true;
            }
        }
        return equal;
    }
    public static boolean isAngarm(String str1, String str2){
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sortedStr1= new String(arr1);
        String sortedStr2= new String(arr2);

        if (sortedStr1.equals(sortedStr2)){
            return true;
        }
        return false;


    }
}
