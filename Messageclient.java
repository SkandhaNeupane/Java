import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Messageclient {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        try{
            Socket skt = new Socket("localhost",3000);
            DataInputStream dis = new DataInputStream(skt.getInputStream());
            DataOutputStream dos = new DataOutputStream(skt.getOutputStream());
            //System.out.println("Enter the string:");
            String entered = "Message form Pokhara University";
            dos.writeUTF(entered);
            String serverReplied = (String)dis.readUTF();
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
