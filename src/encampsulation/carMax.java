package encampsulation;

public class carMax {
    public static void main(String[] args) {
        CarForSale carOne = new CarForSale();
        carOne.setMake("Audi");
        carOne.setModel("Q7");
        carOne.setType("SUV");
        carOne.setSpeed(75);

        System.out.println(carOne.getSpeed());
        System.out.println(carOne.getMake());

        carOne.accellerate(50);
        System.out.println(carOne.getSpeed());

        CarForSale carTwo = new CarForSale();

        System.out.println("Car 2: " + carTwo.getMake());

        CarForSale car3 = new CarForSale("SportCar", "BMW","M7");
        System.out.println(car3.getMake());
        System.out.println(car3.getModel());
        System.out.println(car3.getType());
        CarForSale car4 = new CarForSale("SportCar4", "2","M77");
        System.out.println(car4.getType());


    }
}
