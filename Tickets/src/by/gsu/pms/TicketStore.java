package by.gsu.pms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TicketStore {
	private static TicketStore instance;
	private ArrayList<Ticket> tickets;

	private TicketStore() {
		this.tickets = new ArrayList<>();
		getTickets();
	}

	public static TicketStore getInstance() {
		if (instance == null) {
			instance = new TicketStore();
		}
		return instance;
	}

	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}

	public void showTickets() {
		if (tickets.isEmpty())
			System.out.println("Билеты отсутствуют в базе");
		else {
			for (int ticketNum = 0; ticketNum < tickets.size(); ticketNum++) {
				System.out.println("\nБилет №" + (ticketNum + 1));
				System.out.println(tickets.get(ticketNum));
			}
		}
	}

	public void saveTickets() {
		try {
			FileOutputStream output = new FileOutputStream("tickets.sav");
			ObjectOutputStream stream = new ObjectOutputStream(output);
			stream.writeObject(tickets);
			stream.close();
			output.close();
		} catch (IOException e) {
			System.out.println("Произошла ошибка при сохранении. Попробуйте еще раз");
		}
	}

	private void getTickets() {
		try {
			FileInputStream input = new FileInputStream("tickets.sav");
			ObjectInputStream stream = new ObjectInputStream(input);
			try {
				tickets = (ArrayList<Ticket>) stream.readObject();
			} catch (ClassNotFoundException e) {
				throw new IOException();
			}
			stream.close();
			input.close();
		} catch (IOException e) {
			System.out.println("Файл сохранений поврежден или отсутствует.\nВ работе будет создан новый архив билетов.");
			tickets = new ArrayList<>();
		}
	}
}
