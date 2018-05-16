package by.gsu.pms;

public class ScientificBook extends Book {

	private String subjects;
	private String complexity;
	
	public String getSubjects() {
		return subjects;
	}
	public String getComplexity() {
		return complexity;
	}
	
	public ScientificBook() {
		super();
		this.subjects = "";
		this.complexity = "";
	}
	
	public ScientificBook(String publisher, String author, int numberPages, String name, String subjects, String complexity) {
		super (publisher,author,numberPages,name);
		this.subjects = subjects;
		this.complexity = complexity;
	}
	
	public ScientificBook(String publisher, String author, String name) {
		super (publisher,author,name);
		this.subjects =  "";
		this.complexity = "";
	}
	
	protected String fieldsToString() {
		return super.fieldsToString() + ";" + subjects +  ";" + complexity;
	}
}
