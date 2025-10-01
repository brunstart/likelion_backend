package Java.day12_250903;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionCalculator {

    // 나눗셈을 수행하는 메소드
    public int divide(int a, int b) throws ArithmeticException {
        // TODO: 0으로 나누기 예외 처리 추가
        // try {
        //     return a / b;
        // }catch (Exception e) {
        //     System.out.println(e);
        //     return 0.0;
        // }

        return a / b;
    }

    public static void main(String[] args) {
        DivisionCalculator calc = new DivisionCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 나눗셈 계산기 ===");

        int num1 = 0;
        int num2 = 0;
        int result = 0;

        // TODO: 숫자가 아닌 입력에 대한 예외 처리 추가
        System.out.print("첫 번째 숫자를 입력하세요: ");
        try {
            num1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            num2 = scanner.nextInt();
        }catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("잘못된 입력입니다.");
            return;
        }

        // TODO: divide 메소드에서 발생하는 예외 처리 추가
        try {
            result = calc.divide(num1, num2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("결과: " + num1 + " ÷ " + num2 + " = " + result);

        scanner.close();
    }
}