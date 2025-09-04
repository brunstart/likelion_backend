package day13_250904;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExample {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("input.txt");
             FileWriter writer = new FileWriter("output.txt")) {

            int character;
            // 파일 끝(-1)까지 한 문자씩 읽기
            while ((character = reader.read()) != -1) {
                // 한글의 경우 깨짐
                System.out.println((char)character);
                writer.write(character);
            }
            System.out.println("텍스트 파일 복사 완료!");
        // 문자 이용 시에는 FileReader, FileWriter등을 이용해야 바이트를 제대로 읽어서 문자를 그대로 출력 가능
        // 문자를 읽어내면서 써야하는 경우는 ByteStream의 경우는 깨져서 나옴
        } catch (IOException e) {
            System.err.println("파일 처리 중 오류: " + e.getMessage());
        }
    }
}
