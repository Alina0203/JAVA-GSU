package by.gsu.pms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		TicketStore tickets = TicketStore.getInstance();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		do {
			showMenu();
			try {
				int enter;
				try {
					enter = Integer.parseInt(reader.readLine());
				} catch (NumberFormatException e) {
					throw new IOException();
				}
				switch (enter) {
				case 1:
					tickets.addTicket(new Ticket());
					break;
				case 2:
					tickets.showTickets();
					break;
				case 3:
					tickets.saveTickets();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					throw new IOException();
				}
			} catch (IOException e) {
				System.out.println("Ошибка ввода, попробуйте еще раз");
			}
		} while (true);
	}

	private static void showMenu() {
		System.out.println("\nМЕНЮ\n\n1. Создать новый билет\n2. Показать все билеты\n3. Сохранить билеты\n4. Выход из программы");
	}
}
