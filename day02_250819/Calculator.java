package day02_250819;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자 입력 : ");
        int firstNumber = sc.nextInt();
        System.out.println("두번째 숫자 입력 : ");
        int secondNumber = sc.nextInt();

        System.out.println("연산자 입력 : ");
        char operator = sc.next().charAt(0);

        switch (operator)
        {
            case '+':
            {
                System.out.println("결과값 : " + (firstNumber + secondNumber));
                break;
            }
            case '-':
            {
                System.out.println("결과값 : " + (firstNumber - secondNumber));
                break;
            }
            case '*':
            {
                System.out.println("결과값 : " + (firstNumber * secondNumber));
                break;
            }
            case '/':
            {
                if (secondNumber == 0)
                {
                    System.out.println("0으로는 나눌 수 없습니다.");
                    break;
                }
                else
                {
                    System.out.println("결과값 : " + (firstNumber / secondNumber));
                    break;
                }
            }
            case '%':
            {
                if (secondNumber == 0)
                {
                    System.out.println("0으로는 나눌 수 없습니다.");
                    break;
                }
                else
                {
                    System.out.println("결과값 : " + (firstNumber % secondNumber));
                    break;
                }
            }
            default:
                System.out.println("잘못된 연산자 입력");
        }
    }
}
