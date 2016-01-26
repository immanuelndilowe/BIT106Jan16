/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A program to check user's marks
 * @author ngsm
 */
import java.util.*;
public class Grading {
    
    public static void main(String[] args)
    {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score :");
        int score = sc.nextInt();
        
        // see if they pass
        if (score >= 50)
            System.out.println("You pass!");
        else
            System.out.println("You fail");
        
        System.out.print("Enter your grade :");
        char grade = sc.next().charAt(0);
        
        // give them encouragement
        if (grade == 'A')
            System.out.println("Wow");
        else
            System.out.println("Try harder next time");
    }
}
