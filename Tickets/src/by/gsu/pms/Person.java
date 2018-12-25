package by.gsu.pms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

class Person implements Serializable {
	private String firstName;
	private String lastName;
	private String secondName;
	private Date birthday;
	private String location;

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	private String getFirstName() {
		return firstName;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String getLastName() {
		return lastName;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String getBirthday() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
		return dateFormat.format(birthday);
	}

	private void setBirthday(String birthday) throws IOException {
		StringConvert stringToDate = StringConvert.getInstance();
		this.birthday = stringToDate.stringToDate(birthday);
	}

	private String getLocation() {
		return location;
	}

	private void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Фамилия: " + getLastName() + '\n' + "Имя: " + getFirstName() + '\n' + "Отчество: " + getSecondName() + '\n' + "Дата рождения: " + getBirthday() + '\n' + "Прописан по адресу:" + getLocation();
	}

	public Person() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean error;
		do {
			try {
				error = false;
				System.out.println("Фамилия: ");
				setLastName(reader.readLine());
				System.out.println("Имя: ");
				setFirstName(reader.readLine());
				System.out.println("Отчество: ");
				setSecondName(reader.readLine());
				System.out.println("Дата рождения(дд.мм.гггг): ");
				setBirthday(reader.readLine());
				System.out.println("Прописка: ");
				setLocation(reader.readLine());
			} catch (IOException e) {
				error = true;
				System.out.println("Введенные данные неверны. Попробуйте еще раз");
			}
		} while (error);
	}
}
