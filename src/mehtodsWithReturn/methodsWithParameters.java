package mehtodsWithReturn;

public class methodsWithParameters {
    public static void main(String[] args) {
        System.out.println(buildEmail("mike","smith"));
        String newEmail=buildEmail("mike","smith");
        String newEmail2=buildEmail("mike1","smith2");

        System.out.println(newEmail);
        System.out.println(newEmail2);
        System.out.println("Largest is: " + getMax(24,34));
        System.out.println(getMax3(33,5,45));


    }
    //BuildEmail that can first name last name and email
    public static String buildEmail(String firstName, String lastName) {

        String email = firstName.toLowerCase()+"_" + lastName.toLowerCase()
                + "@gmail.com";
        return email.toLowerCase();


    }
    public static int getMax(int n,int n1){
        int largest;
        if (n>n1){
            largest = n;

        }else {
            largest=n1;
        }
        return largest;
    }
    public static int getMax3(int num1, int num2, int num3){

        if (num1>num2 && num1>num3){
            return num1;
            }else if (num2>=num1 && num2 >=3){
                return num2;
            }else {
            return num3;
        }

    }

}
