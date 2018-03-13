import by.gsu.pms.WeekDays;
import by.gsu.pms.Purchase;

public class Runner {
	
	public static void main (String[] args){
		Purchase[] days = new Purchase [] {
				new Purchase( 10, WeekDays, MONDAY),
				new Purchase( 5, WeekDays, SUNDAY),
				new Purchase( 2, WeekDays, TUESDAY),
				new Purchase( 3, WeekDays, THURSDAY),
				new Purchase( 8, WeekDays, FRIDAY),
				new Purchase() 
		};
		for(Purchase day : days){
            if(day != null) {
                day.show();
            }
   
         }
	       System.out.println("=========================");
	       
	       int averageCost = 0;
			int costOnMonday = 0;
			int maxCost = 0;
			WeekDay maxCostDay = null;
			for (Purchase purchase : objects) {
				int cost = purchase.getCost();
				averageCost = averageCost + cost;
				if (purchase.getWeekDay() == WeekDay.MONDAY) {
					costOnMonday = costOnMonday + cost;
				}
				if (cost > maxCost){
					maxCostDay = purchase.getWeekDay();
					maxCost = cost;
				}
			}
			if (PURCHASES_NUMBER > 0) {
				averageCost = averageCost / PURCHASES_NUMBER;
			}
			System.out.println("Mean cost = " + averageCost);
			System.out.println("The total cost on Monday = " + costOnMonday);
			System.out.println("The day with the maximum cost purchase is " + maxCostDay);
			
			Arrays.sort(objects);

			printArray(objects);
	} 
}
