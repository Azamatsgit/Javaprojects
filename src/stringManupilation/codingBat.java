package stringManupilation;

public class codingBat {
    public static void main(String[] args) {
        System.out.println(changLast("coding"));
    }
    public static String extraEnd(String str){
        return str.substring(str.length()-2) + str.substring(str.length()-2)+str.substring(str.length()-2);

    }
    public static String withoutEnd(String str){
        int len=str.length();
        return str.substring(1,len-1);
    }
    public static String withoutEnd1(String str,int n){
        return str.substring(0,n) + str.substring(str.length()-n,str.length());



    }
    public static boolean hasBad(String str){
        if (str.length() <3)
            return false;
        else if (str.substring(0,3).equals("bad"))
            return true;
        else if (str.length() >3){
            if ((str.substring(1,4)).equals("bad"))
                return true;
        }
        return false;

    }
    public static String changLast(String str){
        int len = str.length();
        String str1=str.substring(0,str.length()-2);
        String str2= str.substring(str.length()-1) + str.substring(len-2,len-1);
        return str1+str2;
    }

}
