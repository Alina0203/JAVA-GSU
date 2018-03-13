package by.gsu.pms;

import java.util.Scanner;

public class Commodity {

	private String commodityName;
	private int price;
	private int units;
	
	public  Commodity() {
		this.commodityName = null;
		this.price = 0;
		this.units = 0;
	}
	
	public Commodity(String commodityName, int price){
		this.commodityName = commodityName;
		this.price = price;
		this.units = units;
	}
	
	public Commodity(Scanner sc) {
		this.commodityName = sc.next();
		this.price = sc.nextInt();
		this.units = sc.nextInt();
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getUnits() {
		return units;
	}
	
	public void setUnits(int units) {
		this.units = units;
	}
	public int getCost(){
		return (int) (price * units);
	}

	public String toString() {
		return fieldsToString() + ";" + getCost();
	}
	protected String fieldsToString(){
		return commodityName + ";" + price + ";" + units;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commodityName == null) ? 0 : commodityName.hashCode());
		result = prime * result + price;
		result = prime * result + units;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Purchase other = (Commodity) obj;
		if (commodityName == null) {
			if (other.commodityName != null)
				return false;
		} else if (!commodityName.equals(other.commodityName))
			return false;
		if (price != other.price)
			return false;
		if (units != other.units)
			return false;
		return true;
	}
	
	
	
	

}
