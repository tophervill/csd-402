/**
 * Christopher Villarreal
 * Module 10 Assignment 2
 */

package module10;

public class InternationalDivision extends Division {
	
	private String country;
	private String language;
	
	/**
	 * Constructor for InternationalDivsion
	 * @param divisionName name of division
	 * @param accountNumber account number for division
	 * @param country country of division
	 * @param language language of division
	 */
	
	public InternationalDivision(String divisionName, 
			int accountNumber, 
			String country, 
			String language) {
		
		super(divisionName, accountNumber);
		this.country = country;
		this.language = language;
	}
	
	/**
	 * Displays division information
	 */
	
	@Override
	public void display() {
		System.out.println("International Division");
		System.out.println("Division Name: " + divisionName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Country: " + country);
		System.out.println("Language: " + language);
		System.out.println();
	}

}
