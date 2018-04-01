package edu.handong.csee.java.lab07.prob2;

public class Chicken {

	private String name;
	private double price;
	private int stars;
	
	public Chicken()
	{
	this.name = "";
	this.price = 0.0;
	this.stars = 0;
	}
	
	public Chicken(String name, double price, int stars)
	{
		this.name = name;
		this.price = price;
		this.stars = stars;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public static void main(String[] args) {
		
		Chicken menu1 = new Chicken("Cheese_mustard", 16000, 5);
		Chicken menu2 = new Chicken("Honey_mustard", 16000, 5);
		Chicken menu3 = new Chicken("Spicey_chicken", 16000, 1);
				
		menu1.setStars(3);
		menu2.setStars(4);
		menu3.setStars(1);
	
		System.out.println(menu1.getName() + "'s rating is " + menu1.getStars());
		System.out.println(menu2.getName() + "'s rating is " + menu2.getStars());
		System.out.println(menu3.getName() + "'s rating is " + menu3.getStars());
		
	}

}
