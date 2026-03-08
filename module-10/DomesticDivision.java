/**
 * Christopher Villarreal
 * Module 10 Assignment 2
 */

package module10;

public class DomesticDivision extends Division {
	
	private String state;

    /**
     * Constructor for DomesticDivision
     */
    public DomesticDivision(String divisionName, int accountNumber,
                            String state) {

        super(divisionName, accountNumber);
        this.state = state;
    }

    /**
     * Displays division information
     */
    @Override
    public void display() {
        System.out.println("Domestic Division");
        System.out.println("Division Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }

}
