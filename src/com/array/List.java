package com.array;


import java.util.ArrayList;

public class List {
    private ArrayList<String> list = new ArrayList<String>();

    public void addItem(String item){
        list.add(item);
    }

    public void printList(){
        System.out.println("You have" + list.size() + " ITEMS:");
        for(int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + ". " + list.get(i));
        }
    }

    public void modifyItem(int position, String newItem){
        list.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + "had been modified");
    }

    public void removeItem(int postion){
        String theItem = list.get(postion);
        list.remove(postion);
    }

    public String findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem);
            int position = list.indexOf(searchItem);
            if(position >= 0){
                return list.get(position);
            }
            return null;
    }
}
