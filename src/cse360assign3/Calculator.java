
package cse360assign3;

/**
 * This is a simple class for calculating a value by adding, subtracting, multiplying, and dividing. This program will also
 * track the history of commands. 
 * 
 * @author Adam Metelski pin number 605 
 * @version 2016.02.20
 *
 */

public class Calculator {

	private int total;
	private String history = total + ""; 
	
	/**
	 * Constructor for Calculator class. Sets total to zero. 
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * This will return the current total stored. 
	 * 
	 * @return current total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Method will add to the total value
	 * @param value of type int
	 */
	public void add (int value) {
		total = total + value; 
		history = history + " + " + value; 
	}
	
	/**
	 * Method will subtract value from current total
	 * @param value of type int 
	 */
	public void subtract (int value) {
		total = total - value; 
		history = history + " - " + value; 
	}
	
	/**
	 * Method will multiply value with current total 
	 * @param value  of type int
	 */
	public void multiply (int value) {
		total = total * value; 
		history = history + " * " + value; 
	}
	
	/**
	 * Method will divide current total by value
	 * @param value of type int
	 */
	public void divide (int value) {
		if(value == 0){
			total = 0; 
		}else{
			total = total / value; 
		} 
		history = history + " / " + value; 
	}
	
	/**
	 * Method will return the history of commands executed 
	 * @return empty string
	 */
	public String getHistory () {
		return history;
	}
}
