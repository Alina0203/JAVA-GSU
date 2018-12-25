package by.gsu.pms;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class StringConvert {
	private static StringConvert instance;

	private StringConvert() {
	}

	public static StringConvert getInstance() {
		if (instance == null) {
			instance = new StringConvert();
		}
		return instance;
	}

	public Date stringToDate(String string) throws IOException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		Date date;
		try {
			date = dateFormat.parse(string);
		} catch (ParseException e) {
			throw new IOException();
		}
		return date;
	}

	public LocalTime stringToTime(String string) {
		LocalTime time = LocalTime.parse(string);
		return time;
	}
}
