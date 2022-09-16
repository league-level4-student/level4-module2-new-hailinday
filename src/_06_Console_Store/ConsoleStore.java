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
    double money = 200.00;
    Cart<Clothing> clothes = new Cart<Clothing>();
    Cart<Toy> toys = new Cart<Toy>();
    Cart<Lego> legos = new Cart<Lego>();
    Cart<Stuffed> stuffed = new Cart<Stuffed>();
    String check;
    int clothAm=0;
    int toyAm=0;
    int legoAm=0;
    int stuffAm=0;
    do {
    System.out.println("How many clothes would you like for $10");
    clothAm += scan.nextInt();
    money-=10 * clothAm;
    System.out.println("How many toys would you like for $5");
    toyAm += scan.nextInt();
    money-=5 * toyAm;
    System.out.println("How many legos would you like for $20");
    legoAm += scan.nextInt();
    money-=20 * legoAm;
    System.out.println("How many stuffed animals would you like for $15");
    stuffAm += scan.nextInt();
    money-=15 * stuffAm;
    System.out.println("Would you like to view your items?");
    String view = scan.next();
    if (view.equalsIgnoreCase("Yes")) {
		System.out.println("Clothes: " + clothAm);
		System.out.println("Toys: " + toyAm);
		System.out.println("Lego: " + legoAm);
		System.out.println("Stuffed Animals: " + stuffAm);
	}
    System.out.println(money);
    System.out.println("Are you ready to cash out?");
    check = scan.next();
    } while (!check.equalsIgnoreCase("Yes"));
    	if (money<0.0) {
			System.out.println("You need to remove some items, you can't pay for all that.");
			do {
				System.out.println("How many clothes would you like to remove");
			    clothAm -= scan.nextInt();
			    money+=10 * clothAm;
			    System.out.println("How many toys would you like to remove");
			    toyAm -= scan.nextInt();
			    money+=5 * clothAm;
			    System.out.println("How many legos would you like to remove");
			    legoAm -= scan.nextInt();
			    money+=20 * clothAm;
			    System.out.println("How many stuffed animals would you like to remove");
			    stuffAm -= scan.nextInt();
			    money+=15 * clothAm;
			    System.out.println("Would you like to view your items?");
			    String view = scan.next();
			    if (view.equalsIgnoreCase("Yes")) {
					System.out.println("Clothes: " + clothAm);
					System.out.println("Toys: " + toyAm);
					System.out.println("Lego: " + legoAm);
					System.out.println("Stuffed Animals: " + stuffAm);
				}
			} while (money <0.0);
				
		}
    	double total = clothAm * 10 + toyAm * 5 + legoAm * 20 + stuffAm * 15;
    	System.out.println("Receipt: ");
    	System.out.println("Clothes: $" + clothAm * 10);
		System.out.println("Toys: $" + toyAm * 5);
		System.out.println("Lego: $" + legoAm * 20);
		System.out.println("Stuffed Animals: $" + stuffAm * 15);
		System.out.println("Total: $" + (total));
    }

}
