package by.gsu.pms;
import java.util.Comparator;

public class ComparatorTotal implements Comparator <BusinessTrip> {
	
	public ComparatorTotal() {
		super();
	}
	
	public int compare(BusinessTrip arg0, BusinessTrip arg1){
		
		return (int)(arg0.getTotal() - arg1.getTotal());
	}
}
