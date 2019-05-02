package Cunstructor;

public class Main1 {
    public static void main(String[] args) {


        Account bobsAccount = new Account();
        bobsAccount.withdrawal(100.0);
        bobsAccount.setBalance(0.00);
        bobsAccount.setCustomerName("bob brown");
        bobsAccount.setCustomerEmailAddress("axa@gmail.com");
        bobsAccount.setCustomerPhoneNumber("777777777");


        bobsAccount.deposite(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposite(51.1);
        bobsAccount.withdrawal(100.0);


    }


}
