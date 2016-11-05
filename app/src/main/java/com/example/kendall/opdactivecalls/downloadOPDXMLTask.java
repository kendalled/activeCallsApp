//package com.example.kendall.opdactivecalls;
//
//import android.os.AsyncTask;
//import android.util.Log;
//import android.util.Xml;
//
//import org.xml.sax.Attributes;
//import org.xml.sax.ContentHandler;
//import org.xml.sax.Locator;
//import org.xml.sax.SAXException;
//import org.xmlpull.v1.XmlPullParser;
//import org.xmlpull.v1.XmlPullParserException;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.URL;
//import java.net.HttpURLConnection;
//import java.lang.StringBuilder;
//import java.util.ArrayList;
//
///**
// * Created by Kendall Jackson on 10/30/16.
// */
//public class DownloadOPDXMLTask extends AsyncTask {
//    private String OPDURL = "http://www1.cityoforlando.net/opd/activecalls/";
//    Home homeActivity;
//
//    DownloadOPDXMLTask(Home homeActivity){
//        super ();
//        this.homeActivity = homeActivity;
//    }
//
//    @Override
//    protected Object doInBackground(Object[] objects) {
////        ArrayList<Call> populatedList = new ArrayList<>();
////        try {
////            URL url = new URL(OPDURL);
////            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
////            XmlPullParser parser = Xml.newPullParser();
////            parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, true);
////            parser.setInput(new InputStreamReader(urlConnection.getInputStream()));
////            while (parser.next() != XmlPullParser.END_TAG) {
////                Log.e("My awesomeLog" ,"Tag: " +  parser.getName());
////                //Log.e("", "" + parser.getAttributeName());
////                Log.e("Text", "" + parser.getText());
////                Log.e("NameSpace", "" + parser.getNamespace());
////                Log.e("Event Type", "" + parser.getEventType());
////                Log.e("", "\n");
////                if (parser.getEventType() != XmlPullParser.START_TAG) {
////                    continue;
////                }
////                String name = parser.getName();
////                // Starts by looking for the entry tag
////                if (name.equals("CALL")) {
////                    // Call call = new Call (parser);
////                    // populatedList.add(call);
////                } else {
////                    //skip(parser);
////                }
////            }
////        }catch(XmlPullParserException e) {
////
////        }catch(IOException e) {
////
////        }
////        catch(Exception e) {
////            Log.e("ERROR", e.getMessage(), e);
////            return null;
////        }
////        return populatedList;
//        // create call objects and populate arrayList w them
////        try {
////            URL url = new URL(OPDURL);
////            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
////            try {
////                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
////                StringBuilder stringBuilder = new StringBuilder();
////                String line;
////                while ((line = bufferedReader.readLine()) != null) {
////                    stringBuilder.append(line).append("\n");
////                }
////                bufferedReader.close();
////                Log.e("downloadedXML",stringBuilder.toString());
////                Xml.parse(stringBuilder.toString(), new ContentHandler() {
////                    @Override
////                    public void setDocumentLocator(Locator locator) {
////
////                    }
////
////                    @Override
////                    public void startDocument() throws SAXException {
////
////                    }
////
////                    @Override
////                    public void endDocument() throws SAXException {
////
////                    }
////
////                    @Override
////                    public void startPrefixMapping(String prefix, String uri) throws SAXException {
////
////                    }
////
////                    @Override
////                    public void endPrefixMapping(String prefix) throws SAXException {
////
////                    }
////
////                    @Override
////                    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
////                        Log.e("LocalName", localName);
////                        Log.e("QName", qName);
////                    }
////
////                    @Override
////                    public void endElement(String uri, String localName, String qName) throws SAXException {
////
////                    }
////
////                    @Override
////                    //text
////                    public void characters(char[] ch, int start, int length) throws SAXException {
////
////                    }
////
////                    @Override
////                    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
////
////                    }
////
////                    @Override
////                    public void processingInstruction(String target, String data) throws SAXException {
////
////                    }
////
////                    @Override
////                    public void skippedEntity(String name) throws SAXException {
////
////                    }
////                });
////                return stringBuilder.toString();
////            }
////            finally{
////                urlConnection.disconnect();
////            }
////        }
////        catch(Exception e) {
////            Log.e("ERROR", e.getMessage(), e);
////            return null;
////        }
////    }
//
//    @Override
//    protected void onPostExecute(Object o) {
//        super.onPostExecute(o);
//
//       //ArrayList<Call> calls = .generateCallsWithXML((String) o);
//        // Is stringBuilder where the string version of the XML is saved?
//       //Home.configureActivityWithCalls(calls);
//    }
//}
