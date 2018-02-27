import java.util.Scanner;
import java.lang.Math;
public class BMI
{
	public static void main(String[] args)
	{
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Your height in m: ");
	  double height = input.nextDouble();

		System.out.print("Your weight in kg: ");
		int weight = input.nextInt();

		double BMI = weight / Math.pow(height,2);
		
		System.out.println("Your BMI is " + Math.round(BMI*100000.0)/100000.0);
	}
}
