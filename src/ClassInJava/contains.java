package ClassInJava;

public class contains {
    public static void main(String[] args) {
     int []nums ={2,4,5,4,7,8};
     boolean found=false;
     for(int i=0; i<=nums.length-1; i++){
        if (nums[i]==5 && nums[i+1]==5){
            found=true;
            break;
        }
     }
        System.out.println(found);
    }
}
