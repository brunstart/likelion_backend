package Java.day13_250904;

import java.io.File;
import java.io.IOException;

public class FileInfo {
    public static void main(String[] args) {
        // 파일 경로로 File 객체 생성
        File path = new File("src/Java.day13_250904");   // 부모 디렉토리를 File 객체로 생성
        // File file1 = new File(path, "myfile.txt");      // 디렉토리에 있는 File을 지정
        File file1 = new File("myfile.txt");
        if (file1.exists())
        {
            System.out.println("길이 : " + file1.length());
            System.out.println("읽기 전용 : " + file1.canRead());
            System.out.println("쓰기 전용 : " + file1.canWrite());
            System.out.println("절대경로 : " + file1.getAbsolutePath());
            try {
                System.out.println("getCanonicalPath : " + file1.getCanonicalPath());
            } catch(IOException e) {
                System.out.println(e);
            }
            System.out.println("getName : " + file1.getName());
            System.out.println("getParent : " + file1.getParent());
            System.out.println("getPath : " + file1.getPath());
        }
        else
        {
            System.out.println("파일 없음");
        }
    }
}
