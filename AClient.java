import java.net.*;
import java.io.*;
import java.util.Scanner;
public class AClient {
    public static void main(String[] args)throws IOException{
        Scanner scn = new Scanner(System.in);
        Socket skt = new Socket("localhost",5100);
        DataInputStream dis = new DataInputStream(skt.getInputStream());
        DataOutputStream dos = new DataOutputStream(skt.getOutputStream());
        while(true){
            System.out.println("Enter a string");
            String msg = scn.nextLine();
            dos.writeUTF(msg);
            if(msg.equals("exit")){
                break;
            }
            int len = dis.readInt();
            System.out.println("Length of the string is:"+len);
        }
        dos.close();
        dis.close();
        skt.close();
        scn.close();
    }
}
