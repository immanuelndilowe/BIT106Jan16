/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * THis is a math quiz that shows 10 questions
 * @author ngsm
 */
import java.util.*;
public class MathQuiz {
    
    /* This method returns a random character
       representing a math operation
    */
    public static char determineOp()
    {
        int rOp = (int) (Math.random() * 4 + 1);
        char op = ' ';
        switch (rOp)
        {
            case 1: op = '+'; break;
            case 2: op = '-'; break;
            case 3: op = '*'; break;
            case 4: op = '^'; break;
        }
        return op;
    }
    
    /* THis method calculates the correct answer for
       two numbers and an operation
    */
    public static int calculateAnswer(int num1, int num2, char op)
    {
        int correctAnswer = 0;
        switch(op)
        {
            case '+': correctAnswer = num1 + num2; break;
            case '-': 
                int big = Math.max(num1, num2);
                int small = Math.min(num1, num2);
                correctAnswer = big - small;
                break;
            case '*':
                correctAnswer = num1 * num2;
                break;
            case '^': correctAnswer = (int) Math.pow(num1, num2); break;
        }
        return correctAnswer;
    }
    
    /** A method to display the question and get the user's answer
     * 
     */
    public static int getUserAnswer(int num1, int num2, char op)
    {
        if (op == '-' && num2 > num1)
            System.out.println("What is " + num2 + " " + op + " " + num1);
        else
            System.out.println("What is " + num1 + " " + op + " " + num2);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    
    public static void main(String [] args)
    {
        int points = 0;
        // ask 10 questions and see how many they get correct
        for (int i = 0; i < 10; i++)
        {
            int num1 = (int) (Math.random() * 10 + 1);
            int num2 = (int) (Math.random() * 10 + 1);
            char opToDisplay = determineOp();
            int answer = calculateAnswer(num1, num2, opToDisplay);
            int userAnswer = getUserAnswer(num1, num2, opToDisplay);
            if (answer == userAnswer)
            {
                System.out.println("You are correct!");
                points++;
            }
            else 
            {
                System.out.println("You are wrong!");
                System.out.println("The answer is " + answer);
            }
        }
        System.out.println("Your score is " + points);
    }
}
