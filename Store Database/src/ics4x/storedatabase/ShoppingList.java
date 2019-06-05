/*
Assignment Name: Store Database
Author : Dhvani Pancholi
Description : This Class Is Used To Diplay and Define a ShoppingList Which Is The Interface. The Shopping List Will
Have A CheckOut List and Will Have Methods Like AddItem And RemoveItem To Control What Goes In And Out Of The List.
Completion Date : 2018-11-26

 */
// Loading Libraries
package ics4x.storedatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.math.*;

 public class ShoppingList extends Goods{

     List<Goods> ShoppingList = new ArrayList<Goods>(); // Creates New ArrayList Called ShoppingList(Used To Store CheckedOut Items)
     double totalcost = 0; // variable used for the total coast at the end

     // Creating Items For Super-Class Goods
     Goods Pasta = new Food("Pasta",5,1,100);
     Goods Pizza = new Food("Pizza",15,1,150);
     Goods Burger = new Food("Burger",3,1,100);
     Goods Doll = new Toy("Doll",5,1,7);
     Goods Ball = new Toy("Ball",3,1,4);
     Goods Bicycle = new Toy ("Bicycle",120,1,10);
     Goods HarryPotter = new Book("HarryPotter Book",20,1,"JK Rowlings");
     Goods Divergent = new Book("Divergent Book",20,1,"Veronica Roth");
     Goods GeronimoStilton = new Book("Geronimo Stilton Book", 15,1,"Elizabetta Dami");




    public void addItem(int Choice) { // addItem Method, Used For Adding Items To Your Shopping Cart

        // User Input Is Sorted Out In These If Statements To Find Out Which Items Are To Be Added To CheckOut List

        if (Choice == 1) {
            System.out.println("Item Added To Shopping List");
            ShoppingList.add(Pasta); // Adds Pasta To ShoppingList Array List
            Pasta.getItemName();
            Pasta.getItemPrice();
            Pasta.getCalories();
        }


         if (Choice == 2) {
            System.out.println("Item Added To Shopping List");
            ShoppingList.add(Pizza);  // Adds Pizza To ShoppingList Array List
             // Displaying Item Info
            Pizza.getItemName();
            Pizza.getItemPrice();
            Pizza.getCalories();

        }
         if (Choice == 3) {
            System.out.println("Item Added To Shopping List");
            ShoppingList.add(Burger);  // Adds Burger To ShoppingList Array List
             // Displaying Item Info
            Burger.getItemName();
            Burger.getItemPrice();
            Burger.getCalories();
        }
         if( Choice == 4) {
            System.out.println("Item Added To Shopping List");
            ShoppingList.add(Doll);  // Adds Doll To ShoppingList Array List
             // Displaying Item Info
            Doll.getItemName();
            Doll.getItemPrice();
            Doll.getMinimumAge();
        }
         if (Choice == 5) {
            System.out.println("Item Added To Shopping List");
            ShoppingList.add(Ball);  // Adds Ball To ShoppingList Array List
             // Displaying Item Info
            Ball.getItemName();
            Ball.getItemPrice();
            Ball.getMinimumAge();
}
           if(Choice == 6) {
            System.out.println("Item Added To Shopping List");
              ShoppingList.add(Bicycle);  // Adds Bicycle To ShoppingList Array List
               // Displaying Item Info
            Bicycle.getItemName();
            Bicycle.getItemPrice();
            Bicycle.getMinimumAge();
    }
     if(Choice == 7) {
            System.out.println("Item Added To Shopping List");
            ShoppingList.add(HarryPotter);  // Adds Harry Potter Book To ShoppingList Array List
         // Displaying Item Info
            HarryPotter.getItemName();
            HarryPotter.getItemPrice();
            HarryPotter.GetAuthor();
        }
         if(Choice == 8) {
            System.out.println("Item Added To Shopping List");
            ShoppingList.add(Divergent);  // Adds Divergent Book To ShoppingList Array List
             // Displaying Item Info
            Divergent.getItemName();
            Divergent.getItemPrice();
            Divergent.GetAuthor();
        }
         if (Choice == 9) {
            System.out.println("Item Added To Shopping List");
            ShoppingList.add(GeronimoStilton);  // Adds Geronimo Stilton Book To ShoppingList Array List
             // Displaying Item Info
            GeronimoStilton.getItemName();
            GeronimoStilton.getItemPrice();
            GeronimoStilton.GetAuthor();
        }
         if (Choice == 10) {

            System.out.println("Checking Out");


        }
}
    public void removeItem(int Choice) { // removeItem Method, Used For Adding Items To Your Shopping Cart

        // User Input Is Sorted Out In These If Statements To Find Out Which Items Are To Be Removed From CheckOut List
        if (Choice == 1) {
            System.out.println("Item Removed From Shopping List");
            ShoppingList.remove(Pasta); // Removes Pasta From ArrayList


        }
        if (Choice == 2) {
            System.out.println("Item Removed From Shopping List");
            ShoppingList.remove(Pizza); // Removes Pizza From ArrayList


        }
        if (Choice == 3) {
            System.out.println("Item Removed From Shopping List");
            ShoppingList.remove(Burger); // Removes Burger From ArrayList

        }
        if( Choice == 4) {
            System.out.println("Item Removed From Shopping List");
            ShoppingList.remove(Doll); // Removes Doll From ArrayList
            ;
        }
        if (Choice == 5) {
            System.out.println("Item Removed From Shopping List");
            ShoppingList.remove(Ball); // Removes Ball From ArrayList

        }
        if(Choice == 6) {
            System.out.println("Item Removed From Shopping List");
            ShoppingList.remove(Bicycle); // Removes Bicycle From ArrayList

        }
        if(Choice == 7) {
            System.out.println("Item Removed From Shopping List");
            ShoppingList.remove(HarryPotter); // Removes Harry Potter Book From ArrayList

        }
        if(Choice == 8) {
            System.out.println("Item Removed From Shopping List");
            ShoppingList.remove(Divergent); // Removes Divergent Book From ArrayList

        }
        if (Choice == 9) {
            System.out.println("Item Removed From Shopping List");
            ShoppingList.remove(GeronimoStilton); // Removes Geronimo Stilton Book From ArrayList

        }
        if (Choice == 10) {

            System.out.println("Checking Out");


        }
        if (Choice > 10) {

            System.out.println("Invalid Option!");


        }

    }

    public void ShowItems() { // ShowItems Method, Used To Display The CheckOut List

        for (int i = 0; i < ShoppingList.size(); i++) {
            System.out.println(ShoppingList.get(i));


        }


    }
    public double GetFinalPrice() { // GetFinalPrice Method, Used To Display The Original And Final Prices Of The Items Bought
        String sum;
        System.out.println("-------- Before TAX ---------");
        for (int i = 0; i < ShoppingList.size(); i++) {
            sum =  "Original Price Of " +ShoppingList.get(i).Description +": " + ShoppingList.get(i).Price;
            System.out.println(sum);
        }
        System.out.println("------------------------------");
        System.out.println("-------- After TAX -----------");

        for (Goods pricelist : ShoppingList) {
            totalcost += pricelist.calculateTax() * pricelist.getItemQty(); // Total Cost Is Displayed After Calculating Tax

        }
        System.out.println("------------------------------");







        return totalcost;
    }




}