package edu.handong.csee.java.lab07.prob3; // Set the package where this class belongs to

import java.util.*; // gets all the things in the package (libarary) java.util

/**
 * This class defines to get the random number and see if the four students absent days are over 6 or not. </br>
 * declares four members and make constructors, getters, and setters.</br>
 * @author HAN
 */
public class Attendance { // its a class which can access from other package

	private String name = ""; // declares private member
	private int year = 0; // declares private year member
	private String student_id = ""; // declares private studentid member
	private int missed = 0; // declares private missed member



	/**
	 * constructor, executed before program runs. </br>
	 * Initializing all the private members.</br>
	 * @author HAN
	 */
	public Attendance() { // constructors, executes before program starts

		this.name = "Null"; // initialize name member
		this.year = 0; // initialize year member
		this.student_id = "Null"; // initialize studentid member
		this.missed = 0; // initialize missed member
	}

	/**
	 * constructor, executed before program runs. </br>
	 * stores the value in private members.</br>
	 * @author HAN
	 */
	public Attendance(String name, int year, String student_id, int missed) { // constructor, stores the values in each private members.
		this.name = name; // stores name value in class name member.
		this.year = year; // stores year value in class name member.
		this.student_id = student_id; // stores studentid value in class name member.
		this.missed = missed; // stores missed value in class name member.

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
	 * brings the value of private year member and return it.</br>
	 * @author HAN
	 */
	public int getYear() { // getter method, returns year private member value
		return year; // returns year member
	}

	/**
	 * Setters. </br>
	 * Sets the value in private year member.</br>
	 * @author HAN
	 */
	public void setYear(int year) {// setter method, sets year value and stores it in class name member.
		this.year = year; // stores year value in class year member
	}

	/**
	 * Getters. </br>
	 * brings the value of private Student_id member and return it.</br>
	 * @author HAN
	 */
	public String getStudent_id() { // getter method, returns studentid private member value
		return student_id; // returns student id member
	}

	/**
	 * Setters. </br>
	 * Sets the value in private student_id member.</br>
	 * @author HAN
	 */
	public void setStudent_id(String student_id) { // setter method, sets student id value and stores it in class name member.
		this.student_id = student_id; // stores student id value in class student id member
	}

	/**
	 * Getters. </br>
	 * brings the value of private Missed member and return it.</br>
	 * @author HAN
	 */
	public int getMissed() { // getter method, returns missed private member value
		return missed; // returns missed member
	}

	/**
	 * Setters. </br>
	 * Sets the value in private missed member.</br>
	 * @author HAN
	 */
	public void setMissed(int missed) { // setter method, sets missed value and stores it in class name member.
		this.missed = missed; // stores missed value in class missed member
	}

	/**
	 * This main method makes four instances . </br>
	 * it sets all the member values in two instances and use getter methods to get the all the member values in other two instances.</br>
	 * assigns the random numbers in each missed member, respectively. </br>
	 * use if condition and prints if the students are missed more than 6 classes. </br>  
	 * @author HAN
	 */
	public static void main(String[] args) { // a void method, invoked by the system

		Attendance s1 = new Attendance(); // makes a new instance, initialized with 0 and null value.
		Attendance s2 = new Attendance(); // makes a new instance, initialized with 0 and null value.
		Attendance s3 = new Attendance("Brian", 1, "21700774", 0); // makes a new instance, get the values with constructors and brought values by using getter methods.
		Attendance s4 = new Attendance("Sophia", 2, "21400382", 0); // makes a new instance, get the values with constructors and brought values by using getter methods.

		s1.setName("Kyo"); s1.setYear(3); s1.setStudent_id("21100483"); s1.setMissed(0); // sets the member values with setter methods.
		s2.setName("Dongsu"); s2.setYear(4); s2.setStudent_id("21600323"); s2.setMissed(0); // sets the member values with setter methods.

		Random randomGen = new Random(); // makes a new instance to assign the random numbers.

		s1.setMissed(randomGen.nextInt(10)); // assigns random missed num for first student.
		s2.setMissed(randomGen.nextInt(10)); // assigns random missed num for second student.
		s3.setMissed(randomGen.nextInt(10)); // assigns random missed num for third student.
		s4.setMissed(randomGen.nextInt(10)); // assigns random missed num for fourth student. 

		if(s1.getMissed() > 6) // condition if absence days are over six
		{
			System.out.println("I'm sorry " + s1.getName() + ". You fail this course"); // print the student failed this course.
			System.out.println(s1.getName() + " - Number of absence: " + s1.getMissed()); // print how much absence days student has
		}

		else // if condition is not satisfied
			System.out.println("We'll see about the grade, " + s1.getName()); // print the student name and specific statement that he passed.


		if(s2.getMissed() > 6) // condition if absence days are over six
		{
			System.out.println("I'm sorry " + s2.getName() + ". You fail this course"); // print the student failed this course.
			System.out.println(s2.getName() + " - Number of absence: " + s2.getMissed()); // print how much absence days student has
		}

		else
			System.out.println("We'll see about the grade, " + s2.getName()); // print the student name and specific statement that he passed.

		if(s3.getMissed() > 6) // condition if absence days are over six
		{
			System.out.println("I'm sorry " + s3.getName() + ". You fail this course"); // print the student failed this course.
			System.out.println(s3.getName() + " - Number of absence: " + s3.getMissed()); // print how much absence days student has
		}

		else
			System.out.println("We'll see about the grade, " + s1.getName()); // print the student name and specific statement that he passed.

		if(s4.getMissed() > 6) // condition if absence days are over six
		{
			System.out.println("I'm sorry " + s4.getName() + ". You fail this course"); // print the student failed this course.
			System.out.println(s4.getName() + " - Number of absence: " + s4.getMissed()); // print how much absence days student has
		}

		else
			System.out.println("We'll see about the grade, " + s4.getName()); // print the student name and specific statement that he passed.


	}

}
