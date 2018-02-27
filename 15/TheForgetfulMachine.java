import java.util.Scanner;

public class TheForgetfulMachine
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Give me a word! ");
		String word = input.next();
		System.out.print("Give me a second word! ");
		String nextWord = input.next();
		System.out.print("Great, now your favorite number? ");
		int x = input.nextInt();
		System.out.print("And your second-favorite number... ");
		int y = input.nextInt();
		
		System.out.println("Whew! Wasn't that fun?");
	}
}
