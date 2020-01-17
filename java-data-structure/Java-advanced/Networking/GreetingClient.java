/**
 * GreetingClient.java
 */

import java.net.*;
import java.io.*;

public class GreetingClient
{
    public static void main(String[] args) {
        String serverName = args[0];
        int port = Integer.parseInt(args[1]);
        
        try {
            System.out.println("Connecting to " + serverName + " on Port " + port);
            Socket client = new Socket(serverName, port);
            System.out.println("Just Connected to " + client.getRemoteSocketAddress());
            
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            for(int i=0; i<10; i++)
            {
                out.writeUTF("Hello from " + client.getLocalSocketAddress());
                System.out.println("sent !");
            }
            

            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("Server says " + in.readUTF());

            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}