package mehtodsWithReturn;

public class lastName {
    public static void main(String[] args) {
     person("azamat,aza,30");

    }
    public static void person(String str){
        String[] splitStr = str.split(",");
        System.out.println("Name: "+splitStr[0]+", "+"LastName: "+splitStr[1]+", "+"age :"+splitStr[2]);

    }
}
