package day12_250903;

import java.io.*;
import java.net.URL;

public class IOExam1 {
//     IO의 의미
    public static void main(String[] args) throws IOException {
        // 파일로부터 한줄씩 읽고 싶다.
        FileInputStream is = new FileInputStream("src/day12_250903/input.txt");

        // 키보드로부터 한줄씩 입력받는걸로 변경한다면?
        //     키보드 System.in;
        // InputStream is = System.in;

        // URL
        // URL url = new URL("https://www.naver.com");
        // InputStream is = url.openStream();

        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String msg = "";
        // msg = br.readLine();
        // msg = br.readLine();
        // System.out.println(msg);

        while ((msg = br.readLine()) != null)
        {
            System.out.println(msg);
        }
    }
}
