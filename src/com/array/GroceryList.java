package com.array;


import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have" + groceryList.size() + " ITEMS:");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + "had been modified");
    }

    public void removeItem(int postion){
        String theItem = groceryList.get(postion);
        groceryList.remove(postion);
    }

    public String findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
            int position = groceryList.indexOf(searchItem);
            if(position >= 0){
                return groceryList.get(position);
            }
            return null;
    }
}
