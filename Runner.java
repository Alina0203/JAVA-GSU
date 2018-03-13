import java.io.FileNotFoundException;

import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;
import by.gsu.epamlab.Purchase;
import by.gsu.epamlab.PurchaseFactory;

public class Runner {
	private static final int NUMBER_LINES = 6;
	public static void main(String[] args) {
		
		Scanner sc = null; 
		try {
			sc = new Scanner(new FileReader("src/in.txt"));
			sc.useLocale(Locale.ENGLISH);
			Purchase[] purchases = new Purchase[NUMBER_LINES];
			int maxCost = 0;
			int indexMaxCost = 0;
			boolean purchasesEqual = true;
			for (int i = 0; i < purchases.length; i++){
				purchases[i] = PurchaseFactory.getPurchaseFromFactory(sc);
				System.out.println(purchases[i]);
				if (purchases[i].getCost() > maxCost){
					maxCost = purchases[i].getCost();
					indexMaxCost = i;
				}
				if (purchasesEqual){
					purchasesEqual = purchases[i].equals(purchases[0]);
				}
			}
			System.out.println("The purchase with maximum cost - " + purchases[indexMaxCost]);
			System.out.println("All purchases are equal - " + purchasesEqual);
				
		} catch (FileNotFoundException e){
			System.err.println("File not found");
		} finally {
			if(sc != null) {
				sc.close();
			}
	}
	}
}


