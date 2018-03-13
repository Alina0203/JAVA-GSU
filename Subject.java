package by.gsu.pms;

public class Subject {

	
	private String name;
	private double volume;
	private Material material;
	
	public Subject(){
		this.name = null;
		this.material = new Material();
		this.volume = 0;
	}
	
	public Subject(String name, double volume,Material material){
		this.name = name;
		this.material = material;
		this.volume = volume;
	}

	public String getName() {
		return name;
	}

	public double getVolume() {
		return volume;
	}

	public Material getMaterial() {
		return material;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public double getMass(){
		return (material.getDensity()*volume);
	}

	public String toString() {
		return   name +";" + volume +";" + material+ ";" +getMass();
	}

	
	
}
