package chapter8.arraylist;
import java.util.ArrayList;

public class GroceryList {
    ArrayList <String> groceryList = new ArrayList <String>();

    public void  addGroceryItem(String item) {
        groceryList.add(item);
    }
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items.");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }
    public void  modifyGroceryItem(int position, String item) {
        groceryList.set(position, item);
    }
    public String removeGroceryItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);
        return item;
    }
    public String findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
