import java.util.Scanner;

public class ADumbCalculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("What is your first number? ");
		double firstNumber = input.nextDouble();

		System.out.print("What is your second number? ");
		double secondNumber = input.nextDouble();

		System.out.print("What is your third number? ");
		double thirdNumber = input.nextDouble();

		double answer = (firstNumber + secondNumber + thirdNumber) / 2;

		System.out.println("( " + firstNumber + " + " + secondNumber + " + " + thirdNumber + " ) / 2 is ... " + answer);
	}
}
