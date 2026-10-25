package Collagefiles;

import java.net.*;

class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket serverSocket = new DatagramSocket(9876);
        byte[] receiveData = new byte[1024];

        System.out.println("UDP Server is running...");

        DatagramPacket receivePacket =
                new DatagramPacket(receiveData, receiveData.length);

        serverSocket.receive(receivePacket);

        String message = new String(
                receivePacket.getData(),
                0,
                receivePacket.getLength()
        );

        System.out.println("FROM CLIENT: " + message);

        String reply = message.toUpperCase();
        byte[] sendData = reply.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(
                sendData,
                sendData.length,
                receivePacket.getAddress(),
                receivePacket.getPort()
        );

        serverSocket.send(sendPacket);
        serverSocket.close();
    }
}
