package by.gsu.pms;

public abstract class Book implements WriteInfo {

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
		
		@Override
		public String toString() {
			return publisher + ";"+ author + ";" + numberPages +  ";" +  name;
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
		
		protected String fieldsToString() {
			return publisher + ";"+ author + ";" + numberPages +  ";" +  name;
		}

		@Override
		public void Write() {
			System.out.println("Book:"+fieldsToString());
		}
}
