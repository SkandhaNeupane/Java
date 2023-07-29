import java.net.*;
import java.util.Map;
import java.util.List;
import java.io.IOException;
public class RequestHeader {
    public static void main(String[] args){
        try{
            URL url = new URL("https://google.com");
            HttpURLConnection hCon = (HttpURLConnection)url.openConnection();
            Map<String,List<String>> map = hCon.getHeaderFields();
            for(Map.Entry<String,List<String>>data:map.entrySet()){
                System.out.println(data.getKey()+":"+data.getValue());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
