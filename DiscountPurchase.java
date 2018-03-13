package by.gsu.pms;

import java.util.Scanner;

public class DiscountPurchase extends Purchase{
	private int persent;
	
	public DiscountPurchase(){
		super();
		this.persent = 0;
	}
	public DiscountPurchase(String commodityName, int price, int units, int persent){
		super(commodityName, price, units);
		this.persent = persent;
	}
	public DiscountPurchase(Scanner sc) {
		super(sc);
		this.persent = sc.nextInt();
	}
	public double getPersent() {
		return persent;
	}
	public void setPersent(int persent) {
		this.persent = persent;
	}

	public String fieldsToString(){
		return super.getCommodityName()+ ";" + super.getPrice() + ";" + super.getUnits() + ";" + persent;
	}

	public int getCost() {
		return (int) ((super.getPrice() - persent) * super.getUnits());
	}
}