package by.htp.afisha.runner;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.InputSource;
import org.xml.sax.helpers.XMLReaderFactory;

import by.htp.afisha.dao.xml.AfishaXMLHandler;
import by.htp.afisha.entity.Afisha;
import by.htp.afisha.entity.Event;
import by.htp.afisha.entity.Exhibition;
import by.htp.afisha.entity.Film;
import by.htp.afisha.entity.Genre;
import by.htp.afisha.entity.Opera;
import by.htp.afisha.entity.Solist;
import by.htp.afisha.logic.AfishaVisitor;
import by.htp.afisha.logic.impl.ConsoleAfishaVisitor;

public class Runner {

	/**
	 * @param args
	 * @throws SAXException 
	 * @throws IOException 
	 */
	/*public static void main(String[] args) {
		Event film = new Film (new Date(), "WhiteFish", "17.00","Galeleo", new BigDecimal(99.5), Genre.HORROR, 6.7);
		Event opera = new Opera (new Date(), "Aida", "19.00","Opera and balet", new BigDecimal(120.5), new Solist("L. Pavarotty"));
		Event exhibition = new Exhibition (new Date(), "Leonardo da Vinchi", "20.00","Galery", new BigDecimal(85.25), "l. da Vinchi", "Invetions");
		Afisha afisha = new Afisha("Minsk");
		afisha.addEvent(film);
		afisha.addEvent(opera);
		afisha.addEvent(exhibition);
		System.out.println(afisha);
		AfishaVisitor visitor = new ConsoleAfishaVisitor();
		visitor.loadAfisha(afisha);
		//visitor.loadAfisha(afisha, date);
		//visitor.loadAfisha(afisha, startDate, endDate);
	}*/
	//private final static Logger log = LogManager.getLogger();
	
	public static void main(String[] args) throws SAXException, IOException {
		/*Properties property = new Properties ();
		try{
		property.load(new FileInputStream("resources/config.properties"));
		System.out.println(property.getProperty("name"));
		} catch (IOException e){
			
		}*/
		
		
		/*try{
		ResourceBundle boundleRu = ResourceBundle.getBundle("config",new Locale ("ru_RU"));
		ResourceBundle boundleEn = ResourceBundle.getBundle("config", Locale.ENGLISH);
		
		System.out.println(boundleRu.getString("file"));
		System.out.println(boundleEn.getString("name"));
		}
		catch (Exception e){
			log.error("Error");
			log.info("new error 1");
			log.info("new error 2");
			log.debug("new error 3");
			log.debug("new error 4");
			//e.printStackTrace();*/
		XMLReader reader = XMLReaderFactory.createXMLReader();
		InputSource sourse = new InputSource("files/afisha.xml");
		AfishaXMLHandler handler = new AfishaXMLHandler ();
		reader.setContentHandler(handler);
		reader.parse(sourse);
		}
		
	}
	

//}
