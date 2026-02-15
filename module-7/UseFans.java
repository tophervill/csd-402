/*
 *  Christopher Villarreal
 *  Module 7 Assignment 2
 */


package module7;

public class UseFans {

	public static void main(String[] args) {
		
		UseFans useFans = new UseFans();
		
		// Collection of Fan Instances
		Fan[] fanCollection = new Fan[3];
		
		fanCollection[0] = new Fan(Fan.FAST, true, 10.0, "Green");
        fanCollection[1] = new Fan(Fan.STOPPED, false, 8.0, "White");
        fanCollection[2] = new Fan(Fan.SLOW, true, 6.5, "Red");
		
		// Display Fans
        useFans.displayFans(fanCollection);
	}
	
	public void displayFans(Fan[] fans) {
		
		for(int i = 0; i < fans.length; i++) {
			System.out.println("- - - Display Fan #" + (i + 1) + " - - -");
			displayFan(fans[i]);
			System.out.println();
		}
		
	}
	
	public void displayFan(Fan fan) {
		
		// Prepare strings
		System.out.println("The 'Speed'  is currently: " + fan.getSpeed());
		System.out.println("The 'Status' is currently: " + fan.isOn());
		System.out.println("The 'Radius' is currently: " + fan.getRadius());
		System.out.println("The 'Color'  is currently: " + fan.getColor());
	}
}
