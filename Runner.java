import by.gsu.pms.Material;

public class Runner {
   public static void main (String[]args) {
	   Material steel = new Material ("Steel",7850.0);
	   Material copper = new Material ("Copper",8500.0);
	   
	   Subject wire = new Subject ("Wire",steel,0.03);
	   
	   System.out.println(wire);
	   
	   
	   wire.setMaterial(copper);
	   System.out.println("The wire mass is" + wire.getMass + "kg");
   }
	
	
}
