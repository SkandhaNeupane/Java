import java.net.*;
import java.io.*;
public class TCPServer {
    public static void main(String[] args){
        try{
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server running at port 5000");
            Socket skt = ss.accept();
            System.out.println("Client is connected through the port:"+skt.getPort());
            DataInputStream dis = new DataInputStream(skt.getInputStream());
            DataOutputStream dos = new DataOutputStream(skt.getOutputStream());
            String received = (String)dis.readUTF();
            String reversed = "";
            for(int i = received.length()-1; i>=0;i--){
                reversed = received+received.charAt(i);
            }
            if(received.equals(reversed)){
                dos.writeUTF("The string is palindrome");
            }
            else{
                dos.writeUTF("The string is not palindrome");
            }
            ss.close();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
