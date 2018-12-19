package by.gsu.pms;

public class Currency {

	String Id;
	String NumCode;
	String CharCode;
	String Scale;
	String Name;
	String Rate;

	@Override

	public String toString() {

		return "ID:" + this.Id + "; NumCode:" + this.NumCode + "; CharCode:" + this.CharCode + "; Scale:" + this.Scale + "; Name:" + this.Name + "; Rate:" + this.Rate;

	}
}