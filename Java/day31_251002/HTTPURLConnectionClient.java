package Java.day31_251002;

import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPURLConnectionClient {
    public static void main(String[] args) {
        String urlString = "http://www.google.com";

        HttpURLConnection connection = null;
        try {
            URL url = new URL(urlString);
            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
