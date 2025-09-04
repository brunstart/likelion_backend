package day13_250904;

import java.io.*;

public class SystemIOExample {
    public static void main(String[] args) {

        // System.in을 BufferedReader로 감싸기
        try(
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));
            ) {

            // System.out으로 프롬프트 출력
            System.out.print("이름을 입력하세요: ");
            String name = reader.readLine();
            writer.write(name + "\n");

            System.out.print("나이를 입력하세요: ");
            int age = Integer.parseInt(reader.readLine());
            writer.write(Integer.toString(age));

            // 정상 출력
            System.out.println("안녕하세요, " + name + "님!");
            System.out.println("당신은 " + age + "살입니다.");

            writer.println("안녕하세요, " + name + "님!");
            writer.println("당신은 " + age + "살입니다.");

            // 오류 출력 예시
            if (age < 0) {
                System.err.println("오류: 나이는 음수일 수 없습니다.");
            }

        } catch (IOException e) {
            System.err.println("입력 오류: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("숫자 형식 오류: " + e.getMessage());
        }
    }
}