package by.gsu.pms;

public class Product {

	private String name;
	private boolean availabity;
	private double prize;
	
	public Product (String name, boolean availabity, double prize){
		this.name = name;
		this.availabity = availabity;
		this.prize = prize;
	}

	public String getName() {
		return name;
	}

	public boolean getAvailabity() {
		return availabity;
	}

	public double getPrize() {
		return prize;
	}
	
	public String toString() {
		return name + ";" + availabity + ";" + prize;
	}
	
	
}
