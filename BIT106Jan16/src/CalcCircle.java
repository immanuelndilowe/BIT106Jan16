/**
 * This is my second program in Java. 
 * Almost 11 am already why am i still here
 * @author ngsm
 */
public class CalcCircle {
    
    public static void main(String[] args)
    {
        // declare radius of 10
        int radius = 10;
        
        // declare constant, PI
        final double PI = 3.14159;
        
        // calculate area and circumference
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        
        // display results
        System.out.println("For a circle with radius " + radius);
        System.out.println("The area is " + area);
        System.out.println("And the circumference is " + circumference);
    }

}
