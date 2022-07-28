import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Main class where the program is run
 * @author Kevin Meisenbacher
 *
 */
public class Main {
	/**
	 * Main function to start the program.
	 * Includes try/catch validation to prevent bad input from breaking it
	 * @param args
	 */
	public static void main (String[] args) {
		Fan fan = new Fan();

		try {
			controlFan(fan);
		} catch(InputMismatchException e) {
			System.out.println("Input has to be a number");
			controlFan(fan);
		}
	}
	
	/**
	 * Does what it says
	 * @param fan
	 * @param input - Number typed by the user which indicates which cord to pull
	 * @param live - A boolean that keeps the program live until terminated by the user
	 */
	public static void controlFan(Fan fan) {
		
		// Input
		Scanner in = new Scanner(System.in);
		int input = 0;
		boolean live = true;
		
		do {
			// Display
			fan.displayStatus();
			System.out.println("Type 1 for the cord that changes speed, "
					+ "2 for the cord that changes direction, or 3 to quit");
			
			// Controls
			input = in.nextInt();
			if (input == 1) {
				fan.speedCord();
			}
			else if (input == 2) fan.directionCord();
			// Terminator
			else if (input == 3) {
				System.out.println("Thank you for looking at my evaluation! \n"
					+ "I look forward to hearing from you soon");
				
				live = false;
			}
			// Bad input catch
			else System.out.println("Invalid choice");
		} while (live == true);
	}
}
