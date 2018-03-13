package by.gsu.pms;

import java.util.Scanner;

public class CommodityFactory {

	private static enum CommodityKind {
		GENERAL_Commodity, DISCOUNT_Commodity, SALE_Commodity
	}
	public static Commodity getCommodityFromFactory(Scanner sc) {
		String id = sc.next();
		CommodityKind kind = CommodityKind.valueOf(id);
		switch(kind) {
			case GENERAL_Commodity : 
				return new Commodity(sc);
			case DISCOUNT_Commodity :
				return new DiscountCommodity(sc);
			case SALE_Commodity :
				return new SaleCommodity(sc);
			default : 
				throw new IllegalArgumentException();
		}
	}
	
}
