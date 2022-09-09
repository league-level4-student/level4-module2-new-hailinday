package _06_Console_Store;
import java.util.Scanner;

import _02_Generics_Store.*;
public class ConsoleStore {

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Double money = 100.00;
    Cart<Clothing> clothes = new Cart<Clothing>();
    Cart<Toy> toys = new Cart<Toy>();
    Cart<Lego> legos = new Cart<Lego>();
    Cart<Stuffed> stuffed = new Cart<Stuffed>();
    String check;
    int price;
    do {
    System.out.println("How many clothes woudld you like for $10");
    int clothAm = scan.nextInt();
    System.out.println("How many toys would you like for $5");
    int toyAm = scan.nextInt();
    System.out.println("How many legos would you like for $20");
    int legoAm = scan.nextInt();
    System.out.println("How many stuffed animals would you like for $15");
    int stuffAm = scan.nextInt();
    System.out.println("Would you like to view your items?");
    String view = scan.next();
    System.out.println("Are you ready to cash out?");
    check = scan.next();
    } while (!check.equalsIgnoreCase("Yes"));
    
    
    }

}
