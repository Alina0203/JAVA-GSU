import by.gsu.pms.Book;
import by.gsu.pms.FictionBook;
import by.gsu.pms.ScientificBook;

public class Runner {

	public static void main(String[] args) {

		Book[] books = new Book[6];

		books[0] = new ScientificBook("Moscow","Gorbachev", 90,"Wow", "Fantastic","Hard");
		books[1] = new ScientificBook("Gomel", "Kravchenko", 105,"Miracle", "Fantastic","Easily");
		books[2] = new ScientificBook("Grodno","Kovalev", 117,"The adventures of the little prince\r\n" + 
				"", "Adventure","Medium");
		books[3] = new FictionBook("Brest","Gladchenko", 74,"Passion","Thriller");
		books[4] = new FictionBook("Minsk","Afonina", 125, "Alica", "Adventure");
		books[5] = new FictionBook("Vitebsk","Korotkevich", 89,"enemy","Detective");

			for (int i = 0; i < books.length; i++) {
				books[i].Write();
		}
}
}
