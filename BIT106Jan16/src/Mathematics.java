/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Finding square roots
 * @author ngsm
 */
import java.util.*;
public class Mathematics {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num >= 0 )
        {
            System.out.println("The square root of " + num);
            System.out.println("Is " + Math.sqrt(num));
        }
        else
            System.out.println("Cannot find square root of negative number");
        
    }
}
