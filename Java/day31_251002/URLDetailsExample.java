package Java.day31_251002;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLDetailsExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.youtube.com");

            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPort());
            System.out.println(url.getPath());

            URLConnection connection = url.openConnection();

            connection.setConnectTimeout(5000);

            connection.getContentType();

            // 헤더 정보 읽기
            System.out.println("\n=== 헤더 정보 ===");
            System.out.println("Content-Type: " +
                    connection.getContentType());
            System.out.println("Content-Length: " +
                    connection.getContentLength());

            try(BufferedReader br =
                    new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"))) {
                String line;
                System.out.println("\n=== 내용 (처음 5줄) ===");
                int count = 0;
                while ((line = br.readLine()) != null && count < 5) {
                    System.out.println(line);
                    count++;
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
