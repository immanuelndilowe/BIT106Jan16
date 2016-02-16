/** A class with useful health calculators
 * 
 */
public class Health {

	// main method
	public static void main(String[] args) {
		
		double h = 1.6;
		double w = 65;
		double BMI = getBMI(h,w);
		System.out.printf("A user with height %.2fm and weight %.2fkg", h,w);
		System.out.printf(" has a BMI of %.2f", BMI );
		
	}

	// A method that returns BMI given the height and weight
	public static double getBMI(double height, double weight)
	{
	
		return (weight / (height * height));

	}
        
        //  a method to determine the body type based on BMI
        public static String getBodyType(double bmiValue)
        {
            if (bmiValue < 18.5)
                return "underweight";
            else if (bmiValue < 25)
                return "normal weight";
            else if (bmiValue < 30)
                return "overweight";
            else
                return "obese";
        }
}
