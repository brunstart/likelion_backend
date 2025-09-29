package Java.day12_250903;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args){
    //     main 메소드 throws Exception은 테스트할 때 정도만 사용

    //     스트림은 단방향으로 데이터가 흐른다.
    //     절대경로 쓰고 싶으면 써도 됨
        FileInputStream is = null;
        FileOutputStream os = null;

        try {
            is = new FileInputStream("src/Java.day12_250903/IOExam1.java");  // 인텔리제이는 기본 경로가 프로젝트 위치
            os = new FileOutputStream("ioexam.txt");

            // System.out.println(is.read());
            //
            // System.out.println((char)is.read());

            //     파일을 다 읽으려면 is.read()가 반복되어야겠다.
            //     is.read() 했을 때 파일의 끝이면 -1을 리턴. EOF

            int n = 0;
            int count = 0;
            // while ((n = is.read()) != -1) {  // 파일의 끝이 아닐때까지 계속 읽어라
            //     count++;
            //     os.write(n);
            // }
            //
            // System.out.println(count);

            // 바이트배열을 만들어서 그 크기만큼 파일을 읽게 할 수 있음
            byte[] bytes = new byte[1024];

            while ((n = is.read(bytes)) != -1)      // read의 argument로 bytes를 넣음 -> bytes의 크기만큼 읽는다
            {
                String str = new String(bytes, 0, n);
                System.out.println(str);
                count++;
                os.write(bytes, 0, n);
            }

            System.out.println(count);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
            // 실제 파일에 쓰는일 -> OS가 함
            if (os != null)
            {
                try {
                    os.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

            if (is != null)
            {
                try {
                    is.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
