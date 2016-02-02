/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ngsm
 */
import java.util.Scanner;
public class WhileVsDoWhile {
    
    public static void main(String[] args)
    {
        char answer; 
        Scanner keyboard = new Scanner (System.in);
        
        do
        {
            System.out.print("Are you (m)ale or (f)emale?");
            answer = keyboard.next().charAt(0);	
            if (answer!='m' && answer!='f')
                System.out.println("Please answer m or f");
        }
        while ((answer != 'm') && (answer != 'f'));
        
        System.out.println("Good!");

    }
}
