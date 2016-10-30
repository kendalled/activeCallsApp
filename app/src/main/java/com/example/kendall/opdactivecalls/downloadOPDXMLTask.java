package com.example.kendall.opdactivecalls;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import java.lang.StringBuilder;

/**
 * Created by Kendall Jackson on 10/30/16.
 */
public class downloadOPDXMLTask extends AsyncTask {
    private String OPDURL = "http://www1.cityoforlando.net/opd/activecalls/";
    @Override
    protected Object doInBackground(Object[] objects) {
        // Do some validation here

        try {
            URL url = new URL(OPDURL);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                StringBuilder stringBuilder = new StringBuilder();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuilder.append(line).append("\n");
                }
                bufferedReader.close();
                return stringBuilder.toString();
            }
            finally{
                urlConnection.disconnect();
            }
        }
        catch(Exception e) {
            Log.e("ERROR", e.getMessage(), e);
            return null;
        }
    }
}
