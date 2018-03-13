package by.gsu.pms;

import java.util. *;
public class ComparatorInt implements Comparator <Product> {
 
	public ComparatorInt(){
		super();
	}
	
	public int compare(Product arg0, Product arg1){
		
		return (int)(arg0.getPrize() - arg1.getPrize());
	}
}
