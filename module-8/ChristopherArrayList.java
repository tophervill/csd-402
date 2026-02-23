/*
 * Christopher Villarreal
 * Module 8 Assignment 2
 */

package module8;

import java.util.ArrayList;

public class ChristopherArrayList {
	
	public static Integer max(ArrayList list) {
		
		// Ensures ArrayList contains values, if not, return 0 to avoid error.
		if (list == null || list.isEmpty()) {
			return 0;
		}
		
		Integer largest = (Integer) list.get(0);
		
		for(int i = 0; i < list.size(); i++) {
			
			Integer current = (Integer) list.get(i);
			
			// Update largest if current is greater than largest.
			if (current > largest) {
				largest = current;
			}
		}
		
		return largest;
		
	}
	
	
}	
