import by.gsu.pms.*;
import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class Runner {

	public static void main(String[] args) throws Exception{
		//создание цепи потоков с потоком вывода объекта в конце
		int[] a;
		int n;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number: ");
		n = scan.nextInt();
		a = new int[n];
		
		for (int i = 0;i < n;i++) {
		System.out.println("Enter the name: ");
		String name = scan.next();
		System.out.println("Enter the availabity: ");
		boolean availabity = scan.nextBoolean();
		System.out.println("Enter the prize: ");
		int prize = scan.nextInt();
		scan.close();
		
		Product product = new Product (name, availabity, prize);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file1.txt"));
		out.writeObject(product);
		out.flush();
		out.close();
		
		ObjectInputStream in =  new ObjectInputStream (new FileInputStream("file1.txt"));
		Product prod = (Product)in.readObject();
		System.out.println(prod.toString());
		in.close();	
		}
	}
}
