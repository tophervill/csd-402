/**
 * Christopher Villarreal
 * Module 10 Assignment 2
 */

package module10;

public class UseDivision {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		InternationalDivision intl1 =
                new InternationalDivision("Shrimp EU Operations", 201, "Germany", "German");

        InternationalDivision intl2 =
                new InternationalDivision("Shrimp Global Distribution", 200, "Japan", "Japanese");

        DomesticDivision dom1 =
                new DomesticDivision("Shrimp HQ - West Coast", 100, "California");

        DomesticDivision dom2 =
                new DomesticDivision("Cherry Shrimp HQ - East Coast", 101, "New Jersey");

        // International
        intl1.display();
        intl2.display();
        
        // Domestic
        dom1.display();
        dom2.display();
	}

}
