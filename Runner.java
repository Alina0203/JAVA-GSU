import by.gsu.pms.Book;
import by.gsu.pms.FictionBook;
import by.gsu.pms.ScientificBook;

public class Runner {
	
	public static void main(String[] args) {

		 Book[] books = new Book[6];

		books[0] = new Book("Minsk","Afonina", 125, "Alica");
		books[1] = new Book("Moscow","Gorbachev", 90,"Wow");
		books[2] = new ScientificBook("Gomel", "Kravchenko", 105,"Miracle", "Fantastic","Easily");
		books[3] = new ScientificBook("Grodno","Kovalev", 117,"The adventures of the little prince\r\n" + 
				"", "Adventure","Medium");
		books[4] = new FictionBook("Brest","Gladchenko", 74,"Passion","Thriller");
		books[5] = new FictionBook("Vitebsk","Korotkevich", 89,"enemy","Detective");

		
		for (int i = 0; i < books.length; i++) {
			Book book = books[i];
			System.out.println(books);
		}

}
}
