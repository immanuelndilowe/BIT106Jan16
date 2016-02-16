/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ngsm
 */
import java.util.*;
public class FortuneTeller {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char answer;
        System.out.println("Welcome to Madame Zorra's hut");
        do
        {
            System.out.println("Ask me a question");
            sc.nextLine();
            int rnum = (int) (Math.random() * 4+1);
            // provide answer
            switch (rnum)
            {
                case 1: System.out.println("Of course not!");
                        break;
                case 2: System.out.println("Yes, definitely");
                        break;
                case 3: System.out.println("Not now, but maybe in the future");
                        break;
                case 4: System.out.println("Work harder");
                        break;
                    
            }
            System.out.println("Do you want to ask another question?");
            answer = sc.nextLine().charAt(0);
            while (answer!='Y' && answer != 'y' && answer!='N'&& answer!='n')
            {
                System.out.println("Please answer Y or N");
                System.out.println("Do you want to ask another question?");
                answer = sc.nextLine().charAt(0);
            }    
        }
        while (answer == 'Y' || answer == 'y');
    }
}
