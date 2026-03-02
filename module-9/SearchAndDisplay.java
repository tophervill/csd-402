/*
 * Christopher Villarreal
 * Module 9 Assignment 2 - Program 1 
 * 
 */

package module9;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchAndDisplay {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		ArrayList<String> cityList = new ArrayList<String>();
		
		cityList.add("Los Angeles");
		cityList.add("New York");
		cityList.add("Durango");
		cityList.add("Chicago");
		cityList.add("San Diego");
		cityList.add("Copenhagen");
		cityList.add("San Francisco");
		cityList.add("Joliet");
		cityList.add("Las Vegas");
		cityList.add("Fresno");
		
		
		// Loop cityList and display each city		
		for(String city : cityList) {
			
			System.out.println(city);
			
		}
		
		int listSize = cityList.size();
		
		System.out.println();
		System.out.println("Which element would you like to see from cityList again? (Enter a value up to [" + (listSize - 1) + "])");
		String userInput = input.nextLine();
		
		input.close();
		
		try {
			Integer element = Integer.parseInt(userInput);
			
			if (element >= listSize || element < 0) {
				throw new IndexOutOfBoundsException("Out of Bounds");
			}
			
			System.out.println("Element number [" + element + "] is " + cityList.get(element));
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Error: Out of Bounds");
		}
		catch (NumberFormatException e) {
			System.out.println("Error: Please enter a valid number");
		}
		
	
	}

}
