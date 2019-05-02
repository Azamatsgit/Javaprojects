package encampsulation;

public class EtsyRegistrationPage {

    public static void main(String[] args) {

        EtsyUser account = new EtsyUser();
        account.setEmail("account@gmail.com");
        account.setFirsName("Aza");
        account.setPassword("1111adem");

        EtsyUser account1 = new EtsyUser();
        account1.setEmail("account1@gmail.com");
        account1.setFirsName("Bob");
        account1.setPassword("1111bob");

        EtsyUser account2 = new EtsyUser();
        account2.setEmail("aza@gmail.com");
        account2.setFirsName("_");
        account2.setPassword("111");

        System.out.println("First name of account: " + account.getFirsName());

        EtsyUser myAccount = new EtsyUser();
        myAccount.setAccountInfo("my@yahoo.com","Bill","abc123");
        System.out.println(myAccount.getEmail()+ " | " + myAccount.getFirsName());

        myAccount.setEmail("myEmai@gmail.com");
        myAccount.setFirsName(myAccount.getFirsName().replace("B","S"));

        System.out.println(myAccount.getEmail()+ " | " + myAccount.getFirsName());
        System.out.println(myAccount.setAccountInfo());

        EtsyUser yourAccount = new EtsyUser();
        yourAccount.setAccountInfo("mail@gmail.com", "Apple", "mackbook34");
        String accountinfo= yourAccount.setAccountInfo();
        System.out.println(accountinfo);


    }
}
