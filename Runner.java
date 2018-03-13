import java.util.Arrays;

import by.gsu.pms.ComparatorInt;
import by.gsu.pms.ComparatorString;
import by.gsu.pms.Product;

public class Runner {
	
	public static void main(String[] args) {
	     final Product[] products = new Product[10];
	        products[0] = new Product("Milk", true, 10);
	        products[1] = new Product("Oil", false, 20);
	        products[2] = new Product("Meat", true, 40);
	        products[3] = new Product("Fish", false, 32);
	        products[4] = new Product("Tomato", true, 18);
	        products[5] = new Product("Bread", true, 8);
	        products[6] = new Product("Eggs", false, 12);
	        products[7] = new Product("Potato", true, 6);
	        products[8] = new Product("Butter", false, 23);
	        products[9] = new Product("Pasta", true, 12);
	        
	        
	        for (int i = 0; i < products.length; i++) {
				System.out.println(products[i]);
			}

			System.out.println("=================================");

			Arrays.sort(products, new ComparatorInt());
			for (int i = 0; i < products.length; i++) {
				System.out.println(products[i]);
			}

			System.out.println("=================================");
			
			Arrays.sort(products, new ComparatorString());
			for (int i = 0; i < products.length; i++) {
				System.out.println(products[i]);
			}

			System.out.println("=================================");
	
		double  countprize = 0;
		for (final Product product : products){
			countprize = product.getPrize() + countprize;
		}
	
       System.out.println("Total cost products :" + countprize);
       System.out.println("=========================");
       
		int  countavailabity = 0;
		for (final Product product : products){
			if(product.getAvailabity() == true){
				 ++ countavailabity;
			}	
		}

       System.out.println("Kol-vo products availabity :" + countavailabity);
       System.out.println("=========================");
	
	
	
	}
}
