package by.gsu.pms;

public class FictionBook extends Book {
	private String genre;

	public String getGenre() {
		return genre;
	}
	
	public FictionBook(){
		super();
		this.genre = "";
	}
	
	public FictionBook(String publisher, String author, int numberPages, String name, String genre) {
		super (publisher,author,numberPages,name);
		this.genre = genre;
	}
	
	public FictionBook (String publisher, String author, String name) {
		super (publisher,author,name);
		this.genre = "";
		
	}

	public String toString() {
		return publisher + ";"+ author + ";" + numberPages +  ";" +  name +  ";" + genre ;
	}
	
}
