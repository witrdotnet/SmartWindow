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

    public List<Flight> parse(InputStream inputStream) throws Exception {
        try {

            SAXParserFactory parserFactor = SAXParserFactory.newInstance();
            SAXParser parser = parserFactor.newSAXParser();
            SAXHandler handler = new SAXHandler();
            parser.parse(inputStream, handler);

            return handler.getFlights();
        }
        catch (Exception e) {
            System.out.println("Data error");
            return null;
        }
    }

    /**
     * The Handler for SAX Events.
     */
    public static class SAXHandler extends DefaultHandler {

        List<Flight> flyList = new ArrayList<Flight>();
        Flight fly = null;
        String content = null;

        public List<Flight> getFlights(){
            return flyList;
        }

        @Override
        //Triggered when the start of tag is found.
        public void startElement(String uri, String localName,
                                 String qName, Attributes attributes)
                throws SAXException {

            if (qName.equals("Flight")) {
                fly = new Flight();
                fly.id = attributes.getValue("id");

            }
        }

        @Override
        public void endElement(String uri, String localName,
                               String qName) throws SAXException {
            if (qName.equals("Flight")) {
                flyList.add(fly);

                //For all other end tags the employee has to be updated.
            } else if (qName.equals("AirportCode")) {
                fly.id = content;

            }
        }

        @Override
        public void characters(char[] ch, int start, int length)
                throws SAXException {
            content = String.copyValueOf(ch, start, length).trim();
        }

    }

    public static class Flight {

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

}