package Collagefiles;

import java.net.URI;
import java.net.URL;

public class URLDemo {
    public static void main(String[] args) throws Exception {

        URL url = new URI(
                "https://www.example.com:8080/wt/index.html#section1"
        ).toURL();

        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getFile());
        System.out.println(url.getRef());
    }
}