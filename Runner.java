import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import by.gsu.pms.BusinessTrip;
import by.gsu.pms.ComparatorTotal;

public class Runner {
	
	private final static String File_Name = "src/in.txt";
	
	private static String getParam(List<String> s,String find){
		for(String tmp:s){
			if(tmp.contains(find)){
				s.remove(tmp);
				return tmp.substring(find.length()+1).trim();
			}
		}
		return "0";
	}
	
	public static void main(String[] args) {
		Scanner scanner = null;	
		try {
			String account;
			int days, transport;
			scanner = new Scanner(new File(File_Name));
			List<BusinessTrip> list = new ArrayList<>();
			List<String> strings = new ArrayList<>();
			
			while(scanner.hasNext()) {
				strings.add(scanner.nextLine());
			}
			
			BusinessTrip.setRate(Integer.parseInt(getParam(strings, "daily-rate")));
			String indexes[]=getParam(strings, "indices").split(";");
			
			for (String s :indexes){
				if(s.length()<2){
					s="0"+s;
				}
				account = getParam(strings,"account"+s);
				days = Integer.parseInt(getParam(strings, "days"+s));
				transport = Integer.parseInt(getParam(strings, "transport"+s));
				list.add(new BusinessTrip(account, transport, days));
			}
			
			for(BusinessTrip b : list){
				System.out.println(b);
			}
			list.sort(new ComparatorTotal());	
			System.out.println('\n');
			for(BusinessTrip b : list){
				System.out.println(b);
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("Not found");
		} finally{
			scanner.close();
		}
		
	}

}
