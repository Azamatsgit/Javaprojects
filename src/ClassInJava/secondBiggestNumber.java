package ClassInJava;

public class secondBiggestNumber {
    public static void main(String[] args) {
        int[] num = {4,43,5,64,78,86};
        int biggest=num[0];
        int secondBig=num[0];

        for (int i=0; i<=num.length-1;i++){
            if(biggest<=num[i]){
                secondBig=biggest;
                biggest=num[i];
                secondBig=num[i];

            }else if(num[i]>secondBig) {
                secondBig=num[i];
            }
        }
        System.out.println(biggest);
        System.out.println(secondBig);
    }
}
