package Cunstructor;

public class VipCustmerMain {
    public static void main(String[] args) {

        VipCustomer person= new VipCustomer();
        System.out.println(person.getName());


        VipCustomer person1 = new VipCustomer("Bob",5599.3);
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Aza", 1000.00,"aza@gmail.com");

        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
