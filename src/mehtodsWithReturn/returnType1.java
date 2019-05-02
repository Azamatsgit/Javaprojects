package mehtodsWithReturn;

public class returnType1 {
    public static void main(String[] args) {
       int amount = giveMe5$();
        System.out.println(amount);
        String name = getPresidentName();
        System.out.println(name);
        String email = getFirstName()+ "_"+ getLastName()+getEmail();
        System.out.print(email);

    }
    public static int giveMe5$(){
        int d = 5;
        return d;

    }


    public static String getPresidentName(){
        String name ="Aza";
        return name;
    }
    public static String getFirstName(){
        String firsName="Azamat";
        return firsName;

    }
    public static String getLastName(){
        String lastName = "Uulu";
        return lastName;
    }
    public static String getEmail(){
        return "@gmai.com";
    }

}
