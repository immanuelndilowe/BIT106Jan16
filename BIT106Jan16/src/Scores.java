
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
        int numTimes = 1;
        System.out.print("How many assignments? :");
        int numAssignments = sc.nextInt();
        
        while (numTimes <= numAssignments)
        {
            // Ask user for the  score
            System.out.print("Enter score for student " + numTimes +":");
            int score = sc.nextInt();
            total += score;
            // update numTimes
            numTimes++;
        }
        double average = (double) total / numAssignments;
        System.out.println("The total score is " + total);
        System.out.printf("The average score is %5.3f %n", average);
    }
    
}
