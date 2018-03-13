package by.gsu.pms;

import java.util.Scanner;

public class DiscountCommodity extends Commodity{
	private double persent;
	
	public DiscountCommodity(){
		super();
		this.persent = 0;
	}
	public DiscountCommodity(String commodityName, int price, int units, double persent){
		super(commodityName, price, units);
		this.persent = persent;
	}
	public DiscountCommodity(Scanner sc) {
		super(sc);
		this.persent = sc.nextDouble();
	}
	public double getPersent() {
		return persent;
	}
	public void setPersent(double persent) {
		this.persent = persent;
	}

	public String toString() {
		return super.fieldsToString() + ";" + persent + ";" + getCost();
	}

	public int getCost() {
		return (int) (super.getCost() * (100 - persent)/100);
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(persent);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		DiscountCommodity other = (DiscountCommodity) obj;
		if (Double.doubleToLongBits(persent) != Double.doubleToLongBits(other.persent))
			return false;
		return true;
	}
}