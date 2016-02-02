/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A program to display some math operations on a value
 * entered by the user
 * @author ngsm
 */
import java.util.*;
public class MathOperationsMennu {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // ask the user to enter a value
        System.out.print("Enter a double value :");
        double n = sc.nextDouble();
        
        // let user enter a choice
        int choice;
        // then calculate the square, cube, square root 
        // and reciprocal
        System.out.println("Do you want to calculate");
        System.out.println("1. square");
        System.out.println("2. cube");
        System.out.println("3. square root");
        System.out.println("4. reciprocal");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        
        if (choice == 1)
            System.out.println("("+n+")^2 = " + (n*n));
        else if (choice == 2)
            System.out.println("("+n+")^3 = " + (n*n*n));
        else if (choice == 3)
            System.out.println("sqrt("+n+") = " + Math.sqrt(n));
        else if (choice == 4)
            System.out.println("1/"+n+" = " + (1/n));
        else
            System.out.println("Invalid choice");
    }
            
    
}
