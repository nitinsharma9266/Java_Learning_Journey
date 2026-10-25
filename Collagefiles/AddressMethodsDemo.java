package Collagefiles;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressMethodsDemo {
    public static void main(String[] args)
            throws UnknownHostException {

        InetAddress address =
                InetAddress.getByName("www.google.com");

        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());
        System.out.println(address.toString());

        byte[] bytes = address.getAddress();

        for (byte b : bytes) {
            System.out.println(b);
        }
    }
}