import by.gsu.pms.BussinesTrip;



public class Runner {

	public static void main (String[] args){
		BussinesTrip[] trips = new BussinesTrip[] {
				new BussinesTrip("Afonina Alina", 100, 5),
				null, 
				new BussinesTrip("Petrov Petr", 50, 10),
				new BussinesTrip("Ivanov Ivan", 12, 10),
				new BussinesTrip("Krivitskaya Kristina", 25, 8),
				new BussinesTrip("Limanova Maria", 18, 15),
				new BussinesTrip() 
		};
		for(BussinesTrip trip : trips){
            if(trip != null) {
                trip.show();
            }
        }
		System.out.println("=========================");
		trips[trips.length - 1].setExpenses(20);
		System.out.println("Duration = " + (trips[0].getDays() + trips[2].getDays()));
		System.out.println("=========================");
		for (BussinesTrip trip : trips){
			System.out.println(trip);
		}
		
		System.out.println("=========================");
		
		int totalSum = 0;
		for (BussinesTrip trip: trips){
			if(trip !=null){
		totalSum += trip.getTotal();
			}
		}
		System.out.println("Total sum :" +totalSum);
		
		System.out.println("=========================");
		
		BussinesTrip maxExpenses = new BussinesTrip();
		for(BussinesTrip trip: trips){
		if ((trip != null) && (trip.getExpenses()> maxExpenses.getExpenses())){
		maxExpenses=trip;
		  }
		}
		System.out.println("Max expenses :" + maxExpenses.getAccount());
		System.out.println("Total :" +maxExpenses.getTotal());
		System.out.println("=========================");
		}
		
	}
