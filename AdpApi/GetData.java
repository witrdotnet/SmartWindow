package Hackathon.SmartWindow;

import android.provider.DocumentsContract;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

/**
 * Created by 42 on 28/06/2015.
 */
public class GetData {

    protected Document urldata(String src, String obj, String key) {
        try {
            URL url = new URL(src + obj + key);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            return (db.parse(new InputSource(url.openStream())));
        }
        catch (Exception e) {
            System.out.println("Data error");
            return null;
        }
    }
}
