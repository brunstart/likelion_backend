package Java.day13_250904;

import java.io.*;

public class FileCopyByte {
    public static void main(String[] args) {
        String path = "src/Java.day13_250904/";
        String sourceFile = "sample.pdf";
        String destFile = "destination.pdf";

        try (FileInputStream fis = new FileInputStream(path + sourceFile);      // 파일로부터
             FileOutputStream fos = new FileOutputStream(destFile);                   // 파일을 쓸 대상
             BufferedInputStream bis = new BufferedInputStream(fis);                  // 버퍼 단위로 읽는다
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {              // 버퍼 단위로 쓴다

            byte[] buffer = new byte[1024];
            int bytesRead;

            // 버퍼 단위로 읽고 쓰기
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);                // buffer를 0부터 bytesRead까지 써라.
            }

            System.out.println("파일 복사 완료: " + sourceFile + " → " + destFile);

        } catch (IOException e) {
            System.err.println("파일 복사 실패: " + e.getMessage());
        }
    }
}