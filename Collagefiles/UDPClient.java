package Collagefiles;

import java.net.*;
import java.util.Scanner;

class UDPClient {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName("localhost");

        System.out.print("Enter a message: ");
        String message = sc.nextLine();
        byte[] sendData = message.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(
                sendData, sendData.length, IPAddress, 9876
        );

        clientSocket.send(sendPacket);

        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket =
                new DatagramPacket(receiveData, receiveData.length);

        clientSocket.receive(receivePacket);

        String reply = new String(
                receivePacket.getData(),
                0,
                receivePacket.getLength()
        );

        System.out.println("FROM SERVER: " + reply);

        clientSocket.close();
        sc.close();
    }
}
