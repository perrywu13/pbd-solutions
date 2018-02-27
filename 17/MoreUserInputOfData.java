import java.util.Scanner;

public class MoreUserInputOfData
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("First name: ");
		String FirstName = input.next();
		
		System.out.print("Last name: ");
		String LastName = input.next();

		System.out.print("Grade (9-12): ");
		int Grade = input.nextInt();

		System.out.print("Student ID: ");
		int ID = input.nextInt();
		
		System.out.print("Login: ");
		String Login = input.next();

		System.out.print("Average: ");
		double Average = input.nextDouble();

		System.out.println("Your information: ");
		System.out.println("Login: " + Login);
		System.out.println("ID: " + ID);
		System.out.println("Name: " + LastName + ", " + FirstName);
		System.out.println("Avg: " + Average);
		System.out.println("Grade: " + Grade);
	}
}
