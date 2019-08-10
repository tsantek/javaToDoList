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
        System.out.println("Press: \n 0 - To print options  \n 1 - To print list  \n 2 - to add item \n 3 - to modify item \4 to remove item \n 5 = to search item \n 6 to exit");
    }


}
