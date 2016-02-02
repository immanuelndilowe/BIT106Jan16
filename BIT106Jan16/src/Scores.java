
/**
 * A program to read three scores
 * and calculate the average
 * @author ngsm
 */

import java.util.*;
public class Scores {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        // Ask user for the first score
        System.out.print("Enter score for student 1 :");
        int score1 = sc.nextInt();
        total = total + score1;
        
        // Ask user for the second score
        System.out.print("Enter score for student 2 :");
        int score2 = sc.nextInt();
        total = total + score2;
        
        // Ask user for the third score
        System.out.print("Enter score for student 3 :");
        int score3 = sc.nextInt();
        total = total + score3;
        
        double average = (double) total / 3;
        System.out.printf("The average score is %5.3f %n", average);
    }
    
}
