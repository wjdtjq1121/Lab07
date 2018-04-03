package edu.handong.csee.java.lab07.prob2; // Set the package where this class belongs to

/**
 * This class defines to get the number of star according to each chicken store. </br>
 * declares three private members and store them with the constructor.</br>
 * get the value of members with getters and setters and finally gets the start with getter method. </br>
 * @author HAN
 */
public class Chicken { // its a class which can access from other package

	private String name; // declare private member name
	private double price; // declare private member price
	private int stars; // declare private member stars

	/**
	 * constructor, executed before program runs. </br>
	 * Initializing all the private members.</br>
	 * @author HAN
	 */
	public Chicken() // constructor, initializing value with 0 and null value.
	{
		this.name = ""; // stores null value in name member
		this.price = 0.0; // stores 0 value in price member
		this.stars = 0; // stores 0 value in stars member
	}

	/**
	 * constructor, executed before program runs. </br>
	 * stores the value in private members.</br>
	 * @author HAN
	 */
	public Chicken(String name, double price, int stars) // constructor, stores the values in each private members.
	{
		this.name = name; // stores name value in class name member.
		this.price = price; // stores price value in class price member.
		this.stars = stars; // stores stars value in class stars member.
	}

	/**
	 * Getters. </br>
	 * brings the value of private name member and return it.</br>
	 * @author HAN
	 */
	public String getName() { // getter method, returns name private member value
		return name; // returns name member
	}
	
	/**
	 * Setters. </br>
	 * Sets the value in private name member.</br>
	 * @author HAN
	 */
	public void setName(String name) { // setter method, sets name value and stores it in class name member.
		this.name = name; // stores name value in class name member.
	}

	/**
	 * Getters. </br>
	 * brings the value of private price member and return it.</br>
	 * @author HAN
	 */
	public double getPrice() { // getter method, returns price member value
		return price; // returns price member
	}

	/**
	 * Setters. </br>
	 * Sets the value in private price member.</br>
	 * @author HAN
	 */
	public void setPrice(double price) { // setter method, sets price value and stores it in class price member.
		this.price = price; // stores price value in class price member.
	}

	/**
	 * Getters. </br>
	 * brings the value of private stars member and return it.</br>
	 * @author HAN
	 */
	public int getStars() { // getter method, returns stars member value
		return stars; // returns stars member
	}

	/**
	 * Setters. </br>
	 * Sets the value in private stars member.</br>
	 * @author HAN
	 */
	public void setStars(int stars) { // setter method, sets stars value and stores it in class stars member
		this.stars = stars; // stores stars value in class stars member
	}

	/**
	 * This main method makes three new instances. When each instance is made, the constructor executes before program runs. </br>
	 * Sets the star value with getters method.</br>
	 * prints the name of restaurant and the rating of stars each stores. </br>
	 * @author HAN
	 */
	public static void main(String[] args) {

		Chicken menu1 = new Chicken("Cheese_mustard", 16000, 5); // makes a new instance menu1 and stores the values in private members.
		Chicken menu2 = new Chicken("Honey_mustard", 16000, 5); // makes a new instance menu2 and stores the values in private members.
		Chicken menu3 = new Chicken("Spicey_chicken", 16000, 1); // makes a new instance menu3 and stores the values in private members.

		menu1.setStars(3); // sets the star value 3
		menu2.setStars(4); // sets the star value 4
		menu3.setStars(1); // sets the star value 1

		System.out.println(menu1.getName() + "'s rating is " + menu1.getStars()); // prints the statement of first restaurant name and number of stars
		System.out.println(menu2.getName() + "'s rating is " + menu2.getStars()); // prints the statement of second restaurant name and number of stars
		System.out.println(menu3.getName() + "'s rating is " + menu3.getStars()); // prints the statement of third restaurant name and number of stars

	}

}
