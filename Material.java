package by.gsu.pms;

public class Material {

	private String name;
	private double density;
	
	public Material(){
		this.name = null;
		this.density = 0;
	}
	
	public Material(String name,double density){
		this.name = name;
		this.density = density;
	}
	
	public String getName() {
		return name;
	}

	public double getDensity() {
		return density;
	}

	public String toString() {
		return name +";"+ density;
	}
	
	

}
