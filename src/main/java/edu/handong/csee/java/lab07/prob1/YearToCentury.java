package edu.handong.csee.java.lab07.prob1;

import java.util.Scanner;

public class YearToCentury {

	int year;
	
	public YearToCentury(int year) { // default constructor
		this.year = year;
	}

	public int CalculateCentury() {
		
		int result;
		int plusone=0;
		result = year/100;
		if(year%100 != 0)
			plusone=1;
		
		
		 result+=plusone;
		
		return result;
	}
	
	
	public static void main(String[] args) {

		int yr=0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input year: ");
		yr = keyboard.nextInt();
		
		YearToCentury getCen = new YearToCentury(yr);
		
		System.out.println(yr + " is " + getCen.CalculateCentury() + "th century. ");
		
		
	}

}
