/*
 * Christopher Villarreal
 * Module 8 Assignment 2
 */

package module8;

import java.util.ArrayList;
import java.util.Scanner;

public class ChristopherArrayListTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Array List for user-input numbers
		ArrayList<Integer> numbers = new ArrayList<>();
		
		System.out.println("Enter integers (enter 0 to stop). 0 Will also be stored.");
		
		// Accepts integers until user enters 0, which will also store the value.
		while (true) {
			System.out.print("Enter a number: ");
			
			while (!input.hasNextInt()) {
				System.out.print("Invalid response. Please enter a valid integer: ");
				input.next();
			}
			
			int value = input.nextInt();
			numbers.add(value);
			
			if (value == 0) {
				System.out.println("Stopping with the final value of [" + value + "]");
				break;
			}
			
			// Remind if user surpasses 7 user-inputs
			if (numbers.size() > 7) {
				System.out.println("Friendly reminder you can enter 0 to stop.");
			}
						
		}
		
		Integer largestValue = ChristopherArrayList.max(numbers);
		
		// Output of user-input ArrayList
		System.out.println("\nArrayList contents: " + numbers);
		System.out.println("The largest value in the ArrayList is: [" + largestValue + "]");
		
		System.out.println("\n--- Additional Tests ---");
		
		// Testing an empty ArrayList to return 0
		ArrayList<Integer> emptyList = new ArrayList<>();
		System.out.println("In an empty ArrayList, the return is: " 
				+ ChristopherArrayList.max(emptyList));
		
		// Testing a manual input ArrayList to verify it checks for the largest value
		ArrayList<Integer> testList = new ArrayList<>();
		testList.add(5);
		testList.add(12);
		testList.add(3);
		System.out.println("In a predefined ArrayList with the contents " + testList 
				+ ", the highest result returned would be: " 
				+ ChristopherArrayList.max(testList));
		
		input.close();

	}

}
