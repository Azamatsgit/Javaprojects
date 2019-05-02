package ClassInJava;

public class substringTask {
    public static void main(String[] args) {
        String[] words={"hello","why","by","apple","note"};
        String temp="";
        for (String x: words){
            temp=x.substring(0,1)+x.substring(x.length()-1);
            System.out.println(temp);
        }
    }
}
