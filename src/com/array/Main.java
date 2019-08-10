package com.array;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static List list = new List();

    public static void main(String[] args) {
      boolean quit = false;
      int choice = 0;
        printInstructions();
      while (!quit){
          System.out.println("Enter your choice: ");
          choice = scanner.nextInt();
          scanner.nextLine();
          switch (choice){
              case 0:
                  printInstructions();
                  break;
              case 1:
                  list.printList();
                  break;
              case 2:
                  addItem();
                  break;
              case 3:
                  modifyItem();
                  break;
              case 4:
                  removeItem();
                  break;
              case 5:
                  findItem();
                  break;
              case 6:
                  quit = true;
                  break;
          }
      }
    }

    public  static void printInstructions(){
        System.out.println("Press: \n 0 - To print options  \n 1 - To print list  \n 2 - to add item \n 3 - to modify item \n 4 to remove item \n 5 = to search item \n 6 to exit");
    }

    public static void addItem(){
        System.out.println("Please enter item");
        list.addItem(scanner.nextLine());
    }

    public static void removeItem(){
        System.out.println("Please enter item No to remove it");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        list.removeItem(itemNo-1);
    }

    public static void  modifyItem(){
        System.out.println("Please enter item No to remove it");
       int itemNo = scanner.nextInt();
       scanner.nextLine();
        System.out.println("Enter replacemt Item :" );
        String newItem = scanner.nextLine();
        list.modifyItem(itemNo-1, newItem);
    }

    public static void findItem(){
        System.out.println("Please search for item ");
        String searchItem = scanner.nextLine();
        if(list.findItem(searchItem) != null){
            System.out.println("Found " + searchItem);
        }else{
            System.out.println("Item not found");
        }
    }
}
