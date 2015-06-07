package Hackathon.SmartWindow;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

//to do:
//  DataObject turn String to Array and add rand function.
public class AdpApi {
    protected String AircraftData = "http://hackathonapi.aeroportsdeparis.fr/ADP.WebAPI.Flight/api/";
    protected String ApiKey = "apiKey=3Dq7P85nVhZUQRTZIUzTYQ";
    protected String DataObject = "Aircrafts?";
    protected SaxParsing GD = null;
    private final String USER_AGENT = "Mozilla/5.0";


    public List<SaxParsing.Flight> getFlights() throws Exception {
        InputStream xmlIS = get(AircraftData, ApiKey, DataObject);
        SaxParsing sp = new SaxParsing();
        return sp.parse(xmlIS);
    }


    // HTTP GET request
    private InputStream get(String src, String obj, String key) throws Exception {

        URL url = new URL(src + obj + key);

        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("Response Code : " + responseCode);

        return con.getInputStream();
    }

}
