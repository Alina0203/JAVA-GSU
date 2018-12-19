package by.gsu.pms;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXHandler extends DefaultHandler {

	List<Currency> currList = new ArrayList<>();
	Currency curr = null;
	String content = null;

	@Override

	public void characters(char[] ch, int start, int length) throws SAXException {
		this.content = String.copyValueOf(ch, start, length).trim();

	}

	@Override

	public void endElement(String uri, String localName, String qName)

			throws SAXException {

		switch (qName) {

		case "Currency":

			this.currList.add(this.curr);

			break;

		case "NumCode":

			this.curr.NumCode = this.content;

			break;

		case "CharCode":

			this.curr.CharCode = this.content;

			break;

		case "Name":

			this.curr.Name = this.content;

			break;

		case "Rate":

			this.curr.Rate = this.content;

			break;

		}

	}

	@Override

	public void startElement(String uri, String localName, String qName,

			Attributes attributes) throws SAXException {

		switch (qName) {

		case "Currency":

			this.curr = new Currency();

			this.curr.Id = attributes.getValue("Id");

			break;

		}

	}

}
