package Hackathon.SmartWindow;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParsing {

    public static void main(String src, String obj, String key) throws Exception {
        try {
            URL url = new URL(src + obj + key);
            SAXParserFactory parserFactor = SAXParserFactory.newInstance();
            SAXParser parser = parserFactor.newSAXParser();
            SAXHandler handler = new SAXHandler();
            parser.parse(url.openStream(), handler);

            //Printing the list of employees obtained from XML
            for (Flight fly : handler.flyList) {
                System.out.println("sax error");
            }
        }
        catch (Exception e) {
            System.out.println("Data error");
        }
    }
}
/**
 * The Handler for SAX Events.
 */
class SAXHandler extends DefaultHandler {

    List<Flight> flyList = new ArrayList<>();
    Flight fly = null;
    String content = null;
    @Override
    //Triggered when the start of tag is found.
    public void startElement(String uri, String localName,
                             String qName, Attributes attributes)
            throws SAXException {

        switch(qName){
            //Create a new Employee object when the start tag is found
            case "Flight":
                fly = new Flight();
                fly.id = attributes.getValue("id");
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName,
                           String qName) throws SAXException {
        switch(qName){
            //Add the employee to list once end tag is found
            case "Flight":
                flyList.add(fly);
                break;
            //For all other end tags the employee has to be updated.
            case "AirportCode":
                fly.id = content;
                break;/*
            case "lastName":
                fly.lastName = content;
                break;
            case "location":
                fly.location = content;
                break;*/
        }
    }

    @Override
    public void characters(char[] ch, int start, int length)
            throws SAXException {
        content = String.copyValueOf(ch, start, length).trim();
    }

}

class Flight {

    String id;
    String Departure;/*
    String Arrive;
    String Depart;
    String Customs;
    String BusNeeded;
    String
*/
    @Override
    public String toString() {
        return id + " " + Departure;
    }
}