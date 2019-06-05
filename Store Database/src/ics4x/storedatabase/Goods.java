/*
Assignment Name: Store Database
Author : Dhvani Pancholi
Description : This Class Holds The SuperClass And The SubClasses.
 It Holds All The Constructors And The Attributes Of All The Classes.
Each SubClass In This Class File Has Methods As Well.
Completion Date : 2018-11-26

 */
// Loading Package
package ics4x.storedatabase;

public class Goods   // Super Class
{
    // Assigning Attributes For Super Class
    public String Description;
    public double Price;
    public int Quantity;
    public boolean Taxable;
    public int Calories;
    public String Author;
    public int MinimumAge;
    public double TotalAmount;

    // constructor
    public Goods() {

    }

    // Super Class Methods
    public Double calculateTax() { // Calculates The Tax For Each Item
        double TaxRate = 13; // 13 Percent TaxRate


        if (Taxable == true) { // If Item Is Taxable, Tax Will Be Added
            TotalAmount = Price * (TaxRate / 100) + Price;
            System.out.println("Final Price For " + Description +": $" + TotalAmount);
        }
        else if (Taxable == false) { // If Item Is Not Taxable, Tax Will Not Be Added
            TotalAmount = Price + 0;
            System.out.println("Final Price For " + Description +": $" + TotalAmount);
        }

        return 0.0;

    }
    public String getItemName() { // Returns Item Name
        System.out.println("ItemName : " + Description);
        return "";
    }


    public double getItemPrice() { // Returns Item's Original Price
        System.out.println("Price : " + Price * Quantity);
        return 0;
    }


    public int getItemQty() { // Returns Item Quantity
        System.out.println("Quantity : "+ Quantity);
        return 0;
    }

    public int getCalories () // Returns Food Calories
    {
        System.out.println("Calories : " + Calories);
        return 0;
    }

    public int getMinimumAge() // Returns Toy Minimum Age Requirement
    {
        System.out.println("MinimumAge : "+ MinimumAge);
        return 0;
    }

    public String GetAuthor() { // Returns Book Author
        System.out.println("Author : " + Author);
        return "";


    }
    @Override // Overrides The Default toString Function
    public String toString() {

        return Description;

    }

}

//  Food Subclass - Represents The Food Items In Goods
  class Food extends Goods {


    public Food (String info, double GetPrice, int howMany,int Cal) { // Food Constructor
        Taxable = true;
        Description = info;
        Price = GetPrice;
        Quantity = howMany;
        Calories = Cal;
    }

}
//  Toy Subclass - Represents the Toy Items in Goods
   class Toy extends Goods {


    public Toy (String info, double GetPrice, int howMany,int MinAge) { // Toy Constructor
        Taxable = true;
        Description = info;
        Price = GetPrice;
        Quantity = howMany;
        MinimumAge = MinAge;


    }

}
//  Book Subclass - Represents the Book Items in Goods
 class Book extends Goods  {


    public Book (String info, double GetPrice, int howMany, String Who) { // Book Constructor
        Taxable = true;
        Description = info;
        Price = GetPrice;
        Quantity = howMany;
        Author = Who;


    }


}