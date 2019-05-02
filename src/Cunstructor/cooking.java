package Cunstructor;

public class cooking {

    /*
    Method cook accepts String food name, and prints,
    Today we are cooking "foodName"

     */

    /*
    Method youWillNeed, accepts a String with things we need
    prints "We need following items: items"
     */
    /*
    method cookFor accepts minutes and prints:
    "You need to cook for minutes by wayOfCooking
     */
    /*
    method ready; does not accepts any parameters,
    prints: Meal is ready enjoy!
     */
    public static void main(String[] args) {
        cook(" Steak");
        youWillNeed("Meat, Oil, Salt, Pepper, Wooden Spoon, Tomato, Onions, Garlic!");
        cookFor(30,"Frying! ");
        mealReady();

    }
    public static void cook (String foodName){
        System.out.println(" Today  we are cooking" + foodName + " ");

    }
    public static void youWillNeed(String item){
        System.out.println(" We need following items " + item + " ");
    }
    public static void cookFor(int minutes, String wayOfCooking){
        System.out.println(" You need to cook for " + minutes + " minutes by " + wayOfCooking+ " ");
    }
    public static void mealReady(){
        System.out.println(" Meal is ready enjoy !!!");

    }
}
