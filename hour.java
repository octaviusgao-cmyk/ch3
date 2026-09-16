import java.util.Scanner;

public class hour {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type an amount of seconds: ");
		int line = in.nextInt();
		int seconds = (line/60) % 60; 
		int minutes = (seconds/60) % 60;
		System.out.println(seconds+minutes);
		
	}
	}
