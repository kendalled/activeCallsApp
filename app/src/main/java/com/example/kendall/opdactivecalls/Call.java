package com.example.kendall.opdactivecalls;

import android.util.Log;

import org.xmlpull.v1.XmlPullParser;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/**
 * Created by Kendall Jackson on 10/31/16.
 */
public class Call {
    public String date;
    public String address;
    public String disturbance;
    public String district;

    public Call(String date, String address, String disturbance, String district){
        this.date = date;
        this.address = address;
        this.disturbance = disturbance;
        this.district = district;

    }
//    public Call(XmlPullParser parser) throws XmlPullParserException, IOException{
//        while (parser.next() != XmlPullParser.END_TAG) {
//            Log.e("CallParser", "" + parser.getName());
//            if (parser.getEventType() != XmlPullParser.START_TAG) {
//                continue;
//            }
//            String name = parser.getName();
//            if (name.equals("DATE")) {
//                date = parser.getText();
//            } else if (name.equals("LOCATION")) {
//                address = parser.getText();
//            } else if (name.equals("DESC")) {
//                disturbance = parser.getText();
//            } else if (name.equals("DISTRICT")) {
//                district = parser.getText();
//            }
//            else {
//                int depth = 1;
//                while (depth != 0) {
//                    switch (parser.next()) {
//                        case XmlPullParser.END_TAG:
//                            depth--;
//                            break;
//                        case XmlPullParser.START_TAG:
//                            depth++;
//                            break;
//                    }
//                }
//            }
//        }
//
//    }
}
