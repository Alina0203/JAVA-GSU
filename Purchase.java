package by.gsu.pms;

import java.util.Scanner;

public class Purchase {

		private String commodityName;
		private int price;
		private int units;
		
		public Purchase(){
			this.commodityName = null;
			this.price = 0;
			this.units = 0;
		}
		public Purchase(String commodityName, int price, int units){
			this.commodityName = commodityName;
			this.price = price;
			this.units = units;
		}
		public Purchase(Scanner sc) {
			this(sc.next(), sc.nextInt(), sc.nextInt());
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
			return  price * units;
		}
	
		public String toString() {
			return fieldsToString() + ";" + convertToBYN(getCost());
		}
		public String convertToBYN (int coins){
			  int firstPart = coins/100;
			  String secondPart = String.format("%02d", coins%100);
			  String rubles = firstPart + "." + secondPart;
			  return rubles;
			 }
		protected String fieldsToString(){
			return commodityName + ";" + price + ";" + units;
		}
		
		public boolean equals(Object obj) {
			Purchase other = (Purchase) obj;
			if (! (obj instanceof Purchase)) {
					return false;
			}
			  if (this.commodityName.equals(other.getCommodityName()) && this.price == other.getPrice())
				   return true;
				  else 
				   return false;
		}
}

