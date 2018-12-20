package by.gsu.pms;

public class Employees {

	private String name;
	private String phone;
	private String position;
	private Number age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Number getAge() {
		return age;
	}

	public void setAge(Number age) {
		this.age = age;
	}

	public Employees(String name, String phone, String position, Number age) {
		super();
		this.name = name;
		this.phone = phone;
		this.position = position;
		this.age = age;
	}

	public Employees() {
		super();
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", phone=" + phone + ", position=" + position + ", age=" + age + "]";
	}

}
