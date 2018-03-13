import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;
import by.gsu.pms.Commodity;
import by.gsu.pms.CommodityFactory;


public class Runner {

	public static void main(String[] args) {
		
		Scanner sc = null; 
		try {
			sc = new Scanner(new FileReader("src/in.txt"));
			sc.useLocale(Locale.ENGLISH);
			Commodity[] commodities = new Commodity[6];
			int maxCost = 0;
			int indexMaxCost = 0;
			boolean commoditiesEqual = true;
			for (int i = 0; i < commodities.length; i++){
				commodities[i] = CommodityFactory.getCommodityFromFactory(sc);
				System.out.println(commodities[i]);
				if (commodities[i].getCost() > maxCost){
					maxCost = commodities[i].getCost();
					indexMaxCost = i;
				}
				if (i != 0 && !commodities[i].equals(commodities[i-1])){
					commoditiesEqual = false;
				}
			}
			System.out.println("The purchase with maximum cost - " + commodities[indexMaxCost]);
			System.out.println("All purchases are equal - " + commoditiesEqual);
				
		} catch (FileNotFoundException e){
			System.err.println("File not found");
		}

		
		
		
	}

}
