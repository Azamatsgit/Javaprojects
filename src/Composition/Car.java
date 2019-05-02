package Composition;

public class Car extends vehicle{
    private int doors;
    private int enginCapacity;

    public Car(String name, int doors, int enginCapacity) {

        this.doors= doors;
        this.enginCapacity=enginCapacity;
    }
}
