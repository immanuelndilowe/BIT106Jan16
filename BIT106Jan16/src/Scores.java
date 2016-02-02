
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
        
        while (numTimes <=10)
        {
            // Ask user for the  score
            System.out.print("Enter score for student :");
            int score = sc.nextInt();
            total = total + score;
            // update numTimes
            numTimes = numTimes + 1;
        }
        double average = (double) total / 10;
        System.out.printf("The average score is %5.3f %n", average);
    }
    
}
