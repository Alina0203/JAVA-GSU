package by.gsu.pms;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private boolean availabity;
	private int prize;
	
	public Product (String name, boolean availabity, int prize){
		this.name = name;
		this.availabity = availabity;
		this.prize = prize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAvailabity() {
		return availabity;
	}

	public void setAvailabity(boolean availabity) {
		this.availabity = availabity;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public String toString() {
		return name + ";" + availabity + ";" + prize;
	}
}
