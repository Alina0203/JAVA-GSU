package by.gsu.pms;

import java.net.URL;
import java.util.Currency;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Sax {

	public static void main(String[] args) throws Exception {

		SAXParserFactory parserFactor = SAXParserFactory.newInstance();
		SAXParser parser = parserFactor.newSAXParser();
		SAXHandler handler = new SAXHandler();

		parser.parse(new URL("http://www.nbrb.by/Services/XmlExRates.aspx").openStream(), handler);

		for (Currency curr : handler.currList) {
			System.out.println(curr);

		}
	}
}