package multiDArrays;

import java.util.ArrayList;

public class arrayList {
    private int[] myNumbers = new int[50];
    private ArrayList <String> arrayList1 = new ArrayList<String>();

    public void addGroceryItem(String item) {
        arrayList1.add(item);


    }
    public void printGroceryList() {
        System.out.println("You have " + arrayList1.size() + " item in your grocery List");
        for (int i=0; i<arrayList1.size(); i++){
            System.out.println((i+1) +". " + arrayList1.get(i));
        }
    }
    public void modifyGroceryItem(int position, String newItem){
        arrayList1.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has modified. ");
    }
    public void removeGroceryItem(int position){
        String theItem = arrayList1.get(position);
        arrayList1.remove(position);
    }
    public String findItem(String searchItem) {
      //  boolean exists = arrayList1.contains(searchItem)
    int position =arrayList1.indexOf(searchItem);
    if(position >=0) {
        return arrayList1.get(position);
    }
    return null;
    }

}
