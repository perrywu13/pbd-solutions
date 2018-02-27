import java.util.Scanner;

public class AgeInFiveYears 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hello. What is your name? ");
		String name = input.next();

		System.out.print("Hi, " + name + "! How old are you? ");
		int age = input.nextInt();

		int fiveYears = age + 5;
		int years = age - 5;

		System.out.println("Did you know in five years you will be " + fiveYears + " years old?");
		System.out.println("And five years ago you were " + years + "! Imagine that!");
	}
}
		
