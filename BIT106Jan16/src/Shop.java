/* Tutorial 2 exercise - Worksheet 2 
 * This program is to be used in a computer shop
 * Written by: Ng Shu Min
 * Date:
 */ 
import java.util.Scanner;

public class Shop
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    String item1;
	    double item1Price;
	    String item2;
	    double item2Price;
	    int discPercent;
	    int numItem1, numItem2;
	    
	    
	    System.out.print("What is the name of the first item :");
	    item1 = sc.nextLine();
	    System.out.print("What is the price of the first item :");
	    item1Price = sc.nextDouble();
	    sc.nextLine();
	    System.out.print("What is the name of the second item :"); 
	    item2 = sc.nextLine();
	    System.out.print("What is the price of the second item :");
	    item2Price = sc.nextDouble();
	    sc.nextLine();
	    System.out.print("What is today's discount :");
	    discPercent = sc.nextInt();
	    
	    // Display introduction
		System.out.println("Welcome to the \"E\"-Shop");
		System.out.println("A " + item1 + " costs RM" + item1Price);
		System.out.println("A " + item2 + " costs RM" + item2Price);
	
		System.out.println(discPercent + "% discount today!");
		
		System.out.println("If you buy 1 " + item1 + " and 1 " + item2);
		
		double discount = (double) discPercent / 100 * (item1Price + item2Price);
		
		System.out.println("You will get a discount of " + discount);
		
		double totalPrice = item1Price + item2Price - discount;
		System.out.println("The total price will be RM" + totalPrice);
		
		System.out.print("How many " + item1 + " do you want :");
		numItem1 = sc.nextInt();
		System.out.print("How many " + item2 + " do you want :");
		numItem2 = sc.nextInt();
		
		double subTotal = (numItem1 * item1Price) + (numItem2 * item2Price);
	    discount = discPercent / 100.0 * subTotal;
	    totalPrice = subTotal - discount;
	    System.out.println("Subtotal : " + subTotal);
	    System.out.println("Discount given : " + discount);
	    System.out.println("Please pay: " + totalPrice);
		
	}
}