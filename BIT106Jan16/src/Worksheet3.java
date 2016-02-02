/* Tutorial 3
 * The purpose of this program is to calculate and display the final
 * marks for a student
 * Date:
 * Written by:
 */
import java.util.*;
public class Worksheet3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                System.out.print("Enter mark for assignment 1:");
                double assign1 = sc.nextDouble();
                if (assign1 < 0 || assign1 > 100)
                {
                    System.out.println("Invalid value entered");
                    assign1 = 0;
                }
                System.out.print("Enter mark for assignment 2:");
                double assign2 = sc.nextDouble();
                 if (assign2 < 0 || assign2 > 100)
                {
                    System.out.println("Invalid value entered");
                    assign2 = 0;
                }
                System.out.print("Enter mark for exam:");
                double exam = sc.nextDouble();
                 if (exam < 0 || exam > 100)
                {
                    System.out.println("Invalid value entered");
                    exam = 0;
                }
                double finalMark = assign1/4 + assign2/4 + exam/2;
                System.out.printf("Your final mark is %5.2f\n", finalMark);
                
                char grade;
                if (finalMark >=50)
                {   
                    System.out.println("You pass");
                    if (finalMark >=90)
                        grade = 'A';
                    else if (finalMark >= 75)
                        grade = 'B';
                    else if (finalMark >= 65)
                        grade = 'C';
                    else 
                        grade = 'D';
                }
                else    // definitely under 50
                {
                    System.out.println("Your fail");
                    if (finalMark >= 40)
                        grade = 'E';
                    else 
                        grade = 'F';
                }
        
                System.out.println("Your grade is " + grade);
	
        
            switch(grade)
             {
                case 'A':
                    System.out.println("Excellent");
                case 'B':
                    System.out.println("Well done");
                    break;
                case 'C': case 'D':
                  System.out.println("Try harder");
                   break;
                case 'F':
                    System.out.println("Ask for help!");
                case 'E':
                    System.out.println("That's too bad");
            
                     break;
            
            default:
                System.out.println("Invalid grade");
                break;
        }
        }
}
