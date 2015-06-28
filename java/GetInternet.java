package Hackathon.SmartWindow;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.app.Activity;

/**
 * Created by 42 on 28/06/2015.
 */
public class GetInternet {

    protected void connection(Activity atv) {
        ConnectivityManager cm = (ConnectivityManager) atv.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
    }
}
