package ClassInJava;

public class arraCalculate {
    public static void main(String[] args) {
        int nums[] = {2,1,2,3,4};
        int count=0;
        for (int x:nums){
            if(x % 2==0)
            count++;

        }
        System.out.println(count);
    }
}
