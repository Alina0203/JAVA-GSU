package by.gsu.pms;

public class Purchase implements Comparable {

		private final static String name = "IPhone";
		private final static int price= 1500;
		private int unitsNumber;
		private double percent;
		private WeekDays days;
		
		public Purchase() {
			this.unitsNumber = 0;
			this.percent = 0;
			this.days = null;
			
		}
		
		public Purchase (int unitsNumber, WeekDays days){
		super();
		this.unitsNumber = unitsNumber;
		this.percent = percent;
		this.days = days;
		}
		
   public Purchase() {
			super();
		}

	public int getUnitsNumber() {
		return unitsNumber;
	}

	public void setUnitsNumber(int unitsNumber) {
		this.unitsNumber = unitsNumber;
	}
	
	public WeekDays getDays() {
		return days;
	}
	
	public void setDays(WeekDays days) {
		this.days = days;
	}
	
	public static String getName() {
		return name;
	}
	
	public static int getPrice() {
		return price;
	}
	public int getCost(){
		return (int) (price*unitsNumber* (100 - percent) / 100);
	}


	@Override
	public String toString() {
		return unitsNumber + ";" + percent + ";" + days + ";" + getCost();
	}
	
	public static Purchase parseData(String data){
		String[] fields = data.split(";");
		return new Purchase(Integer.parseInt(fields[0]), Double.parseDouble(fields[1]), 
				Integer.parseInt(fields[2]));
	}
	@Override
	public int compareTo(Purchase o) {
		return unitsNumber - o.unitsNumber;
	}
}

	

	
}


