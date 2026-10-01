import java.util.Scanner;
import java.util.Random;

public class guess {
	
	public static void main (String[] args) {
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		
		int number = random.nextInt(100) + 1;
		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.println("(including both). Can you guess what it is?");
		System.out.println("Type a number: " );
		int pick = in.nextInt();
		int difference = Math.abs(number-pick);
		
		System.out.println("Your guess is: " + pick);
		System.out.println("The number I was thinking of is: " + number);
		System.out.println("You were off by: " + difference);
		
		
		
		
	}
	}
