package Collagefiles;

import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;

public class URLConnectionDemo {
    public static void main(String[] args) throws Exception {

        URL url = new URI( "https://www.example.com").toURL();

        URLConnection connection = url.openConnection();

        System.out.println("Content Type: " +
                connection.getContentType());

        System.out.println("Content Length: " +
                connection.getContentLength());

        HttpURLConnection http =
                (HttpURLConnection) connection;

        System.out.println("Request Method: " +
                http.getRequestMethod());

        System.out.println("Response Code: " +
                http.getResponseCode());

        System.out.println("Response Message: " +
                http.getResponseMessage());

        http.disconnect();
    }
}