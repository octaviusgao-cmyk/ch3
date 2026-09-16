import java.util.Scanner;

public class temp {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a temperature in Celsius: ");
		double line = in.nextInt();
		System.out.println(line + "C = " + line*9/5+32 + "F");
	}
	
	}
