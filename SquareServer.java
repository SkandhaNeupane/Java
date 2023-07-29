import java.net.*;
import java.io.*;
public class SquareServer {
    public static void main(String[] args){
      try{
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server is running at port 5000");
        Socket skt = ss.accept();
        System.out.println("The Client is connected through the port:"+skt.getPort());
        DataInputStream dis = new DataInputStream(skt.getInputStream());
        DataOutputStream dos = new DataOutputStream(skt.getOutputStream());
        int received = (int)dis.readInt();
        received = received*received;
        dos.writeInt(received);
        ss.close();
      }catch(IOException e){
        System.out.println(e.getMessage());
      }

    }
}
