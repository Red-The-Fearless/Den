import java.util.Scanner;

public class BMI {
	
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		int choice = 3;
		double height;
		double weight;
		double BMI;
		
		System.out.println("This program displays your BMI.");
		
		while(choice > 2 || choice < 0)
		{
			System.out.println("Type the number 1 for metric units or number 2 for empirical units");
			choice = scnr.nextInt();
		}
		
		if(choice == 1)
		{
			System.out.print("Enter your height in meters: ");
			height = scnr.nextDouble();
			System.out.print("Enter your weight in kgs: ");
			weight = scnr.nextDouble();
			
			BMI = (weight / Math.pow(height, 2));
		}
		else
		{
			System.out.print("Enter your height in inches: ");
			height = scnr.nextDouble();
			System.out.print("Enter your weight in lbs: ");
			weight = scnr.nextDouble();
			
			BMI = ((weight * 703) / Math.pow(height, 2));
		}
		System.out.println("BMI categories are as follows:");
		System.out.println("Underweight; Below 18.5 |    Normal; 18.5-24.9");
		System.out.println(" Overweight; 25.0-29.9  | Obesity; 30.0 and Above");
		System.out.println("Your BMI is: " + BMI);
		
	}

}
