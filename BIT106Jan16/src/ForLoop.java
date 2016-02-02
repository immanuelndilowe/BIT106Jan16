/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ngsm
 */
public class ForLoop {
    
    public static void main(String[] args)
    {
        // finding the square roots of 100 to 200
        // initialize to 100
        // update by 10
        // test that the value is <= 200
        // in the loop body, calculate the square root
        for (int i = 100; i <= 200; i+=10)
        {    
            System.out.print("Sqrt(" + i +") = ");
            System.out.println(Math.sqrt(i));
        }
    }
}
