package by.gsu.pms;

import java.util.Scanner;

public class PurchaseFactory {
	private static enum PurchaseKind {
		GENERAL_PURCHASE, DISCOUNT_PURCHASE, SALE_PURCHASE
	}
	public static Purchase getPurchaseFromFactory(Scanner sc) {
		String id = sc.next();
		PurchaseKind kind = PurchaseKind.valueOf(id);
		switch(kind) {
			case GENERAL_PURCHASE : 
				return new Purchase(sc);
			case DISCOUNT_PURCHASE :
				return new DiscountPurchase(sc);
			case SALE_PURCHASE :
				return new SalePurchase(sc);
			default : 
				throw new IllegalArgumentException();
		}
	}
}