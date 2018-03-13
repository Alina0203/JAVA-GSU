package by.gsu.pms;

import java.util.Scanner;

public class SalePurchase extends Purchase{
	private double persent;
	private static final int NUMBER = 3;
	
	public SalePurchase(){
		super();
		this.persent = 0;
	}
	public SalePurchase(String commodityName, int price, int units, double persent){
		super(commodityName, price, units);
		this.persent = persent;
	}
	public SalePurchase(Scanner sc) {
		super(sc);
		this.persent = sc.nextDouble();
	}
	public double getPersent() {
		return persent;
	}
	public void setPersent(double persent) {
		this.persent = persent;
	}

	public String fieldsToString(){
		return super.getCommodityName()+ ";" + super.getPrice() + ";" + super.getUnits() + ";" + persent;
	}

	public int getCost() { 
		int cost = super.getCost();
		if (this.getUnits() > NUMBER)
		{
			return (int) (cost * (100 - persent)/100);
		} else {
			return cost;
		}
	}
}

