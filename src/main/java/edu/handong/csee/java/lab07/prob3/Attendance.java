package edu.handong.csee.java.lab07.prob3;

import java.util.*;

public class Attendance {
	
	private String name = "";
	private int year = 0;
	private String student_id = "";
	private int missed = 0;
	

	
	
	public Attendance() { // constructors (executes before program starts

		this.name = "Null";
		this.year = 0;
		this.student_id = "Null";
		this.missed = 0;
	}
	
	public Attendance(String name, int year, String student_id, int missed) {
		this.name = name;
		this.year = year;
		this.student_id = student_id;
		this.missed = missed;
		
	}

	//getters and setters 
	public String getName() {
		return name;
	}
 
	
	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public int getMissed() {
		return missed;
	}

	public void setMissed(int missed) {
		this.missed = missed;
	}

	public static void main(String[] args) {

			Attendance s1 = new Attendance();
			Attendance s2 = new Attendance();
			Attendance s3 = new Attendance("Brian", 1, "21700774", 0);
			Attendance s4 = new Attendance("Sophia", 2, "21400382", 0);
			
			s1.setName("Kyo"); s1.setYear(3); s1.setStudent_id("21100483"); s1.setMissed(0);			
			s2.setName("Dongsu"); s2.setYear(4); s2.setStudent_id("21600323"); s2.setMissed(0);
						
			Random randomGen = new Random();
			
			s1.setMissed(randomGen.nextInt(10));
			s2.setMissed(randomGen.nextInt(10));
			s3.setMissed(randomGen.nextInt(10));
			s4.setMissed(randomGen.nextInt(10));

			if(s1.getMissed() > 6)
			{
				System.out.println("I'm sorry " + s1.getName() + ". You fail this course");
				System.out.println(s1.getName() + " - Number of absence: " + s1.getMissed());
			}
		
			else
				System.out.println("We'll see about the grade, " + s1.getName());
				
			
			if(s2.getMissed() > 6)
			{
				System.out.println("I'm sorry " + s2.getName() + ". You fail this course");
				System.out.println(s2.getName() + " - Number of absence: " + s2.getMissed());
			}
		
			else
				System.out.println("We'll see about the grade, " + s2.getName());
			
			if(s3.getMissed() > 6)
			{
				System.out.println("I'm sorry " + s3.getName() + ". You fail this course");
				System.out.println(s3.getName() + " - Number of absence: " + s3.getMissed());
			}
		
			else
				System.out.println("We'll see about the grade, " + s1.getName());
			
			if(s4.getMissed() > 6)
			{
				System.out.println("I'm sorry " + s4.getName() + ". You fail this course");
				System.out.println(s4.getName() + " - Number of absence: " + s4.getMissed());
			}
		
			else
				System.out.println("We'll see about the grade, " + s4.getName());
			
			
	}

}
