package Cunstructor;

public class TV {

    private int Channel;
    private int ValumeLevel;
    private boolean on;
    private String brand;



    public TV(){
        System.out.println("Creating TV using no Args - constructor");

    }
    public TV(String brand){
        System.out.println("Creating TV using 1 Args - constructor");
        this.brand=brand;
    }



    public int getChannel() {
        return Channel;
    }

    public void setChannel(int channel) {
        if (on && channel >0 && channel <121){
            this.Channel = channel;

        }else {
            System.out.println("ERROR: TV is either off or Invalid Channel");
        }

    }

    public int getValumeLevel() {
        return ValumeLevel;
    }

    public void setValumeLevel(int valumeLevel) {
        if (on ==true && ValumeLevel >0 && ValumeLevel <=7){
            this.ValumeLevel = valumeLevel;
        }else {
            System.out.println("ERROR: TV is either off or Invalid Channel");

        }

    }

    public boolean isOn() {
        return on;
    }

    public void turnOn() {
        if (isOn()){
            System.out.println("TV is already On");
        }else {
            on = true;
        }
    }
    public void turnOff() {
        if (isOn()){
            on = false;
        }else {
            System.out.println("TV is OFF");
        }
    }
    public void channelUp(){
        if (isOn()&& getChannel() < 120){
            Channel++;
        }
    }
    public void channelDown(){
        if (isOn()&& Channel >1){
            Channel--;
        }
    }
    public void valumeUp(){
        if (isOn()&& ValumeLevel < 7){
            ValumeLevel++;
        }
    }
    public void valumeDown(){
        if (isOn()&& ValumeLevel > 1){
            ValumeLevel--;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
