package edu.handong.csee.java.lab07.prob1; // Set the package where this class belongs to

import java.util.Scanner; // gets the Scanner class from the package (libarary) java.util


/**
 * This class defines to get the century according to the year. </br>
 * First declares year and stores the year value with the constructor.</br>
 * with calculate century method we get the appropriate century. </br>
 * @author HAN
 */
public class YearToCentury { // its a class which can access from other package

	int year; // declare year member 
	
	
	/**
	 * Constructor executed before program runs. </br>
	 * it stores the year value which comes from the user in the class member year. </br>  
	 * @author HAN
	 */
	public YearToCentury(int year) { // default constructor, executed before program runs 
		this.year = year; // stores the value year 
	}

	/**
	 * This method  declares two members and returns the value of century. </br>
	 * the year value is divided by 100 and stores the century value in the result member. </br>  
	 * @author HAN
	 */
	public int CalculateCentury() { // method to get the century value according to specific year
		
		int result; // declares result member
		int plusone=0; // declares plusone member 
		result = year/100; // result value is divided by 100
		if(year%100 != 0) // if the year is the value which is the multiplication of 100, we add the value one to century
			plusone=1; // temporary number in order to plus the value century
		
		
		 result+=plusone; // finally brings the value to the century, plus one
		
		return result; // returns the value result
	}
	
	/**
	 * This main method declares yr value which is the user value typed by keyboard. </br>
	 * it makes a new instance getCen and calls method to get the century and prints the century according to the year. </br>
	 * @author HAN
	 */
	public static void main(String[] args) { // a void method, invoked by the system

		int yr=0; // declares yr member and initialize it with zero
		
		Scanner keyboard = new Scanner(System.in); // sets up things so the program can accept keyboard input. 
		System.out.println("Input year: "); // prints the statement to ask the user to put yr value
		yr = keyboard.nextInt(); // gets the yr value from the user
		
		YearToCentury getCen = new YearToCentury(yr); // makes a new instance named with getCen
		
		System.out.println(yr + " is " + getCen.CalculateCentury() + "th century. "); // prints the statement the yr value is what century.
		
		
	}

}
