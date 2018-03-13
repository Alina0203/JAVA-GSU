package by.gsu.pms;

public class BussinesTrip {
	
	private  final static int ALLOWANCE= 7;
	private String account;
	private int expenses;
	private int days;
	
	public BussinesTrip (){
	this.account = null;
	this.expenses = 0;
	this.days = 0;
	}
	 
	public BussinesTrip(String account, int expenses, int days){
		this.account = account;
		this.days = days;
		this.expenses = expenses;
	}
	public String getAccount(){
		return account;
	}
	
	public int getExpenses(){
		return expenses;
	}
	public int getDays(){
		return days;
	}
	
    public void setAccount(String account) {
		this.account = account;
	}
    public void setDays(int days) {
		this.days = days;
	}
    public void setExpenses(int expenses) {
		this.expenses = expenses;
	}
    
    public String toString() {
    	return account + ";" + (double)expenses/100 + ";" + (double)days/100 + ";" + (double)getTotal()/100;
    }
    public int getTotal () {
    	return expenses + (ALLOWANCE * days);
    }
    public void show() {
    	System.out.println("rate = " + (double)ALLOWANCE/100 +"\n "
    			+ "account = " + account + 
    			"\n transport = " + (double)expenses/100 +
    			"\n days = " + days +
    			"\n total = " + (double)getTotal()/100);
    }
	
}
