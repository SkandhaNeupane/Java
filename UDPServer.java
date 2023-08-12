import java.net.*;
import java.io.*;
public class UDPServer {
    public static void main(String[] args){
        try{
        DatagramSocket server = new DatagramSocket(5000);
        System.out.println("Server running at port 5000");
        byte[] receiveBuffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
        server.receive(receivePacket);
        String receivedFromClient = new String(receivePacket.getData());
        System.out.println("Client's Message:"+receivedFromClient);
        InetAddress clientIP = receivePacket.getAddress();
        int clientPort = receivePacket.getPort();
        System.out.println("Client is connected through IP Address:"+clientIP+"and Port:"+clientPort);
        byte[] sendBuffer = receivedFromClient.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendBuffer,sendBuffer.length,clientIP, clientPort);
        server.send(sendPacket);
        server.close();

             }catch(IOException e){
            System.out.println(e.getMessage());
        }  
    }
}
