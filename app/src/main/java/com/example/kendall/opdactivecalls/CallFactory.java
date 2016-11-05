package com.example.kendall.opdactivecalls;

import android.util.Log;
import android.util.Xml;
import android.os.AsyncTask;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;

import android.util.Xml;

import org.xmlpull.v1.XmlPullParser;

import static android.R.attr.entries;

/**
 * Created by Kendall Jackson on 11/1/16.
 */
//public class CallFactory extends AsyncTask {
//@Override
//protected Object doInBackground(Object[] objects) {
//
//}
//    private static String OPDURL = "http://www1.cityoforlando.net/opd/activecalls/";
//    public static ArrayList<Call> generateCallsWithXML(String xmlString) {
//        ArrayList<Call> populatedList = new ArrayList<>();
//        try {
//            URL url = new URL(OPDURL);
//            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//            XmlPullParser parser = Xml.newPullParser();
//            parser.setInput(new InputStreamReader(urlConnection.getInputStream()));
//            while (parser.next() != XmlPullParser.END_TAG) {
//                Log.e("My awesomeLog" ,"Tag: " +  parser.getName());
//                if (parser.getEventType() != XmlPullParser.START_TAG) {
//                    continue;
//                }
//                String name = parser.getName();
//                // Starts by looking for the entry tag
//                if (name.equals("CALL")) {
//                    //populatedList.add(readEntry(parser));
//                } else {
//                    //skip(parser);
//                }
//            }
//        }
//        catch(Exception e) {
//            Log.e("ERROR", e.getMessage(), e);
//            return null;
//        }
//    return populatedList;
//    }
//}
