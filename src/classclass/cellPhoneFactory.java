package classclass;

public class cellPhoneFactory {

    public static void main(String[] args) {
        // Create object from a cellPhone
        cellPhone phone1 = new cellPhone();
        phone1.brand="Samsung Galaxy S9+";
        phone1.color="Prism Black";
        phone1.price=999.00;
        phone1.call();
        phone1.text();

        cellPhone phone2 = new cellPhone();
        cellPhone phone3 = new cellPhone();
        phone2.brand= "Nokia";
        phone2.color="Silver";
        phone2.price = 300.30;

        phone3.brand= "HTC";
        phone3.color="White";
        phone3.price = 200.30;

        phone2.call();
        phone2.text();

        phone3.call();
        phone3.call();

        System.out.println(phone1.brand);

        double total = phone1.price+phone2.price+phone3.price;
        System.out.println(total);
        phone1.price=1200.0;
        phone2.price=phone3.price;
        System.out.println();






    }
}
