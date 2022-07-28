/**
 * Functionality and display for the fan
 * @author Kevin Meisenbacher
 *
 */
public class Fan {
	// Fan settings
	public int speed;
	public String speedDisplay = "slow";
	public int direction = 1;
	public String dirDisplay = "forwards";
	
	/**
	 * Function that changes fan speed to 3 levels or turns it off
	 * @param speed - 3 settings from 1 to 3; 0 is off
	 * @param speedDisplay - Display for the fan's speed, used in the fan's status display
	 */
	public void speedCord() {
		// Controls
		speed++;
		if (speed > 3) speed = 0;
		
		// Results
		if (speed == 1) speedDisplay = "slow";
		else if (speed == 2) speedDisplay = "moderate";
		else if (speed == 3) speedDisplay = "fast";
		else speedDisplay = "off";
	}
	
	/**
	 * Function that changes fan direction
	 * @param direction - Switches between 0 and 1; 0 is reverse and 1 is forwards
	 * @param dirDisplay - Display for the fan's direction
	 */
	public void directionCord() {
		// Controls
		direction++;
		if (direction > 1) direction = 0;

		// Results
		if (direction == 0) dirDisplay = "in reverse";
		else if (direction == 1) dirDisplay = "forwards";
	}
	
	/**
	 * Function that tells the user what the fan is doing with corresponding speed and direction
	 */
	public void displayStatus() {
		if (speed > 0) System.out.printf("The fan is spinning %s at a %s speed%n", dirDisplay, speedDisplay);
		else System.out.println("The fan is off");
	}
}
