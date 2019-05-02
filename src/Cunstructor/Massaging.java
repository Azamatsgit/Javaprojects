package Cunstructor;

public class Massaging {
    public static void main(String[] args) {
        Massage msg1 = new Massage("Its java","Bob","Aza");
        Massage msg2 = new Massage("Its java");
        Massage msg3 = new Massage("Its java","Shone");
        System.out.println(msg1.toString());
        System.out.println(msg2.toString());
        System.out.println(msg3.toString());
    }
}
