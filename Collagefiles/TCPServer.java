package Collagefiles;

import java.io.*;
import java.net.*;

class TCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket welcomeSocket = new ServerSocket(6789);

        System.out.println("Server is waiting for client...");

        Socket connectionSocket = welcomeSocket.accept();
        System.out.println("Client connected.");

        BufferedReader inFromClient =
                new BufferedReader(new InputStreamReader(
                        connectionSocket.getInputStream()));

        DataOutputStream outToClient =
                new DataOutputStream(connectionSocket.getOutputStream());

        String clientSentence = inFromClient.readLine();
        System.out.println("Request Data: " + clientSentence);

        String capitalizedSentence =
                clientSentence.toUpperCase() + "\n";

        outToClient.writeBytes(capitalizedSentence);

        connectionSocket.close();
        welcomeSocket.close();
    }
}
