/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* ExamReport.java
 * This program calculates the average marks for students in a subject.
 * Written by: Ng Shu Min
 * Date: 2 Feb 2016
 */
import java.util.*;
public class ExamReport {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter subject code");
		String code = sc.nextLine();
                
                System.out.println("How many students are there?");
                int numStudents = sc.nextInt();
		double total = 0.0;
		int count = 1;
		while (count <= numStudents )
		{
			System.out.println("Enter mark for student " + count);
			double mark = sc.nextDouble();
			total += mark;
			count++;
		}
		double average = total / numStudents;
		System.out.printf("For %s the average mark of %d students is %.2f%n", code, numStudents, average);
		
	}

}
