import java.io.*;
public class Employees {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("records.txt");
            DataInputStream dis = new DataInputStream(fis);
            while(dis.available()>0){
                String name = dis.readUTF();
                String post = dis.readUTF();
                float salary = dis.readFloat();
                if(name.toUpperCase().startsWith("A")){
                    System.out.println("Name:"+name+"Post:"+post+"Salary:"+salary);

                }
            }
            dis.close();
            fis.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
