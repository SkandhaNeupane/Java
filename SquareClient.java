import java.io.*;
import java.net.*;
import java.util.Scanner;
public class SquareClient {
 public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    try{
        Socket skt = new Socket("localhost",5000);
        DataInputStream dis = new DataInputStream(skt.getInputStream());
        DataOutputStream dos = new DataOutputStream(skt.getOutputStream());
        System.out.println("Enter the integer:");
        int entered = scn.nextInt();
        dos.writeInt(entered);
        int serverReplied = (int)dis.readInt();
        System.out.println(serverReplied);
        dos.close();
        dis.close();
        skt.close();
        scn.close();
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
 }   
}
