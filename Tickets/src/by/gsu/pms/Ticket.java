package by.gsu.pms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

class Ticket implements Serializable {
	private Person person;
	private String from;
	private String To;
	private Date date;
	private LocalTime time;

	private String getFrom() {
		return from;
	}

	private String getDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
		return dateFormat.format(date);
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(String time) {
		StringConvert timeConvert = StringConvert.getInstance();
		this.time = timeConvert.stringToTime(time);
	}

	private void setDate(String date) throws IOException {
		StringConvert stringToDate = StringConvert.getInstance();
		Date date1;
		try {
			date1 = stringToDate.stringToDate(date);
		} catch (IOException e) {
			throw new IOException();
		}
		this.date = date1;
	}

	private void setFrom(String from) {
		this.from = from;
	}

	private String getTo() {
		return To;
	}

	private void setTo(String to) {
		To = to;
	}

	private Person getPerson() {
		return person;
	}

	@Override
	public String toString() {
		return "Пригадлежит: \n" + getPerson() + '\n' + "Вылет из: " + getFrom() + '\n' + "В: " + getTo() + '\n' + "Когда: " + getDate() + " в " + getTime();
	}

	public Ticket() {
		person = new Person();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean error;
		do {
			error = false;
			try {
				System.out.println("Пункт отправления: ");
				setFrom(reader.readLine());
				System.out.println("Пункт назначения: ");
				setTo(reader.readLine());
				System.out.println("Дата отправления(дд.мм.гггг): ");
				setDate(reader.readLine());
				System.out.println("Время отправления(чч:мм): ");
				setTime(reader.readLine());
			} catch (IOException e) {
				error = true;
				System.out.println("Произошла непредвиденная ошибка. Попробуйте еще раз");
			}
		} while (error);
	}
}
