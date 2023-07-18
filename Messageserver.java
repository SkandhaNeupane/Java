import java.io.*;
import java.net.*;
public class Messageserver {
    public static void main(String[] args){
        try{
            ServerSocket ss = new ServerSocket(3000);
            System.out.println("The server is running at 3000");
            Socket skt = ss.accept();
            System.out.println("The Client is connected through the port:"+skt.getPort());
            DataInputStream dis = new DataInputStream(skt.getInputStream());
            DataOutputStream dos = new DataOutputStream(skt.getOutputStream());
            String received = (String)dis.readUTF();
            System.out.println("The received message is;"+received);
            dos.writeUTF(received);
            ss.close();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
