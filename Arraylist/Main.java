package com.Rahmat;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        PrintMenu ();
        while (!quit){
            System.out.println("Enter ur choice");
choice = scanner.nextInt();
scanner.nextLine();
switch (choice){
    case 0:
        PrintMenu();
        break;
    case 1:
        groceryList.printGroc();
        break;
    case 2:
        additem();
        break;
    case 3:
        modify();
        break;
    case 4:
        remove();
        break;
    case 5:
        search();
    case 6:
        quit = true;
        break;
}
        }

    }
    public static void PrintMenu(){
        System.out.println("\n press");
        System.out.println("\t 0- to choice");
        System.out.println("\t 1- to print the list");
        System.out.println("\t 2- to add item");
        System.out.println("\t 3- to modify an item");
        System.out.println("\t 4- to remove an item");
        System.out.println("\t 5- to seach for an item");
        System.out.println("\t 6- to quit");
    }
    public static void additem(){
        System.out.print("Enter the item ");
        groceryList.addGrocery(scanner.nextLine());
        }
        public static void modify(){
            System.out.print("Current item number ");
            String  itemno = scanner.nextLine();
            System.out.print("Enter new item ");
            String newitem = scanner.nextLine();
            groceryList.modify(itemno, newitem);

        }
        public static void remove(){
            System.out.print("Enter item number ");
            String itemno = scanner.nextLine();
            groceryList.remove(itemno);
        }
        public static void search(){
            System.out.print("item to sech for ");
            String searchitem = scanner.nextLine();
            if(groceryList.onfile(searchitem)){
                System.out.println("found "+searchitem+ " in ur list");
            }else{
                System.out.println(searchitem+" is not found ");
            }
        }
        public static void prosessArrayList(){
            ArrayList<String> newArray = new ArrayList<String>();
            newArray.addAll(groceryList.getGrocerylist());
            ArrayList<String > nextArray  = new ArrayList<String>(groceryList.getGrocerylist());
            String [] myArray = new String[groceryList.getGrocerylist().size()];
            myArray = groceryList.getGrocerylist().toArray(myArray);
        }
}

