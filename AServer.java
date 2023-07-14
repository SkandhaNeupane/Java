import java.net.*;
import java.io.*;
public class AServer {
    public static void main(String[] args)throws IOException{
        ServerSocket ss = new ServerSocket(5100);
        System.out.println("The server is running at 5100");
        Socket skt = ss.accept();
        System.out.println("Client Connected");
        DataInputStream dis = new DataInputStream(skt.getInputStream());
        DataOutputStream dos = new DataOutputStream(skt.getOutputStream());
        while(true){
            String msg = dis.readUTF();
            if(msg.equals("exit")){
                break;
            }
            int len = msg.length();
            dos.writeInt(len);
        }
        dos.close();
        dis.close();
        skt.close();
        ss.close();
    }
}
