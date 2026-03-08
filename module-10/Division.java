/**
 * Christopher Villarreal
 * Module 10 Assignment 2
 */

package module10;

public abstract class Division {
	
	protected String divisionName;
	protected int accountNumber;
	
	/**
	 * Constructor for Division superclass
	 * @param divisionName name of the division
	 * @param accountNumber account number for the division
	 */
	
	public Division(String divisionName, int accountNumber)  {
		this.divisionName = divisionName;
		this.accountNumber = accountNumber;
	}
	
	/**
	 * Abstract display method that will be implemented in subclasses
	 */
	
	public abstract void display();

}
