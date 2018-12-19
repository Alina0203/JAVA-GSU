package by.gsu.pms;

import java.net.URL;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Dom {

	public static void main(String[] args) throws Exception {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new URL("http://www.nbrb.by/Services/XmlExRates.aspx").openStream());
		List<Currency> currList = new ArrayList<>();

		NodeList nodeList = document.getDocumentElement().getChildNodes();

		for (int i = 0; i < nodeList.getLength(); i++) {

			Node node = nodeList.item(i);

			if (node instanceof Element) {

				Currency curr = new Currency();
				curr.Id = node.getAttributes().getNamedItem("Id").getNodeValue();
				NodeList childNodes = node.getChildNodes();

				for (int j = 0; j < childNodes.getLength(); j++) {
					Node cNode = childNodes.item(j);
					if (cNode instanceof Element) {
						String content = cNode.getLastChild().getTextContent().trim();
						switch (cNode.getNodeName()) {
						case "NumCode":
							curr.NumCode = content;
							break;
						case "CharCode":
							curr.CharCode = content;
							break;
						case "Scale":
							curr.Scale = content;
							break;
						case "Name":
							curr.Name = content;
							break;

						case "Rate":
							curr.Rate = content;
							break;
						}
					}
				}
				currList.add(curr);
			}
		}

		for (Currency curr : currList) {
			System.out.println(curr);

		}

	}

}
