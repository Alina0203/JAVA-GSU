package by.gsu.pms;

import java.util.Comparator;

public class ComparatorString implements Comparator<Product> {

	public ComparatorString() {
		super();
	}

	public int compare(Product arg0, Product arg1) {

		return  arg0.getName().compareTo(arg1.getName()) ;
	}
}
