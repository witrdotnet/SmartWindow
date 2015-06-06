package Hackathon.SmartWindow;

import android.app.ActionBar;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.AbsListView.LayoutParams;

import org.w3c.dom.Document;

//to do:
//  DataObject turn String to Array and add rand function.
public class MainActivity extends ActionBarActivity {
    protected String AircraftData = "http://hackathonapi.aeroportsdeparis.fr/ADP.WebAPI.Flight/api/";
    protected String ApiKey = "apiKey=3Dq7P85nVhZUQRTZIUzTYQ";
    protected String DataObject = "Aircrafts";
    protected GetInternet GI = new GetInternet();
    protected SaxParsing GD = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            GI.connection(this);
        }
        catch (Exception e) {
            System.out.println("Internet error");
        }
        try {
            GD.main(AircraftData, DataObject, ApiKey);
        }
        catch (Exception e) {
            System.out.println("Data error");
        }

    }
}
