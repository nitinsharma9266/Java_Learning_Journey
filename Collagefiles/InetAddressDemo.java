package Collagefiles;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
    public static void main(String[] args)
            throws UnknownHostException {

        InetAddress local = InetAddress.getLocalHost();
        System.out.println("Local host: " + local);

        InetAddress remote =
                InetAddress.getByName("www.google.com");
        System.out.println("Remote host: " + remote);

        InetAddress[] addresses =
                InetAddress.getAllByName("www.google.com");

        for (InetAddress address : addresses) {
            System.out.println(address);
        }
    }
}