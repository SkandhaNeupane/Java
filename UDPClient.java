import java.net.*;
import java.io.*;
import java.util.Scanner;
public class UDPClient{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        try{
            DatagramSocket client = new DatagramSocket();
            System.out.println("Enter a message:");
            String enteredMessage = scn.nextLine();
            InetAddress serverIP = InetAddress.getLocalHost();
            byte[] sendBuffer = enteredMessage.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendBuffer,sendBuffer.length,serverIP,5000);
            client.send(sendPacket);
            byte[] receiveBuffer = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveBuffer,receiveBuffer.length);
            client.receive(receivePacket);
            String receivedFromserver = new String(receivePacket.getData());
            System.out.println("Server Message:"+receivedFromserver);
            client.close();
            scn.close();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}