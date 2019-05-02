package Cunstructor;

public class TVRunner {
    public static void main(String[] args) {
       TV myTv = new TV();
       TV smartTV = new TV("Sharp");
       TV cTV = new TV("HP");

        System.out.println(myTv.isOn());
        smartTV.turnOn();
        myTv.turnOn();
        myTv.setChannel(20);
        smartTV.setChannel(55);
        System.out.println(myTv.getChannel());
        System.out.println(smartTV.getChannel());

        myTv.channelUp();
        smartTV.channelDown();

        System.out.println(myTv.getChannel());
        System.out.println(smartTV.getChannel());

        cTV.turnOn();


    }
}
