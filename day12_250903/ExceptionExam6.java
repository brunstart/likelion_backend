package day12_250903;

import java.util.Scanner;

public class ExceptionExam6 {
    public static void inputScore(int score) throws ExceptionExample
    {
//        score는 점수 값을 나타냄, 0 ~ 100 까지만 입력을 원함
//        0 ~ 100 이외의 값이 들어왔다면 예외라고 정의하려고 함

        if (score < 0 || score > 5)
        {
//            throw new RuntimeException();
            throw new ExceptionExample("점수는 1 ~ 5 사이 값만 입력 가능. 사용자 입력값 : " + score );
        }
        System.out.println("학생의 점수 : " + score);
    }

    public static void main(String[] args) {
        // 예외가 보편적인 상황에 적용된것 같지 않나요?
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        try {
            inputScore(sc.nextInt());
        } catch (ExceptionExample e) {
            System.out.println(e.getMessage());
        }
        System.out.println("main 종료");
    }
}
