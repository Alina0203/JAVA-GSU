package by.gsu.pms;

public class Book {

	private String publisher;
	private String author;
	private int  numberPages;
	private String name;
	
	public String getPublisher() {
		return publisher;
	}
	public String getAuthor() {
		return author;
	}
	public int getNumberPages() {
		return numberPages;
	}
	public String getName() {
		return name;
	}
	
	public void printName() {
		System.out.println("Name book - " + this.getName());
	}
	
	public Book(){
		this.publisher = "";
		this.author = "";
		this.numberPages = 0;
		this.name = "";
	}
	
	public Book (String publisher, String author, int numberPages, String name){
		this.publisher = publisher;
		this.author = author;
		this.numberPages = numberPages;
		this.name = name;
	}
	
	public Book (String publisher, String author, String name){
		this.publisher = publisher;
		this.author = author;
		this.numberPages = 0;
		this.name = name;
	}
	@Override
	public String toString() {
		return publisher + ";"+ author + ";" + numberPages +  ";" +  name;
	}
	
}
