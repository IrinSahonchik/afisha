package by.htp.afisha.dao.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import by.htp.afisha.entity.Event;
import by.htp.afisha.entity.Exhibition;
import by.htp.afisha.entity.Film;
import by.htp.afisha.entity.Opera;

public class AfishaXMLHandler extends DefaultHandler {
	
	private String value;

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		System.out.println(ch);
	}

	@Override
	public void startDocument() throws SAXException {
		System.out.println("startDocument");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("endDocument");
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		System.out.println(qName);
		
		Event event;
		
		if (qName.equals("event")){
			
			String type = attributes.getValue(qName);
			if (type!=null){
			switch (type){
			case "film":
				event = new Film();
				break;
			case "opera":
				event = new Opera();
				break;
			case "exhibition":
				event = new Exhibition();
				break;
			}
			}
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println(qName);
		
	}
	
	

}
