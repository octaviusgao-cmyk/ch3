
import java.util.Scanner;

public class hour {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Type an amount of seconds: ");
		int line = in.nextInt();
		int minutes = line/60;
		int minutesremaining = line % 60;
		int hours = minutesremaining/360;
		int hoursremaining = minutesremaining % 360;
		System.out.println("This is the amount of seconds: " + line);
		System.out.println(hours + " hours" + minutes + " minutes" +minutesremaining+hoursremaining + " seconds");
		
	}
	}
