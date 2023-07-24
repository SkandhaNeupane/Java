import java.io.*;
public class Read {
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("test.txt");
            //write bytes of data to the putput stram
            fos.write(new byte[] {60,80});
            fos.close();
            //create an input stream to read form the file
            FileInputStream fis = new FileInputStream("test.txt");
            int value;
            while((value = fis.read())!=-1){
                System.out.println((char)value);
            }

            fis.close();
        
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
