package by.gsu.pms;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class Stax {

	public static void main(String[] args) throws XMLStreamException, MalformedURLException, IOException {

		List<Currency> currList = null;
		Currency currCurr = null;
		String tagContent = null;
		XMLInputFactory factory = XMLInputFactory.newInstance();

		XMLStreamReader reader = factory.createXMLStreamReader(new URL("http://www.nbrb.by/Services/XmlExRates.aspx").openStream());

		currList = new ArrayList<>();

		while (reader.hasNext()) {

			int event = reader.next();

			switch (event) {

			case XMLStreamConstants.START_ELEMENT:

				if ("Currency".equals(reader.getLocalName())) {

					currCurr = new Currency();
					currCurr.Id = reader.getAttributeValue(0);

				}

				break;

			case XMLStreamConstants.CHARACTERS:

				tagContent = reader.getText().trim();

				break;

			case XMLStreamConstants.END_ELEMENT:

				switch (reader.getLocalName()) {

				case "Currency":
					currList.add(currCurr);
					break;

				case "NumCode":
					currCurr.NumCode = tagContent;
					break;

				case "CharCode":
					currCurr.CharCode = tagContent;
					break;

				case "Scale":
					currCurr.Scale = tagContent;
					break;

				case "Name":
					currCurr.Name = tagContent;
					break;

				case "Rate":
					currCurr.Rate = tagContent;
					break;
				}

				break;

			case XMLStreamConstants.START_DOCUMENT:
				currList = new ArrayList<>();
				break;

			}
		}

		for (Currency curr : currList) {

			System.out.println(curr);

		}
	}
}