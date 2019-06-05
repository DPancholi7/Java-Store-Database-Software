/*
Assignment Name: Store Database
Author : Dhvani Pancholi
Completion Date : 2018-11-26
Program Description : This program demonstrate a concept of a store database by using inheritance and polymorphism
to simulate a real life process of buying goods in a store.
 */

// Importing Libraries
package ics4x.storedatabase;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

 class StoreDatabase extends ShoppingList // Store (Main Method)
 {

     public static void main(String args[]) // Main Method Implementation
     {

         Scanner input = new Scanner(System.in);
         ShoppingList MyBasket = new ShoppingList();
         List<String> list = new ArrayList<String>();


         // Showcasing a List Of Items Available
         System.out.println("----- Available Shopping Items------");
         System.out.println("ITEM NAME                PRICE");
         list.add("1. " + MyBasket.Pasta.Description + "                  " + MyBasket.Pasta.Price + "        ");
         list.add("2. " + MyBasket.Pizza.Description + "                  " + MyBasket.Pizza.Price + "        ");
         list.add("3. " + MyBasket.Burger.Description + "                 " + MyBasket.Burger.Price + "        ");
         list.add("4. " + MyBasket.Doll.Description + "                   " + MyBasket.Doll.Price + "        ");
         list.add("5. " + MyBasket.Ball.Description + "                   " + MyBasket.Ball.Price + "        ");
         list.add("6. " + MyBasket.Bicycle.Description + "                " + MyBasket.Bicycle.Price + "     ");
         list.add("7. " + MyBasket.HarryPotter.Description + "       " + MyBasket.HarryPotter.Price + "   ");
         list.add("8. " + MyBasket.Divergent.Description + "         " + MyBasket.Divergent.Price + "     ");
         list.add("9. " + MyBasket.GeronimoStilton.Description + "  " + MyBasket.GeronimoStilton.Price + "");
         list.add("  Press 10 To Check Out Items");


         // Printing out list

         for (int i = 0; i < list.size(); i++) {
             System.out.println(list.get(i));

         }
         // Introduction Output
         System.out.println("------------------------------------");
         System.out.println("Welcome To Our Shop!\n" + "Select A Number To Add To Cart ");

         int Choice = input.nextInt(); // Used To Gather User Input For Buying Items


         while (Choice != 10) { // While Loop Which Will Run Until The Check-Out Option Is Chosen
             if (Choice == 1) {
                 MyBasket.addItem(1); // Add Item Method is Called
                 Choice = input.nextInt(); // Gathers User Input For More Options


             }
             if (Choice == 2) {
                 MyBasket.addItem(2); // Add Item Method is Called
                 Choice = input.nextInt(); // Gathers User Input For More Options



             }
             if (Choice == 3) {
                 MyBasket.addItem(3); // Add Item Method is Called
                 Choice = input.nextInt(); // Gathers User Input For More Options



             }
             if (Choice == 4) {
                 MyBasket.addItem(4); // Add Item Method is Called
                 Choice = input.nextInt(); // Gathers User Input For More Options



             }
             if (Choice == 4) {
                 MyBasket.addItem(4); // Add Item Method is Called
                 Choice = input.nextInt(); // Gathers User Input For More Options



             }
             if (Choice == 5) {
                 MyBasket.addItem(5); // Add Item Method is Called
                 Choice = input.nextInt(); // Gathers User Input For More Options



             }
             if (Choice == 6) {
                 MyBasket.addItem(6); // Add Item Method is Called
                 Choice = input.nextInt(); // Gathers User Input For More Options



             }
             if (Choice == 7) {
                 MyBasket.addItem(7); // Add Item Method is Called
                 Choice = input.nextInt(); // Gathers User Input For More Options



             }
             if (Choice == 8) {
                 MyBasket.addItem(8); // Add Item Method is Called
                 Choice = input.nextInt(); // Gathers User Input For More Options



             }
             if (Choice == 9) {
                 MyBasket.addItem(9); // Add Item Method is Called
                 Choice = input.nextInt(); // Gathers User Input For More Options


             }
             if (Choice == 10) {
                 System.out.println("---- Your Shopping List ----");
                 MyBasket.ShowItems(); // ShowItem Method Is Called
                 System.out.println("------------------------------------");
                 break; // Breaks While Loop


             }
             if (MyBasket.ShoppingList.size() > 10) { // This If Statement Is Used To Make Sure A Maximum Of 10 Items Only
                 MyBasket.ShoppingList.remove(10);
                 System.out.println("---- Your Shopping List ----");
                 MyBasket.ShowItems();
                 System.out.println("------------------------------------");
                 System.out.println("*Shopping Cart Full*");
                 Choice = 10; // Revert To Check-Out Option


             }
         }

         // Many If Statements Will Be Initialized For The User To Talk And Command The Program.

         System.out.println("Would You Like To Remove Any Items, Yes or No?"); // Asks The User If They Wants Items Removed
         String Option = input.next();

         if (Option.equals("yes") || Option.equals("Yes")) {// If User Selects Yes, Items Will Be Removed Upon Their Request
             System.out.println("Please State The Name of The Item You Would Like To Remove!");
             Option = input.next();
         } else if (Option.equals("no") || Option.equals("No")) { // If User Selects No, Check Out Process Will Be Initiated

             System.out.println("Calculating Total Prices For All Items....\n");
             MyBasket.GetFinalPrice(); // Final Price Method Is Called.

         } else {
             while (Option != "yes" || Option != "no") { // While Loop To Make Sure Invalid Input Is Informed To User
                 System.out.println(" Invalid! Please Check Again");
                 Option = input.next();
                 if (Option.equals("yes") || Option.equals("Yes")) {

                     System.out.println("Please State The Name of The Item You Would Like To Remove!");
                     Option = input.next();
                     break;
                 } else if (Option.equals("no") || Option.equals("No")) {

                     System.out.println("Calculating Total Prices For All Items....\n");
                     MyBasket.GetFinalPrice(); //  Get Final Price Method Is Called
                     break;

                 }
             }


         }
         if (Option.equals("pasta") || Option.equals("Pasta")) {
             MyBasket.removeItem(1); // RemoveItem Method Called
             System.out.println("Would You Like To Remove Any Items, Yes or No?");
             Option = input.next();
             if (Option.equals("yes") || Option.equals("Yes")) { // If User Selects Yes, Items Will Be Removed Upon Their Request
                 System.out.println("Please State The Name of The Item You Would Like To Remove!");
                 Option = input.next();
             } else if (Option.equals("no") || Option.equals("No")) {  // If User Selects No, Check Out Process Will Be Initiated
                 System.out.println("Calculating Total Prices For All Items....\n");
                 MyBasket.GetFinalPrice();
             } else {
                 while (Option != "yes" || Option != "no") {  // While Loop To Make Sure Invalid Input Is Informed To User
                     System.out.println(" Invalid! Please Check Again");
                     Option = input.next();
                     if (Option.equals("yes") || Option.equals("Yes")) {

                         System.out.println("Please State The Name of The Item You Would Like To Remove!");
                         Option = input.next();
                         break;
                     } else if (Option.equals("no") || Option.equals("No")) {

                         System.out.println("Calculating Total Prices For All Items....\n");
                         MyBasket.GetFinalPrice(); //  Get Final Price Method Is Called
                         break;

                     }
                 }


             }
         }
         if (Option.equals("pizza") || Option.equals("Pizza")) {
             MyBasket.removeItem(2); // RemoveItem Method Called
             System.out.println("Would You Like To Remove Any Items, Yes or No?");
             Option = input.next();
             if (Option.equals("yes") || Option.equals("Yes")) { // If User Selects Yes, Items Will Be Removed Upon Their Request
                 System.out.println("Please State The Name of The Item You Would Like To Remove!");
                 Option = input.next();
             } else if (Option.equals("no") || Option.equals("No")) {  // If User Selects No, Check Out Process Will Be Initiated
                 System.out.println("Calculating Total Prices For All Items....\n");
                 MyBasket.GetFinalPrice();
             } else {
                 while (Option != "yes" || Option != "no") {  // While Loop To Make Sure Invalid Input Is Informed To User
                     System.out.println(" Invalid! Please Check Again");
                     Option = input.next();
                     if (Option.equals("yes") || Option.equals("Yes")) {

                         System.out.println("Please State The Name of The Item You Would Like To Remove!");
                         Option = input.next();
                         break;
                     } else if (Option.equals("no") || Option.equals("No")) {

                         System.out.println("Calculating Total Prices For All Items....\n");
                         MyBasket.GetFinalPrice(); //  Get Final Price Method Is Called
                         break;

                     }
                 }


             }

         }

         if (Option.equals("burger") || Option.equals("Burger")) {
             MyBasket.removeItem(3); // RemoveItem Method Called
             System.out.println("Would You Like To Remove Any Items, Yes or No?");
             Option = input.next();
             if (Option.equals("yes") || Option.equals("Yes")) { // If User Selects Yes, Items Will Be Removed Upon Their Request
                 System.out.println("Please State The Name of The Item You Would Like To Remove!");
                 Option = input.next();
             } else if (Option.equals("no") || Option.equals("No")) {  // If User Selects No, Check Out Process Will Be Initiated
                 System.out.println("Calculating Total Prices For All Items....\n");
                 MyBasket.GetFinalPrice();
             } else {
                 while (Option != "yes" || Option != "no") {  // While Loop To Make Sure Invalid Input Is Informed To User
                     System.out.println(" Invalid! Please Check Again");
                     Option = input.next();
                     if (Option.equals("yes") || Option.equals("Yes")) {

                         System.out.println("Please State The Name of The Item You Would Like To Remove!");
                         Option = input.next();
                         break;
                     } else if (Option.equals("no") || Option.equals("No")) {

                         System.out.println("Calculating Total Prices For All Items....\n");
                         MyBasket.GetFinalPrice(); //  Get Final Price Method Is Called
                         break;

                     }
                 }


             }
         }
         if (Option.equals("doll") || Option.equals("Doll")) {
             MyBasket.removeItem(4); // RemoveItem Method Called
             System.out.println("Would You Like To Remove Any Items, Yes or No?");
             Option = input.next();
             if (Option.equals("yes") || Option.equals("Yes")) { // If User Selects Yes, Items Will Be Removed Upon Their Request
                 System.out.println("Please State The Name of The Item You Would Like To Remove!");
                 Option = input.next();
             } else if (Option.equals("no") || Option.equals("No")) {  // If User Selects No, Check Out Process Will Be Initiated
                 System.out.println("Calculating Total Prices For All Items....\n");
                 MyBasket.GetFinalPrice();
             } else {
                 while (Option != "yes" || Option != "no") {  // While Loop To Make Sure Invalid Input Is Informed To User
                     System.out.println(" Invalid! Please Check Again");
                     Option = input.next();
                     if (Option.equals("yes") || Option.equals("Yes")) {

                         System.out.println("Please State The Name of The Item You Would Like To Remove!");
                         Option = input.next();
                         break;
                     } else if (Option.equals("no") || Option.equals("No")) {

                         System.out.println("Calculating Total Prices For All Items....\n");
                         MyBasket.GetFinalPrice(); //  Get Final Price Method Is Called
                         break;

                     }
                 }


             }
         }
         if (Option.equals("ball") || Option.equals("Ball")) {
             MyBasket.removeItem(5); // RemoveItem Method Called
             System.out.println("Would You Like To Remove Any Items, Yes or No?");
             Option = input.next();
             if (Option.equals("yes") || Option.equals("Yes")) { // If User Selects Yes, Items Will Be Removed Upon Their Request
                 System.out.println("Please State The Name of The Item You Would Like To Remove!");
                 Option = input.next();
             } else if (Option.equals("no") || Option.equals("No")) {  // If User Selects No, Check Out Process Will Be Initiated
                 System.out.println("Calculating Total Prices For All Items....\n");
                 MyBasket.GetFinalPrice();
             } else {
                 while (Option != "yes" || Option != "no") {  // While Loop To Make Sure Invalid Input Is Informed To User
                     System.out.println(" Invalid! Please Check Again");
                     Option = input.next();
                     if (Option.equals("yes") || Option.equals("Yes")) {

                         System.out.println("Please State The Name of The Item You Would Like To Remove!");
                         Option = input.next();
                         break;
                     } else if (Option.equals("no") || Option.equals("No")) {

                         System.out.println("Calculating Total Prices For All Items....\n");
                         MyBasket.GetFinalPrice(); //  Get Final Price Method Is Called
                         break;

                     }
                 }


             }
         }
         if (Option.equals("bicycle") || Option.equals("Bicycle")) {
             MyBasket.removeItem(6); // RemoveItem Method Called
             System.out.println("Would You Like To Remove Any Items, Yes or No?");
             Option = input.next();
             if (Option.equals("yes") || Option.equals("Yes")) { // If User Selects Yes, Items Will Be Removed Upon Their Request
                 System.out.println("Please State The Name of The Item You Would Like To Remove!");
                 Option = input.next();
             } else if (Option.equals("no") || Option.equals("No")) {  // If User Selects No, Check Out Process Will Be Initiated
                 System.out.println("Calculating Total Prices For All Items....\n");
                 MyBasket.GetFinalPrice();
             } else {
                 while (Option != "yes" || Option != "no") {  // While Loop To Make Sure Invalid Input Is Informed To User
                     System.out.println(" Invalid! Please Check Again");
                     Option = input.next();
                     if (Option.equals("yes") || Option.equals("Yes")) {

                         System.out.println("Please State The Name of The Item You Would Like To Remove!");
                         Option = input.next();
                         break;
                     } else if (Option.equals("no") || Option.equals("No")) {

                         System.out.println("Calculating Total Prices For All Items....\n");
                         MyBasket.GetFinalPrice(); //  Get Final Price Method Is Called
                         break;

                     }
                 }


             }
         }
         if (Option.equals("harrypotter") || Option.equals("HarryPotter")) {
             MyBasket.removeItem(7); // RemoveItem Method Called
             System.out.println("Would You Like To Remove Any Items, Yes or No?");
             Option = input.next();
             if (Option.equals("yes") || Option.equals("Yes")) { // If User Selects Yes, Items Will Be Removed Upon Their Request
                 System.out.println("Please State The Name of The Item You Would Like To Remove!");
                 Option = input.next();
             } else if (Option.equals("no") || Option.equals("No")) {  // If User Selects No, Check Out Process Will Be Initiated
                 System.out.println("Calculating Total Prices For All Items....\n");
                 MyBasket.GetFinalPrice();
             } else {
                 while (Option != "yes" || Option != "no") {  // While Loop To Make Sure Invalid Input Is Informed To User
                     System.out.println(" Invalid! Please Check Again");
                     Option = input.next();
                     if (Option.equals("yes") || Option.equals("Yes")) {

                         System.out.println("Please State The Name of The Item You Would Like To Remove!");
                         Option = input.next();
                         break;
                     } else if (Option.equals("no") || Option.equals("No")) {

                         System.out.println("Calculating Total Prices For All Items....\n");
                         MyBasket.GetFinalPrice(); //  Get Final Price Method Is Called
                         break;

                     }
                 }


             }
         }
         if (Option.equals("Divergent") || Option.equals("divergent")) {
             MyBasket.removeItem(8); // RemoveItem Method Called
             System.out.println("Would You Like To Remove Any Items, Yes or No?");
             Option = input.next();
             if (Option.equals("yes") || Option.equals("Yes")) { // If User Selects Yes, Items Will Be Removed Upon Their Request
                 System.out.println("Please State The Name of The Item You Would Like To Remove!");
                 Option = input.next();
             } else if (Option.equals("no") || Option.equals("No")) {  // If User Selects No, Check Out Process Will Be Initiated
                 System.out.println("Calculating Total Prices For All Items....\n");
                 MyBasket.GetFinalPrice();
             } else {
                 while (Option != "yes" || Option != "no") {  // While Loop To Make Sure Invalid Input Is Informed To User
                     System.out.println(" Invalid! Please Check Again");
                     Option = input.next();
                     if (Option.equals("yes") || Option.equals("Yes")) {

                         System.out.println("Please State The Name of The Item You Would Like To Remove!");
                         Option = input.next();
                         break;
                     } else if (Option.equals("no") || Option.equals("No")) {

                         System.out.println("Calculating Total Prices For All Items....\n");
                         MyBasket.GetFinalPrice(); //  Get Final Price Method Is Called
                         break;

                     }
                 }


             }
         }
         if (Option.equals("Geronimo") || Option.equals("geronimo")) {
             MyBasket.removeItem(9); // RemoveItem Method Called
             System.out.println("Would You Like To Remove Any Items, Yes or No?");
             Option = input.next();
             if (Option.equals("yes") || Option.equals("Yes")) { // If User Selects Yes, Items Will Be Removed Upon Their Request
                 System.out.println("Please State The Name of The Item You Would Like To Remove!");
                 Option = input.next();
             }
             if (Option.equals("no") || Option.equals("No")) {  // If User Selects No, Check Out Process Will Be Initiated
                 System.out.println("Calculating Total Prices For All Items....\n");
                 MyBasket.GetFinalPrice();
             } else {
                 while (Option != "yes" || Option != "no") {  // While Loop To Make Sure Invalid Input Is Informed To User
                     System.out.println(" Invalid! Please Check Again");
                     Option = input.next();
                     if (Option.equals("yes") || Option.equals("Yes")) {

                         System.out.println("Please State The Name of The Item You Would Like To Remove!");
                         Option = input.next();
                         break;
                     } else if (Option.equals("no") || Option.equals("No")) {

                         System.out.println("Calculating Total Prices For All Items....\n");
                         MyBasket.GetFinalPrice(); //  Get Final Price Method Is Called
                         break;

                     }
                 }
             }

         }

         System.out.println("Thank You For Shopping At Dhvani's Store");
         System.out.println("Good Bye, Have A Good Day!"); // Good Bye Output

     }
 }










