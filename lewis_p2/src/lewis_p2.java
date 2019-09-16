import java.util.Scanner;

public class lewis_p2 {

	public static void main(String[] args) {
		double userWeight;
		double userHeight;
		double bmi;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Would you like to use the metric or Imperial equation? (enter \"metric\" or \"Imperial\")");
		String whichFormula = scnr.next();
		
		
		if(whichFormula.equals("Imperial") || whichFormula.contentEquals("imperial")) {
			System.out.println("Enter you weight in pounds (no units): ");
			userWeight = scnr.nextDouble();
			System.out.println("Enter you height in inches (no units): ");
			userHeight = scnr.nextDouble();
			
			bmi = 730 * userWeight / (Math.pow(userHeight, 2));
			System.out.printf("\nYour BMI is: %.2f \n", bmi);
			
			System.out.println("\nCATEGORIES:");
			System.out.println("   Underweight:  < 18.5");
			System.out.println("   Normal:       18.5 - 24.9");
			System.out.println("   Overwieght:   25 - 29.9");
			System.out.println("   Obese:        > 30\n");
			
			if(bmi < 18.5) {
				System.out.println("You are underweight");
			}
			else if(bmi < 25) {
				System.out.println("You are normal");
			}
			else if(bmi < 30) {
				System.out.println("You are overweight");
			}
			else {
				System.out.println("You are obese");
			}

		}
		
		else if(whichFormula.equals("Metric") || whichFormula.contentEquals("metric")) {
			System.out.println("Enter you weight in kilograms (no units): ");
			userWeight = scnr.nextDouble();
			System.out.println("Enter you height in meters (no units): ");
			userHeight = scnr.nextDouble();
			
			bmi = userWeight / (Math.pow(userHeight, 2));
			System.out.printf("\nYour BMI is: %.2f \n", bmi);
			
			System.out.println("\nCATEGORIES:");
			System.out.println("   Underweight:  < 18.5");
			System.out.println("   Normal:       18.5 - 24.9");
			System.out.println("   Overwieght:   25 - 29.9");
			System.out.println("   Obese:        > 30\n");
			
			if(bmi < 18.5) {
				System.out.println("You are underweight");
			}
			else if(bmi < 25) {
				System.out.println("You are normal");
			}
			else if(bmi < 30) {
				System.out.println("You are overweight");
			}
			else {
				System.out.println("You are obese");
			}

		}
		
		else {
			System.out.println("**INVALID RESPONSE**\nPlease re-run program");
		}
		
		
	}

}
