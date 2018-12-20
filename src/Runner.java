import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import by.gsu.pms.Employees;

public class Runner {

	public static void main(String[] args) throws IOException {
		Gson gson = new GsonBuilder().create();
		try (Reader reader = new FileReader("src//employees.json")) {
			Employees[] employeesList = (gson.fromJson(reader, Employees[].class));
			for (Employees employeesList2 : employeesList) {
				System.out.println(employeesList2);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
